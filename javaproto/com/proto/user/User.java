// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/userdef.proto

package com.proto.user;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserInfoReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserInfoReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserInfoReply_ThirdAccountEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserInfoReply_ThirdAccountEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserPLevelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserPLevelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserPLevelReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserPLevelReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_PLevelInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_PLevelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_OneUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_OneUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LoginReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LoginReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LogoutReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LogoutReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_KickOutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_KickOutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_KickOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_KickOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_LoginNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_LoginNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_MsgNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_MsgNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user/userdef.proto\022\004user\032\021comm/common." +
      "proto\"N\n\022GetUserInfoRequest\022\022\n\ntarget_ui" +
      "d\030\001 \003(\r\022\017\n\007traceId\030\002 \001(\t\022\023\n\013thirdGameId\030" +
      "\003 \001(\r\"\346\001\n\020GetUserInfoReply\022\035\n\004code\030\001 \001(\016" +
      "2\017.comm.ErrorType\022\017\n\007message\030\002 \001(\t\022\034\n\004us" +
      "er\030\003 \003(\0132\016.user.UserInfo\022\017\n\007traceid\030\004 \001(" +
      "\t\022>\n\014thirdAccount\030\005 \003(\0132(.user.GetUserIn" +
      "foReply.ThirdAccountEntry\0323\n\021ThirdAccoun" +
      "tEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\";" +
      "\n\024GetUserPLevelRequest\022\022\n\ntarget_uid\030\001 \001" +
      "(\r\022\017\n\007traceId\030\002 \001(\t\"v\n\022GetUserPLevelRepl" +
      "y\022\035\n\004code\030\001 \001(\0162\017.comm.ErrorType\022\017\n\007mess" +
      "age\030\002 \001(\t\022\037\n\005level\030\003 \001(\0132\020.user.PLevelIn" +
      "fo\022\017\n\007traceId\030\004 \001(\t\"6\n\nPLevelInfo\022\r\n\005lev" +
      "el\030\001 \001(\r\022\013\n\003exp\030\002 \001(\r\022\014\n\004left\030\003 \001(\r\"\300\001\n\010" +
      "UserInfo\022\013\n\003uid\030\001 \001(\r\022\020\n\010nickname\030\002 \001(\t\022" +
      "\016\n\006avatar\030\003 \001(\t\022\016\n\006gender\030\004 \001(\r\022\036\n\005ident" +
      "\030\005 \001(\0162\017.user.UserIdent\022 \n\006plevel\030\006 \001(\0132" +
      "\020.user.PLevelInfo\022\016\n\006anchor\030\007 \001(\010\022\016\n\006mob" +
      "ile\030\010 \001(\t\022\023\n\013invite_code\030\t \001(\t\"J\n\007OneUse" +
      "r\022\013\n\003uid\030\001 \001(\r\022\020\n\010platform\030\002 \001(\r\022\020\n\010sock" +
      "etId\030\003 \001(\r\022\016\n\006gateIp\030\004 \001(\t\"M\n\014LoginReque" +
      "st\022\013\n\003uid\030\001 \001(\r\022\r\n\005token\030\002 \001(\t\022\020\n\010platfo" +
      "rm\030\003 \001(\r\022\017\n\007traceId\030\004 \001(\t\"}\n\nLoginReply\022" +
      "\035\n\004code\030\001 \001(\0162\017.comm.ErrorType\022\017\n\007messag" +
      "e\030\002 \001(\t\022\034\n\004user\030\003 \001(\0132\016.user.UserInfo\022\017\n" +
      "\007traceId\030\004 \001(\t\022\020\n\010loginCnt\030\005 \001(\r\"0\n\rLogo" +
      "utRequest\022\017\n\007traceId\030\001 \001(\t\022\016\n\006except\030\002 \001" +
      "(\010\"N\n\013LogoutReply\022\035\n\004code\030\001 \001(\0162\017.comm.E" +
      "rrorType\022\017\n\007message\030\002 \001(\t\022\017\n\007traceId\030\003 \001" +
      "(\t\"h\n\016KickOutRequest\022\013\n\003uid\030\001 \001(\r\022\020\n\010las" +
      "t_sid\030\002 \001(\r\022\025\n\rlast_platform\030\003 \001(\r\022\017\n\007me" +
      "ssage\030\004 \001(\t\022\017\n\007traceId\030\005 \001(\t\"J\n\007KickOut\022" +
      "\035\n\004code\030\001 \001(\0162\017.comm.ErrorType\022\017\n\007messag" +
      "e\030\002 \001(\t\022\017\n\007traceId\030\003 \001(\t\"w\n\013LoginNotify\022" +
      "\033\n\004user\030\001 \001(\0132\r.user.OneUser\022\021\n\tloginTim" +
      "e\030\002 \001(\003\022\020\n\010socketId\030\003 \001(\r\022\025\n\rcurrentGate" +
      "Ip\030\004 \001(\t\022\017\n\007traceId\030\005 \001(\t\"Z\n\tMsgNotify\022\033" +
      "\n\004user\030\001 \003(\0132\r.user.OneUser\022\017\n\007message\030\002" +
      " \001(\014\022\r\n\005cmdId\030\003 \001(\r\022\020\n\010gateType\030\004 \001(\005*1\n" +
      "\tUserIdent\022\n\n\006normal\020\000\022\014\n\010official\020\001\022\n\n\006" +
      "system\020\002BP\n\016com.proto.userB\004UserP\001Z/gith" +
      "ub.com/generalzgd/micro-proto/goproto/gw" +
      ";gw\242\002\004Userb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.proto.comm.Comm.getDescriptor(),
        });
    internal_static_user_GetUserInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_GetUserInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserInfoRequest_descriptor,
        new java.lang.String[] { "TargetUid", "TraceId", "ThirdGameId", });
    internal_static_user_GetUserInfoReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_GetUserInfoReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserInfoReply_descriptor,
        new java.lang.String[] { "Code", "Message", "User", "Traceid", "ThirdAccount", });
    internal_static_user_GetUserInfoReply_ThirdAccountEntry_descriptor =
      internal_static_user_GetUserInfoReply_descriptor.getNestedTypes().get(0);
    internal_static_user_GetUserInfoReply_ThirdAccountEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserInfoReply_ThirdAccountEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_user_GetUserPLevelRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_GetUserPLevelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserPLevelRequest_descriptor,
        new java.lang.String[] { "TargetUid", "TraceId", });
    internal_static_user_GetUserPLevelReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_GetUserPLevelReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserPLevelReply_descriptor,
        new java.lang.String[] { "Code", "Message", "Level", "TraceId", });
    internal_static_user_PLevelInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_user_PLevelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_PLevelInfo_descriptor,
        new java.lang.String[] { "Level", "Exp", "Left", });
    internal_static_user_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_user_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_UserInfo_descriptor,
        new java.lang.String[] { "Uid", "Nickname", "Avatar", "Gender", "Ident", "Plevel", "Anchor", "Mobile", "InviteCode", });
    internal_static_user_OneUser_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_user_OneUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_OneUser_descriptor,
        new java.lang.String[] { "Uid", "Platform", "SocketId", "GateIp", });
    internal_static_user_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_user_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LoginRequest_descriptor,
        new java.lang.String[] { "Uid", "Token", "Platform", "TraceId", });
    internal_static_user_LoginReply_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_user_LoginReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LoginReply_descriptor,
        new java.lang.String[] { "Code", "Message", "User", "TraceId", "LoginCnt", });
    internal_static_user_LogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_user_LogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LogoutRequest_descriptor,
        new java.lang.String[] { "TraceId", "Except", });
    internal_static_user_LogoutReply_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_user_LogoutReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LogoutReply_descriptor,
        new java.lang.String[] { "Code", "Message", "TraceId", });
    internal_static_user_KickOutRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_user_KickOutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_KickOutRequest_descriptor,
        new java.lang.String[] { "Uid", "LastSid", "LastPlatform", "Message", "TraceId", });
    internal_static_user_KickOut_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_user_KickOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_KickOut_descriptor,
        new java.lang.String[] { "Code", "Message", "TraceId", });
    internal_static_user_LoginNotify_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_user_LoginNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_LoginNotify_descriptor,
        new java.lang.String[] { "User", "LoginTime", "SocketId", "CurrentGateIp", "TraceId", });
    internal_static_user_MsgNotify_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_user_MsgNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_MsgNotify_descriptor,
        new java.lang.String[] { "User", "Message", "CmdId", "GateType", });
    com.proto.comm.Comm.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
