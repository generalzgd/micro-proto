// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

/**
 * <pre>
 * ------------------------------------------
 * 获得用户信息, 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新获取
 * c2s
 * </pre>
 *
 * Protobuf type {@code user.GetUserInfoRequest}
 */
public  final class GetUserInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.GetUserInfoRequest)
    GetUserInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserInfoRequest.newBuilder() to construct.
  private GetUserInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserInfoRequest() {
    targetUid_ = emptyIntList();
    traceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUserInfoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUserInfoRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              targetUid_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            targetUid_.addInt(input.readUInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              targetUid_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              targetUid_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            traceId_ = s;
            break;
          }
          case 24: {

            thirdGameId_ = input.readUInt32();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        targetUid_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.user.User.internal_static_user_GetUserInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.user.User.internal_static_user_GetUserInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.user.GetUserInfoRequest.class, com.proto.user.GetUserInfoRequest.Builder.class);
  }

  public static final int TARGET_UID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList targetUid_;
  /**
   * <pre>
   * 要获取的用户uid
   * </pre>
   *
   * <code>repeated uint32 target_uid = 1;</code>
   * @return A list containing the targetUid.
   */
  public java.util.List<java.lang.Integer>
      getTargetUidList() {
    return targetUid_;
  }
  /**
   * <pre>
   * 要获取的用户uid
   * </pre>
   *
   * <code>repeated uint32 target_uid = 1;</code>
   * @return The count of targetUid.
   */
  public int getTargetUidCount() {
    return targetUid_.size();
  }
  /**
   * <pre>
   * 要获取的用户uid
   * </pre>
   *
   * <code>repeated uint32 target_uid = 1;</code>
   * @param index The index of the element to return.
   * @return The targetUid at the given index.
   */
  public int getTargetUid(int index) {
    return targetUid_.getInt(index);
  }
  private int targetUidMemoizedSerializedSize = -1;

  public static final int TRACEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object traceId_;
  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 2;</code>
   * @return The traceId.
   */
  public java.lang.String getTraceId() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      traceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 2;</code>
   * @return The bytes for traceId.
   */
  public com.google.protobuf.ByteString
      getTraceIdBytes() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      traceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THIRDGAMEID_FIELD_NUMBER = 3;
  private int thirdGameId_;
  /**
   * <pre>
   * 第三方绑定的游戏ID，0:不查
   * </pre>
   *
   * <code>uint32 thirdGameId = 3;</code>
   * @return The thirdGameId.
   */
  public int getThirdGameId() {
    return thirdGameId_;
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
    getSerializedSize();
    if (getTargetUidList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(targetUidMemoizedSerializedSize);
    }
    for (int i = 0; i < targetUid_.size(); i++) {
      output.writeUInt32NoTag(targetUid_.getInt(i));
    }
    if (!getTraceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, traceId_);
    }
    if (thirdGameId_ != 0) {
      output.writeUInt32(3, thirdGameId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < targetUid_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(targetUid_.getInt(i));
      }
      size += dataSize;
      if (!getTargetUidList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      targetUidMemoizedSerializedSize = dataSize;
    }
    if (!getTraceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, traceId_);
    }
    if (thirdGameId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, thirdGameId_);
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
    if (!(obj instanceof com.proto.user.GetUserInfoRequest)) {
      return super.equals(obj);
    }
    com.proto.user.GetUserInfoRequest other = (com.proto.user.GetUserInfoRequest) obj;

    if (!getTargetUidList()
        .equals(other.getTargetUidList())) return false;
    if (!getTraceId()
        .equals(other.getTraceId())) return false;
    if (getThirdGameId()
        != other.getThirdGameId()) return false;
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
    if (getTargetUidCount() > 0) {
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUidList().hashCode();
    }
    hash = (37 * hash) + TRACEID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceId().hashCode();
    hash = (37 * hash) + THIRDGAMEID_FIELD_NUMBER;
    hash = (53 * hash) + getThirdGameId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.user.GetUserInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.GetUserInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.user.GetUserInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.GetUserInfoRequest parseFrom(
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
  public static Builder newBuilder(com.proto.user.GetUserInfoRequest prototype) {
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
   * ------------------------------------------
   * 获得用户信息, 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新获取
   * c2s
   * </pre>
   *
   * Protobuf type {@code user.GetUserInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.GetUserInfoRequest)
      com.proto.user.GetUserInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.user.User.internal_static_user_GetUserInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.user.User.internal_static_user_GetUserInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.user.GetUserInfoRequest.class, com.proto.user.GetUserInfoRequest.Builder.class);
    }

    // Construct using com.proto.user.GetUserInfoRequest.newBuilder()
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
      targetUid_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      traceId_ = "";

      thirdGameId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.user.User.internal_static_user_GetUserInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.user.GetUserInfoRequest getDefaultInstanceForType() {
      return com.proto.user.GetUserInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.user.GetUserInfoRequest build() {
      com.proto.user.GetUserInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.user.GetUserInfoRequest buildPartial() {
      com.proto.user.GetUserInfoRequest result = new com.proto.user.GetUserInfoRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        targetUid_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.targetUid_ = targetUid_;
      result.traceId_ = traceId_;
      result.thirdGameId_ = thirdGameId_;
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
      if (other instanceof com.proto.user.GetUserInfoRequest) {
        return mergeFrom((com.proto.user.GetUserInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.user.GetUserInfoRequest other) {
      if (other == com.proto.user.GetUserInfoRequest.getDefaultInstance()) return this;
      if (!other.targetUid_.isEmpty()) {
        if (targetUid_.isEmpty()) {
          targetUid_ = other.targetUid_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTargetUidIsMutable();
          targetUid_.addAll(other.targetUid_);
        }
        onChanged();
      }
      if (!other.getTraceId().isEmpty()) {
        traceId_ = other.traceId_;
        onChanged();
      }
      if (other.getThirdGameId() != 0) {
        setThirdGameId(other.getThirdGameId());
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
      com.proto.user.GetUserInfoRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.user.GetUserInfoRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList targetUid_ = emptyIntList();
    private void ensureTargetUidIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        targetUid_ = mutableCopy(targetUid_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * 要获取的用户uid
     * </pre>
     *
     * <code>repeated uint32 target_uid = 1;</code>
     * @return A list containing the targetUid.
     */
    public java.util.List<java.lang.Integer>
        getTargetUidList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(targetUid_) : targetUid_;
    }
    /**
     * <pre>
     * 要获取的用户uid
     * </pre>
     *
     * <code>repeated uint32 target_uid = 1;</code>
     * @return The count of targetUid.
     */
    public int getTargetUidCount() {
      return targetUid_.size();
    }
    /**
     * <pre>
     * 要获取的用户uid
     * </pre>
     *
     * <code>repeated uint32 target_uid = 1;</code>
     * @param index The index of the element to return.
     * @return The targetUid at the given index.
     */
    public int getTargetUid(int index) {
      return targetUid_.getInt(index);
    }
    /**
     * <pre>
     * 要获取的用户uid
     * </pre>
     *
     * <code>repeated uint32 target_uid = 1;</code>
     * @param index The index to set the value at.
     * @param value The targetUid to set.
     * @return This builder for chaining.
     */
    public Builder setTargetUid(
        int index, int value) {
      ensureTargetUidIsMutable();
      targetUid_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 要获取的用户uid
     * </pre>
     *
     * <code>repeated uint32 target_uid = 1;</code>
     * @param value The targetUid to add.
     * @return This builder for chaining.
     */
    public Builder addTargetUid(int value) {
      ensureTargetUidIsMutable();
      targetUid_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 要获取的用户uid
     * </pre>
     *
     * <code>repeated uint32 target_uid = 1;</code>
     * @param values The targetUid to add.
     * @return This builder for chaining.
     */
    public Builder addAllTargetUid(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureTargetUidIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, targetUid_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 要获取的用户uid
     * </pre>
     *
     * <code>repeated uint32 target_uid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetUid() {
      targetUid_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object traceId_ = "";
    /**
     * <pre>
     * 用户的uuid，用来追踪用户消息链路
     * </pre>
     *
     * <code>string traceId = 2;</code>
     * @return The traceId.
     */
    public java.lang.String getTraceId() {
      java.lang.Object ref = traceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        traceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 用户的uuid，用来追踪用户消息链路
     * </pre>
     *
     * <code>string traceId = 2;</code>
     * @return The bytes for traceId.
     */
    public com.google.protobuf.ByteString
        getTraceIdBytes() {
      java.lang.Object ref = traceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        traceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 用户的uuid，用来追踪用户消息链路
     * </pre>
     *
     * <code>string traceId = 2;</code>
     * @param value The traceId to set.
     * @return This builder for chaining.
     */
    public Builder setTraceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      traceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户的uuid，用来追踪用户消息链路
     * </pre>
     *
     * <code>string traceId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTraceId() {
      
      traceId_ = getDefaultInstance().getTraceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户的uuid，用来追踪用户消息链路
     * </pre>
     *
     * <code>string traceId = 2;</code>
     * @param value The bytes for traceId to set.
     * @return This builder for chaining.
     */
    public Builder setTraceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      traceId_ = value;
      onChanged();
      return this;
    }

    private int thirdGameId_ ;
    /**
     * <pre>
     * 第三方绑定的游戏ID，0:不查
     * </pre>
     *
     * <code>uint32 thirdGameId = 3;</code>
     * @return The thirdGameId.
     */
    public int getThirdGameId() {
      return thirdGameId_;
    }
    /**
     * <pre>
     * 第三方绑定的游戏ID，0:不查
     * </pre>
     *
     * <code>uint32 thirdGameId = 3;</code>
     * @param value The thirdGameId to set.
     * @return This builder for chaining.
     */
    public Builder setThirdGameId(int value) {
      
      thirdGameId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 第三方绑定的游戏ID，0:不查
     * </pre>
     *
     * <code>uint32 thirdGameId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearThirdGameId() {
      
      thirdGameId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:user.GetUserInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:user.GetUserInfoRequest)
  private static final com.proto.user.GetUserInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.user.GetUserInfoRequest();
  }

  public static com.proto.user.GetUserInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetUserInfoRequest>() {
    @java.lang.Override
    public GetUserInfoRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUserInfoRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUserInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.user.GetUserInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

