// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/teamdef.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <protobuf/GPBProtocolBuffers_RuntimeSupport.h>
#else
 #import "GPBProtocolBuffers_RuntimeSupport.h"
#endif

#import <stdatomic.h>

#import "core/Teamdef.pbobjc.h"
#import "comm/Common.pbobjc.h"
#import "user/Userdef.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - CoreTeamdefRoot

@implementation CoreTeamdefRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - CoreTeamdefRoot_FileDescriptor

static GPBFileDescriptor *CoreTeamdefRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"core"
                                                 objcPrefix:@"Core"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - Enum CoreTeamState

GPBEnumDescriptor *CoreTeamState_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Prepare\000Matching\000Starting\000Gaming\000Ending\000";
    static const int32_t values[] = {
        CoreTeamState_Prepare,
        CoreTeamState_Matching,
        CoreTeamState_Starting,
        CoreTeamState_Gaming,
        CoreTeamState_Ending,
    };
    static const char *extraTextFormatInfo = "\005\000\007\000\001\010\000\002\010\000\003\006\000\004\006\000";
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(CoreTeamState)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:CoreTeamState_IsValidValue
                              extraTextFormatInfo:extraTextFormatInfo];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL CoreTeamState_IsValidValue(int32_t value__) {
  switch (value__) {
    case CoreTeamState_Prepare:
    case CoreTeamState_Matching:
    case CoreTeamState_Starting:
    case CoreTeamState_Gaming:
    case CoreTeamState_Ending:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Enum CoreTeamMemberState

GPBEnumDescriptor *CoreTeamMemberState_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Idle\000Ready\000InGame\000";
    static const int32_t values[] = {
        CoreTeamMemberState_Idle,
        CoreTeamMemberState_Ready,
        CoreTeamMemberState_InGame,
    };
    static const char *extraTextFormatInfo = "\003\000\004\000\001\005\000\002\006\000";
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(CoreTeamMemberState)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:CoreTeamMemberState_IsValidValue
                              extraTextFormatInfo:extraTextFormatInfo];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL CoreTeamMemberState_IsValidValue(int32_t value__) {
  switch (value__) {
    case CoreTeamMemberState_Idle:
    case CoreTeamMemberState_Ready:
    case CoreTeamMemberState_InGame:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Enum CoreTeamInfoAction

GPBEnumDescriptor *CoreTeamInfoAction_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "Nothing\000All\000Add\000Del\000Update\000";
    static const int32_t values[] = {
        CoreTeamInfoAction_Nothing,
        CoreTeamInfoAction_All,
        CoreTeamInfoAction_Add,
        CoreTeamInfoAction_Del,
        CoreTeamInfoAction_Update,
    };
    static const char *extraTextFormatInfo = "\005\000\007\000\001\003\000\002\003\000\003\003\000\004\006\000";
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(CoreTeamInfoAction)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:CoreTeamInfoAction_IsValidValue
                              extraTextFormatInfo:extraTextFormatInfo];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL CoreTeamInfoAction_IsValidValue(int32_t value__) {
  switch (value__) {
    case CoreTeamInfoAction_Nothing:
    case CoreTeamInfoAction_All:
    case CoreTeamInfoAction_Add:
    case CoreTeamInfoAction_Del:
    case CoreTeamInfoAction_Update:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - Enum CoreMatchState

GPBEnumDescriptor *CoreMatchState_EnumDescriptor(void) {
  static _Atomic(GPBEnumDescriptor*) descriptor = nil;
  if (!descriptor) {
    static const char *valueNames =
        "MatchIdle\000MatchLeader\000MatchFollower\000";
    static const int32_t values[] = {
        CoreMatchState_MatchIdle,
        CoreMatchState_MatchLeader,
        CoreMatchState_MatchFollower,
    };
    static const char *extraTextFormatInfo = "\003\000\t\000\001\013\000\002\r\000";
    GPBEnumDescriptor *worker =
        [GPBEnumDescriptor allocDescriptorForName:GPBNSStringifySymbol(CoreMatchState)
                                       valueNames:valueNames
                                           values:values
                                            count:(uint32_t)(sizeof(values) / sizeof(int32_t))
                                     enumVerifier:CoreMatchState_IsValidValue
                              extraTextFormatInfo:extraTextFormatInfo];
    GPBEnumDescriptor *expected = nil;
    if (!atomic_compare_exchange_strong(&descriptor, &expected, worker)) {
      [worker release];
    }
  }
  return descriptor;
}

BOOL CoreMatchState_IsValidValue(int32_t value__) {
  switch (value__) {
    case CoreMatchState_MatchIdle:
    case CoreMatchState_MatchLeader:
    case CoreMatchState_MatchFollower:
      return YES;
    default:
      return NO;
  }
}

#pragma mark - CoreAccount

@implementation CoreAccount

@dynamic hasUser, user;
@dynamic nickname;
@dynamic joinTime;
@dynamic state;

typedef struct CoreAccount__storage_ {
  uint32_t _has_storage_[1];
  CoreTeamMemberState state;
  UserInfo *user;
  NSString *nickname;
  int64_t joinTime;
} CoreAccount__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "user",
        .dataTypeSpecific.className = GPBStringifySymbol(UserInfo),
        .number = CoreAccount_FieldNumber_User,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreAccount__storage_, user),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "nickname",
        .dataTypeSpecific.className = NULL,
        .number = CoreAccount_FieldNumber_Nickname,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CoreAccount__storage_, nickname),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "joinTime",
        .dataTypeSpecific.className = NULL,
        .number = CoreAccount_FieldNumber_JoinTime,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(CoreAccount__storage_, joinTime),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "state",
        .dataTypeSpecific.enumDescFunc = CoreTeamMemberState_EnumDescriptor,
        .number = CoreAccount_FieldNumber_State,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(CoreAccount__storage_, state),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreAccount class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreAccount__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\002\002H\000\003\010\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t CoreAccount_State_RawValue(CoreAccount *message) {
  GPBDescriptor *descriptor = [CoreAccount descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreAccount_FieldNumber_State];
  return GPBGetMessageInt32Field(message, field);
}

void SetCoreAccount_State_RawValue(CoreAccount *message, int32_t value) {
  GPBDescriptor *descriptor = [CoreAccount descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreAccount_FieldNumber_State];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

#pragma mark - CoreTeamInfo

@implementation CoreTeamInfo

@dynamic id_p;
@dynamic leaderUid;
@dynamic state;
@dynamic membersArray, membersArray_Count;
@dynamic action;
@dynamic createTime;
@dynamic matchState;
@dynamic matchedIds;
@dynamic playCost;
@dynamic playMode;

typedef struct CoreTeamInfo__storage_ {
  uint32_t _has_storage_[1];
  uint32_t leaderUid;
  CoreTeamState state;
  CoreTeamInfoAction action;
  CoreMatchState matchState;
  uint32_t playCost;
  uint32_t playMode;
  NSString *id_p;
  NSMutableArray *membersArray;
  NSString *matchedIds;
  int64_t createTime;
} CoreTeamInfo__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "id_p",
        .dataTypeSpecific.className = NULL,
        .number = CoreTeamInfo_FieldNumber_Id_p,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, id_p),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "leaderUid",
        .dataTypeSpecific.className = NULL,
        .number = CoreTeamInfo_FieldNumber_LeaderUid,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, leaderUid),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeUInt32,
      },
      {
        .name = "state",
        .dataTypeSpecific.enumDescFunc = CoreTeamState_EnumDescriptor,
        .number = CoreTeamInfo_FieldNumber_State,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, state),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "membersArray",
        .dataTypeSpecific.className = GPBStringifySymbol(CoreAccount),
        .number = CoreTeamInfo_FieldNumber_MembersArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, membersArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "action",
        .dataTypeSpecific.enumDescFunc = CoreTeamInfoAction_EnumDescriptor,
        .number = CoreTeamInfo_FieldNumber_Action,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, action),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "createTime",
        .dataTypeSpecific.className = NULL,
        .number = CoreTeamInfo_FieldNumber_CreateTime,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, createTime),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "matchState",
        .dataTypeSpecific.enumDescFunc = CoreMatchState_EnumDescriptor,
        .number = CoreTeamInfo_FieldNumber_MatchState,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, matchState),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom | GPBFieldHasEnumDescriptor),
        .dataType = GPBDataTypeEnum,
      },
      {
        .name = "matchedIds",
        .dataTypeSpecific.className = NULL,
        .number = CoreTeamInfo_FieldNumber_MatchedIds,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, matchedIds),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "playCost",
        .dataTypeSpecific.className = NULL,
        .number = CoreTeamInfo_FieldNumber_PlayCost,
        .hasIndex = 7,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, playCost),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeUInt32,
      },
      {
        .name = "playMode",
        .dataTypeSpecific.className = NULL,
        .number = CoreTeamInfo_FieldNumber_PlayMode,
        .hasIndex = 8,
        .offset = (uint32_t)offsetof(CoreTeamInfo__storage_, playMode),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreTeamInfo class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreTeamInfo__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\006\002\t\000\007\n\000\010\n\000\t\n\000\n\010\000\013\010\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

int32_t CoreTeamInfo_State_RawValue(CoreTeamInfo *message) {
  GPBDescriptor *descriptor = [CoreTeamInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreTeamInfo_FieldNumber_State];
  return GPBGetMessageInt32Field(message, field);
}

void SetCoreTeamInfo_State_RawValue(CoreTeamInfo *message, int32_t value) {
  GPBDescriptor *descriptor = [CoreTeamInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreTeamInfo_FieldNumber_State];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

int32_t CoreTeamInfo_Action_RawValue(CoreTeamInfo *message) {
  GPBDescriptor *descriptor = [CoreTeamInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreTeamInfo_FieldNumber_Action];
  return GPBGetMessageInt32Field(message, field);
}

void SetCoreTeamInfo_Action_RawValue(CoreTeamInfo *message, int32_t value) {
  GPBDescriptor *descriptor = [CoreTeamInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreTeamInfo_FieldNumber_Action];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

int32_t CoreTeamInfo_MatchState_RawValue(CoreTeamInfo *message) {
  GPBDescriptor *descriptor = [CoreTeamInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreTeamInfo_FieldNumber_MatchState];
  return GPBGetMessageInt32Field(message, field);
}

void SetCoreTeamInfo_MatchState_RawValue(CoreTeamInfo *message, int32_t value) {
  GPBDescriptor *descriptor = [CoreTeamInfo descriptor];
  GPBFieldDescriptor *field = [descriptor fieldWithNumber:CoreTeamInfo_FieldNumber_MatchState];
  GPBSetInt32IvarWithFieldInternal(message, field, value, descriptor.file.syntax);
}

#pragma mark - CoreCreateTeamRequest

@implementation CoreCreateTeamRequest

@dynamic traceId;

typedef struct CoreCreateTeamRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *traceId;
} CoreCreateTeamRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "traceId",
        .dataTypeSpecific.className = NULL,
        .number = CoreCreateTeamRequest_FieldNumber_TraceId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreCreateTeamRequest__storage_, traceId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreCreateTeamRequest class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreCreateTeamRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\001\001\007\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - CoreCreateTeamReply

@implementation CoreCreateTeamReply

@dynamic hasRes, res;
@dynamic hasAccount, account;
@dynamic hasTeamInfo, teamInfo;

typedef struct CoreCreateTeamReply__storage_ {
  uint32_t _has_storage_[1];
  CommReply *res;
  CoreAccount *account;
  CoreTeamInfo *teamInfo;
} CoreCreateTeamReply__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "res",
        .dataTypeSpecific.className = GPBStringifySymbol(CommReply),
        .number = CoreCreateTeamReply_FieldNumber_Res,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreCreateTeamReply__storage_, res),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "account",
        .dataTypeSpecific.className = GPBStringifySymbol(CoreAccount),
        .number = CoreCreateTeamReply_FieldNumber_Account,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CoreCreateTeamReply__storage_, account),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "teamInfo",
        .dataTypeSpecific.className = GPBStringifySymbol(CoreTeamInfo),
        .number = CoreCreateTeamReply_FieldNumber_TeamInfo,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(CoreCreateTeamReply__storage_, teamInfo),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreCreateTeamReply class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreCreateTeamReply__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\001\004\010\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - CoreJoinTeamRequest

@implementation CoreJoinTeamRequest

@dynamic traceId;
@dynamic teamId;
@dynamic myTeamId;

typedef struct CoreJoinTeamRequest__storage_ {
  uint32_t _has_storage_[1];
  NSString *traceId;
  NSString *teamId;
  NSString *myTeamId;
} CoreJoinTeamRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "traceId",
        .dataTypeSpecific.className = NULL,
        .number = CoreJoinTeamRequest_FieldNumber_TraceId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreJoinTeamRequest__storage_, traceId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "teamId",
        .dataTypeSpecific.className = NULL,
        .number = CoreJoinTeamRequest_FieldNumber_TeamId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CoreJoinTeamRequest__storage_, teamId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "myTeamId",
        .dataTypeSpecific.className = NULL,
        .number = CoreJoinTeamRequest_FieldNumber_MyTeamId,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(CoreJoinTeamRequest__storage_, myTeamId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreJoinTeamRequest class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreJoinTeamRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\007\000\002\006\000\003\010\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - CoreJoinTeamReply

@implementation CoreJoinTeamReply

@dynamic hasRes, res;
@dynamic hasTeamInfo, teamInfo;

typedef struct CoreJoinTeamReply__storage_ {
  uint32_t _has_storage_[1];
  CommReply *res;
  CoreTeamInfo *teamInfo;
} CoreJoinTeamReply__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "res",
        .dataTypeSpecific.className = GPBStringifySymbol(CommReply),
        .number = CoreJoinTeamReply_FieldNumber_Res,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreJoinTeamReply__storage_, res),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "teamInfo",
        .dataTypeSpecific.className = GPBStringifySymbol(CoreTeamInfo),
        .number = CoreJoinTeamReply_FieldNumber_TeamInfo,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CoreJoinTeamReply__storage_, teamInfo),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreJoinTeamReply class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreJoinTeamReply__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\001\002\010\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - CoreLeaveTeamRequest

@implementation CoreLeaveTeamRequest

@dynamic traceId;
@dynamic teamId;
@dynamic uid;

typedef struct CoreLeaveTeamRequest__storage_ {
  uint32_t _has_storage_[1];
  uint32_t uid;
  NSString *traceId;
  NSString *teamId;
} CoreLeaveTeamRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "traceId",
        .dataTypeSpecific.className = NULL,
        .number = CoreLeaveTeamRequest_FieldNumber_TraceId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreLeaveTeamRequest__storage_, traceId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "teamId",
        .dataTypeSpecific.className = NULL,
        .number = CoreLeaveTeamRequest_FieldNumber_TeamId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CoreLeaveTeamRequest__storage_, teamId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "uid",
        .dataTypeSpecific.className = NULL,
        .number = CoreLeaveTeamRequest_FieldNumber_Uid,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(CoreLeaveTeamRequest__storage_, uid),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreLeaveTeamRequest class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreLeaveTeamRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\002\001\007\000\002\006\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - CoreLeaveTeamReply

@implementation CoreLeaveTeamReply

@dynamic hasRes, res;

typedef struct CoreLeaveTeamReply__storage_ {
  uint32_t _has_storage_[1];
  CommReply *res;
} CoreLeaveTeamReply__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "res",
        .dataTypeSpecific.className = GPBStringifySymbol(CommReply),
        .number = CoreLeaveTeamReply_FieldNumber_Res,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreLeaveTeamReply__storage_, res),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreLeaveTeamReply class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreLeaveTeamReply__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - CoreKickMemberRequest

@implementation CoreKickMemberRequest

@dynamic traceId;
@dynamic targetUid;
@dynamic myTeamId;

typedef struct CoreKickMemberRequest__storage_ {
  uint32_t _has_storage_[1];
  uint32_t targetUid;
  NSString *traceId;
  NSString *myTeamId;
} CoreKickMemberRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "traceId",
        .dataTypeSpecific.className = NULL,
        .number = CoreKickMemberRequest_FieldNumber_TraceId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreKickMemberRequest__storage_, traceId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "targetUid",
        .dataTypeSpecific.className = NULL,
        .number = CoreKickMemberRequest_FieldNumber_TargetUid,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CoreKickMemberRequest__storage_, targetUid),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeUInt32,
      },
      {
        .name = "myTeamId",
        .dataTypeSpecific.className = NULL,
        .number = CoreKickMemberRequest_FieldNumber_MyTeamId,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(CoreKickMemberRequest__storage_, myTeamId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreKickMemberRequest class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreKickMemberRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\007\000\002\t\000\003\010\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end

#pragma mark - CoreKickMemberReply

@implementation CoreKickMemberReply

@dynamic hasRes, res;
@dynamic kickedUidArray, kickedUidArray_Count;

typedef struct CoreKickMemberReply__storage_ {
  uint32_t _has_storage_[1];
  CommReply *res;
  GPBUInt32Array *kickedUidArray;
} CoreKickMemberReply__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "res",
        .dataTypeSpecific.className = GPBStringifySymbol(CommReply),
        .number = CoreKickMemberReply_FieldNumber_Res,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CoreKickMemberReply__storage_, res),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "kickedUidArray",
        .dataTypeSpecific.className = NULL,
        .number = CoreKickMemberReply_FieldNumber_KickedUidArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(CoreKickMemberReply__storage_, kickedUidArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldPacked | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeUInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CoreKickMemberReply class]
                                     rootClass:[CoreTeamdefRoot class]
                                          file:CoreTeamdefRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CoreKickMemberReply__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\001\002\000kickedUid\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    #if defined(DEBUG) && DEBUG
      NSAssert(descriptor == nil, @"Startup recursed!");
    #endif  // DEBUG
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)