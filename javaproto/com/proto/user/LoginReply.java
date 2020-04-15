// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

/**
 * <pre>
 * 通用登录协议
 * </pre>
 *
 * Protobuf type {@code user.LoginReply}
 */
public  final class LoginReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.LoginReply)
    LoginReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoginReply.newBuilder() to construct.
  private LoginReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginReply() {
    code_ = 0;
    message_ = "";
    traceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoginReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoginReply(
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
            com.proto.user.UserInfo.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.proto.user.UserInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            traceId_ = s;
            break;
          }
          case 40: {

            loginCnt_ = input.readUInt32();
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
    return com.proto.user.User.internal_static_user_LoginReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.user.User.internal_static_user_LoginReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.user.LoginReply.class, com.proto.user.LoginReply.Builder.class);
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

  public static final int USER_FIELD_NUMBER = 3;
  private com.proto.user.UserInfo user_;
  /**
   * <pre>
   * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
   * </pre>
   *
   * <code>.user.UserInfo user = 3;</code>
   * @return Whether the user field is set.
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <pre>
   * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
   * </pre>
   *
   * <code>.user.UserInfo user = 3;</code>
   * @return The user.
   */
  public com.proto.user.UserInfo getUser() {
    return user_ == null ? com.proto.user.UserInfo.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
   * </pre>
   *
   * <code>.user.UserInfo user = 3;</code>
   */
  public com.proto.user.UserInfoOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int TRACEID_FIELD_NUMBER = 4;
  private volatile java.lang.Object traceId_;
  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链
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
   * 用户的uuid，用来追踪用户消息链
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

  public static final int LOGINCNT_FIELD_NUMBER = 5;
  private int loginCnt_;
  /**
   * <pre>
   * 当前端已登录数量，如果&gt;1，需要踢掉旧链接。redis里值不超过1
   * </pre>
   *
   * <code>uint32 loginCnt = 5;</code>
   * @return The loginCnt.
   */
  public int getLoginCnt() {
    return loginCnt_;
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
    if (user_ != null) {
      output.writeMessage(3, getUser());
    }
    if (!getTraceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, traceId_);
    }
    if (loginCnt_ != 0) {
      output.writeUInt32(5, loginCnt_);
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
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUser());
    }
    if (!getTraceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, traceId_);
    }
    if (loginCnt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, loginCnt_);
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
    if (!(obj instanceof com.proto.user.LoginReply)) {
      return super.equals(obj);
    }
    com.proto.user.LoginReply other = (com.proto.user.LoginReply) obj;

    if (code_ != other.code_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getTraceId()
        .equals(other.getTraceId())) return false;
    if (getLoginCnt()
        != other.getLoginCnt()) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + TRACEID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceId().hashCode();
    hash = (37 * hash) + LOGINCNT_FIELD_NUMBER;
    hash = (53 * hash) + getLoginCnt();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.user.LoginReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.LoginReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.LoginReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.LoginReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.LoginReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.user.LoginReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.user.LoginReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.LoginReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.LoginReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.user.LoginReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.user.LoginReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.user.LoginReply parseFrom(
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
  public static Builder newBuilder(com.proto.user.LoginReply prototype) {
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
   * 通用登录协议
   * </pre>
   *
   * Protobuf type {@code user.LoginReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.LoginReply)
      com.proto.user.LoginReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.user.User.internal_static_user_LoginReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.user.User.internal_static_user_LoginReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.user.LoginReply.class, com.proto.user.LoginReply.Builder.class);
    }

    // Construct using com.proto.user.LoginReply.newBuilder()
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

      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      traceId_ = "";

      loginCnt_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.user.User.internal_static_user_LoginReply_descriptor;
    }

    @java.lang.Override
    public com.proto.user.LoginReply getDefaultInstanceForType() {
      return com.proto.user.LoginReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.user.LoginReply build() {
      com.proto.user.LoginReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.user.LoginReply buildPartial() {
      com.proto.user.LoginReply result = new com.proto.user.LoginReply(this);
      result.code_ = code_;
      result.message_ = message_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      result.traceId_ = traceId_;
      result.loginCnt_ = loginCnt_;
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
      if (other instanceof com.proto.user.LoginReply) {
        return mergeFrom((com.proto.user.LoginReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.user.LoginReply other) {
      if (other == com.proto.user.LoginReply.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (!other.getTraceId().isEmpty()) {
        traceId_ = other.traceId_;
        onChanged();
      }
      if (other.getLoginCnt() != 0) {
        setLoginCnt(other.getLoginCnt());
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
      com.proto.user.LoginReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.user.LoginReply) e.getUnfinishedMessage();
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

    private com.proto.user.UserInfo user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.user.UserInfo, com.proto.user.UserInfo.Builder, com.proto.user.UserInfoOrBuilder> userBuilder_;
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     * @return The user.
     */
    public com.proto.user.UserInfo getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.proto.user.UserInfo.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     */
    public Builder setUser(com.proto.user.UserInfo value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     */
    public Builder setUser(
        com.proto.user.UserInfo.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     */
    public Builder mergeUser(com.proto.user.UserInfo value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.proto.user.UserInfo.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     */
    public com.proto.user.UserInfo.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     */
    public com.proto.user.UserInfoOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.proto.user.UserInfo.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     * 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新登录获取
     * </pre>
     *
     * <code>.user.UserInfo user = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.user.UserInfo, com.proto.user.UserInfo.Builder, com.proto.user.UserInfoOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.user.UserInfo, com.proto.user.UserInfo.Builder, com.proto.user.UserInfoOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private java.lang.Object traceId_ = "";
    /**
     * <pre>
     * 用户的uuid，用来追踪用户消息链
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
     * 用户的uuid，用来追踪用户消息链
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
     * 用户的uuid，用来追踪用户消息链
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
     * 用户的uuid，用来追踪用户消息链
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
     * 用户的uuid，用来追踪用户消息链
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

    private int loginCnt_ ;
    /**
     * <pre>
     * 当前端已登录数量，如果&gt;1，需要踢掉旧链接。redis里值不超过1
     * </pre>
     *
     * <code>uint32 loginCnt = 5;</code>
     * @return The loginCnt.
     */
    public int getLoginCnt() {
      return loginCnt_;
    }
    /**
     * <pre>
     * 当前端已登录数量，如果&gt;1，需要踢掉旧链接。redis里值不超过1
     * </pre>
     *
     * <code>uint32 loginCnt = 5;</code>
     * @param value The loginCnt to set.
     * @return This builder for chaining.
     */
    public Builder setLoginCnt(int value) {
      
      loginCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 当前端已登录数量，如果&gt;1，需要踢掉旧链接。redis里值不超过1
     * </pre>
     *
     * <code>uint32 loginCnt = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoginCnt() {
      
      loginCnt_ = 0;
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


    // @@protoc_insertion_point(builder_scope:user.LoginReply)
  }

  // @@protoc_insertion_point(class_scope:user.LoginReply)
  private static final com.proto.user.LoginReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.user.LoginReply();
  }

  public static com.proto.user.LoginReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginReply>
      PARSER = new com.google.protobuf.AbstractParser<LoginReply>() {
    @java.lang.Override
    public LoginReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoginReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.user.LoginReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

