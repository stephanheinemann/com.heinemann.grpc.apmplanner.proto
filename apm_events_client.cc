#include <iostream>
#include <memory>

#include <grpc/grpc.h>
#include <grpc++/channel_arguments.h>
#include <grpc++/channel_interface.h>
#include <grpc++/client_context.h>
#include <grpc++/create_channel.h>
#include <grpc++/credentials.h>
#include <grpc++/status.h>
#include <grpc++/stream.h>

#include "apm_events.pb.h"
#include "apm_events.grpc.pb.h"

using grpc::ChannelArguments;
using grpc::ChannelInterface;
using grpc::ClientContext;
using grpc::ClientReader;
using grpc::ClientReaderWriter;
using grpc::ClientWriter;
using grpc::Status;

using com::heinemann::grpc::apmplanner::events::Null;
using com::heinemann::grpc::apmplanner::events::UasEvent;
using com::heinemann::grpc::apmplanner::events::UasEventDistribution;

class UasEventClient {
private:
	std::unique_ptr<UasEventDistribution::Stub> stub_;
public:
	UasEventClient(std::shared_ptr<ChannelInterface> channel) :
	stub_(UasEventDistribution::NewStub(channel)) {
	}

	bool fire(UasEvent uasEvent) {
		ClientContext context;
		Null null;

		Status status = stub_->fire(&context, uasEvent, &null);
		if (!status.ok()) {
			std::cout << "fire rpc failed." << std::endl;
			return false;
		}
		return true;
	}

};

int main(int argc, char** argv) {
	UasEventClient client(
			grpc::CreateChannel("localhost:50052", grpc::InsecureCredentials(),
					ChannelArguments()));

	std::cout << "-------------- fire --------------" << std::endl;
	UasEvent uasEvent;
	uasEvent.set_identifier("identifier");
	uasEvent.set_source("source");
	uasEvent.set_parameters("parameters");
	client.fire(uasEvent);

	return 0;
}
