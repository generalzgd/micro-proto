// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

public interface UserInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.UserInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 uid = 1;</code>
   * @return The uid.
   */
  int getUid();

  /**
   * <code>string nickname = 2;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 2;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>string avatar = 3;</code>
   * @return The avatar.
   */
  java.lang.String getAvatar();
  /**
   * <code>string avatar = 3;</code>
   * @return The bytes for avatar.
   */
  com.google.protobuf.ByteString
      getAvatarBytes();

  /**
   * <code>uint32 gender = 4;</code>
   * @return The gender.
   */
  int getGender();

  /**
   * <pre>
   * 用户权限
   * </pre>
   *
   * <code>.user.UserIdent ident = 5;</code>
   * @return The enum numeric value on the wire for ident.
   */
  int getIdentValue();
  /**
   * <pre>
   * 用户权限
   * </pre>
   *
   * <code>.user.UserIdent ident = 5;</code>
   * @return The ident.
   */
  com.proto.user.UserIdent getIdent();

  /**
   * <pre>
   * 用户等级
   * </pre>
   *
   * <code>.user.PLevelInfo plevel = 6;</code>
   * @return Whether the plevel field is set.
   */
  boolean hasPlevel();
  /**
   * <pre>
   * 用户等级
   * </pre>
   *
   * <code>.user.PLevelInfo plevel = 6;</code>
   * @return The plevel.
   */
  com.proto.user.PLevelInfo getPlevel();
  /**
   * <pre>
   * 用户等级
   * </pre>
   *
   * <code>.user.PLevelInfo plevel = 6;</code>
   */
  com.proto.user.PLevelInfoOrBuilder getPlevelOrBuilder();

  /**
   * <pre>
   * 是否主播
   * </pre>
   *
   * <code>bool anchor = 7;</code>
   * @return The anchor.
   */
  boolean getAnchor();

  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>string mobile = 8;</code>
   * @return The mobile.
   */
  java.lang.String getMobile();
  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>string mobile = 8;</code>
   * @return The bytes for mobile.
   */
  com.google.protobuf.ByteString
      getMobileBytes();

  /**
   * <pre>
   * </pre>
   *
   * <code>string invite_code = 9;</code>
   * @return The inviteCode.
   */
  java.lang.String getInviteCode();
  /**
   * <pre>
   * </pre>
   *
   * <code>string invite_code = 9;</code>
   * @return The bytes for inviteCode.
   */
  com.google.protobuf.ByteString
      getInviteCodeBytes();
}
