// Code generated by protoc-gen-go. DO NOT EDIT.
// source: user/userdef.proto

// protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/user/userdef.proto

package gw

import (
	fmt "fmt"
	comm "github.com/generalzgd/micro-proto/goproto/comm"
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

// 用户权限类型定义
type UserIdent int32

const (
	UserIdent_normal   UserIdent = 0
	UserIdent_official UserIdent = 1
	UserIdent_system   UserIdent = 2
)

var UserIdent_name = map[int32]string{
	0: "normal",
	1: "official",
	2: "system",
}

var UserIdent_value = map[string]int32{
	"normal":   0,
	"official": 1,
	"system":   2,
}

func (x UserIdent) String() string {
	return proto.EnumName(UserIdent_name, int32(x))
}

func (UserIdent) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{0}
}

// ------------------------------------------
// 获得用户信息, 获取的信息（例如用户等级）不会实时更新，时间长了，需要重新获取
// c2s
type GetUserInfoRequest struct {
	TargetUid []uint32 `protobuf:"varint,1,rep,packed,name=target_uid,json=targetUid,proto3" json:"target_uid,omitempty"`
	TraceId   string   `protobuf:"bytes,2,opt,name=traceId,proto3" json:"traceId,omitempty"`
	// 第三方绑定的游戏ID，0:不查
	ThirdGameId          uint32   `protobuf:"varint,3,opt,name=thirdGameId,proto3" json:"thirdGameId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetUserInfoRequest) Reset()         { *m = GetUserInfoRequest{} }
func (m *GetUserInfoRequest) String() string { return proto.CompactTextString(m) }
func (*GetUserInfoRequest) ProtoMessage()    {}
func (*GetUserInfoRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{0}
}

func (m *GetUserInfoRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetUserInfoRequest.Unmarshal(m, b)
}
func (m *GetUserInfoRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetUserInfoRequest.Marshal(b, m, deterministic)
}
func (m *GetUserInfoRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetUserInfoRequest.Merge(m, src)
}
func (m *GetUserInfoRequest) XXX_Size() int {
	return xxx_messageInfo_GetUserInfoRequest.Size(m)
}
func (m *GetUserInfoRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetUserInfoRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetUserInfoRequest proto.InternalMessageInfo

func (m *GetUserInfoRequest) GetTargetUid() []uint32 {
	if m != nil {
		return m.TargetUid
	}
	return nil
}

func (m *GetUserInfoRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *GetUserInfoRequest) GetThirdGameId() uint32 {
	if m != nil {
		return m.ThirdGameId
	}
	return 0
}

// s2c
type GetUserInfoReply struct {
	Code    comm.ErrorType `protobuf:"varint,1,opt,name=code,proto3,enum=comm.ErrorType" json:"code,omitempty"`
	Message string         `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
	User    []*UserInfo    `protobuf:"bytes,3,rep,name=user,proto3" json:"user,omitempty"`
	Traceid string         `protobuf:"bytes,4,opt,name=traceid,proto3" json:"traceid,omitempty"`
	// 第三方游戏账号信息，需要接收方转换成对应的结构体
	ThirdAccount         map[string]string `protobuf:"bytes,5,rep,name=thirdAccount,proto3" json:"thirdAccount,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	XXX_NoUnkeyedLiteral struct{}          `json:"-"`
	XXX_unrecognized     []byte            `json:"-"`
	XXX_sizecache        int32             `json:"-"`
}

func (m *GetUserInfoReply) Reset()         { *m = GetUserInfoReply{} }
func (m *GetUserInfoReply) String() string { return proto.CompactTextString(m) }
func (*GetUserInfoReply) ProtoMessage()    {}
func (*GetUserInfoReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{1}
}

func (m *GetUserInfoReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetUserInfoReply.Unmarshal(m, b)
}
func (m *GetUserInfoReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetUserInfoReply.Marshal(b, m, deterministic)
}
func (m *GetUserInfoReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetUserInfoReply.Merge(m, src)
}
func (m *GetUserInfoReply) XXX_Size() int {
	return xxx_messageInfo_GetUserInfoReply.Size(m)
}
func (m *GetUserInfoReply) XXX_DiscardUnknown() {
	xxx_messageInfo_GetUserInfoReply.DiscardUnknown(m)
}

var xxx_messageInfo_GetUserInfoReply proto.InternalMessageInfo

func (m *GetUserInfoReply) GetCode() comm.ErrorType {
	if m != nil {
		return m.Code
	}
	return comm.ErrorType_Norm
}

func (m *GetUserInfoReply) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *GetUserInfoReply) GetUser() []*UserInfo {
	if m != nil {
		return m.User
	}
	return nil
}

func (m *GetUserInfoReply) GetTraceid() string {
	if m != nil {
		return m.Traceid
	}
	return ""
}

func (m *GetUserInfoReply) GetThirdAccount() map[string]string {
	if m != nil {
		return m.ThirdAccount
	}
	return nil
}

// 获取用户等级信息
type GetUserPLevelRequest struct {
	TargetUid            uint32   `protobuf:"varint,1,opt,name=target_uid,json=targetUid,proto3" json:"target_uid,omitempty"`
	TraceId              string   `protobuf:"bytes,2,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetUserPLevelRequest) Reset()         { *m = GetUserPLevelRequest{} }
func (m *GetUserPLevelRequest) String() string { return proto.CompactTextString(m) }
func (*GetUserPLevelRequest) ProtoMessage()    {}
func (*GetUserPLevelRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{2}
}

func (m *GetUserPLevelRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetUserPLevelRequest.Unmarshal(m, b)
}
func (m *GetUserPLevelRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetUserPLevelRequest.Marshal(b, m, deterministic)
}
func (m *GetUserPLevelRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetUserPLevelRequest.Merge(m, src)
}
func (m *GetUserPLevelRequest) XXX_Size() int {
	return xxx_messageInfo_GetUserPLevelRequest.Size(m)
}
func (m *GetUserPLevelRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetUserPLevelRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetUserPLevelRequest proto.InternalMessageInfo

func (m *GetUserPLevelRequest) GetTargetUid() uint32 {
	if m != nil {
		return m.TargetUid
	}
	return 0
}

func (m *GetUserPLevelRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

// 响应用户等级信息
type GetUserPLevelReply struct {
	Code                 comm.ErrorType `protobuf:"varint,1,opt,name=code,proto3,enum=comm.ErrorType" json:"code,omitempty"`
	Message              string         `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
	Level                *PLevelInfo    `protobuf:"bytes,3,opt,name=level,proto3" json:"level,omitempty"`
	TraceId              string         `protobuf:"bytes,4,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *GetUserPLevelReply) Reset()         { *m = GetUserPLevelReply{} }
func (m *GetUserPLevelReply) String() string { return proto.CompactTextString(m) }
func (*GetUserPLevelReply) ProtoMessage()    {}
func (*GetUserPLevelReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{3}
}

func (m *GetUserPLevelReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetUserPLevelReply.Unmarshal(m, b)
}
func (m *GetUserPLevelReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetUserPLevelReply.Marshal(b, m, deterministic)
}
func (m *GetUserPLevelReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetUserPLevelReply.Merge(m, src)
}
func (m *GetUserPLevelReply) XXX_Size() int {
	return xxx_messageInfo_GetUserPLevelReply.Size(m)
}
func (m *GetUserPLevelReply) XXX_DiscardUnknown() {
	xxx_messageInfo_GetUserPLevelReply.DiscardUnknown(m)
}

var xxx_messageInfo_GetUserPLevelReply proto.InternalMessageInfo

func (m *GetUserPLevelReply) GetCode() comm.ErrorType {
	if m != nil {
		return m.Code
	}
	return comm.ErrorType_Norm
}

func (m *GetUserPLevelReply) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *GetUserPLevelReply) GetLevel() *PLevelInfo {
	if m != nil {
		return m.Level
	}
	return nil
}

func (m *GetUserPLevelReply) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

// 用户等级信息
type PLevelInfo struct {
	Level                uint32   `protobuf:"varint,1,opt,name=level,proto3" json:"level,omitempty"`
	Exp                  uint32   `protobuf:"varint,2,opt,name=exp,proto3" json:"exp,omitempty"`
	Left                 uint32   `protobuf:"varint,3,opt,name=left,proto3" json:"left,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *PLevelInfo) Reset()         { *m = PLevelInfo{} }
func (m *PLevelInfo) String() string { return proto.CompactTextString(m) }
func (*PLevelInfo) ProtoMessage()    {}
func (*PLevelInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{4}
}

func (m *PLevelInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_PLevelInfo.Unmarshal(m, b)
}
func (m *PLevelInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_PLevelInfo.Marshal(b, m, deterministic)
}
func (m *PLevelInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_PLevelInfo.Merge(m, src)
}
func (m *PLevelInfo) XXX_Size() int {
	return xxx_messageInfo_PLevelInfo.Size(m)
}
func (m *PLevelInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_PLevelInfo.DiscardUnknown(m)
}

var xxx_messageInfo_PLevelInfo proto.InternalMessageInfo

func (m *PLevelInfo) GetLevel() uint32 {
	if m != nil {
		return m.Level
	}
	return 0
}

func (m *PLevelInfo) GetExp() uint32 {
	if m != nil {
		return m.Exp
	}
	return 0
}

func (m *PLevelInfo) GetLeft() uint32 {
	if m != nil {
		return m.Left
	}
	return 0
}

// 用户信息
type UserInfo struct {
	Uid                  uint32      `protobuf:"varint,1,opt,name=uid,proto3" json:"uid,omitempty"`
	Nickname             string      `protobuf:"bytes,2,opt,name=nickname,proto3" json:"nickname,omitempty"`
	Avatar               string      `protobuf:"bytes,3,opt,name=avatar,proto3" json:"avatar,omitempty"`
	Gender               uint32      `protobuf:"varint,4,opt,name=gender,proto3" json:"gender,omitempty"`
	Ident                UserIdent   `protobuf:"varint,5,opt,name=ident,proto3,enum=user.UserIdent" json:"ident,omitempty"`
	Plevel               *PLevelInfo `protobuf:"bytes,6,opt,name=plevel,proto3" json:"plevel,omitempty"`
	Anchor               bool        `protobuf:"varint,7,opt,name=anchor,proto3" json:"anchor,omitempty"`
	Mobile               string      `protobuf:"bytes,8,opt,name=mobile,proto3" json:"mobile,omitempty"`
	InviteCode           string      `protobuf:"bytes,9,opt,name=invite_code,json=inviteCode,proto3" json:"invite_code,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *UserInfo) Reset()         { *m = UserInfo{} }
func (m *UserInfo) String() string { return proto.CompactTextString(m) }
func (*UserInfo) ProtoMessage()    {}
func (*UserInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{5}
}

func (m *UserInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UserInfo.Unmarshal(m, b)
}
func (m *UserInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UserInfo.Marshal(b, m, deterministic)
}
func (m *UserInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UserInfo.Merge(m, src)
}
func (m *UserInfo) XXX_Size() int {
	return xxx_messageInfo_UserInfo.Size(m)
}
func (m *UserInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_UserInfo.DiscardUnknown(m)
}

var xxx_messageInfo_UserInfo proto.InternalMessageInfo

func (m *UserInfo) GetUid() uint32 {
	if m != nil {
		return m.Uid
	}
	return 0
}

func (m *UserInfo) GetNickname() string {
	if m != nil {
		return m.Nickname
	}
	return ""
}

func (m *UserInfo) GetAvatar() string {
	if m != nil {
		return m.Avatar
	}
	return ""
}

func (m *UserInfo) GetGender() uint32 {
	if m != nil {
		return m.Gender
	}
	return 0
}

func (m *UserInfo) GetIdent() UserIdent {
	if m != nil {
		return m.Ident
	}
	return UserIdent_normal
}

func (m *UserInfo) GetPlevel() *PLevelInfo {
	if m != nil {
		return m.Plevel
	}
	return nil
}

func (m *UserInfo) GetAnchor() bool {
	if m != nil {
		return m.Anchor
	}
	return false
}

func (m *UserInfo) GetMobile() string {
	if m != nil {
		return m.Mobile
	}
	return ""
}

func (m *UserInfo) GetInviteCode() string {
	if m != nil {
		return m.InviteCode
	}
	return ""
}

// -------------------用户体系协议------------------------
// 一个用户的信息
type OneUser struct {
	Uid      uint32 `protobuf:"varint,1,opt,name=uid,proto3" json:"uid,omitempty"`
	Platform uint32 `protobuf:"varint,2,opt,name=platform,proto3" json:"platform,omitempty"`
	// 链接ID
	SocketId uint32 `protobuf:"varint,3,opt,name=socketId,proto3" json:"socketId,omitempty"`
	// 网关IP
	GateIp               string   `protobuf:"bytes,4,opt,name=gateIp,proto3" json:"gateIp,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OneUser) Reset()         { *m = OneUser{} }
func (m *OneUser) String() string { return proto.CompactTextString(m) }
func (*OneUser) ProtoMessage()    {}
func (*OneUser) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{6}
}

func (m *OneUser) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OneUser.Unmarshal(m, b)
}
func (m *OneUser) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OneUser.Marshal(b, m, deterministic)
}
func (m *OneUser) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OneUser.Merge(m, src)
}
func (m *OneUser) XXX_Size() int {
	return xxx_messageInfo_OneUser.Size(m)
}
func (m *OneUser) XXX_DiscardUnknown() {
	xxx_messageInfo_OneUser.DiscardUnknown(m)
}

var xxx_messageInfo_OneUser proto.InternalMessageInfo

func (m *OneUser) GetUid() uint32 {
	if m != nil {
		return m.Uid
	}
	return 0
}

func (m *OneUser) GetPlatform() uint32 {
	if m != nil {
		return m.Platform
	}
	return 0
}

func (m *OneUser) GetSocketId() uint32 {
	if m != nil {
		return m.SocketId
	}
	return 0
}

func (m *OneUser) GetGateIp() string {
	if m != nil {
		return m.GateIp
	}
	return ""
}

// 浩方体系通用登录协议
type LoginRequest struct {
	Uid                  uint32   `protobuf:"varint,1,opt,name=uid,proto3" json:"uid,omitempty"`
	Token                string   `protobuf:"bytes,2,opt,name=token,proto3" json:"token,omitempty"`
	Platform             uint32   `protobuf:"varint,3,opt,name=platform,proto3" json:"platform,omitempty"`
	TraceId              string   `protobuf:"bytes,4,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LoginRequest) Reset()         { *m = LoginRequest{} }
func (m *LoginRequest) String() string { return proto.CompactTextString(m) }
func (*LoginRequest) ProtoMessage()    {}
func (*LoginRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{7}
}

func (m *LoginRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LoginRequest.Unmarshal(m, b)
}
func (m *LoginRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LoginRequest.Marshal(b, m, deterministic)
}
func (m *LoginRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LoginRequest.Merge(m, src)
}
func (m *LoginRequest) XXX_Size() int {
	return xxx_messageInfo_LoginRequest.Size(m)
}
func (m *LoginRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_LoginRequest.DiscardUnknown(m)
}

var xxx_messageInfo_LoginRequest proto.InternalMessageInfo

func (m *LoginRequest) GetUid() uint32 {
	if m != nil {
		return m.Uid
	}
	return 0
}

func (m *LoginRequest) GetToken() string {
	if m != nil {
		return m.Token
	}
	return ""
}

func (m *LoginRequest) GetPlatform() uint32 {
	if m != nil {
		return m.Platform
	}
	return 0
}

func (m *LoginRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

// 通用登录协议
type LoginReply struct {
	Code                 comm.ErrorType `protobuf:"varint,1,opt,name=code,proto3,enum=comm.ErrorType" json:"code,omitempty"`
	Message              string         `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
	User                 *UserInfo      `protobuf:"bytes,3,opt,name=user,proto3" json:"user,omitempty"`
	TraceId              string         `protobuf:"bytes,4,opt,name=traceId,proto3" json:"traceId,omitempty"`
	LoginCnt             uint32         `protobuf:"varint,5,opt,name=loginCnt,proto3" json:"loginCnt,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *LoginReply) Reset()         { *m = LoginReply{} }
func (m *LoginReply) String() string { return proto.CompactTextString(m) }
func (*LoginReply) ProtoMessage()    {}
func (*LoginReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{8}
}

func (m *LoginReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LoginReply.Unmarshal(m, b)
}
func (m *LoginReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LoginReply.Marshal(b, m, deterministic)
}
func (m *LoginReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LoginReply.Merge(m, src)
}
func (m *LoginReply) XXX_Size() int {
	return xxx_messageInfo_LoginReply.Size(m)
}
func (m *LoginReply) XXX_DiscardUnknown() {
	xxx_messageInfo_LoginReply.DiscardUnknown(m)
}

var xxx_messageInfo_LoginReply proto.InternalMessageInfo

func (m *LoginReply) GetCode() comm.ErrorType {
	if m != nil {
		return m.Code
	}
	return comm.ErrorType_Norm
}

func (m *LoginReply) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *LoginReply) GetUser() *UserInfo {
	if m != nil {
		return m.User
	}
	return nil
}

func (m *LoginReply) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *LoginReply) GetLoginCnt() uint32 {
	if m != nil {
		return m.LoginCnt
	}
	return 0
}

// 通用登出协议
type LogoutRequest struct {
	TraceId string `protobuf:"bytes,1,opt,name=traceId,proto3" json:"traceId,omitempty"`
	// true:手动正常退出，false:异常断开退出. 客户端发起该协议，需要指定true
	Except               bool     `protobuf:"varint,2,opt,name=except,proto3" json:"except,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LogoutRequest) Reset()         { *m = LogoutRequest{} }
func (m *LogoutRequest) String() string { return proto.CompactTextString(m) }
func (*LogoutRequest) ProtoMessage()    {}
func (*LogoutRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{9}
}

func (m *LogoutRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LogoutRequest.Unmarshal(m, b)
}
func (m *LogoutRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LogoutRequest.Marshal(b, m, deterministic)
}
func (m *LogoutRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LogoutRequest.Merge(m, src)
}
func (m *LogoutRequest) XXX_Size() int {
	return xxx_messageInfo_LogoutRequest.Size(m)
}
func (m *LogoutRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_LogoutRequest.DiscardUnknown(m)
}

var xxx_messageInfo_LogoutRequest proto.InternalMessageInfo

func (m *LogoutRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *LogoutRequest) GetExcept() bool {
	if m != nil {
		return m.Except
	}
	return false
}

// 通用登出协议
type LogoutReply struct {
	Code                 comm.ErrorType `protobuf:"varint,1,opt,name=code,proto3,enum=comm.ErrorType" json:"code,omitempty"`
	Message              string         `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
	TraceId              string         `protobuf:"bytes,3,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *LogoutReply) Reset()         { *m = LogoutReply{} }
func (m *LogoutReply) String() string { return proto.CompactTextString(m) }
func (*LogoutReply) ProtoMessage()    {}
func (*LogoutReply) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{10}
}

func (m *LogoutReply) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LogoutReply.Unmarshal(m, b)
}
func (m *LogoutReply) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LogoutReply.Marshal(b, m, deterministic)
}
func (m *LogoutReply) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LogoutReply.Merge(m, src)
}
func (m *LogoutReply) XXX_Size() int {
	return xxx_messageInfo_LogoutReply.Size(m)
}
func (m *LogoutReply) XXX_DiscardUnknown() {
	xxx_messageInfo_LogoutReply.DiscardUnknown(m)
}

var xxx_messageInfo_LogoutReply proto.InternalMessageInfo

func (m *LogoutReply) GetCode() comm.ErrorType {
	if m != nil {
		return m.Code
	}
	return comm.ErrorType_Norm
}

func (m *LogoutReply) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *LogoutReply) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

// -----------------------------------------
// 服务发起踢人请求
type KickOutRequest struct {
	Uid                  uint32   `protobuf:"varint,1,opt,name=uid,proto3" json:"uid,omitempty"`
	LastSid              uint32   `protobuf:"varint,2,opt,name=last_sid,json=lastSid,proto3" json:"last_sid,omitempty"`
	LastPlatform         uint32   `protobuf:"varint,3,opt,name=last_platform,json=lastPlatform,proto3" json:"last_platform,omitempty"`
	Message              string   `protobuf:"bytes,4,opt,name=message,proto3" json:"message,omitempty"`
	TraceId              string   `protobuf:"bytes,5,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *KickOutRequest) Reset()         { *m = KickOutRequest{} }
func (m *KickOutRequest) String() string { return proto.CompactTextString(m) }
func (*KickOutRequest) ProtoMessage()    {}
func (*KickOutRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{11}
}

func (m *KickOutRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_KickOutRequest.Unmarshal(m, b)
}
func (m *KickOutRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_KickOutRequest.Marshal(b, m, deterministic)
}
func (m *KickOutRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_KickOutRequest.Merge(m, src)
}
func (m *KickOutRequest) XXX_Size() int {
	return xxx_messageInfo_KickOutRequest.Size(m)
}
func (m *KickOutRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_KickOutRequest.DiscardUnknown(m)
}

var xxx_messageInfo_KickOutRequest proto.InternalMessageInfo

func (m *KickOutRequest) GetUid() uint32 {
	if m != nil {
		return m.Uid
	}
	return 0
}

func (m *KickOutRequest) GetLastSid() uint32 {
	if m != nil {
		return m.LastSid
	}
	return 0
}

func (m *KickOutRequest) GetLastPlatform() uint32 {
	if m != nil {
		return m.LastPlatform
	}
	return 0
}

func (m *KickOutRequest) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *KickOutRequest) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

// 踢出，
// s2c，请使用ImError代替
type KickOut struct {
	// 2：重复登录
	Code                 comm.ErrorType `protobuf:"varint,1,opt,name=code,proto3,enum=comm.ErrorType" json:"code,omitempty"`
	Message              string         `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
	TraceId              string         `protobuf:"bytes,3,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *KickOut) Reset()         { *m = KickOut{} }
func (m *KickOut) String() string { return proto.CompactTextString(m) }
func (*KickOut) ProtoMessage()    {}
func (*KickOut) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{12}
}

func (m *KickOut) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_KickOut.Unmarshal(m, b)
}
func (m *KickOut) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_KickOut.Marshal(b, m, deterministic)
}
func (m *KickOut) XXX_Merge(src proto.Message) {
	xxx_messageInfo_KickOut.Merge(m, src)
}
func (m *KickOut) XXX_Size() int {
	return xxx_messageInfo_KickOut.Size(m)
}
func (m *KickOut) XXX_DiscardUnknown() {
	xxx_messageInfo_KickOut.DiscardUnknown(m)
}

var xxx_messageInfo_KickOut proto.InternalMessageInfo

func (m *KickOut) GetCode() comm.ErrorType {
	if m != nil {
		return m.Code
	}
	return comm.ErrorType_Norm
}

func (m *KickOut) GetMessage() string {
	if m != nil {
		return m.Message
	}
	return ""
}

func (m *KickOut) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

// 用户登录通知给所有网关
type LoginNotify struct {
	User                 *OneUser `protobuf:"bytes,1,opt,name=user,proto3" json:"user,omitempty"`
	LoginTime            int64    `protobuf:"varint,2,opt,name=loginTime,proto3" json:"loginTime,omitempty"`
	SocketId             uint32   `protobuf:"varint,3,opt,name=socketId,proto3" json:"socketId,omitempty"`
	CurrentGateIp        string   `protobuf:"bytes,4,opt,name=currentGateIp,proto3" json:"currentGateIp,omitempty"`
	TraceId              string   `protobuf:"bytes,5,opt,name=traceId,proto3" json:"traceId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LoginNotify) Reset()         { *m = LoginNotify{} }
func (m *LoginNotify) String() string { return proto.CompactTextString(m) }
func (*LoginNotify) ProtoMessage()    {}
func (*LoginNotify) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{13}
}

func (m *LoginNotify) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LoginNotify.Unmarshal(m, b)
}
func (m *LoginNotify) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LoginNotify.Marshal(b, m, deterministic)
}
func (m *LoginNotify) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LoginNotify.Merge(m, src)
}
func (m *LoginNotify) XXX_Size() int {
	return xxx_messageInfo_LoginNotify.Size(m)
}
func (m *LoginNotify) XXX_DiscardUnknown() {
	xxx_messageInfo_LoginNotify.DiscardUnknown(m)
}

var xxx_messageInfo_LoginNotify proto.InternalMessageInfo

func (m *LoginNotify) GetUser() *OneUser {
	if m != nil {
		return m.User
	}
	return nil
}

func (m *LoginNotify) GetLoginTime() int64 {
	if m != nil {
		return m.LoginTime
	}
	return 0
}

func (m *LoginNotify) GetSocketId() uint32 {
	if m != nil {
		return m.SocketId
	}
	return 0
}

func (m *LoginNotify) GetCurrentGateIp() string {
	if m != nil {
		return m.CurrentGateIp
	}
	return ""
}

func (m *LoginNotify) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

// 直接发给用户的协议
type MsgNotify struct {
	// 注意，如果列表里有uid为0的，一定要放最前，不然同一个用户可能会收到多次同样的消息，platform也一样，需要发起方控制
	User    []*OneUser `protobuf:"bytes,1,rep,name=user,proto3" json:"user,omitempty"`
	Message []byte     `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
	CmdId   uint32     `protobuf:"varint,3,opt,name=cmdId,proto3" json:"cmdId,omitempty"`
	// 网关类型，0Im网关，1通用网关
	GateType             int32    `protobuf:"varint,4,opt,name=gateType,proto3" json:"gateType,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *MsgNotify) Reset()         { *m = MsgNotify{} }
func (m *MsgNotify) String() string { return proto.CompactTextString(m) }
func (*MsgNotify) ProtoMessage()    {}
func (*MsgNotify) Descriptor() ([]byte, []int) {
	return fileDescriptor_28a39587afeb8e27, []int{14}
}

func (m *MsgNotify) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_MsgNotify.Unmarshal(m, b)
}
func (m *MsgNotify) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_MsgNotify.Marshal(b, m, deterministic)
}
func (m *MsgNotify) XXX_Merge(src proto.Message) {
	xxx_messageInfo_MsgNotify.Merge(m, src)
}
func (m *MsgNotify) XXX_Size() int {
	return xxx_messageInfo_MsgNotify.Size(m)
}
func (m *MsgNotify) XXX_DiscardUnknown() {
	xxx_messageInfo_MsgNotify.DiscardUnknown(m)
}

var xxx_messageInfo_MsgNotify proto.InternalMessageInfo

func (m *MsgNotify) GetUser() []*OneUser {
	if m != nil {
		return m.User
	}
	return nil
}

func (m *MsgNotify) GetMessage() []byte {
	if m != nil {
		return m.Message
	}
	return nil
}

func (m *MsgNotify) GetCmdId() uint32 {
	if m != nil {
		return m.CmdId
	}
	return 0
}

func (m *MsgNotify) GetGateType() int32 {
	if m != nil {
		return m.GateType
	}
	return 0
}

func init() {
	proto.RegisterEnum("user.UserIdent", UserIdent_name, UserIdent_value)
	proto.RegisterType((*GetUserInfoRequest)(nil), "user.GetUserInfoRequest")
	proto.RegisterType((*GetUserInfoReply)(nil), "user.GetUserInfoReply")
	proto.RegisterMapType((map[string]string)(nil), "user.GetUserInfoReply.ThirdAccountEntry")
	proto.RegisterType((*GetUserPLevelRequest)(nil), "user.GetUserPLevelRequest")
	proto.RegisterType((*GetUserPLevelReply)(nil), "user.GetUserPLevelReply")
	proto.RegisterType((*PLevelInfo)(nil), "user.PLevelInfo")
	proto.RegisterType((*UserInfo)(nil), "user.UserInfo")
	proto.RegisterType((*OneUser)(nil), "user.OneUser")
	proto.RegisterType((*LoginRequest)(nil), "user.LoginRequest")
	proto.RegisterType((*LoginReply)(nil), "user.LoginReply")
	proto.RegisterType((*LogoutRequest)(nil), "user.LogoutRequest")
	proto.RegisterType((*LogoutReply)(nil), "user.LogoutReply")
	proto.RegisterType((*KickOutRequest)(nil), "user.KickOutRequest")
	proto.RegisterType((*KickOut)(nil), "user.KickOut")
	proto.RegisterType((*LoginNotify)(nil), "user.LoginNotify")
	proto.RegisterType((*MsgNotify)(nil), "user.MsgNotify")
}

func init() { proto.RegisterFile("user/userdef.proto", fileDescriptor_28a39587afeb8e27) }

var fileDescriptor_28a39587afeb8e27 = []byte{
	// 874 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xb4, 0x56, 0x4d, 0x6f, 0x23, 0x45,
	0x10, 0xa5, 0x3d, 0xfe, 0x2c, 0x7b, 0x82, 0xb7, 0x15, 0xad, 0x86, 0x08, 0x84, 0x99, 0x05, 0x64,
	0x21, 0x61, 0x8b, 0x70, 0x41, 0x70, 0x40, 0xbb, 0xab, 0x55, 0x88, 0x08, 0x24, 0x1a, 0xb2, 0x17,
	0x2e, 0xd1, 0x64, 0xa6, 0x3c, 0x69, 0x79, 0xa6, 0xdb, 0xf4, 0xb4, 0xb3, 0xeb, 0xfd, 0x09, 0xdc,
	0xe1, 0xc8, 0x01, 0x89, 0x0b, 0xbf, 0x12, 0xf5, 0xc7, 0x8c, 0xed, 0x18, 0x07, 0x0e, 0xd9, 0xcb,
	0xa4, 0x5f, 0x55, 0x77, 0xd5, 0xab, 0x57, 0xd5, 0x1d, 0x03, 0x5d, 0x96, 0x28, 0xa7, 0xfa, 0x93,
	0xe2, 0x6c, 0xb2, 0x90, 0x42, 0x09, 0xda, 0xd4, 0xf0, 0xe8, 0x51, 0x22, 0x8a, 0x62, 0xaa, 0x3f,
	0x82, 0x5b, 0x47, 0x28, 0x80, 0x9e, 0xa0, 0x7a, 0x59, 0xa2, 0x3c, 0xe5, 0x33, 0x11, 0xe1, 0x2f,
	0x4b, 0x2c, 0x15, 0xfd, 0x00, 0x40, 0xc5, 0x32, 0x43, 0x75, 0xb5, 0x64, 0x69, 0x40, 0x46, 0xde,
	0xd8, 0x8f, 0x7a, 0xd6, 0xf2, 0x92, 0xa5, 0x34, 0x80, 0x8e, 0x92, 0x71, 0x82, 0xa7, 0x69, 0xd0,
	0x18, 0x91, 0x71, 0x2f, 0xaa, 0x20, 0x1d, 0x41, 0x5f, 0xdd, 0x30, 0x99, 0x9e, 0xc4, 0x85, 0xf6,
	0x7a, 0x23, 0x32, 0xf6, 0xa3, 0x4d, 0x53, 0xf8, 0x47, 0x03, 0x86, 0x5b, 0x19, 0x17, 0xf9, 0x8a,
	0x3e, 0x81, 0x66, 0x22, 0x52, 0x0c, 0xc8, 0x88, 0x8c, 0x0f, 0x8e, 0xdf, 0x9d, 0x68, 0x8a, 0x93,
	0x17, 0x52, 0x0a, 0x79, 0xb9, 0x5a, 0x60, 0x64, 0x9c, 0x3a, 0x6b, 0x81, 0x65, 0x19, 0x67, 0x58,
	0x65, 0x75, 0x90, 0x86, 0x60, 0xea, 0x0b, 0xbc, 0x91, 0x37, 0xee, 0x1f, 0x1f, 0x4c, 0x34, 0x98,
	0xd4, 0x19, 0x8c, 0xaf, 0xe6, 0xcc, 0xd2, 0xa0, 0xb9, 0xc1, 0x99, 0xa5, 0xf4, 0x0c, 0x06, 0x86,
	0xe0, 0xd3, 0x24, 0x11, 0x4b, 0xae, 0x82, 0x96, 0x89, 0x32, 0xb6, 0x51, 0xee, 0x52, 0x9d, 0x5c,
	0x6e, 0x6c, 0x7d, 0xc1, 0x95, 0x5c, 0x45, 0x5b, 0xa7, 0x8f, 0xbe, 0x85, 0x47, 0x3b, 0x5b, 0xe8,
	0x10, 0xbc, 0x39, 0xae, 0x4c, 0x79, 0xbd, 0x48, 0x2f, 0xe9, 0x21, 0xb4, 0x6e, 0xe3, 0x7c, 0x59,
	0x95, 0x62, 0xc1, 0xd7, 0x8d, 0xaf, 0x48, 0x78, 0x0e, 0x87, 0x2e, 0xe9, 0xc5, 0x19, 0xde, 0x62,
	0xbe, 0xaf, 0x27, 0xe4, 0x7f, 0xf6, 0x24, 0xfc, 0x8d, 0xd4, 0x3d, 0xae, 0x22, 0x3e, 0x80, 0xe6,
	0x9f, 0x42, 0x2b, 0xd7, 0xc1, 0x4c, 0x8f, 0xfb, 0xc7, 0x43, 0x2b, 0x97, 0x4d, 0x60, 0xd4, 0xb2,
	0xee, 0x4d, 0x5e, 0xcd, 0x6d, 0x5e, 0xdf, 0x01, 0xac, 0xb7, 0x6b, 0x41, 0x6c, 0x3c, 0x5b, 0x99,
	0x3b, 0x3d, 0x04, 0x0f, 0x5f, 0x2f, 0x4c, 0x6e, 0x3f, 0xd2, 0x4b, 0x4a, 0xa1, 0x99, 0xe3, 0x4c,
	0xb9, 0xd1, 0x32, 0xeb, 0xf0, 0xd7, 0x06, 0x74, 0xab, 0x2e, 0xe9, 0x23, 0x6b, 0x81, 0xf4, 0x92,
	0x1e, 0x41, 0x97, 0xb3, 0x64, 0xce, 0xe3, 0xa2, 0xaa, 0xa2, 0xc6, 0xf4, 0x31, 0xb4, 0xe3, 0xdb,
	0x58, 0xc5, 0xd2, 0x04, 0xec, 0x45, 0x0e, 0x69, 0x7b, 0x86, 0x3c, 0x45, 0x69, 0x58, 0xfb, 0x91,
	0x43, 0xf4, 0x13, 0x68, 0xb1, 0x14, 0xcd, 0x94, 0x58, 0xd9, 0xd6, 0xb3, 0xa6, 0xcd, 0x91, 0xf5,
	0xd2, 0x31, 0xb4, 0x17, 0xb6, 0x9c, 0xf6, 0x1e, 0x79, 0x9c, 0xdf, 0x10, 0xe0, 0xc9, 0x8d, 0x90,
	0x41, 0x67, 0x44, 0xc6, 0xdd, 0xc8, 0x21, 0x6d, 0x2f, 0xc4, 0x35, 0xcb, 0x31, 0xe8, 0x5a, 0x62,
	0x16, 0xd1, 0x0f, 0xa1, 0xcf, 0xf8, 0x2d, 0x53, 0x78, 0x65, 0xba, 0xd7, 0x33, 0x4e, 0xb0, 0xa6,
	0xe7, 0x22, 0xc5, 0x70, 0x0e, 0x9d, 0x73, 0x8e, 0x9a, 0xd1, 0xbf, 0x4b, 0xb1, 0xc8, 0x63, 0x35,
	0x13, 0xb2, 0x70, 0xa2, 0xd6, 0x58, 0xfb, 0x4a, 0x91, 0xcc, 0x51, 0xd5, 0x17, 0xb7, 0xc6, 0x46,
	0x8e, 0x58, 0xe1, 0xe9, 0xc2, 0x35, 0xd1, 0xa1, 0x30, 0x87, 0xc1, 0x99, 0xc8, 0x18, 0xaf, 0x86,
	0x74, 0x37, 0xe3, 0x21, 0xb4, 0x94, 0x98, 0x23, 0xaf, 0x06, 0xdd, 0x80, 0x2d, 0x1e, 0xde, 0x1d,
	0x1e, 0xfb, 0x27, 0xe6, 0x2f, 0x02, 0xe0, 0xd2, 0x3d, 0xe8, 0xab, 0x41, 0xfe, 0xf3, 0xd5, 0xd8,
	0xe1, 0xa2, 0x2b, 0xc8, 0x35, 0x95, 0xe7, 0x6e, 0x16, 0xfc, 0xa8, 0xc6, 0xe1, 0x53, 0xf0, 0xcf,
	0x44, 0x26, 0x96, 0xaa, 0x92, 0x65, 0x23, 0x0c, 0xd9, 0x0e, 0xf3, 0x18, 0xda, 0xf8, 0x3a, 0xc1,
	0x85, 0x32, 0xec, 0xba, 0x91, 0x43, 0xe1, 0x0c, 0xfa, 0x55, 0x88, 0x07, 0x28, 0x75, 0x23, 0xbf,
	0xb7, 0x2d, 0xe9, 0xef, 0x04, 0x0e, 0xbe, 0x67, 0xc9, 0xfc, 0x7c, 0x4d, 0x76, 0xb7, 0x87, 0xef,
	0x41, 0x37, 0x8f, 0x4b, 0x75, 0x55, 0xb2, 0xd4, 0x4d, 0x4d, 0x47, 0xe3, 0x9f, 0x58, 0x4a, 0x9f,
	0x80, 0x6f, 0x5c, 0x77, 0xba, 0x39, 0xd0, 0xc6, 0x8b, 0x8d, 0x8e, 0x56, 0xc4, 0x9a, 0x7b, 0x89,
	0xb5, 0xb6, 0x89, 0x5d, 0x43, 0xc7, 0xf1, 0x7a, 0x7b, 0xc5, 0xff, 0x4d, 0x8c, 0xca, 0x8c, 0xff,
	0x28, 0x14, 0x9b, 0xad, 0xe8, 0x47, 0x6e, 0x22, 0x88, 0x99, 0x08, 0xdf, 0x4e, 0x84, 0xbb, 0x4c,
	0x6e, 0x20, 0xde, 0x87, 0x9e, 0x69, 0xf3, 0x25, 0x73, 0x8f, 0x89, 0x17, 0xad, 0x0d, 0xf7, 0x5e,
	0xa1, 0x8f, 0xc1, 0x4f, 0x96, 0x52, 0x22, 0x57, 0x27, 0x9b, 0x37, 0x69, 0xdb, 0x78, 0x8f, 0x20,
	0x6f, 0xa0, 0xf7, 0x43, 0x99, 0xed, 0x30, 0xf5, 0xf6, 0x31, 0xbd, 0x23, 0xc8, 0x60, 0x2d, 0xc8,
	0x21, 0xb4, 0x92, 0x22, 0xad, 0x29, 0x5a, 0xa0, 0xb9, 0xeb, 0x4b, 0xad, 0x25, 0x35, 0xd4, 0x5a,
	0x51, 0x8d, 0x3f, 0xfb, 0x02, 0x7a, 0xf5, 0x13, 0x47, 0x01, 0xda, 0x5c, 0xc8, 0x22, 0xce, 0x87,
	0xef, 0xd0, 0x01, 0x74, 0xc5, 0x6c, 0xc6, 0x12, 0x16, 0xe7, 0x43, 0xa2, 0x3d, 0xe5, 0xaa, 0x54,
	0x58, 0x0c, 0x1b, 0xcf, 0x2e, 0xe0, 0x20, 0x11, 0x85, 0xfd, 0x95, 0x61, 0xe8, 0x3d, 0x6b, 0x9a,
	0xff, 0x40, 0xe4, 0xe7, 0x69, 0xc6, 0xd4, 0xcd, 0xf2, 0x5a, 0xb7, 0x71, 0x9a, 0x21, 0x47, 0x19,
	0xe7, 0x6f, 0xb2, 0x74, 0x5a, 0xb0, 0x44, 0x8a, 0xcf, 0xcd, 0xfe, 0x69, 0x26, 0xdc, 0xdf, 0x57,
	0xdf, 0x64, 0xaf, 0xfe, 0x6c, 0x98, 0x93, 0xd7, 0x6d, 0x63, 0xfb, 0xf2, 0x9f, 0x00, 0x00, 0x00,
	0xff, 0xff, 0x0d, 0x4c, 0xb3, 0xeb, 0xe0, 0x08, 0x00, 0x00,
}
