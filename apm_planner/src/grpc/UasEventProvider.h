#ifndef UASEVENTPROVIDER_H_
#define UASEVENTPROVIDER_H_

#include <memory>

#include <QObject>
#include "../uas/UASInterface.h"
#include "UasManagerService.h"

#include <grpc/grpc.h>
#include <grpc++/support/channel_arguments.h>
#include <grpc++/impl/codegen/channel_interface.h>
#include <grpc++/client_context.h>
#include <grpc++/create_channel.h>
#include <grpc++/security/credentials.h>
#include <grpc++/support/status.h>
//#include <grpc++/stream.h>

#include <apm_planner/apm_events.pb.h>
#include <apm_planner/apm_events.grpc.pb.h>

using grpc::ChannelArguments;
using grpc::ChannelInterface;
using grpc::ClientContext;
using grpc::ClientReader;
using grpc::ClientReaderWriter;
using grpc::ClientWriter;
using grpc::Status;
using grpc::CompletionQueue;

using com::heinemann::grpc::apmplanner::events::UasEventDistribution;
using com::heinemann::grpc::apmplanner::events::UasEvent;

class UasEventProvider : public QObject {
    Q_OBJECT

private:
	std::unique_ptr<UasEventDistribution::Stub> stub;
	CompletionQueue queue;
    UASInterface* uasInterface = NULL;
    UasManagerService* service = NULL;

    void fire(UasEvent uasEvent);

public:
	UasEventProvider(grpc::string socket, UasManagerService* service);
	virtual ~UasEventProvider();

public slots:

	void activeUASSet(UASInterface* uas);

	void navModeChanged(int uasId, int mode, const QString& text);
    void armingChanged(bool armed);
	void voltageChanged(int uasId, double voltage);
	void batteryChanged(UASInterface* uas, double voltage, double current, double percent, int seconds);
    void statusChanged(UASInterface* uas, QString status);

};

#endif /* UASEVENTPROVIDER_H_ */
