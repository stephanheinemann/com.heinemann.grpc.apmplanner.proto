#include "UasManagerService.h"

#include <iostream>

#include <grpc++/server.h>
#include <grpc++/server_builder.h>
#include <grpc++/server_credentials.h>
#include <grpc++/status_code_enum.h>

#include <../uas/UASManager.h>
#include <../uas/UASInterface.h>
#include <../uas/UAS.h>

using grpc::Server;
using grpc::ServerBuilder;
using grpc::ServerWriter;
using grpc::StatusCode;


std::thread* serverThread;
const grpc::string UasManagerService::LISTENING = "UAS service listening on ";
const grpc::string UasManagerService::DETAILS_NOT_FOUND = "no active UAS found";
const grpc::string UasManagerService::SUBSCRIBER_NOT_FOUND = "UAS subscriber not found";
const grpc::string UasManagerService::SUBSCRIBER_ALREADY_EXISTS = "UAS subscriber already exists";

UasManagerService::UasManagerService(grpc::string socket) {
	this->socket = socket;
}

bool UasManagerService::hasSubscribers() {
	return (0 < this->subscribers.getSubscribers().size());
}

Status UasManagerService::getActiveUas(
		ServerContext* context,
		const Null* request,
		UasIdentifier* uasIdentifier) {

	(void) context;
	(void) request;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);
	int identifier = -1;
	uasIdentifier->set_identifier(identifier);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIdentifier->set_identifier(uasIf->getUASID());
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::setActiveUas(
		ServerContext* context,
		const UasIdentifier* uasIdentifier,
		Null* response) {

	(void) context;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getUASForId(uasIdentifier->identifier());
	if (NULL != uasIf) {
		UASManager::instance()->setActiveUAS(uasIf);
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::getUas(
		ServerContext* context,
		const UasIdentifier* uasIdentifier,
		Uas* uas) {

	(void) context;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getUASForId(uasIdentifier->identifier());
	if (NULL != uasIf) {
		uas->set_identifier(uasIf->getUASID());
		uas->set_name(uasIf->getUASName().toStdString());
		uas->set_systemtypename(uasIf->getSystemTypeName().toStdString());
		uas->set_autopilottypename(uasIf->getAutopilotTypeName().toStdString());
		uas->set_shortstate(uasIf->getShortState().toStdString());
		uas->set_shortmode(uasIf->getShortMode().toStdString());
		uas->set_isarmed(uasIf->isArmed());
		uas->set_batteryspecs(uasIf->getBatterySpecs().toStdString());
		uas->set_uptime(uasIf->getUptime());
		uas->set_roll(uasIf->getRoll());
		uas->set_pitch(uasIf->getPitch());
		uas->set_yaw(uasIf->getYaw());
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::getUasList(
		ServerContext* context,
		const Null* request,
		ServerWriter<Uas>* uasWriter) {

	(void) context;
	(void) request;
	Uas uas;

	for (UASInterface* uasIf  : UASManager::instance()->getUASList()) {
		uas.set_identifier(uasIf->getUASID());
		uas.set_name(uasIf->getUASName().toStdString());
		uas.set_systemtypename(uasIf->getSystemTypeName().toStdString());
		uas.set_autopilottypename(uasIf->getAutopilotTypeName().toStdString());
		uas.set_shortstate(uasIf->getShortState().toStdString());
		uas.set_shortmode(uasIf->getShortMode().toStdString());
		uas.set_isarmed(uasIf->isArmed());
		uas.set_batteryspecs(uasIf->getBatterySpecs().toStdString());
		uas.set_uptime(uasIf->getUptime());
		uas.set_roll(uasIf->getRoll());
		uas.set_pitch(uasIf->getPitch());
		uas.set_yaw(uasIf->getYaw());
		uasWriter->Write(uas);
	}

	return Status::OK;
}

Status UasManagerService::go(
		ServerContext* context,
		const Null* request,
		Null* response) {

	(void) context;
	(void) request;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->go();
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::halt(
		ServerContext* context,
		const Null* request,
		Null* response) {

	(void) context;
	(void) request;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->halt();
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::home(
		ServerContext* context,
		const Null* request,
		Null* response) {

	(void) context;
	(void) request;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->home();
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::land(
		ServerContext* context,
		const Null* request,
		Null* response) {

	(void) context;
	(void) request;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->land();
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::launch(
		ServerContext* context,
		const Null* request,
		Null* response) {

	(void) context;
	(void) request;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->launch();
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::reboot(
		ServerContext* context,
		const Null* request,
		Null* response) {

	(void) context;
	(void) request;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->reboot();
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::shutdown(
		ServerContext* context,
		const Null* request,
		Null* response) {

	(void) context;
	(void) request;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->shutdown();
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::setMode(
		ServerContext* context,
		const UasMode* mode,
		Null* response) {

	(void) context;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		uasIf->setMode(mode->mode());
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::setArmed(
		ServerContext* context,
		const UasArmed* armed,
		Null* response) {

	(void) context;
	(void) response;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);

	UASInterface* uasIf = UASManager::instance()->getActiveUAS();
	if (NULL != uasIf) {
		if (armed->armed()) {
			((UAS*) uasIf)->armSystem();
		} else {
			((UAS*) uasIf)->disarmSystem();
		}
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::getSubscribers(
		ServerContext* context,
		const Null* request,
		ServerWriter<UasSubscriber>* subscriberWriter) {

	(void) context;
	(void) request;
	Status status = Status::OK;
	UasSubscriber uasSubscriber;

	for (QString subscriber : subscribers.getSubscribers()) {
		uasSubscriber.set_subscriber(subscriber.toStdString());
		subscriberWriter->Write(uasSubscriber);
	}

	return status;
}

Status UasManagerService::addSubscriber(
		ServerContext* context,
		const UasSubscriber* subscriber,
		Null* response) {

	(void) context;
	(void) response;
	//Status status = Status(StatusCode::ALREADY_EXISTS, SUBSCRIBER_ALREADY_EXISTS);
	Status status = Status::OK;

	subscribers.addSubscriber(QString(subscriber->subscriber().c_str()));

	return status;
}

Status UasManagerService::removeSubscriber(
		ServerContext* context,
		const UasSubscriber* subscriber,
		Null* response) {

	(void) context;
	(void) response;
	//Status status = Status(StatusCode::NOT_FOUND, SUBSCRIBER_NOT_FOUND);
	Status status = Status::OK;

	std::cout << "removing subscriber " << subscriber->subscriber() << std::endl;
	subscribers.removeSubscriber(QString(subscriber->subscriber().c_str()));

	return status;
}

void UasManagerService::run() {
	std::string server_address(this->socket);
	ServerBuilder builder;
	builder.AddListeningPort(server_address, grpc::InsecureServerCredentials());
	builder.RegisterService((UasManager::Service*) this);
	std::unique_ptr<Server> server(builder.BuildAndStart());
	server->Wait();
}

void UasManagerService::start() {
	serverThread = new std::thread(&UasManagerService::run, this);
}

void UasManagerService::stop() {
	delete serverThread;
}
