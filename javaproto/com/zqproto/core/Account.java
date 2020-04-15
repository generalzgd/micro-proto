// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/teamdef.proto

package com.zqproto.core;

/**
 * <pre>
 * 多多账号和浩方账号信息
 * </pre>
 *
 * Protobuf type {@code core.Account}
 */
public  final class Account extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:core.Account)
    AccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Account.newBuilder() to construct.
  private Account(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Account() {
    nickname_ = "";
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Account();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Account(
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
          case 10: {
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nickname_ = s;
            break;
          }
          case 24: {

            joinTime_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            state_ = rawValue;
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
    return com.zqproto.core.Core.internal_static_core_Account_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zqproto.core.Core.internal_static_core_Account_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zqproto.core.Account.class, com.zqproto.core.Account.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private com.proto.user.UserInfo user_;
  /**
   * <pre>
   * 账号信息
   * </pre>
   *
   * <code>.user.UserInfo user = 1;</code>
   * @return Whether the user field is set.
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <pre>
   * 账号信息
   * </pre>
   *
   * <code>.user.UserInfo user = 1;</code>
   * @return The user.
   */
  public com.proto.user.UserInfo getUser() {
    return user_ == null ? com.proto.user.UserInfo.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * 账号信息
   * </pre>
   *
   * <code>.user.UserInfo user = 1;</code>
   */
  public com.proto.user.UserInfoOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int NICKNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object nickname_;
  /**
   * <pre>
   * 多多账号昵称
   * </pre>
   *
   * <code>string Nickname = 2;</code>
   * @return The nickname.
   */
  public java.lang.String getNickname() {
    java.lang.Object ref = nickname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nickname_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 多多账号昵称
   * </pre>
   *
   * <code>string Nickname = 2;</code>
   * @return The bytes for nickname.
   */
  public com.google.protobuf.ByteString
      getNicknameBytes() {
    java.lang.Object ref = nickname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nickname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOINTIME_FIELD_NUMBER = 3;
  private long joinTime_;
  /**
   * <pre>
   * 加入队伍时间戳
   * </pre>
   *
   * <code>int64 joinTime = 3;</code>
   * @return The joinTime.
   */
  public long getJoinTime() {
    return joinTime_;
  }

  public static final int STATE_FIELD_NUMBER = 4;
  private int state_;
  /**
   * <pre>
   * 队员准备状态
   * </pre>
   *
   * <code>.core.TeamMemberState state = 4;</code>
   * @return The enum numeric value on the wire for state.
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * 队员准备状态
   * </pre>
   *
   * <code>.core.TeamMemberState state = 4;</code>
   * @return The state.
   */
  public com.zqproto.core.TeamMemberState getState() {
    @SuppressWarnings("deprecation")
    com.zqproto.core.TeamMemberState result = com.zqproto.core.TeamMemberState.valueOf(state_);
    return result == null ? com.zqproto.core.TeamMemberState.UNRECOGNIZED : result;
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
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    if (!getNicknameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nickname_);
    }
    if (joinTime_ != 0L) {
      output.writeInt64(3, joinTime_);
    }
    if (state_ != com.zqproto.core.TeamMemberState.Idle.getNumber()) {
      output.writeEnum(4, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    if (!getNicknameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nickname_);
    }
    if (joinTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, joinTime_);
    }
    if (state_ != com.zqproto.core.TeamMemberState.Idle.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, state_);
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
    if (!(obj instanceof com.zqproto.core.Account)) {
      return super.equals(obj);
    }
    com.zqproto.core.Account other = (com.zqproto.core.Account) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getNickname()
        .equals(other.getNickname())) return false;
    if (getJoinTime()
        != other.getJoinTime()) return false;
    if (state_ != other.state_) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getNickname().hashCode();
    hash = (37 * hash) + JOINTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJoinTime());
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zqproto.core.Account parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zqproto.core.Account parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zqproto.core.Account parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zqproto.core.Account parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zqproto.core.Account parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zqproto.core.Account parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zqproto.core.Account parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zqproto.core.Account parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zqproto.core.Account parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zqproto.core.Account parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zqproto.core.Account parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zqproto.core.Account parseFrom(
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
  public static Builder newBuilder(com.zqproto.core.Account prototype) {
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
   * 多多账号和浩方账号信息
   * </pre>
   *
   * Protobuf type {@code core.Account}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:core.Account)
      com.zqproto.core.AccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zqproto.core.Core.internal_static_core_Account_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zqproto.core.Core.internal_static_core_Account_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zqproto.core.Account.class, com.zqproto.core.Account.Builder.class);
    }

    // Construct using com.zqproto.core.Account.newBuilder()
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
      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      nickname_ = "";

      joinTime_ = 0L;

      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zqproto.core.Core.internal_static_core_Account_descriptor;
    }

    @java.lang.Override
    public com.zqproto.core.Account getDefaultInstanceForType() {
      return com.zqproto.core.Account.getDefaultInstance();
    }

    @java.lang.Override
    public com.zqproto.core.Account build() {
      com.zqproto.core.Account result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zqproto.core.Account buildPartial() {
      com.zqproto.core.Account result = new com.zqproto.core.Account(this);
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      result.nickname_ = nickname_;
      result.joinTime_ = joinTime_;
      result.state_ = state_;
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
      if (other instanceof com.zqproto.core.Account) {
        return mergeFrom((com.zqproto.core.Account)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zqproto.core.Account other) {
      if (other == com.zqproto.core.Account.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (!other.getNickname().isEmpty()) {
        nickname_ = other.nickname_;
        onChanged();
      }
      if (other.getJoinTime() != 0L) {
        setJoinTime(other.getJoinTime());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
      com.zqproto.core.Account parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zqproto.core.Account) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.user.UserInfo user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.user.UserInfo, com.proto.user.UserInfo.Builder, com.proto.user.UserInfoOrBuilder> userBuilder_;
    /**
     * <pre>
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <pre>
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
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
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
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
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
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
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
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
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
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
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
     */
    public com.proto.user.UserInfo.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
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
     * 账号信息
     * </pre>
     *
     * <code>.user.UserInfo user = 1;</code>
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

    private java.lang.Object nickname_ = "";
    /**
     * <pre>
     * 多多账号昵称
     * </pre>
     *
     * <code>string Nickname = 2;</code>
     * @return The nickname.
     */
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 多多账号昵称
     * </pre>
     *
     * <code>string Nickname = 2;</code>
     * @return The bytes for nickname.
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 多多账号昵称
     * </pre>
     *
     * <code>string Nickname = 2;</code>
     * @param value The nickname to set.
     * @return This builder for chaining.
     */
    public Builder setNickname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nickname_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 多多账号昵称
     * </pre>
     *
     * <code>string Nickname = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNickname() {
      
      nickname_ = getDefaultInstance().getNickname();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 多多账号昵称
     * </pre>
     *
     * <code>string Nickname = 2;</code>
     * @param value The bytes for nickname to set.
     * @return This builder for chaining.
     */
    public Builder setNicknameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nickname_ = value;
      onChanged();
      return this;
    }

    private long joinTime_ ;
    /**
     * <pre>
     * 加入队伍时间戳
     * </pre>
     *
     * <code>int64 joinTime = 3;</code>
     * @return The joinTime.
     */
    public long getJoinTime() {
      return joinTime_;
    }
    /**
     * <pre>
     * 加入队伍时间戳
     * </pre>
     *
     * <code>int64 joinTime = 3;</code>
     * @param value The joinTime to set.
     * @return This builder for chaining.
     */
    public Builder setJoinTime(long value) {
      
      joinTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 加入队伍时间戳
     * </pre>
     *
     * <code>int64 joinTime = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJoinTime() {
      
      joinTime_ = 0L;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <pre>
     * 队员准备状态
     * </pre>
     *
     * <code>.core.TeamMemberState state = 4;</code>
     * @return The enum numeric value on the wire for state.
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * 队员准备状态
     * </pre>
     *
     * <code>.core.TeamMemberState state = 4;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 队员准备状态
     * </pre>
     *
     * <code>.core.TeamMemberState state = 4;</code>
     * @return The state.
     */
    public com.zqproto.core.TeamMemberState getState() {
      @SuppressWarnings("deprecation")
      com.zqproto.core.TeamMemberState result = com.zqproto.core.TeamMemberState.valueOf(state_);
      return result == null ? com.zqproto.core.TeamMemberState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 队员准备状态
     * </pre>
     *
     * <code>.core.TeamMemberState state = 4;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.zqproto.core.TeamMemberState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 队员准备状态
     * </pre>
     *
     * <code>.core.TeamMemberState state = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:core.Account)
  }

  // @@protoc_insertion_point(class_scope:core.Account)
  private static final com.zqproto.core.Account DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zqproto.core.Account();
  }

  public static com.zqproto.core.Account getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Account>
      PARSER = new com.google.protobuf.AbstractParser<Account>() {
    @java.lang.Override
    public Account parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Account(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Account> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Account> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zqproto.core.Account getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

