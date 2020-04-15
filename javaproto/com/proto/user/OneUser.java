// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

/**
 * <pre>
 * -------------------用户体系协议------------------------
 * 一个用户的信息
 * </pre>
 *
 * Protobuf type {@code user.OneUser}
 */
public  final class OneUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.OneUser)
    OneUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OneUser.newBuilder() to construct.
  private OneUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OneUser() {
    gateIp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OneUser();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OneUser(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            uid_ = input.readUInt32();
            break;
          }
          case 16: {

            platform_ = input.readUInt32();
            break;
          }
          case 24: {

            socketId_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            gateIp_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.user.User.internal_static_user_OneUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.user.User.internal_static_user_OneUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.user.OneUser.class, com.proto.user.OneUser.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private int uid_;
  /**
   * <pre>
   * 为0表示发给所有人
   * </pre>
   *
   * <code>uint32 uid = 1;</code>
   * @return The uid.
   */
  public int getUid() {
    return uid_;
  }

  public static final int PLATFORM_FIELD_NUMBER = 2;
  private int platform_;
  /**
   * <pre>
   * 为FFFFFFFF表示发给所有端
   * </pre>
   *
   * <code>uint32 platform = 2;</code>
   * @return The platform.
   */
  public int getPlatform() {
    return platform_;
  }

  public static final int SOCKETID_FIELD_NUMBER = 3;
  private int socketId_;
  /**
   * <pre>
   * 链接ID
   * </pre>
   *
   * <code>uint32 socketId = 3;</code>
   * @return The socketId.
   */
  public int getSocketId() {
    return socketId_;
  }

  public static final int GATEIP_FIELD_NUMBER = 4;
  private volatile java.lang.Object gateIp_;
  /**
   * <pre>
   * 网关IP
   * </pre>
   *
   * <code>string gateIp = 4;</code>
   * @return The gateIp.
   */
  public java.lang.String getGateIp() {
    java.lang.Object ref = gateIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gateIp_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 网关IP
   * </pre>
   *
   * <code>string gateIp = 4;</code>
   * @return The bytes for gateIp.
   */
  public com.google.protobuf.ByteString
      getGateIpBytes() {
    java.lang.Object ref = gateIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gateIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (uid_ != 0) {
      output.writeUInt32(1, uid_);
    }
    if (platform_ != 0) {
      output.writeUInt32(2, platform_);
    }
    if (socketId_ != 0) {
      output.writeUInt32(3, socketId_);
    }
    if (!getGateIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, gateIp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, uid_);
    }
    if (platform_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, platform_);
    }
    if (socketId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, socketId_);
    }
    if (!getGateIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, gateIp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.user.OneUser)) {
      return super.equals(obj);
    }
    com.proto.user.OneUser other = (com.proto.user.OneUser) obj;

    if (getUid()
        != other.getUid()) return false;
    if (getPlatform()
        != other.getPlatform()) return false;
    if (getSocketId()
        != other.getSocketId()) return false;
    if (!getGateIp()
        .equals(other.getGateIp())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid();
    hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
    hash = (53 * hash) + getPlatform();
    hash = (37 * hash) + SOCKETID_FIELD_NUMBER;
    hash = (53 * hash) + getSocketId();
    hash = (37 * hash) + GATEIP_FIELD_NUMBER;
    hash = (53 * hash) + getGateIp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.user.OneUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.OneUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.OneUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.OneUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.OneUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.OneUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.OneUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.OneUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.OneUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.user.OneUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.OneUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.OneUser parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.user.OneUser prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * -------------------用户体系协议------------------------
   * 一个用户的信息
   * </pre>
   *
   * Protobuf type {@code user.OneUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.OneUser)
      com.proto.user.OneUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.user.User.internal_static_user_OneUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.user.User.internal_static_user_OneUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.user.OneUser.class, com.proto.user.OneUser.Builder.class);
    }

    // Construct using com.proto.user.OneUser.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      uid_ = 0;

      platform_ = 0;

      socketId_ = 0;

      gateIp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.user.User.internal_static_user_OneUser_descriptor;
    }

    @java.lang.Override
    public com.proto.user.OneUser getDefaultInstanceForType() {
      return com.proto.user.OneUser.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.user.OneUser build() {
      com.proto.user.OneUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.user.OneUser buildPartial() {
      com.proto.user.OneUser result = new com.proto.user.OneUser(this);
      result.uid_ = uid_;
      result.platform_ = platform_;
      result.socketId_ = socketId_;
      result.gateIp_ = gateIp_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.user.OneUser) {
        return mergeFrom((com.proto.user.OneUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.user.OneUser other) {
      if (other == com.proto.user.OneUser.getDefaultInstance()) return this;
      if (other.getUid() != 0) {
        setUid(other.getUid());
      }
      if (other.getPlatform() != 0) {
        setPlatform(other.getPlatform());
      }
      if (other.getSocketId() != 0) {
        setSocketId(other.getSocketId());
      }
      if (!other.getGateIp().isEmpty()) {
        gateIp_ = other.gateIp_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.user.OneUser parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.user.OneUser) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int uid_ ;
    /**
     * <pre>
     * 为0表示发给所有人
     * </pre>
     *
     * <code>uint32 uid = 1;</code>
     * @return The uid.
     */
    public int getUid() {
      return uid_;
    }
    /**
     * <pre>
     * 为0表示发给所有人
     * </pre>
     *
     * <code>uint32 uid = 1;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(int value) {
      
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 为0表示发给所有人
     * </pre>
     *
     * <code>uint32 uid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      
      uid_ = 0;
      onChanged();
      return this;
    }

    private int platform_ ;
    /**
     * <pre>
     * 为FFFFFFFF表示发给所有端
     * </pre>
     *
     * <code>uint32 platform = 2;</code>
     * @return The platform.
     */
    public int getPlatform() {
      return platform_;
    }
    /**
     * <pre>
     * 为FFFFFFFF表示发给所有端
     * </pre>
     *
     * <code>uint32 platform = 2;</code>
     * @param value The platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatform(int value) {
      
      platform_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 为FFFFFFFF表示发给所有端
     * </pre>
     *
     * <code>uint32 platform = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlatform() {
      
      platform_ = 0;
      onChanged();
      return this;
    }

    private int socketId_ ;
    /**
     * <pre>
     * 链接ID
     * </pre>
     *
     * <code>uint32 socketId = 3;</code>
     * @return The socketId.
     */
    public int getSocketId() {
      return socketId_;
    }
    /**
     * <pre>
     * 链接ID
     * </pre>
     *
     * <code>uint32 socketId = 3;</code>
     * @param value The socketId to set.
     * @return This builder for chaining.
     */
    public Builder setSocketId(int value) {
      
      socketId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 链接ID
     * </pre>
     *
     * <code>uint32 socketId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSocketId() {
      
      socketId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object gateIp_ = "";
    /**
     * <pre>
     * 网关IP
     * </pre>
     *
     * <code>string gateIp = 4;</code>
     * @return The gateIp.
     */
    public java.lang.String getGateIp() {
      java.lang.Object ref = gateIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gateIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 网关IP
     * </pre>
     *
     * <code>string gateIp = 4;</code>
     * @return The bytes for gateIp.
     */
    public com.google.protobuf.ByteString
        getGateIpBytes() {
      java.lang.Object ref = gateIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gateIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 网关IP
     * </pre>
     *
     * <code>string gateIp = 4;</code>
     * @param value The gateIp to set.
     * @return This builder for chaining.
     */
    public Builder setGateIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gateIp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 网关IP
     * </pre>
     *
     * <code>string gateIp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGateIp() {
      
      gateIp_ = getDefaultInstance().getGateIp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 网关IP
     * </pre>
     *
     * <code>string gateIp = 4;</code>
     * @param value The bytes for gateIp to set.
     * @return This builder for chaining.
     */
    public Builder setGateIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gateIp_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:user.OneUser)
  }

  // @@protoc_insertion_point(class_scope:user.OneUser)
  private static final com.proto.user.OneUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.user.OneUser();
  }

  public static com.proto.user.OneUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OneUser>
      PARSER = new com.google.protobuf.AbstractParser<OneUser>() {
    @java.lang.Override
    public OneUser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OneUser(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OneUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OneUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.user.OneUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
