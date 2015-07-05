#include <iostream>

#include <grpc/grpc.h>
#include <grpc++/server.h>
#include <grpc++/server_builder.h>
#include <grpc++/server_context.h>
#include <grpc++/server_credentials.h>
#include <grpc++/status.h>
#include <grpc++/stream.h>

#include "apm_events.pb.h"
#include "apm_events.grpc.pb.h"

using grpc::Server;
using grpc::ServerBuilder;
using grpc::ServerContext;
using grpc::ServerReader;
using grpc::ServerReaderWriter;
using grpc::ServerWriter;
using grpc::Status;

using com::heinemann::grpc::apmplanner::events::UasEventDistribution;
using com::heinemann::grpc::apmplanner::events::UasEvent;
using com::heinemann::grpc::apmplanner::events::Null;

class UasEventService final : public UasEventDistribution::Service {

	Status fire(ServerContext* context, const UasEvent* event, Null* null)
			override {
		std::cout << "identifier: " << event->identifier() << std::endl;
		std::cout << "source: " << event->source() << std::endl;
		std::cout << "parameters: " << event->parameters() << std::endl;
		return Status::OK;
	}

};

void RunServer() {
	std::string server_address("localhost:50051");
	UasEventService* service = new UasEventService();
	ServerBuilder builder;
	builder.AddListeningPort(server_address, grpc::InsecureServerCredentials());
	builder.RegisterService((UasEventService::Service*) service);
	std::unique_ptr<Server> server(builder.BuildAndStart());
	std::cout << "Server listening on " << server_address << std::endl;
	server->Wait();
	delete service;
}

int main(int argc, char** argv) {
	RunServer();
	return 0;
}
