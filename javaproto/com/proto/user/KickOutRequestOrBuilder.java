// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

public interface KickOutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.KickOutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 1重复登录
   * </pre>
   *
   * <code>uint32 uid = 1;</code>
   * @return The uid.
   */
  int getUid();

  /**
   * <pre>
   * z最后登录的socket id
   * </pre>
   *
   * <code>uint32 last_sid = 2;</code>
   * @return The lastSid.
   */
  int getLastSid();

  /**
   * <pre>
   * 最后登录的终端
   * </pre>
   *
   * <code>uint32 last_platform = 3;</code>
   * @return The lastPlatform.
   */
  int getLastPlatform();

  /**
   * <code>string message = 4;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 4;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 5;</code>
   * @return The traceId.
   */
  java.lang.String getTraceId();
  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 5;</code>
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();
}
