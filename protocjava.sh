#!/bin/sh
protoc -I ./protos --plugin=protoc-gen-java_plugin=./protoc-gen-grpc-java --java_out=./java --java_plugin_out=./java protos/apm_planner.proto
protoc -I ./protos --plugin=protoc-gen-java_plugin=./protoc-gen-grpc-java --java_out=./java --java_plugin_out=./java protos/apm_events.proto

