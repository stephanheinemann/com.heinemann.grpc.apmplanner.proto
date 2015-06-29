#include <iostream>
#include <thread>

#include <grpc/grpc.h>
#include <grpc++/server.h>
#include <grpc++/server_builder.h>
#include <grpc++/server_context.h>
#include <grpc++/server_credentials.h>
#include <grpc++/status.h>
#include <grpc++/stream.h>

#include <apm_planner/apm_planner.pb.h>
#include <apm_planner/apm_planner.grpc.pb.h>

using grpc::Server;
using grpc::ServerBuilder;
using grpc::ServerContext;
using grpc::ServerReader;
using grpc::ServerReaderWriter;
using grpc::ServerWriter;
using grpc::Status;

using com::heinemann::grpc::apmplanner::UasManager;
using com::heinemann::grpc::apmplanner::Null;
using com::heinemann::grpc::apmplanner::UasIdentifier;
using com::heinemann::grpc::apmplanner::Uas;

class UasManagerService final : public UasManager::Service {

	Status getActiveUas(ServerContext* context, const Null* none, UasIdentifier* uasIdentifier)
			override {
		int id = 9999;
		uasIdentifier->set_identifier(id);
		return Status::OK;
	}

	Status setActiveUas(ServerContext* context, const UasIdentifier* uasIdentifier, Null* none)
			override {
		return Status::OK;
	}
};

std::thread* serverThread;

void run() {
	std::string server_address("localhost:50051");
	UasManagerService* service = new UasManagerService();
	ServerBuilder builder;
	builder.AddListeningPort(server_address, grpc::InsecureServerCredentials());
	builder.RegisterService((UasManager::Service*) service);
	std::unique_ptr<Server> server(builder.BuildAndStart());
	std::cout << "Server listening on " << server_address << std::endl;
	server->Wait();
	delete service;
}

void start() {
	serverThread = new std::thread(run);
}

void stop() {
	delete serverThread;
}
