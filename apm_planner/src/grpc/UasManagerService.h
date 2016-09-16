#ifndef UASMANAGERSERVICE_H_
#define UASMANAGERSERVICE_H_

#include <thread>

#include <grpc/grpc.h>
#include <grpc++/server_context.h>
//#include <grpc++/stream.h>
#include <grpc++/impl/codegen/status.h>

#include <apm_planner/apm_planner.pb.h>
#include <apm_planner/apm_planner.grpc.pb.h>
#include "UasSubscribers.h"

using grpc::ServerContext;
using grpc::ServerWriter;
using grpc::Status;

using com::heinemann::grpc::apmplanner::UasManager;
using com::heinemann::grpc::apmplanner::Null;
using com::heinemann::grpc::apmplanner::Uas;
using com::heinemann::grpc::apmplanner::UasIdentifier;
using com::heinemann::grpc::apmplanner::UasMode;
using com::heinemann::grpc::apmplanner::UasArmed;
using com::heinemann::grpc::apmplanner::UasSubscriber;

class UasManagerService final : public UasManager::Service {
private:
	std::thread* serverThread;
	std::string socket;
	UasSubscribers subscribers;

public:
	static const grpc::string LISTENING;
	static const grpc::string DETAILS_NOT_FOUND;
	static const grpc::string SUBSCRIBER_NOT_FOUND;
	static const grpc::string SUBSCRIBER_ALREADY_EXISTS;

	UasManagerService(grpc::string socket);

	bool hasSubscribers();

	void run();
	void start();
	void stop();

	Status getActiveUas(
			ServerContext* context,
			const Null* request,
			UasIdentifier* uasIdentifier) override;

	Status setActiveUas(
			ServerContext* context,
			const UasIdentifier* uasIdentifier,
			Null* response) override;

	Status getUas(
			ServerContext* context,
			const UasIdentifier* uasIdentifier,
			Uas* uas) override;

	Status getUasList(
			ServerContext* context,
			const Null* request,
			ServerWriter<Uas>* uasWriter) override;

	Status go(
			ServerContext* context,
			const Null* request,
			Null* response) override;

	Status halt(
			ServerContext* context,
			const Null* request,
			Null* response) override;

	Status home(
			ServerContext* context,
			const Null* request,
			Null* response) override;

	Status land(
			ServerContext* context,
			const Null* request,
			Null* response) override;

	Status launch(
			ServerContext* context,
			const Null* request,
			Null* response) override;

	Status reboot(
			ServerContext* context,
			const Null* request,
			Null* response) override;

	Status shutdown(
			ServerContext* context,
			const Null* request,
			Null* response) override;

	Status setMode(
			ServerContext* context,
			const UasMode* mode,
			Null* response) override;

	Status setArmed(
			ServerContext* context,
			const UasArmed* armed,
			Null* response) override;

	Status getSubscribers(
			ServerContext* context,
			const Null* request,
			ServerWriter<UasSubscriber>* subscriberWriter) override;

	Status addSubscriber(
			ServerContext* context,
			const UasSubscriber* subscriber,
			Null* response) override;

	Status removeSubscriber(
			ServerContext* context,
			const UasSubscriber* subscriber,
			Null* response) override;

};

#endif /* UASMANAGERSERVICE_H_ */
