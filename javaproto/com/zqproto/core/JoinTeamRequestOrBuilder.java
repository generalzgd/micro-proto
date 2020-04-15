// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/teamdef.proto

package com.zqproto.core;

public interface JoinTeamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:core.JoinTeamRequest)
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
   * 要加入的队伍编号
   * </pre>
   *
   * <code>string teamId = 2;</code>
   * @return The teamId.
   */
  java.lang.String getTeamId();
  /**
   * <pre>
   * 要加入的队伍编号
   * </pre>
   *
   * <code>string teamId = 2;</code>
   * @return The bytes for teamId.
   */
  com.google.protobuf.ByteString
      getTeamIdBytes();

  /**
   * <pre>
   * 自己的队伍编号
   * </pre>
   *
   * <code>string myTeamId = 3;</code>
   * @return The myTeamId.
   */
  java.lang.String getMyTeamId();
  /**
   * <pre>
   * 自己的队伍编号
   * </pre>
   *
   * <code>string myTeamId = 3;</code>
   * @return The bytes for myTeamId.
   */
  com.google.protobuf.ByteString
      getMyTeamIdBytes();
}