// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/assistant/embedded/v1alpha2/embedded_assistant.proto

package com.google.assistant.embedded.v1alpha2;

/**
 * <pre>
 * The response returned to the device if the user has triggered a Device
 * Action. For example, a device which supports the query *Turn on the light*
 * would receive a `DeviceAction` with a JSON payload containing the semantics
 * of the request.
 * </pre>
 *
 * Protobuf type {@code google.assistant.embedded.v1alpha2.DeviceAction}
 */
public  final class DeviceAction extends
    com.google.protobuf.GeneratedMessageLite<
        DeviceAction, DeviceAction.Builder> implements
    // @@protoc_insertion_point(message_implements:google.assistant.embedded.v1alpha2.DeviceAction)
    DeviceActionOrBuilder {
  private DeviceAction() {
    deviceRequestJson_ = "";
  }
  public static final int DEVICE_REQUEST_JSON_FIELD_NUMBER = 1;
  private java.lang.String deviceRequestJson_;
  /**
   * <pre>
   * JSON containing the device command response generated from the triggered
   * Device Action grammar. The format is given by the
   * `action.devices.EXECUTE` intent for a given
   * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
   * </pre>
   *
   * <code>optional string device_request_json = 1;</code>
   */
  public java.lang.String getDeviceRequestJson() {
    return deviceRequestJson_;
  }
  /**
   * <pre>
   * JSON containing the device command response generated from the triggered
   * Device Action grammar. The format is given by the
   * `action.devices.EXECUTE` intent for a given
   * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
   * </pre>
   *
   * <code>optional string device_request_json = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceRequestJsonBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(deviceRequestJson_);
  }
  /**
   * <pre>
   * JSON containing the device command response generated from the triggered
   * Device Action grammar. The format is given by the
   * `action.devices.EXECUTE` intent for a given
   * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
   * </pre>
   *
   * <code>optional string device_request_json = 1;</code>
   */
  private void setDeviceRequestJson(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    deviceRequestJson_ = value;
  }
  /**
   * <pre>
   * JSON containing the device command response generated from the triggered
   * Device Action grammar. The format is given by the
   * `action.devices.EXECUTE` intent for a given
   * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
   * </pre>
   *
   * <code>optional string device_request_json = 1;</code>
   */
  private void clearDeviceRequestJson() {
    
    deviceRequestJson_ = getDefaultInstance().getDeviceRequestJson();
  }
  /**
   * <pre>
   * JSON containing the device command response generated from the triggered
   * Device Action grammar. The format is given by the
   * `action.devices.EXECUTE` intent for a given
   * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
   * </pre>
   *
   * <code>optional string device_request_json = 1;</code>
   */
  private void setDeviceRequestJsonBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    deviceRequestJson_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!deviceRequestJson_.isEmpty()) {
      output.writeString(1, getDeviceRequestJson());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!deviceRequestJson_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getDeviceRequestJson());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.assistant.embedded.v1alpha2.DeviceAction parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.assistant.embedded.v1alpha2.DeviceAction prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * The response returned to the device if the user has triggered a Device
   * Action. For example, a device which supports the query *Turn on the light*
   * would receive a `DeviceAction` with a JSON payload containing the semantics
   * of the request.
   * </pre>
   *
   * Protobuf type {@code google.assistant.embedded.v1alpha2.DeviceAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.assistant.embedded.v1alpha2.DeviceAction, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.assistant.embedded.v1alpha2.DeviceAction)
      com.google.assistant.embedded.v1alpha2.DeviceActionOrBuilder {
    // Construct using com.google.assistant.embedded.v1alpha2.DeviceAction.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * JSON containing the device command response generated from the triggered
     * Device Action grammar. The format is given by the
     * `action.devices.EXECUTE` intent for a given
     * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
     * </pre>
     *
     * <code>optional string device_request_json = 1;</code>
     */
    public java.lang.String getDeviceRequestJson() {
      return instance.getDeviceRequestJson();
    }
    /**
     * <pre>
     * JSON containing the device command response generated from the triggered
     * Device Action grammar. The format is given by the
     * `action.devices.EXECUTE` intent for a given
     * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
     * </pre>
     *
     * <code>optional string device_request_json = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceRequestJsonBytes() {
      return instance.getDeviceRequestJsonBytes();
    }
    /**
     * <pre>
     * JSON containing the device command response generated from the triggered
     * Device Action grammar. The format is given by the
     * `action.devices.EXECUTE` intent for a given
     * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
     * </pre>
     *
     * <code>optional string device_request_json = 1;</code>
     */
    public Builder setDeviceRequestJson(
        java.lang.String value) {
      copyOnWrite();
      instance.setDeviceRequestJson(value);
      return this;
    }
    /**
     * <pre>
     * JSON containing the device command response generated from the triggered
     * Device Action grammar. The format is given by the
     * `action.devices.EXECUTE` intent for a given
     * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
     * </pre>
     *
     * <code>optional string device_request_json = 1;</code>
     */
    public Builder clearDeviceRequestJson() {
      copyOnWrite();
      instance.clearDeviceRequestJson();
      return this;
    }
    /**
     * <pre>
     * JSON containing the device command response generated from the triggered
     * Device Action grammar. The format is given by the
     * `action.devices.EXECUTE` intent for a given
     * [trait](https://developers.google.com/assistant/sdk/reference/traits/).
     * </pre>
     *
     * <code>optional string device_request_json = 1;</code>
     */
    public Builder setDeviceRequestJsonBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDeviceRequestJsonBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.assistant.embedded.v1alpha2.DeviceAction)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.assistant.embedded.v1alpha2.DeviceAction();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.assistant.embedded.v1alpha2.DeviceAction other = (com.google.assistant.embedded.v1alpha2.DeviceAction) arg1;
        deviceRequestJson_ = visitor.visitString(!deviceRequestJson_.isEmpty(), deviceRequestJson_,
            !other.deviceRequestJson_.isEmpty(), other.deviceRequestJson_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                String s = input.readStringRequireUtf8();

                deviceRequestJson_ = s;
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
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.assistant.embedded.v1alpha2.DeviceAction.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha2.DeviceAction)
  private static final com.google.assistant.embedded.v1alpha2.DeviceAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DeviceAction();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.assistant.embedded.v1alpha2.DeviceAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DeviceAction> PARSER;

  public static com.google.protobuf.Parser<DeviceAction> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
