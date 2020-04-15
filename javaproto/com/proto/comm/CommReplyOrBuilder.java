// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comm/common.proto

package com.proto.comm;

public interface CommReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comm.CommReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.comm.ErrorType code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.comm.ErrorType code = 1;</code>
   * @return The code.
   */
  com.proto.comm.ErrorType getCode();

  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 2;</code>
   * @return The traceId.
   */
  java.lang.String getTraceId();
  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 2;</code>
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();

  /**
   * <pre>
   * 错误消息描述
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * 错误消息描述
   * </pre>
   *
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}