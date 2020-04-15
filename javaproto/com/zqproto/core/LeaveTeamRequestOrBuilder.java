// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/teamdef.proto

package com.zqproto.core;

public interface LeaveTeamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:core.LeaveTeamRequest)
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
   * 队伍编号
   * </pre>
   *
   * <code>string teamId = 2;</code>
   * @return The teamId.
   */
  java.lang.String getTeamId();
  /**
   * <pre>
   * 队伍编号
   * </pre>
   *
   * <code>string teamId = 2;</code>
   * @return The bytes for teamId.
   */
  com.google.protobuf.ByteString
      getTeamIdBytes();

  /**
   * <pre>
   * 自己的uid, 如果是队长离开，需要更换队长。离开后广播队伍信息DuoTeamInfo
   * </pre>
   *
   * <code>uint32 uid = 3;</code>
   * @return The uid.
   */
  int getUid();
}
