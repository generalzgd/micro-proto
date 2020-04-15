// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/teamdef.proto

package com.zqproto.core;

/**
 * <pre>
 * 匹配状态
 * </pre>
 *
 * Protobuf enum {@code core.MatchState}
 */
public enum MatchState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 匹配 空闲状态
   * </pre>
   *
   * <code>MatchIdle = 0;</code>
   */
  MatchIdle(0),
  /**
   * <pre>
   * 匹配 主队
   * </pre>
   *
   * <code>MatchLeader = 1;</code>
   */
  MatchLeader(1),
  /**
   * <pre>
   * 匹配 从对
   * </pre>
   *
   * <code>MatchFollower = 2;</code>
   */
  MatchFollower(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 匹配 空闲状态
   * </pre>
   *
   * <code>MatchIdle = 0;</code>
   */
  public static final int MatchIdle_VALUE = 0;
  /**
   * <pre>
   * 匹配 主队
   * </pre>
   *
   * <code>MatchLeader = 1;</code>
   */
  public static final int MatchLeader_VALUE = 1;
  /**
   * <pre>
   * 匹配 从对
   * </pre>
   *
   * <code>MatchFollower = 2;</code>
   */
  public static final int MatchFollower_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MatchState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MatchState forNumber(int value) {
    switch (value) {
      case 0: return MatchIdle;
      case 1: return MatchLeader;
      case 2: return MatchFollower;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MatchState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MatchState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MatchState>() {
          public MatchState findValueByNumber(int number) {
            return MatchState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.zqproto.core.Core.getDescriptor().getEnumTypes().get(3);
  }

  private static final MatchState[] VALUES = values();

  public static MatchState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MatchState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:core.MatchState)
}
