/*
 * UasSubscribers.cpp
 *
 *  Created on: Jul 2, 2015
 *      Author: stephan
 */

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
	//subscribers.append(subscriber);
}

void UasSubscribers::removeSubscriber(const QString subscriber) {
	subscribers.remove(subscriber);
	//subscribers.removeOne(subscriber);
}
