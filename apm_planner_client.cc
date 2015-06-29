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

#include "apm_planner.pb.h"
#include "apm_planner.grpc.pb.h"

using grpc::ChannelArguments;
using grpc::ChannelInterface;
using grpc::ClientContext;
using grpc::ClientReader;
using grpc::ClientReaderWriter;
using grpc::ClientWriter;
using grpc::Status;

using com::heinemann::grpc::apmplanner::Null;
using com::heinemann::grpc::apmplanner::Uas;
using com::heinemann::grpc::apmplanner::UasIdentifier;
using com::heinemann::grpc::apmplanner::UasManager;

class UasManagerClient {
private:
	std::unique_ptr<UasManager::Stub> stub_;
public:
	UasManagerClient(std::shared_ptr<ChannelInterface> channel) :
	stub_(UasManager::NewStub(channel)) {
	}

	bool getActiveUas(UasIdentifier* uasIdentifier) {
		ClientContext context;
		Null null;

		Status status = stub_->getActiveUas(&context, null, uasIdentifier);
		if (!status.ok()) {
			std::cout << "GetActiveUAS rpc failed." << std::endl;
			return false;
		}
		return true;
	}

};

int main(int argc, char** argv) {
	UasManagerClient client(
			grpc::CreateChannel("localhost:50051", grpc::InsecureCredentials(),
					ChannelArguments()));

	std::cout << "-------------- GetActiveUAS --------------" << std::endl;
	UasIdentifier uasIdentifier;
	client.getActiveUas(&uasIdentifier);
	std::cout << "identifier = " << uasIdentifier.identifier() << std::endl;

	return 0;
}
