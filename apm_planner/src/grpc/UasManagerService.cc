#include "UasManagerService.h"

#include <iostream>

#include <grpc++/server.h>
#include <grpc++/server_builder.h>
#include <grpc++/server_credentials.h>
#include <grpc++/status_code_enum.h>

#include <../uas/UASManager.h>
#include <../uas/UASInterface.h>

using grpc::Server;
using grpc::ServerBuilder;
using grpc::ServerWriter;
using grpc::StatusCode;


std::thread* serverThread;
const grpc::string UasManagerService::LISTENING = "UAS service listening on ";
const grpc::string UasManagerService::DETAILS_NOT_FOUND = "no active UAS found";

UasManagerService::UasManagerService(grpc::string socket) {
	this->socket = socket;
}

Status UasManagerService::getActiveUas(
		ServerContext* context,
		const Null* none,
		UasIdentifier* uasIdentifier) {

	(void) context;
	(void) none;
	Status status = Status(StatusCode::NOT_FOUND, DETAILS_NOT_FOUND);
	int identifier = -1;
	uasIdentifier->set_identifier(identifier);

	UASInterface* activeUAS = UASManager::instance()->getActiveUAS();
	if (NULL != activeUAS) {
		uasIdentifier->set_identifier(activeUAS->getUASID());
		status = Status::OK;
	}

	return status;
}

Status UasManagerService::setActiveUas(
		ServerContext* context,
		const UasIdentifier* uasIdentifier,
		Null* none) {

	(void) context;
	(void) none;
	return Status::OK;
}

Status UasManagerService::getUasStream(
			ServerContext* context,
			const UasIdentifier* uasIdentifier,
			ServerWriter<Uas>* uasStream) {
	return Status::OK;
}

void UasManagerService::run() {
	std::string server_address(this->socket);
	ServerBuilder builder;
	builder.AddListeningPort(server_address, grpc::InsecureServerCredentials());
	builder.RegisterService((UasManager::Service*) this);
	std::unique_ptr<Server> server(builder.BuildAndStart());
	std::cout << LISTENING << server_address << std::endl;
	server->Wait();
}

void UasManagerService::start() {
	serverThread = new std::thread(&UasManagerService::run, this);
}

void UasManagerService::stop() {
	delete serverThread;
}
