#include "UasEventProvider.h"

#include <iostream>

#include "../uas/UASManager.h"
#include "../uas/UASInterface.h"
#include "../uas/UAS.h"

//using com::heinemann::grpc::apmplanner::events::Null;

UasEventProvider::UasEventProvider(grpc::string socket, UasManagerService* service) {
	std::shared_ptr<ChannelInterface> channel = grpc::CreateCustomChannel(
		socket,
		grpc::InsecureChannelCredentials(),
		ChannelArguments());
	stub = UasEventDistribution::NewStub(channel);

	connect(
		UASManager::instance(),
		SIGNAL(activeUASSet(UASInterface*)),
		this,
		SLOT(activeUASSet(UASInterface*)));
	activeUASSet(UASManager::instance()->getActiveUAS());

	this->service = service;
}

UasEventProvider::~UasEventProvider() {
	if (NULL != uasInterface) {
		disconnect(uasInterface, 0, this, 0);
	}
}

void UasEventProvider::fire(UasEvent uasEvent) {
	ClientContext context;
	com::heinemann::grpc::apmplanner::events::Null null;

	// TODO: stub->Asyncfire(&context, uasEvent, &queue);
	if (service->hasSubscribers()) {
		stub->fire(&context, uasEvent, &null);
	}
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
	UasEvent uasEvent;
	uasEvent.set_identifier("navModeChanged");
	uasEvent.set_source(std::to_string(uasId));
	uasEvent.set_parameters(
			"mode=" + std::to_string(mode) + ";" +
			"text=" + text.toStdString());
	fire(uasEvent);
}

void UasEventProvider::armingChanged(bool armed) {
	UasEvent uasEvent;
	uasEvent.set_identifier("armingChanged");
	uasEvent.set_source(std::to_string(uasInterface->getUASID()));
	uasEvent.set_parameters(
			"armed=" + std::to_string(armed));
	fire(uasEvent);
}

void UasEventProvider::voltageChanged(int uasId, double voltage) {
	UasEvent uasEvent;
	uasEvent.set_identifier("voltageChanged");
	uasEvent.set_source(std::to_string(uasId));
	uasEvent.set_parameters(
			"voltage=" + std::to_string(voltage));
	fire(uasEvent);
}

void UasEventProvider::batteryChanged(UASInterface* uas, double voltage, double current, double percent, int seconds) {
	UasEvent uasEvent;
	uasEvent.set_identifier("batteryChanged");
	uasEvent.set_source(std::to_string(uas->getUASID()));
	uasEvent.set_parameters(
			"voltage=" + std::to_string(voltage) + ";" +
			"current=" + std::to_string(current) + ";" +
			"percent=" + std::to_string(percent) + ";" +
			"seconds=" + std::to_string(seconds));
	fire(uasEvent);
}

void UasEventProvider::statusChanged(UASInterface* uas, QString status) {
	UasEvent uasEvent;
	uasEvent.set_identifier("statusChanged");
	uasEvent.set_source(std::to_string(uas->getUASID()));
	uasEvent.set_parameters(
			"status=" + status.toStdString());
	fire(uasEvent);
}
