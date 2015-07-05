#include "UasEventProvider.h"

#include <iostream>

#include "../uas/UASManager.h"
#include "../uas/UASInterface.h"
#include "../uas/UAS.h"

using com::heinemann::grpc::apmplanner::events::Null;

UasEventProvider::UasEventProvider(grpc::string socket) {
	std::shared_ptr<ChannelInterface> channel = grpc::CreateChannel(
		socket,
		grpc::InsecureCredentials(),
		ChannelArguments());
	stub = UasEventDistribution::NewStub(channel);

	connect(
		UASManager::instance(),
		SIGNAL(activeUASSet(UASInterface*)),
		this,
		SLOT(activeUASSet(UASInterface*)));
	activeUASSet(UASManager::instance()->getActiveUAS());
}

UasEventProvider::~UasEventProvider() {
	if (NULL != uasInterface) {
		disconnect(uasInterface, 0, this, 0);
	}
}

void UasEventProvider::fire(UasEvent uasEvent) {
	ClientContext context;
	Null null;

	// TODO: stub->Asyncfire(&context, uasEvent, &queue);
	stub->fire(&context, uasEvent, &null);
}

void UasEventProvider::activeUASSet(UASInterface* uas) {
	if (!uas) {
		return;
	}

	if (NULL != uasInterface) {
		disconnect(uasInterface, 0, this, 0);
	}
	uasInterface = uas;

	connect(
		uasInterface,
		SIGNAL(navModeChanged(int, int, const QString&)),
		this,
		SLOT(navModeChanged(int, int, const QString&)));

	connect(
		uasInterface,
		SIGNAL(armingChanged(bool)),
		this,
		SLOT(armingChanged(bool)));

	connect(
		uasInterface,
		SIGNAL(voltageChanged(int, double)),
		this,
		SLOT(voltageChanged(int, double)));

	connect(
		uasInterface,
		SIGNAL(batteryChanged(UASInterface*, double, double, double, int)),
		this,
		SLOT(batteryChanged(UASInterface*, double, double, double, int)));

	connect(
		uasInterface,
		SIGNAL(statusChanged(UASInterface*, QString)),
		this,
		SLOT(statusChanged(UASInterface*, QString)));
}

void UasEventProvider::navModeChanged(int uasId, int mode, const QString& text) {
	std::cout << "navModeChanged called" << std::endl;
}

void UasEventProvider::armingChanged(bool armed) {
	std::cout << "armingChanged called" << std::endl;
}

void UasEventProvider::voltageChanged(int uasId, double voltage) {
	std::cout << "voltageChanged called " << uasId << " v: " << voltage << std::endl;
}

void UasEventProvider::batteryChanged(UASInterface* uas, double voltage, double current, double percent, int seconds) {
	std::cout << "batteryChanged called " << " v: " << voltage << " c:" << current << " p: " << percent << std::endl;

	UasEvent uasEvent;
	uasEvent.set_identifier("batteryChanged");
	uasEvent.set_source(uas->getUASName().toStdString());
	uasEvent.set_parameters(std::to_string(voltage) + ":" + std::to_string(current) + ":"  + std::to_string(percent) + ":" + std::to_string(seconds));
	fire(uasEvent);
}

void UasEventProvider::statusChanged(UASInterface* uas, QString status) {
	std::cout << "statusChanged called" << std::endl;
}

