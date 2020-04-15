// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

/**
 * <pre>
 * 响应用户等级信息
 * </pre>
 *
 * Protobuf type {@code user.GetUserPLevelReply}
 */
public  final class GetUserPLevelReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.GetUserPLevelReply)
    GetUserPLevelReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserPLevelReply.newBuilder() to construct.
  private GetUserPLevelReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserPLevelReply() {
    code_ = 0;
    message_ = "";
    traceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUserPLevelReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUserPLevelReply(
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
            int rawValue = input.readEnum();

            code_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
            com.proto.user.PLevelInfo.Builder subBuilder = null;
            if (level_ != null) {
              subBuilder = level_.toBuilder();
            }
            level_ = input.readMessage(com.proto.user.PLevelInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(level_);
              level_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            traceId_ = s;
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
    return com.proto.user.User.internal_static_user_GetUserPLevelReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.user.User.internal_static_user_GetUserPLevelReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.user.GetUserPLevelReply.class, com.proto.user.GetUserPLevelReply.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>.comm.ErrorType code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.comm.ErrorType code = 1;</code>
   * @return The code.
   */
  public com.proto.comm.ErrorType getCode() {
    @SuppressWarnings("deprecation")
    com.proto.comm.ErrorType result = com.proto.comm.ErrorType.valueOf(code_);
    return result == null ? com.proto.comm.ErrorType.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_FIELD_NUMBER = 3;
  private com.proto.user.PLevelInfo level_;
  /**
   * <pre>
   * 用户等级信息
   * </pre>
   *
   * <code>.user.PLevelInfo level = 3;</code>
   * @return Whether the level field is set.
   */
  public boolean hasLevel() {
    return level_ != null;
  }
  /**
   * <pre>
   * 用户等级信息
   * </pre>
   *
   * <code>.user.PLevelInfo level = 3;</code>
   * @return The level.
   */
  public com.proto.user.PLevelInfo getLevel() {
    return level_ == null ? com.proto.user.PLevelInfo.getDefaultInstance() : level_;
  }
  /**
   * <pre>
   * 用户等级信息
   * </pre>
   *
   * <code>.user.PLevelInfo level = 3;</code>
   */
  public com.proto.user.PLevelInfoOrBuilder getLevelOrBuilder() {
    return getLevel();
  }

  public static final int TRACEID_FIELD_NUMBER = 4;
  private volatile java.lang.Object traceId_;
  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 4;</code>
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
   * <code>string traceId = 4;</code>
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
    if (code_ != com.proto.comm.ErrorType.Norm.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (level_ != null) {
      output.writeMessage(3, getLevel());
    }
    if (!getTraceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, traceId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.proto.comm.ErrorType.Norm.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (level_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLevel());
    }
    if (!getTraceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, traceId_);
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
    if (!(obj instanceof com.proto.user.GetUserPLevelReply)) {
      return super.equals(obj);
    }
    com.proto.user.GetUserPLevelReply other = (com.proto.user.GetUserPLevelReply) obj;

    if (code_ != other.code_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasLevel() != other.hasLevel()) return false;
    if (hasLevel()) {
      if (!getLevel()
          .equals(other.getLevel())) return false;
    }
    if (!getTraceId()
        .equals(other.getTraceId())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasLevel()) {
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel().hashCode();
    }
    hash = (37 * hash) + TRACEID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.user.GetUserPLevelReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.GetUserPLevelReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.user.GetUserPLevelReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.GetUserPLevelReply parseFrom(
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
  public static Builder newBuilder(com.proto.user.GetUserPLevelReply prototype) {
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
   * 响应用户等级信息
   * </pre>
   *
   * Protobuf type {@code user.GetUserPLevelReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.GetUserPLevelReply)
      com.proto.user.GetUserPLevelReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.user.User.internal_static_user_GetUserPLevelReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.user.User.internal_static_user_GetUserPLevelReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.user.GetUserPLevelReply.class, com.proto.user.GetUserPLevelReply.Builder.class);
    }

    // Construct using com.proto.user.GetUserPLevelReply.newBuilder()
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
      code_ = 0;

      message_ = "";

      if (levelBuilder_ == null) {
        level_ = null;
      } else {
        level_ = null;
        levelBuilder_ = null;
      }
      traceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.user.User.internal_static_user_GetUserPLevelReply_descriptor;
    }

    @java.lang.Override
    public com.proto.user.GetUserPLevelReply getDefaultInstanceForType() {
      return com.proto.user.GetUserPLevelReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.user.GetUserPLevelReply build() {
      com.proto.user.GetUserPLevelReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.user.GetUserPLevelReply buildPartial() {
      com.proto.user.GetUserPLevelReply result = new com.proto.user.GetUserPLevelReply(this);
      result.code_ = code_;
      result.message_ = message_;
      if (levelBuilder_ == null) {
        result.level_ = level_;
      } else {
        result.level_ = levelBuilder_.build();
      }
      result.traceId_ = traceId_;
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
      if (other instanceof com.proto.user.GetUserPLevelReply) {
        return mergeFrom((com.proto.user.GetUserPLevelReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.user.GetUserPLevelReply other) {
      if (other == com.proto.user.GetUserPLevelReply.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasLevel()) {
        mergeLevel(other.getLevel());
      }
      if (!other.getTraceId().isEmpty()) {
        traceId_ = other.traceId_;
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
      com.proto.user.GetUserPLevelReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.user.GetUserPLevelReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ = 0;
    /**
     * <code>.comm.ErrorType code = 1;</code>
     * @return The enum numeric value on the wire for code.
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.comm.ErrorType code = 1;</code>
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.comm.ErrorType code = 1;</code>
     * @return The code.
     */
    public com.proto.comm.ErrorType getCode() {
      @SuppressWarnings("deprecation")
      com.proto.comm.ErrorType result = com.proto.comm.ErrorType.valueOf(code_);
      return result == null ? com.proto.comm.ErrorType.UNRECOGNIZED : result;
    }
    /**
     * <code>.comm.ErrorType code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.proto.comm.ErrorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.comm.ErrorType code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private com.proto.user.PLevelInfo level_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.user.PLevelInfo, com.proto.user.PLevelInfo.Builder, com.proto.user.PLevelInfoOrBuilder> levelBuilder_;
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     * @return Whether the level field is set.
     */
    public boolean hasLevel() {
      return levelBuilder_ != null || level_ != null;
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     * @return The level.
     */
    public com.proto.user.PLevelInfo getLevel() {
      if (levelBuilder_ == null) {
        return level_ == null ? com.proto.user.PLevelInfo.getDefaultInstance() : level_;
      } else {
        return levelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     */
    public Builder setLevel(com.proto.user.PLevelInfo value) {
      if (levelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        level_ = value;
        onChanged();
      } else {
        levelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     */
    public Builder setLevel(
        com.proto.user.PLevelInfo.Builder builderForValue) {
      if (levelBuilder_ == null) {
        level_ = builderForValue.build();
        onChanged();
      } else {
        levelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     */
    public Builder mergeLevel(com.proto.user.PLevelInfo value) {
      if (levelBuilder_ == null) {
        if (level_ != null) {
          level_ =
            com.proto.user.PLevelInfo.newBuilder(level_).mergeFrom(value).buildPartial();
        } else {
          level_ = value;
        }
        onChanged();
      } else {
        levelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     */
    public Builder clearLevel() {
      if (levelBuilder_ == null) {
        level_ = null;
        onChanged();
      } else {
        level_ = null;
        levelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     */
    public com.proto.user.PLevelInfo.Builder getLevelBuilder() {
      
      onChanged();
      return getLevelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     */
    public com.proto.user.PLevelInfoOrBuilder getLevelOrBuilder() {
      if (levelBuilder_ != null) {
        return levelBuilder_.getMessageOrBuilder();
      } else {
        return level_ == null ?
            com.proto.user.PLevelInfo.getDefaultInstance() : level_;
      }
    }
    /**
     * <pre>
     * 用户等级信息
     * </pre>
     *
     * <code>.user.PLevelInfo level = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.user.PLevelInfo, com.proto.user.PLevelInfo.Builder, com.proto.user.PLevelInfoOrBuilder> 
        getLevelFieldBuilder() {
      if (levelBuilder_ == null) {
        levelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.user.PLevelInfo, com.proto.user.PLevelInfo.Builder, com.proto.user.PLevelInfoOrBuilder>(
                getLevel(),
                getParentForChildren(),
                isClean());
        level_ = null;
      }
      return levelBuilder_;
    }

    private java.lang.Object traceId_ = "";
    /**
     * <pre>
     * 用户的uuid，用来追踪用户消息链路
     * </pre>
     *
     * <code>string traceId = 4;</code>
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
     * <code>string traceId = 4;</code>
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
     * <code>string traceId = 4;</code>
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
     * <code>string traceId = 4;</code>
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
     * <code>string traceId = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:user.GetUserPLevelReply)
  }

  // @@protoc_insertion_point(class_scope:user.GetUserPLevelReply)
  private static final com.proto.user.GetUserPLevelReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.user.GetUserPLevelReply();
  }

  public static com.proto.user.GetUserPLevelReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserPLevelReply>
      PARSER = new com.google.protobuf.AbstractParser<GetUserPLevelReply>() {
    @java.lang.Override
    public GetUserPLevelReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUserPLevelReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUserPLevelReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserPLevelReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.user.GetUserPLevelReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

