// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/teamdef.proto

package com.zqproto.core;

/**
 * Protobuf type {@code core.JoinTeamReply}
 */
public  final class JoinTeamReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:core.JoinTeamReply)
    JoinTeamReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinTeamReply.newBuilder() to construct.
  private JoinTeamReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinTeamReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinTeamReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JoinTeamReply(
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
            com.proto.comm.CommReply.Builder subBuilder = null;
            if (res_ != null) {
              subBuilder = res_.toBuilder();
            }
            res_ = input.readMessage(com.proto.comm.CommReply.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(res_);
              res_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.zqproto.core.TeamInfo.Builder subBuilder = null;
            if (teamInfo_ != null) {
              subBuilder = teamInfo_.toBuilder();
            }
            teamInfo_ = input.readMessage(com.zqproto.core.TeamInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(teamInfo_);
              teamInfo_ = subBuilder.buildPartial();
            }

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
    return com.zqproto.core.Core.internal_static_core_JoinTeamReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zqproto.core.Core.internal_static_core_JoinTeamReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zqproto.core.JoinTeamReply.class, com.zqproto.core.JoinTeamReply.Builder.class);
  }

  public static final int RES_FIELD_NUMBER = 1;
  private com.proto.comm.CommReply res_;
  /**
   * <code>.comm.CommReply res = 1;</code>
   * @return Whether the res field is set.
   */
  public boolean hasRes() {
    return res_ != null;
  }
  /**
   * <code>.comm.CommReply res = 1;</code>
   * @return The res.
   */
  public com.proto.comm.CommReply getRes() {
    return res_ == null ? com.proto.comm.CommReply.getDefaultInstance() : res_;
  }
  /**
   * <code>.comm.CommReply res = 1;</code>
   */
  public com.proto.comm.CommReplyOrBuilder getResOrBuilder() {
    return getRes();
  }

  public static final int TEAMINFO_FIELD_NUMBER = 2;
  private com.zqproto.core.TeamInfo teamInfo_;
  /**
   * <pre>
   * 返回加入成功后的队伍信息
   * </pre>
   *
   * <code>.core.TeamInfo teamInfo = 2;</code>
   * @return Whether the teamInfo field is set.
   */
  public boolean hasTeamInfo() {
    return teamInfo_ != null;
  }
  /**
   * <pre>
   * 返回加入成功后的队伍信息
   * </pre>
   *
   * <code>.core.TeamInfo teamInfo = 2;</code>
   * @return The teamInfo.
   */
  public com.zqproto.core.TeamInfo getTeamInfo() {
    return teamInfo_ == null ? com.zqproto.core.TeamInfo.getDefaultInstance() : teamInfo_;
  }
  /**
   * <pre>
   * 返回加入成功后的队伍信息
   * </pre>
   *
   * <code>.core.TeamInfo teamInfo = 2;</code>
   */
  public com.zqproto.core.TeamInfoOrBuilder getTeamInfoOrBuilder() {
    return getTeamInfo();
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
    if (res_ != null) {
      output.writeMessage(1, getRes());
    }
    if (teamInfo_ != null) {
      output.writeMessage(2, getTeamInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (res_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRes());
    }
    if (teamInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTeamInfo());
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
    if (!(obj instanceof com.zqproto.core.JoinTeamReply)) {
      return super.equals(obj);
    }
    com.zqproto.core.JoinTeamReply other = (com.zqproto.core.JoinTeamReply) obj;

    if (hasRes() != other.hasRes()) return false;
    if (hasRes()) {
      if (!getRes()
          .equals(other.getRes())) return false;
    }
    if (hasTeamInfo() != other.hasTeamInfo()) return false;
    if (hasTeamInfo()) {
      if (!getTeamInfo()
          .equals(other.getTeamInfo())) return false;
    }
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
    if (hasRes()) {
      hash = (37 * hash) + RES_FIELD_NUMBER;
      hash = (53 * hash) + getRes().hashCode();
    }
    if (hasTeamInfo()) {
      hash = (37 * hash) + TEAMINFO_FIELD_NUMBER;
      hash = (53 * hash) + getTeamInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zqproto.core.JoinTeamReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zqproto.core.JoinTeamReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zqproto.core.JoinTeamReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zqproto.core.JoinTeamReply parseFrom(
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
  public static Builder newBuilder(com.zqproto.core.JoinTeamReply prototype) {
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
   * Protobuf type {@code core.JoinTeamReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:core.JoinTeamReply)
      com.zqproto.core.JoinTeamReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zqproto.core.Core.internal_static_core_JoinTeamReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zqproto.core.Core.internal_static_core_JoinTeamReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zqproto.core.JoinTeamReply.class, com.zqproto.core.JoinTeamReply.Builder.class);
    }

    // Construct using com.zqproto.core.JoinTeamReply.newBuilder()
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
      if (resBuilder_ == null) {
        res_ = null;
      } else {
        res_ = null;
        resBuilder_ = null;
      }
      if (teamInfoBuilder_ == null) {
        teamInfo_ = null;
      } else {
        teamInfo_ = null;
        teamInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zqproto.core.Core.internal_static_core_JoinTeamReply_descriptor;
    }

    @java.lang.Override
    public com.zqproto.core.JoinTeamReply getDefaultInstanceForType() {
      return com.zqproto.core.JoinTeamReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.zqproto.core.JoinTeamReply build() {
      com.zqproto.core.JoinTeamReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zqproto.core.JoinTeamReply buildPartial() {
      com.zqproto.core.JoinTeamReply result = new com.zqproto.core.JoinTeamReply(this);
      if (resBuilder_ == null) {
        result.res_ = res_;
      } else {
        result.res_ = resBuilder_.build();
      }
      if (teamInfoBuilder_ == null) {
        result.teamInfo_ = teamInfo_;
      } else {
        result.teamInfo_ = teamInfoBuilder_.build();
      }
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
      if (other instanceof com.zqproto.core.JoinTeamReply) {
        return mergeFrom((com.zqproto.core.JoinTeamReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zqproto.core.JoinTeamReply other) {
      if (other == com.zqproto.core.JoinTeamReply.getDefaultInstance()) return this;
      if (other.hasRes()) {
        mergeRes(other.getRes());
      }
      if (other.hasTeamInfo()) {
        mergeTeamInfo(other.getTeamInfo());
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
      com.zqproto.core.JoinTeamReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zqproto.core.JoinTeamReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.comm.CommReply res_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.comm.CommReply, com.proto.comm.CommReply.Builder, com.proto.comm.CommReplyOrBuilder> resBuilder_;
    /**
     * <code>.comm.CommReply res = 1;</code>
     * @return Whether the res field is set.
     */
    public boolean hasRes() {
      return resBuilder_ != null || res_ != null;
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     * @return The res.
     */
    public com.proto.comm.CommReply getRes() {
      if (resBuilder_ == null) {
        return res_ == null ? com.proto.comm.CommReply.getDefaultInstance() : res_;
      } else {
        return resBuilder_.getMessage();
      }
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     */
    public Builder setRes(com.proto.comm.CommReply value) {
      if (resBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        res_ = value;
        onChanged();
      } else {
        resBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     */
    public Builder setRes(
        com.proto.comm.CommReply.Builder builderForValue) {
      if (resBuilder_ == null) {
        res_ = builderForValue.build();
        onChanged();
      } else {
        resBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     */
    public Builder mergeRes(com.proto.comm.CommReply value) {
      if (resBuilder_ == null) {
        if (res_ != null) {
          res_ =
            com.proto.comm.CommReply.newBuilder(res_).mergeFrom(value).buildPartial();
        } else {
          res_ = value;
        }
        onChanged();
      } else {
        resBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     */
    public Builder clearRes() {
      if (resBuilder_ == null) {
        res_ = null;
        onChanged();
      } else {
        res_ = null;
        resBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     */
    public com.proto.comm.CommReply.Builder getResBuilder() {
      
      onChanged();
      return getResFieldBuilder().getBuilder();
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     */
    public com.proto.comm.CommReplyOrBuilder getResOrBuilder() {
      if (resBuilder_ != null) {
        return resBuilder_.getMessageOrBuilder();
      } else {
        return res_ == null ?
            com.proto.comm.CommReply.getDefaultInstance() : res_;
      }
    }
    /**
     * <code>.comm.CommReply res = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.comm.CommReply, com.proto.comm.CommReply.Builder, com.proto.comm.CommReplyOrBuilder> 
        getResFieldBuilder() {
      if (resBuilder_ == null) {
        resBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.comm.CommReply, com.proto.comm.CommReply.Builder, com.proto.comm.CommReplyOrBuilder>(
                getRes(),
                getParentForChildren(),
                isClean());
        res_ = null;
      }
      return resBuilder_;
    }

    private com.zqproto.core.TeamInfo teamInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zqproto.core.TeamInfo, com.zqproto.core.TeamInfo.Builder, com.zqproto.core.TeamInfoOrBuilder> teamInfoBuilder_;
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     * @return Whether the teamInfo field is set.
     */
    public boolean hasTeamInfo() {
      return teamInfoBuilder_ != null || teamInfo_ != null;
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     * @return The teamInfo.
     */
    public com.zqproto.core.TeamInfo getTeamInfo() {
      if (teamInfoBuilder_ == null) {
        return teamInfo_ == null ? com.zqproto.core.TeamInfo.getDefaultInstance() : teamInfo_;
      } else {
        return teamInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     */
    public Builder setTeamInfo(com.zqproto.core.TeamInfo value) {
      if (teamInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        teamInfo_ = value;
        onChanged();
      } else {
        teamInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     */
    public Builder setTeamInfo(
        com.zqproto.core.TeamInfo.Builder builderForValue) {
      if (teamInfoBuilder_ == null) {
        teamInfo_ = builderForValue.build();
        onChanged();
      } else {
        teamInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     */
    public Builder mergeTeamInfo(com.zqproto.core.TeamInfo value) {
      if (teamInfoBuilder_ == null) {
        if (teamInfo_ != null) {
          teamInfo_ =
            com.zqproto.core.TeamInfo.newBuilder(teamInfo_).mergeFrom(value).buildPartial();
        } else {
          teamInfo_ = value;
        }
        onChanged();
      } else {
        teamInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     */
    public Builder clearTeamInfo() {
      if (teamInfoBuilder_ == null) {
        teamInfo_ = null;
        onChanged();
      } else {
        teamInfo_ = null;
        teamInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     */
    public com.zqproto.core.TeamInfo.Builder getTeamInfoBuilder() {
      
      onChanged();
      return getTeamInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     */
    public com.zqproto.core.TeamInfoOrBuilder getTeamInfoOrBuilder() {
      if (teamInfoBuilder_ != null) {
        return teamInfoBuilder_.getMessageOrBuilder();
      } else {
        return teamInfo_ == null ?
            com.zqproto.core.TeamInfo.getDefaultInstance() : teamInfo_;
      }
    }
    /**
     * <pre>
     * 返回加入成功后的队伍信息
     * </pre>
     *
     * <code>.core.TeamInfo teamInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zqproto.core.TeamInfo, com.zqproto.core.TeamInfo.Builder, com.zqproto.core.TeamInfoOrBuilder> 
        getTeamInfoFieldBuilder() {
      if (teamInfoBuilder_ == null) {
        teamInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zqproto.core.TeamInfo, com.zqproto.core.TeamInfo.Builder, com.zqproto.core.TeamInfoOrBuilder>(
                getTeamInfo(),
                getParentForChildren(),
                isClean());
        teamInfo_ = null;
      }
      return teamInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:core.JoinTeamReply)
  }

  // @@protoc_insertion_point(class_scope:core.JoinTeamReply)
  private static final com.zqproto.core.JoinTeamReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zqproto.core.JoinTeamReply();
  }

  public static com.zqproto.core.JoinTeamReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinTeamReply>
      PARSER = new com.google.protobuf.AbstractParser<JoinTeamReply>() {
    @java.lang.Override
    public JoinTeamReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JoinTeamReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JoinTeamReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinTeamReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zqproto.core.JoinTeamReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

