// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/teamdef.proto

package com.zqproto.core;

public final class Core {
  private Core() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_TeamInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_TeamInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_CreateTeamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_CreateTeamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_CreateTeamReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_CreateTeamReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_JoinTeamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_JoinTeamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_JoinTeamReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_JoinTeamReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_LeaveTeamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_LeaveTeamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_LeaveTeamReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_LeaveTeamReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_KickMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_KickMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_core_KickMemberReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_core_KickMemberReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022core/teamdef.proto\022\004core\032\021comm/common." +
      "proto\032\022user/userdef.proto\"q\n\007Account\022\034\n\004" +
      "user\030\001 \001(\0132\016.user.UserInfo\022\020\n\010Nickname\030\002" +
      " \001(\t\022\020\n\010joinTime\030\003 \001(\003\022$\n\005state\030\004 \001(\0162\025." +
      "core.TeamMemberState\"\201\002\n\010TeamInfo\022\n\n\002id\030" +
      "\001 \001(\t\022\021\n\tleaderUid\030\002 \001(\r\022\036\n\005state\030\004 \001(\0162" +
      "\017.core.TeamState\022\036\n\007members\030\005 \003(\0132\r.core" +
      ".Account\022$\n\006action\030\006 \001(\0162\024.core.TeamInfo" +
      "Action\022\022\n\ncreateTime\030\007 \001(\003\022$\n\nmatchState" +
      "\030\010 \001(\0162\020.core.MatchState\022\022\n\nmatchedIds\030\t" +
      " \001(\t\022\020\n\010playCost\030\n \001(\r\022\020\n\010playMode\030\013 \001(\r" +
      "\"$\n\021CreateTeamRequest\022\017\n\007traceId\030\001 \001(\t\"q" +
      "\n\017CreateTeamReply\022\034\n\003res\030\001 \001(\0132\017.comm.Co" +
      "mmReply\022\036\n\007account\030\002 \001(\0132\r.core.Account\022" +
      " \n\010teamInfo\030\004 \001(\0132\016.core.TeamInfo\"D\n\017Joi" +
      "nTeamRequest\022\017\n\007traceId\030\001 \001(\t\022\016\n\006teamId\030" +
      "\002 \001(\t\022\020\n\010myTeamId\030\003 \001(\t\"O\n\rJoinTeamReply" +
      "\022\034\n\003res\030\001 \001(\0132\017.comm.CommReply\022 \n\010teamIn" +
      "fo\030\002 \001(\0132\016.core.TeamInfo\"@\n\020LeaveTeamReq" +
      "uest\022\017\n\007traceId\030\001 \001(\t\022\016\n\006teamId\030\002 \001(\t\022\013\n" +
      "\003uid\030\003 \001(\r\".\n\016LeaveTeamReply\022\034\n\003res\030\001 \001(" +
      "\0132\017.comm.CommReply\"I\n\021KickMemberRequest\022" +
      "\017\n\007traceId\030\001 \001(\t\022\021\n\ttargetUid\030\002 \001(\r\022\020\n\010m" +
      "yTeamId\030\003 \001(\t\"B\n\017KickMemberReply\022\034\n\003res\030" +
      "\001 \001(\0132\017.comm.CommReply\022\021\n\tkickedUid\030\002 \003(" +
      "\r*L\n\tTeamState\022\013\n\007Prepare\020\000\022\014\n\010Matching\020" +
      "\001\022\014\n\010Starting\020\002\022\n\n\006Gaming\020\003\022\n\n\006Ending\020\004*" +
      "2\n\017TeamMemberState\022\010\n\004Idle\020\000\022\t\n\005Ready\020\001\022" +
      "\n\n\006InGame\020\002*D\n\016TeamInfoAction\022\013\n\007Nothing" +
      "\020\000\022\007\n\003All\020\001\022\007\n\003Add\020\002\022\007\n\003Del\020\003\022\n\n\006Update\020" +
      "\004*?\n\nMatchState\022\r\n\tMatchIdle\020\000\022\017\n\013MatchL" +
      "eader\020\001\022\021\n\rMatchFollower\020\002BV\n\020com.zqprot" +
      "o.coreB\004CoreP\001Z3github.com/generalzgd/mi" +
      "cro-proto/goproto/core;core\242\002\004Coreb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.proto.comm.Comm.getDescriptor(),
          com.proto.user.User.getDescriptor(),
        });
    internal_static_core_Account_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_core_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_Account_descriptor,
        new java.lang.String[] { "User", "Nickname", "JoinTime", "State", });
    internal_static_core_TeamInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_core_TeamInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_TeamInfo_descriptor,
        new java.lang.String[] { "Id", "LeaderUid", "State", "Members", "Action", "CreateTime", "MatchState", "MatchedIds", "PlayCost", "PlayMode", });
    internal_static_core_CreateTeamRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_core_CreateTeamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_CreateTeamRequest_descriptor,
        new java.lang.String[] { "TraceId", });
    internal_static_core_CreateTeamReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_core_CreateTeamReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_CreateTeamReply_descriptor,
        new java.lang.String[] { "Res", "Account", "TeamInfo", });
    internal_static_core_JoinTeamRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_core_JoinTeamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_JoinTeamRequest_descriptor,
        new java.lang.String[] { "TraceId", "TeamId", "MyTeamId", });
    internal_static_core_JoinTeamReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_core_JoinTeamReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_JoinTeamReply_descriptor,
        new java.lang.String[] { "Res", "TeamInfo", });
    internal_static_core_LeaveTeamRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_core_LeaveTeamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_LeaveTeamRequest_descriptor,
        new java.lang.String[] { "TraceId", "TeamId", "Uid", });
    internal_static_core_LeaveTeamReply_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_core_LeaveTeamReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_LeaveTeamReply_descriptor,
        new java.lang.String[] { "Res", });
    internal_static_core_KickMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_core_KickMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_KickMemberRequest_descriptor,
        new java.lang.String[] { "TraceId", "TargetUid", "MyTeamId", });
    internal_static_core_KickMemberReply_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_core_KickMemberReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_core_KickMemberReply_descriptor,
        new java.lang.String[] { "Res", "KickedUid", });
    com.proto.comm.Comm.getDescriptor();
    com.proto.user.User.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
