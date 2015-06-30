#ifndef UASMANAGERSERVICE_H_
#define UASMANAGERSERVICE_H_

#include <thread>

#include <grpc/grpc.h>
#include <grpc++/server_context.h>
#include <grpc++/stream.h>
#include <grpc++/status.h>

#include <apm_planner/apm_planner.pb.h>
#include <apm_planner/apm_planner.grpc.pb.h>

using grpc::ServerContext;
using grpc::ServerWriter;
using grpc::Status;

using com::heinemann::grpc::apmplanner::UasManager;
using com::heinemann::grpc::apmplanner::Null;
using com::heinemann::grpc::apmplanner::UasIdentifier;
using com::heinemann::grpc::apmplanner::Uas;

class UasManagerService final : public UasManager::Service {
private:
	std::thread* serverThread;
	std::string socket;

public:
	static const grpc::string LISTENING;
	static const grpc::string DETAILS_NOT_FOUND;

	UasManagerService(grpc::string socket);

	void run();
	void start();
	void stop();

	Status getActiveUas(
			ServerContext* context,
			const Null* none,
			UasIdentifier* uasIdentifier) override;

	Status setActiveUas(
			ServerContext* context,
			const UasIdentifier* uasIdentifier,
			Null* none) override;

	Status getUas(
			ServerContext* context,
			const UasIdentifier* uasIdentifier,
			Uas* uas) override;

	Status getUasList(
			ServerContext* context,
			const Null* none,
			ServerWriter<Uas>* uasWriter) override;
};

#endif /* UASMANAGERSERVICE_H_ */
