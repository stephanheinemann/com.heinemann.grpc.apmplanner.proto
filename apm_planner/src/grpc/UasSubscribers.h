#ifndef UASSUBSCRIBERS_H_
#define UASSUBSCRIBERS_H_

#include <QSet>
#include <QString>

class UasSubscribers {
private:
	QSet<QString> subscribers;

public:
	UasSubscribers();
	virtual ~UasSubscribers();

	QSet<QString> getSubscribers();
	void addSubscriber(const QString subscriber);
	void removeSubscriber(const QString subscriber);
};

#endif /* UASSUBSCRIBERS_H_ */
