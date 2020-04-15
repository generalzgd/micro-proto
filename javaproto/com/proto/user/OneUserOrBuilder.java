// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

public interface OneUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.OneUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 为0表示发给所有人
   * </pre>
   *
   * <code>uint32 uid = 1;</code>
   * @return The uid.
   */
  int getUid();

  /**
   * <pre>
   * 为FFFFFFFF表示发给所有端
   * </pre>
   *
   * <code>uint32 platform = 2;</code>
   * @return The platform.
   */
  int getPlatform();

  /**
   * <pre>
   * 链接ID
   * </pre>
   *
   * <code>uint32 socketId = 3;</code>
   * @return The socketId.
   */
  int getSocketId();

  /**
   * <pre>
   * 网关IP
   * </pre>
   *
   * <code>string gateIp = 4;</code>
   * @return The gateIp.
   */
  java.lang.String getGateIp();
  /**
   * <pre>
   * 网关IP
   * </pre>
   *
   * <code>string gateIp = 4;</code>
   * @return The bytes for gateIp.
   */
  com.google.protobuf.ByteString
      getGateIpBytes();
}