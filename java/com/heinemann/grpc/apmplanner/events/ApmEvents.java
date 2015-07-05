// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apm_events.proto

package com.heinemann.grpc.apmplanner.events;

public final class ApmEvents {
  private ApmEvents() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface NullOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.heinemann.grpc.apmplanner.events.Null)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code com.heinemann.grpc.apmplanner.events.Null}
   */
  public  static final class Null extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.heinemann.grpc.apmplanner.events.Null)
      NullOrBuilder {
    // Use Null.newBuilder() to construct.
    private Null(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private Null() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Null(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_Null_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_Null_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heinemann.grpc.apmplanner.events.ApmEvents.Null.class, com.heinemann.grpc.apmplanner.events.ApmEvents.Null.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.heinemann.grpc.apmplanner.events.ApmEvents.Null prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.heinemann.grpc.apmplanner.events.Null}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.heinemann.grpc.apmplanner.events.Null)
        com.heinemann.grpc.apmplanner.events.ApmEvents.NullOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_Null_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_Null_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.heinemann.grpc.apmplanner.events.ApmEvents.Null.class, com.heinemann.grpc.apmplanner.events.ApmEvents.Null.Builder.class);
      }

      // Construct using com.heinemann.grpc.apmplanner.events.ApmEvents.Null.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_Null_descriptor;
      }

      public com.heinemann.grpc.apmplanner.events.ApmEvents.Null getDefaultInstanceForType() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.Null.getDefaultInstance();
      }

      public com.heinemann.grpc.apmplanner.events.ApmEvents.Null build() {
        com.heinemann.grpc.apmplanner.events.ApmEvents.Null result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.heinemann.grpc.apmplanner.events.ApmEvents.Null buildPartial() {
        com.heinemann.grpc.apmplanner.events.ApmEvents.Null result = new com.heinemann.grpc.apmplanner.events.ApmEvents.Null(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.heinemann.grpc.apmplanner.events.ApmEvents.Null) {
          return mergeFrom((com.heinemann.grpc.apmplanner.events.ApmEvents.Null)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.heinemann.grpc.apmplanner.events.ApmEvents.Null other) {
        if (other == com.heinemann.grpc.apmplanner.events.ApmEvents.Null.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.heinemann.grpc.apmplanner.events.ApmEvents.Null parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.heinemann.grpc.apmplanner.events.ApmEvents.Null) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.heinemann.grpc.apmplanner.events.Null)
    }

    // @@protoc_insertion_point(class_scope:com.heinemann.grpc.apmplanner.events.Null)
    private static final com.heinemann.grpc.apmplanner.events.ApmEvents.Null DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.heinemann.grpc.apmplanner.events.ApmEvents.Null();
    }

    public static com.heinemann.grpc.apmplanner.events.ApmEvents.Null getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<Null> PARSER =
        new com.google.protobuf.AbstractParser<Null>() {
      public Null parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Null(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Null> getParserForType() {
      return PARSER;
    }

    public com.heinemann.grpc.apmplanner.events.ApmEvents.Null getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UasEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.heinemann.grpc.apmplanner.events.UasEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string identifier = 1;</code>
     */
    java.lang.String getIdentifier();
    /**
     * <code>optional string identifier = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdentifierBytes();

    /**
     * <code>optional string source = 2;</code>
     */
    java.lang.String getSource();
    /**
     * <code>optional string source = 2;</code>
     */
    com.google.protobuf.ByteString
        getSourceBytes();

    /**
     * <code>optional string parameters = 3;</code>
     */
    java.lang.String getParameters();
    /**
     * <code>optional string parameters = 3;</code>
     */
    com.google.protobuf.ByteString
        getParametersBytes();
  }
  /**
   * Protobuf type {@code com.heinemann.grpc.apmplanner.events.UasEvent}
   */
  public  static final class UasEvent extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.heinemann.grpc.apmplanner.events.UasEvent)
      UasEventOrBuilder {
    // Use UasEvent.newBuilder() to construct.
    private UasEvent(com.google.protobuf.GeneratedMessage.Builder builder) {
      super(builder);
    }
    private UasEvent() {
      identifier_ = "";
      source_ = "";
      parameters_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private UasEvent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();

              identifier_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();

              source_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();

              parameters_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.class, com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.Builder.class);
    }

    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private volatile java.lang.Object identifier_;
    /**
     * <code>optional string identifier = 1;</code>
     */
    public java.lang.String getIdentifier() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identifier_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string identifier = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SOURCE_FIELD_NUMBER = 2;
    private volatile java.lang.Object source_;
    /**
     * <code>optional string source = 2;</code>
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          source_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string source = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMETERS_FIELD_NUMBER = 3;
    private volatile java.lang.Object parameters_;
    /**
     * <code>optional string parameters = 3;</code>
     */
    public java.lang.String getParameters() {
      java.lang.Object ref = parameters_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          parameters_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string parameters = 3;</code>
     */
    public com.google.protobuf.ByteString
        getParametersBytes() {
      java.lang.Object ref = parameters_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parameters_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getIdentifierBytes().isEmpty()) {
        output.writeBytes(1, getIdentifierBytes());
      }
      if (!getSourceBytes().isEmpty()) {
        output.writeBytes(2, getSourceBytes());
      }
      if (!getParametersBytes().isEmpty()) {
        output.writeBytes(3, getParametersBytes());
      }
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdentifierBytes().isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getIdentifierBytes());
      }
      if (!getSourceBytes().isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSourceBytes());
      }
      if (!getParametersBytes().isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getParametersBytes());
      }
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.heinemann.grpc.apmplanner.events.UasEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.heinemann.grpc.apmplanner.events.UasEvent)
        com.heinemann.grpc.apmplanner.events.ApmEvents.UasEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.class, com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.Builder.class);
      }

      // Construct using com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        identifier_ = "";

        source_ = "";

        parameters_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_descriptor;
      }

      public com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent getDefaultInstanceForType() {
        return com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.getDefaultInstance();
      }

      public com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent build() {
        com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent buildPartial() {
        com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent result = new com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent(this);
        result.identifier_ = identifier_;
        result.source_ = source_;
        result.parameters_ = parameters_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent) {
          return mergeFrom((com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent other) {
        if (other == com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.getDefaultInstance()) return this;
        if (!other.getIdentifier().isEmpty()) {
          identifier_ = other.identifier_;
          onChanged();
        }
        if (!other.getSource().isEmpty()) {
          source_ = other.source_;
          onChanged();
        }
        if (!other.getParameters().isEmpty()) {
          parameters_ = other.parameters_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object identifier_ = "";
      /**
       * <code>optional string identifier = 1;</code>
       */
      public java.lang.String getIdentifier() {
        java.lang.Object ref = identifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identifier_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdentifierBytes() {
        java.lang.Object ref = identifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public Builder setIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        identifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public Builder clearIdentifier() {
        
        identifier_ = getDefaultInstance().getIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public Builder setIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        identifier_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object source_ = "";
      /**
       * <code>optional string source = 2;</code>
       */
      public java.lang.String getSource() {
        java.lang.Object ref = source_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            source_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSourceBytes() {
        java.lang.Object ref = source_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          source_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public Builder setSource(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        source_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public Builder clearSource() {
        
        source_ = getDefaultInstance().getSource();
        onChanged();
        return this;
      }
      /**
       * <code>optional string source = 2;</code>
       */
      public Builder setSourceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        source_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object parameters_ = "";
      /**
       * <code>optional string parameters = 3;</code>
       */
      public java.lang.String getParameters() {
        java.lang.Object ref = parameters_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            parameters_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string parameters = 3;</code>
       */
      public com.google.protobuf.ByteString
          getParametersBytes() {
        java.lang.Object ref = parameters_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          parameters_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string parameters = 3;</code>
       */
      public Builder setParameters(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        parameters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string parameters = 3;</code>
       */
      public Builder clearParameters() {
        
        parameters_ = getDefaultInstance().getParameters();
        onChanged();
        return this;
      }
      /**
       * <code>optional string parameters = 3;</code>
       */
      public Builder setParametersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        parameters_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.heinemann.grpc.apmplanner.events.UasEvent)
    }

    // @@protoc_insertion_point(class_scope:com.heinemann.grpc.apmplanner.events.UasEvent)
    private static final com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent();
    }

    public static com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<UasEvent> PARSER =
        new com.google.protobuf.AbstractParser<UasEvent>() {
      public UasEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new UasEvent(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<UasEvent> getParserForType() {
      return PARSER;
    }

    public com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_heinemann_grpc_apmplanner_events_Null_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_heinemann_grpc_apmplanner_events_Null_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020apm_events.proto\022$com.heinemann.grpc.a" +
      "pmplanner.events\"\006\n\004Null\"B\n\010UasEvent\022\022\n\n" +
      "identifier\030\001 \001(\t\022\016\n\006source\030\002 \001(\t\022\022\n\npara" +
      "meters\030\003 \001(\t2|\n\024UasEventDistribution\022d\n\004" +
      "fire\022..com.heinemann.grpc.apmplanner.eve" +
      "nts.UasEvent\032*.com.heinemann.grpc.apmpla" +
      "nner.events.Null\"\000B3\n$com.heinemann.grpc" +
      ".apmplanner.events\242\002\nAPMPlannerb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_heinemann_grpc_apmplanner_events_Null_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_heinemann_grpc_apmplanner_events_Null_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_heinemann_grpc_apmplanner_events_Null_descriptor,
        new java.lang.String[] { });
    internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_heinemann_grpc_apmplanner_events_UasEvent_descriptor,
        new java.lang.String[] { "Identifier", "Source", "Parameters", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
