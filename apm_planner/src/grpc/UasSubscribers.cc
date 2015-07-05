#include "UasSubscribers.h"

UasSubscribers::UasSubscribers() {
}

UasSubscribers::~UasSubscribers() {
}

QSet<QString> UasSubscribers::getSubscribers() {
	return subscribers;
}

void UasSubscribers::addSubscriber(const QString subscriber) {
	subscribers.insert(subscriber);
}

void UasSubscribers::removeSubscriber(const QString subscriber) {
	subscribers.remove(subscriber);
}
