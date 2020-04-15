// Code generated by protoc-gen-go. DO NOT EDIT.
// source: core/teamdef.proto

// protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/core/teamdef.proto

package core

import (
	fmt "fmt"
	comm "github.com/generalzgd/micro-proto/goproto/comm"
	gw "github.com/generalzgd/micro-proto/goproto/gw"
	proto "github.com/golang/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

// 队伍状态
type TeamState int32

const (
	// 准备阶段
	TeamState_Prepare TeamState = 0
	// 匹配阶段
	TeamState_Matching TeamState = 1
	// 启动阶段（调用多多游戏接口过程）
	TeamState_Starting TeamState = 2
	// 游戏阶段
	TeamState_Gaming TeamState = 3
	// 游戏结束阶段，需要销毁队伍信息
	TeamState_Ending TeamState = 4
)

var TeamState_name = map[int32]string{
	0: "Prepare",
	1: "Matching",
	2: "Starting",
	3: "Gaming",
	4: "Ending",
}

var TeamState_value = map[string]int32{
	"Prepare":  0,
	"Matching": 1,
	"Starting": 2,
	"Gaming":   3,
	"Ending":   4,
}

func (x TeamState) String() string {
	return proto.EnumName(TeamState_name, int32(x))
}

func (TeamState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{0}
}

// 队员状态
type TeamMemberState int32

const (
	// 空闲状态
	TeamMemberState_Idle TeamMemberState = 0
	// 准备状态
	TeamMemberState_Ready TeamMemberState = 1
	// 游戏中
	TeamMemberState_InGame TeamMemberState = 2
)

var TeamMemberState_name = map[int32]string{
	0: "Idle",
	1: "Ready",
	2: "InGame",
}

var TeamMemberState_value = map[string]int32{
	"Idle":   0,
	"Ready":  1,
	"InGame": 2,
}

func (x TeamMemberState) String() string {
	return proto.EnumName(TeamMemberState_name, int32(x))
}

func (TeamMemberState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{1}
}

// 队伍信息，成员列表刷新动作
type TeamInfoAction int32

const (
	TeamInfoAction_Nothing TeamInfoAction = 0
	TeamInfoAction_All     TeamInfoAction = 1
	TeamInfoAction_Add     TeamInfoAction = 2
	TeamInfoAction_Del     TeamInfoAction = 3
	TeamInfoAction_Update  TeamInfoAction = 4
)

var TeamInfoAction_name = map[int32]string{
	0: "Nothing",
	1: "All",
	2: "Add",
	3: "Del",
	4: "Update",
}

var TeamInfoAction_value = map[string]int32{
	"Nothing": 0,
	"All":     1,
	"Add":     2,
	"Del":     3,
	"Update":  4,
}

func (x TeamInfoAction) String() string {
	return proto.EnumName(TeamInfoAction_name, int32(x))
}

func (TeamInfoAction) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{2}
}

// 匹配状态
type MatchState int32

const (
	// 匹配 空闲状态
	MatchState_MatchIdle MatchState = 0
	// 匹配 主队
	MatchState_MatchLeader MatchState = 1
	// 匹配 从对
	MatchState_MatchFollower MatchState = 2
)

var MatchState_name = map[int32]string{
	0: "MatchIdle",
	1: "MatchLeader",
	2: "MatchFollower",
}

var MatchState_value = map[string]int32{
	"MatchIdle":     0,
	"MatchLeader":   1,
	"MatchFollower": 2,
}

func (x MatchState) String() string {
	return proto.EnumName(MatchState_name, int32(x))
}

func (MatchState) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{3}
}

// 多多账号和浩方账号信息
type Account struct {
	// 账号信息
	User *gw.UserInfo `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
	// 多多账号昵称
	Nickname string `protobuf:"bytes,2,opt,name=Nickname,proto3" json:"Nickname,omitempty"`
	// 加入队伍时间戳
	JoinTime int64 `protobuf:"varint,3,opt,name=joinTime,proto3" json:"joinTime,omitempty"`
	// 队员准备状态
	State                TeamMemberState `protobuf:"varint,4,opt,name=state,proto3,enum=core.TeamMemberState" json:"state,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *Account) Reset()         { *m = Account{} }
func (m *Account) String() string { return proto.CompactTextString(m) }
func (*Account) ProtoMessage()    {}
func (*Account) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{0}
}

func (m *Account) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Account.Unmarshal(m, b)
}
func (m *Account) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Account.Marshal(b, m, deterministic)
}
func (m *Account) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Account.Merge(m, src)
}
func (m *Account) XXX_Size() int {
	return xxx_messageInfo_Account.Size(m)
}
func (m *Account) XXX_DiscardUnknown() {
	xxx_messageInfo_Account.DiscardUnknown(m)
}

var xxx_messageInfo_Account proto.InternalMessageInfo

func (m *Account) GetUser() *gw.UserInfo {
	if m != nil {
		return m.User
	}
	return nil
}

func (m *Account) GetNickname() string {
	if m != nil {
		return m.Nickname
	}
	return ""
}

func (m *Account) GetJoinTime() int64 {
	if m != nil {
		return m.JoinTime
	}
	return 0
}

func (m *Account) GetState() TeamMemberState {
	if m != nil {
		return m.State
	}
	return TeamMemberState_Idle
}

// 队伍信息, 需要广播下发的队伍状态和队员列表。（广播）
type TeamInfo struct {
	// 队伍编号
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// 队长ID
	LeaderUid uint32 `protobuf:"varint,2,opt,name=leaderUid,proto3" json:"leaderUid,omitempty"`
	// 队伍状态
	State TeamState `protobuf:"varint,4,opt,name=state,proto3,enum=core.TeamState" json:"state,omitempty"`
	// 队员列表, 该字段独立写入redis
	Members []*Account `protobuf:"bytes,5,rep,name=members,proto3" json:"members,omitempty"`
	// 0:Idle, 1：所有队员列表，2：需要新增队员列表，3：需要删除的队员列表, 4: 只更新对应队员信息(状态)
	Action TeamInfoAction `protobuf:"varint,6,opt,name=action,proto3,enum=core.TeamInfoAction" json:"action,omitempty"`
	// 创建时间戳
	CreateTime int64 `protobuf:"varint,7,opt,name=createTime,proto3" json:"createTime,omitempty"`
	// 匹配状态
	MatchState MatchState `protobuf:"varint,8,opt,name=matchState,proto3,enum=core.MatchState" json:"matchState,omitempty"`
	// 匹配后，所有到队伍ID, 用,分割
	MatchedIds string `protobuf:"bytes,9,opt,name=matchedIds,proto3" json:"matchedIds,omitempty"`
	// 玩一局的消耗值
	PlayCost uint32 `protobuf:"varint,10,opt,name=playCost,proto3" json:"playCost,omitempty"`
	// 游戏模式
	PlayMode             uint32   `protobuf:"varint,11,opt,name=playMode,proto3" json:"playMode,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *TeamInfo) Reset()         { *m = TeamInfo{} }
func (m *TeamInfo) String() string { return proto.CompactTextString(m) }
func (*TeamInfo) ProtoMessage()    {}
func (*TeamInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{1}
}

func (m *TeamInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_TeamInfo.Unmarshal(m, b)
}
func (m *TeamInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_TeamInfo.Marshal(b, m, deterministic)
}
func (m *TeamInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_TeamInfo.Merge(m, src)
}
func (m *TeamInfo) XXX_Size() int {
	return xxx_messageInfo_TeamInfo.Size(m)
}
func (m *TeamInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_TeamInfo.DiscardUnknown(m)
}

var xxx_messageInfo_TeamInfo proto.InternalMessageInfo

func (m *TeamInfo) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *TeamInfo) GetLeaderUid() uint32 {
	if m != nil {
		return m.LeaderUid
	}
	return 0
}

func (m *TeamInfo) GetState() TeamState {
	if m != nil {
		return m.State
	}
	return TeamState_Prepare
}

func (m *TeamInfo) GetMembers() []*Account {
	if m != nil {
		return m.Members
	}
	return nil
}

func (m *TeamInfo) GetAction() TeamInfoAction {
	if m != nil {
		return m.Action
	}
	return TeamInfoAction_Nothing
}

func (m *TeamInfo) GetCreateTime() int64 {
	if m != nil {
		return m.CreateTime
	}
	return 0
}

func (m *TeamInfo) GetMatchState() MatchState {
	if m != nil {
		return m.MatchState
	}
	return MatchState_MatchIdle
}

func (m *TeamInfo) GetMatchedIds() string {
	if m != nil {
		return m.MatchedIds
	}
	return ""
}

func (m *TeamInfo) GetPlayCost() uint32 {
	if m != nil {
		return m.PlayCost
	}
	return 0
}

func (m *TeamInfo) GetPlayMode() uint32 {
	if m != nil {
		return m.PlayMode
	}
	return 0
}

// 创建队伍
type CreateTeamRequest struct {
	// 用户的uuid，用来追踪用户消息链路
	TraceId              string   `protobuf:"bytes,1,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CreateTeamRequest) Reset()         { *m = CreateTeamRequest{} }
func (m *CreateTeamRequest) String() string { return proto.CompactTextString(m) }
func (*CreateTeamRequest) ProtoMessage()    {}
func (*CreateTeamRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{2}
}

func (m *CreateTeamRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateTeamRequest.Unmarshal(m, b)
}
func (m *CreateTeamRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateTeamRequest.Marshal(b, m, deterministic)
}
func (m *CreateTeamRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateTeamRequest.Merge(m, src)
}
func (m *CreateTeamRequest) XXX_Size() int {
	return xxx_messageInfo_CreateTeamRequest.Size(m)
}
func (m *CreateTeamRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateTeamRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateTeamRequest proto.InternalMessageInfo

func (m *CreateTeamRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

type CreateTeamReply struct {
	Res *comm.CommReply `protobuf:"bytes,1,opt,name=res,proto3" json:"res,omitempty"`
	// 多多和浩方用户信息
	Account *Account `protobuf:"bytes,2,opt,name=account,proto3" json:"account,omitempty"`
	//
	TeamInfo             *TeamInfo `protobuf:"bytes,4,opt,name=teamInfo,proto3" json:"teamInfo,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *CreateTeamReply) Reset()         { *m = CreateTeamReply{} }
func (m *CreateTeamReply) String() string { return proto.CompactTextString(m) }
func (*CreateTeamReply) ProtoMessage()    {}
func (*CreateTeamReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{3}
}

func (m *CreateTeamReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateTeamReply.Unmarshal(m, b)
}
func (m *CreateTeamReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateTeamReply.Marshal(b, m, deterministic)
}
func (m *CreateTeamReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateTeamReply.Merge(m, src)
}
func (m *CreateTeamReply) XXX_Size() int {
	return xxx_messageInfo_CreateTeamReply.Size(m)
}
func (m *CreateTeamReply) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateTeamReply.DiscardUnknown(m)
}

var xxx_messageInfo_CreateTeamReply proto.InternalMessageInfo

func (m *CreateTeamReply) GetRes() *comm.CommReply {
	if m != nil {
		return m.Res
	}
	return nil
}

func (m *CreateTeamReply) GetAccount() *Account {
	if m != nil {
		return m.Account
	}
	return nil
}

func (m *CreateTeamReply) GetTeamInfo() *TeamInfo {
	if m != nil {
		return m.TeamInfo
	}
	return nil
}

// 加入队伍
type JoinTeamRequest struct {
	// 用户的uuid，用来追踪用户消息链路
	TraceId string `protobuf:"bytes,1,opt,name=traceId,proto3" json:"traceId,omitempty"`
	// 要加入的队伍编号
	TeamId string `protobuf:"bytes,2,opt,name=teamId,proto3" json:"teamId,omitempty"`
	// 自己的队伍编号
	MyTeamId             string   `protobuf:"bytes,3,opt,name=myTeamId,proto3" json:"myTeamId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *JoinTeamRequest) Reset()         { *m = JoinTeamRequest{} }
func (m *JoinTeamRequest) String() string { return proto.CompactTextString(m) }
func (*JoinTeamRequest) ProtoMessage()    {}
func (*JoinTeamRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{4}
}

func (m *JoinTeamRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinTeamRequest.Unmarshal(m, b)
}
func (m *JoinTeamRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinTeamRequest.Marshal(b, m, deterministic)
}
func (m *JoinTeamRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinTeamRequest.Merge(m, src)
}
func (m *JoinTeamRequest) XXX_Size() int {
	return xxx_messageInfo_JoinTeamRequest.Size(m)
}
func (m *JoinTeamRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinTeamRequest.DiscardUnknown(m)
}

var xxx_messageInfo_JoinTeamRequest proto.InternalMessageInfo

func (m *JoinTeamRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *JoinTeamRequest) GetTeamId() string {
	if m != nil {
		return m.TeamId
	}
	return ""
}

func (m *JoinTeamRequest) GetMyTeamId() string {
	if m != nil {
		return m.MyTeamId
	}
	return ""
}

type JoinTeamReply struct {
	Res *comm.CommReply `protobuf:"bytes,1,opt,name=res,proto3" json:"res,omitempty"`
	// 返回加入成功后的队伍信息
	TeamInfo             *TeamInfo `protobuf:"bytes,2,opt,name=teamInfo,proto3" json:"teamInfo,omitempty"`
	XXX_NoUnkeyedLiteral struct{}  `json:"-"`
	XXX_unrecognized     []byte    `json:"-"`
	XXX_sizecache        int32     `json:"-"`
}

func (m *JoinTeamReply) Reset()         { *m = JoinTeamReply{} }
func (m *JoinTeamReply) String() string { return proto.CompactTextString(m) }
func (*JoinTeamReply) ProtoMessage()    {}
func (*JoinTeamReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{5}
}

func (m *JoinTeamReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_JoinTeamReply.Unmarshal(m, b)
}
func (m *JoinTeamReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_JoinTeamReply.Marshal(b, m, deterministic)
}
func (m *JoinTeamReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_JoinTeamReply.Merge(m, src)
}
func (m *JoinTeamReply) XXX_Size() int {
	return xxx_messageInfo_JoinTeamReply.Size(m)
}
func (m *JoinTeamReply) XXX_DiscardUnknown() {
	xxx_messageInfo_JoinTeamReply.DiscardUnknown(m)
}

var xxx_messageInfo_JoinTeamReply proto.InternalMessageInfo

func (m *JoinTeamReply) GetRes() *comm.CommReply {
	if m != nil {
		return m.Res
	}
	return nil
}

func (m *JoinTeamReply) GetTeamInfo() *TeamInfo {
	if m != nil {
		return m.TeamInfo
	}
	return nil
}

// 队员主动离开队伍
type LeaveTeamRequest struct {
	// 用户的uuid，用来追踪用户消息链路
	TraceId string `protobuf:"bytes,1,opt,name=traceId,proto3" json:"traceId,omitempty"`
	// 队伍编号
	TeamId string `protobuf:"bytes,2,opt,name=teamId,proto3" json:"teamId,omitempty"`
	// 自己的uid, 如果是队长离开，需要更换队长。离开后广播队伍信息DuoTeamInfo
	Uid                  uint32   `protobuf:"varint,3,opt,name=uid,proto3" json:"uid,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LeaveTeamRequest) Reset()         { *m = LeaveTeamRequest{} }
func (m *LeaveTeamRequest) String() string { return proto.CompactTextString(m) }
func (*LeaveTeamRequest) ProtoMessage()    {}
func (*LeaveTeamRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{6}
}

func (m *LeaveTeamRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LeaveTeamRequest.Unmarshal(m, b)
}
func (m *LeaveTeamRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LeaveTeamRequest.Marshal(b, m, deterministic)
}
func (m *LeaveTeamRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LeaveTeamRequest.Merge(m, src)
}
func (m *LeaveTeamRequest) XXX_Size() int {
	return xxx_messageInfo_LeaveTeamRequest.Size(m)
}
func (m *LeaveTeamRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_LeaveTeamRequest.DiscardUnknown(m)
}

var xxx_messageInfo_LeaveTeamRequest proto.InternalMessageInfo

func (m *LeaveTeamRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *LeaveTeamRequest) GetTeamId() string {
	if m != nil {
		return m.TeamId
	}
	return ""
}

func (m *LeaveTeamRequest) GetUid() uint32 {
	if m != nil {
		return m.Uid
	}
	return 0
}

type LeaveTeamReply struct {
	Res                  *comm.CommReply `protobuf:"bytes,1,opt,name=res,proto3" json:"res,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *LeaveTeamReply) Reset()         { *m = LeaveTeamReply{} }
func (m *LeaveTeamReply) String() string { return proto.CompactTextString(m) }
func (*LeaveTeamReply) ProtoMessage()    {}
func (*LeaveTeamReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{7}
}

func (m *LeaveTeamReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LeaveTeamReply.Unmarshal(m, b)
}
func (m *LeaveTeamReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LeaveTeamReply.Marshal(b, m, deterministic)
}
func (m *LeaveTeamReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LeaveTeamReply.Merge(m, src)
}
func (m *LeaveTeamReply) XXX_Size() int {
	return xxx_messageInfo_LeaveTeamReply.Size(m)
}
func (m *LeaveTeamReply) XXX_DiscardUnknown() {
	xxx_messageInfo_LeaveTeamReply.DiscardUnknown(m)
}

var xxx_messageInfo_LeaveTeamReply proto.InternalMessageInfo

func (m *LeaveTeamReply) GetRes() *comm.CommReply {
	if m != nil {
		return m.Res
	}
	return nil
}

// 踢人
type KickMemberRequest struct {
	// 用户的uuid，用来追踪用户消息链路
	TraceId string `protobuf:"bytes,1,opt,name=traceId,proto3" json:"traceId,omitempty"`
	// 被踢人的用户ID，需要leader权限
	TargetUid uint32 `protobuf:"varint,2,opt,name=targetUid,proto3" json:"targetUid,omitempty"`
	// 自己的队伍编号
	MyTeamId             string   `protobuf:"bytes,3,opt,name=myTeamId,proto3" json:"myTeamId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *KickMemberRequest) Reset()         { *m = KickMemberRequest{} }
func (m *KickMemberRequest) String() string { return proto.CompactTextString(m) }
func (*KickMemberRequest) ProtoMessage()    {}
func (*KickMemberRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{8}
}

func (m *KickMemberRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_KickMemberRequest.Unmarshal(m, b)
}
func (m *KickMemberRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_KickMemberRequest.Marshal(b, m, deterministic)
}
func (m *KickMemberRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_KickMemberRequest.Merge(m, src)
}
func (m *KickMemberRequest) XXX_Size() int {
	return xxx_messageInfo_KickMemberRequest.Size(m)
}
func (m *KickMemberRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_KickMemberRequest.DiscardUnknown(m)
}

var xxx_messageInfo_KickMemberRequest proto.InternalMessageInfo

func (m *KickMemberRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *KickMemberRequest) GetTargetUid() uint32 {
	if m != nil {
		return m.TargetUid
	}
	return 0
}

func (m *KickMemberRequest) GetMyTeamId() string {
	if m != nil {
		return m.MyTeamId
	}
	return ""
}

type KickMemberReply struct {
	Res *comm.CommReply `protobuf:"bytes,1,opt,name=res,proto3" json:"res,omitempty"`
	// 被踢的用户ID
	KickedUid            []uint32 `protobuf:"varint,2,rep,packed,name=kickedUid,proto3" json:"kickedUid,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *KickMemberReply) Reset()         { *m = KickMemberReply{} }
func (m *KickMemberReply) String() string { return proto.CompactTextString(m) }
func (*KickMemberReply) ProtoMessage()    {}
func (*KickMemberReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_05c12b52f1734baa, []int{9}
}

func (m *KickMemberReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_KickMemberReply.Unmarshal(m, b)
}
func (m *KickMemberReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_KickMemberReply.Marshal(b, m, deterministic)
}
func (m *KickMemberReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_KickMemberReply.Merge(m, src)
}
func (m *KickMemberReply) XXX_Size() int {
	return xxx_messageInfo_KickMemberReply.Size(m)
}
func (m *KickMemberReply) XXX_DiscardUnknown() {
	xxx_messageInfo_KickMemberReply.DiscardUnknown(m)
}

var xxx_messageInfo_KickMemberReply proto.InternalMessageInfo

func (m *KickMemberReply) GetRes() *comm.CommReply {
	if m != nil {
		return m.Res
	}
	return nil
}

func (m *KickMemberReply) GetKickedUid() []uint32 {
	if m != nil {
		return m.KickedUid
	}
	return nil
}

func init() {
	proto.RegisterEnum("core.TeamState", TeamState_name, TeamState_value)
	proto.RegisterEnum("core.TeamMemberState", TeamMemberState_name, TeamMemberState_value)
	proto.RegisterEnum("core.TeamInfoAction", TeamInfoAction_name, TeamInfoAction_value)
	proto.RegisterEnum("core.MatchState", MatchState_name, MatchState_value)
	proto.RegisterType((*Account)(nil), "core.Account")
	proto.RegisterType((*TeamInfo)(nil), "core.TeamInfo")
	proto.RegisterType((*CreateTeamRequest)(nil), "core.CreateTeamRequest")
	proto.RegisterType((*CreateTeamReply)(nil), "core.CreateTeamReply")
	proto.RegisterType((*JoinTeamRequest)(nil), "core.JoinTeamRequest")
	proto.RegisterType((*JoinTeamReply)(nil), "core.JoinTeamReply")
	proto.RegisterType((*LeaveTeamRequest)(nil), "core.LeaveTeamRequest")
	proto.RegisterType((*LeaveTeamReply)(nil), "core.LeaveTeamReply")
	proto.RegisterType((*KickMemberRequest)(nil), "core.KickMemberRequest")
	proto.RegisterType((*KickMemberReply)(nil), "core.KickMemberReply")
}

func init() { proto.RegisterFile("core/teamdef.proto", fileDescriptor_05c12b52f1734baa) }

var fileDescriptor_05c12b52f1734baa = []byte{
	// 756 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xa4, 0x54, 0x51, 0x8f, 0xdb, 0x44,
	0x10, 0xae, 0xed, 0x5c, 0x12, 0x4f, 0x48, 0xe2, 0xac, 0x00, 0x59, 0xa7, 0x13, 0x0a, 0x96, 0x10,
	0x51, 0xa0, 0x09, 0xca, 0x3d, 0xf2, 0x80, 0xae, 0x29, 0x54, 0x81, 0xbb, 0xaa, 0x72, 0xef, 0xfa,
	0xc0, 0x03, 0x68, 0xcf, 0x3b, 0x4d, 0x4d, 0xbc, 0xde, 0x74, 0xbd, 0x01, 0xa5, 0xff, 0x80, 0x57,
	0x7e, 0x02, 0xbf, 0x8c, 0x9f, 0x82, 0x66, 0xed, 0x38, 0x3e, 0x90, 0x68, 0x24, 0x5e, 0x9c, 0xfd,
	0xe6, 0x9b, 0x9d, 0x6f, 0xf6, 0xcb, 0xec, 0x02, 0x4b, 0x94, 0xc6, 0xb9, 0x41, 0x2e, 0x05, 0xbe,
	0x9e, 0x6d, 0xb5, 0x32, 0x8a, 0xb5, 0x28, 0x76, 0x3e, 0x4a, 0x94, 0x94, 0x73, 0xfa, 0xa8, 0xbc,
	0x24, 0xce, 0xd9, 0xae, 0x40, 0x3d, 0xa7, 0x4f, 0x9d, 0x1c, 0xfd, 0xe1, 0x40, 0xe7, 0x2a, 0x49,
	0xd4, 0x2e, 0x37, 0x2c, 0x82, 0x16, 0x91, 0xa1, 0x33, 0x76, 0x26, 0xbd, 0xc5, 0x60, 0x46, 0x60,
	0x76, 0x57, 0xa0, 0x5e, 0xe5, 0xaf, 0x55, 0x6c, 0x39, 0x76, 0x0e, 0xdd, 0xe7, 0x69, 0xb2, 0xc9,
	0xb9, 0xc4, 0xd0, 0x1d, 0x3b, 0x13, 0x3f, 0xae, 0x31, 0x71, 0xbf, 0xa8, 0x34, 0xbf, 0x4d, 0x25,
	0x86, 0xde, 0xd8, 0x99, 0x78, 0x71, 0x8d, 0xd9, 0x17, 0x70, 0x56, 0x18, 0x6e, 0x30, 0x6c, 0x8d,
	0x9d, 0xc9, 0x60, 0xf1, 0xd1, 0x8c, 0x9a, 0x9c, 0xdd, 0x22, 0x97, 0x37, 0x28, 0xef, 0x51, 0xbf,
	0x24, 0x32, 0x2e, 0x73, 0xa2, 0xbf, 0x5c, 0xe8, 0x12, 0x45, 0xba, 0x6c, 0x00, 0x6e, 0x2a, 0x6c,
	0x4f, 0x7e, 0xec, 0xa6, 0x82, 0x5d, 0x80, 0x9f, 0x21, 0x17, 0xa8, 0xef, 0x52, 0x61, 0x5b, 0xe8,
	0xc7, 0xc7, 0x00, 0xfb, 0xec, 0xa1, 0xce, 0xf0, 0xa8, 0xd3, 0x54, 0x60, 0x9f, 0x43, 0x47, 0x5a,
	0xdd, 0x22, 0x3c, 0x1b, 0x7b, 0x93, 0xde, 0xa2, 0x5f, 0x26, 0x56, 0x56, 0xc4, 0x07, 0x96, 0x7d,
	0x09, 0x6d, 0x9e, 0x98, 0x54, 0xe5, 0x61, 0xdb, 0x16, 0xfc, 0xf0, 0x58, 0x90, 0xba, 0xbb, 0xb2,
	0x5c, 0x5c, 0xe5, 0xb0, 0x4f, 0x00, 0x12, 0x8d, 0xdc, 0xa0, 0xf5, 0xa0, 0x63, 0x3d, 0x68, 0x44,
	0xd8, 0x57, 0x00, 0x92, 0x9b, 0xe4, 0x8d, 0xed, 0x25, 0xec, 0xda, 0x8a, 0x41, 0x59, 0xf1, 0xa6,
	0x8e, 0xc7, 0x8d, 0x1c, 0xaa, 0x68, 0x11, 0x8a, 0x95, 0x28, 0x42, 0xdf, 0xba, 0xd0, 0x88, 0x90,
	0xe7, 0xdb, 0x8c, 0xef, 0x97, 0xaa, 0x30, 0x21, 0x58, 0x33, 0x6a, 0x7c, 0xe0, 0x6e, 0x94, 0xc0,
	0xb0, 0x77, 0xe4, 0x08, 0x47, 0x8f, 0x61, 0xb4, 0x2c, 0xfb, 0x42, 0x2e, 0x63, 0x7c, 0xbb, 0xc3,
	0xc2, 0xb0, 0x10, 0x3a, 0x46, 0xf3, 0x04, 0x57, 0x07, 0xbf, 0x0f, 0x30, 0xfa, 0xdd, 0x81, 0x61,
	0x33, 0x7f, 0x9b, 0xed, 0xd9, 0xa7, 0xe0, 0x69, 0x2c, 0xaa, 0x69, 0x21, 0xa3, 0xa5, 0x9c, 0x2d,
	0x95, 0x2c, 0xd9, 0x98, 0x38, 0xb2, 0x99, 0x97, 0x8e, 0xda, 0x7f, 0xea, 0xdf, 0x36, 0x57, 0x2c,
	0x9b, 0x42, 0xd7, 0x54, 0x96, 0xda, 0x7f, 0x8e, 0xc6, 0xef, 0x81, 0xd1, 0x71, 0xcd, 0x47, 0x3f,
	0xc3, 0xf0, 0x7b, 0x1a, 0xab, 0x53, 0x1a, 0x67, 0x1f, 0x43, 0xdb, 0x6e, 0x14, 0xd5, 0xb4, 0x56,
	0x88, 0xbc, 0x91, 0xfb, 0xdb, 0x92, 0xf1, 0xca, 0x39, 0x3e, 0xe0, 0xe8, 0x27, 0xe8, 0x1f, 0x05,
	0x4e, 0x3c, 0x69, 0xf3, 0x00, 0xee, 0x7b, 0x0e, 0xf0, 0x0a, 0x82, 0x6b, 0xe4, 0xbf, 0xe2, 0xff,
	0x3b, 0x41, 0x00, 0xde, 0x2e, 0x2d, 0x9b, 0xef, 0xc7, 0xb4, 0x8c, 0x2e, 0x61, 0xd0, 0xa8, 0x7b,
	0x5a, 0xe3, 0xd1, 0x1a, 0x46, 0x3f, 0xa4, 0xc9, 0xa6, 0xbc, 0x85, 0xef, 0xef, 0xe6, 0x02, 0x7c,
	0xc3, 0xf5, 0x1a, 0x4d, 0xe3, 0xf6, 0xd5, 0x81, 0xff, 0x74, 0x35, 0x86, 0x61, 0x53, 0xe8, 0x44,
	0x5f, 0x2f, 0xc0, 0xdf, 0xa4, 0xc9, 0x06, 0x45, 0xa9, 0xe7, 0x91, 0x5e, 0x1d, 0x98, 0x5e, 0x83,
	0x5f, 0x5f, 0x6d, 0xd6, 0x83, 0xce, 0x0b, 0x8d, 0x5b, 0xae, 0x31, 0x78, 0xc4, 0x3e, 0x80, 0xae,
	0xbd, 0x51, 0x69, 0xbe, 0x0e, 0x1c, 0x42, 0x2f, 0x0d, 0xd7, 0x86, 0x90, 0xcb, 0x00, 0xda, 0xcf,
	0xb8, 0xa4, 0xb5, 0x47, 0xeb, 0x6f, 0x73, 0x41, 0xeb, 0xd6, 0x74, 0x01, 0xc3, 0x7f, 0x3c, 0x48,
	0xac, 0x0b, 0xad, 0x95, 0xc8, 0xa8, 0xa0, 0x0f, 0x67, 0x31, 0x72, 0xb1, 0x0f, 0x1c, 0xda, 0xb3,
	0xca, 0x9f, 0x71, 0x89, 0x81, 0x3b, 0x7d, 0x0a, 0x83, 0x87, 0x6f, 0x01, 0xb5, 0xf1, 0x5c, 0x19,
	0x2b, 0xfc, 0x88, 0x75, 0xc0, 0xbb, 0xca, 0xb2, 0xc0, 0xb1, 0x0b, 0x21, 0x02, 0x97, 0x16, 0x4f,
	0x31, 0x2b, 0x95, 0xef, 0xb6, 0x82, 0x1b, 0x0c, 0x5a, 0xd3, 0x6f, 0x00, 0x8e, 0xf7, 0x9f, 0xf5,
	0xc1, 0xb7, 0xa8, 0x52, 0x1e, 0x42, 0xcf, 0xc2, 0x6b, 0xfb, 0xc8, 0x05, 0x0e, 0x1b, 0x41, 0xdf,
	0x06, 0xbe, 0x53, 0x59, 0xa6, 0x7e, 0x43, 0x1d, 0xb8, 0x4f, 0x5e, 0x41, 0x90, 0x28, 0x39, 0x7b,
	0xf7, 0xd6, 0xbe, 0xea, 0x76, 0xf2, 0x9e, 0xb4, 0x96, 0x4a, 0xe3, 0x0b, 0xe7, 0xc7, 0xcb, 0x75,
	0x6a, 0xde, 0xec, 0xee, 0xc9, 0xde, 0xf9, 0x1a, 0x73, 0xd4, 0x3c, 0x7b, 0xb7, 0x16, 0x73, 0x99,
	0x26, 0x5a, 0x3d, 0xb6, 0xf9, 0xf3, 0xb5, 0x2a, 0x7f, 0x69, 0xdf, 0xd7, 0xf4, 0xf9, 0xd3, 0xb5,
	0xbb, 0xef, 0xdb, 0x36, 0x7e, 0xf9, 0x77, 0x00, 0x00, 0x00, 0xff, 0xff, 0x92, 0xf7, 0x91, 0x8c,
	0x68, 0x06, 0x00, 0x00,
}
