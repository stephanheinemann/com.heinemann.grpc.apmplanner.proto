#include <iostream>

#include <grpc/grpc.h>
#include <grpc++/server.h>
#include <grpc++/server_builder.h>
#include <grpc++/server_context.h>
#include <grpc++/security/server_credentials.h>
#include <grpc++/impl/codegen/status.h>
//#include <grpc++/stream.h>

#include "apm_planner.pb.h"
#include "apm_planner.grpc.pb.h"

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

void RunServer() {
	std::string server_address("localhost:50051");
	UasManagerService* service = new UasManagerService();
	ServerBuilder builder;
	builder.AddListeningPort(server_address, grpc::InsecureServerCredentials());
	builder.RegisterService((UasManagerService::Service*) service);
	std::unique_ptr<Server> server(builder.BuildAndStart());
	std::cout << "Server listening on " << server_address << std::endl;
	server->Wait();
	delete service;
}

int main(int argc, char** argv) {
	RunServer();
	return 0;
}
