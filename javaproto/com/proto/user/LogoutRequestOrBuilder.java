// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

public interface LogoutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.LogoutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 1;</code>
   * @return The traceId.
   */
  java.lang.String getTraceId();
  /**
   * <pre>
   * 用户的uuid，用来追踪用户消息链路
   * </pre>
   *
   * <code>string traceId = 1;</code>
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString
      getTraceIdBytes();

  /**
   * <pre>
   * true:手动正常退出，false:异常断开退出. 客户端发起该协议，需要指定true
   * </pre>
   *
   * <code>bool except = 2;</code>
   * @return The except.
   */
  boolean getExcept();
}