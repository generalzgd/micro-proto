// Code generated by protoc-gen-go. DO NOT EDIT.
// source: core/pubsub.proto

// protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/core/pubsub.proto

package core

import (
	fmt "fmt"
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

// 该文件下所有消息用户，pubsub通道传递事件
type PubSubChannel int32

const (
	PubSubChannel_Login        PubSubChannel = 0
	PubSubChannel_Logout       PubSubChannel = 1
	PubSubChannel_TicketUpdate PubSubChannel = 2
)

var PubSubChannel_name = map[int32]string{
	0: "Login",
	1: "Logout",
	2: "TicketUpdate",
}

var PubSubChannel_value = map[string]int32{
	"Login":        0,
	"Logout":       1,
	"TicketUpdate": 2,
}

func (x PubSubChannel) String() string {
	return proto.EnumName(PubSubChannel_name, int32(x))
}

func (PubSubChannel) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_6cd7a3b54d416296, []int{0}
}

// 用户登录消息
type LoginInfo struct {
	TraceId              string       `protobuf:"bytes,1,opt,name=traceId,proto3" json:"traceId,omitempty"`
	Platform             uint32       `protobuf:"varint,2,opt,name=platform,proto3" json:"platform,omitempty"`
	User                 *gw.UserInfo `protobuf:"bytes,3,opt,name=user,proto3" json:"user,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *LoginInfo) Reset()         { *m = LoginInfo{} }
func (m *LoginInfo) String() string { return proto.CompactTextString(m) }
func (*LoginInfo) ProtoMessage()    {}
func (*LoginInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_6cd7a3b54d416296, []int{0}
}

func (m *LoginInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LoginInfo.Unmarshal(m, b)
}
func (m *LoginInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LoginInfo.Marshal(b, m, deterministic)
}
func (m *LoginInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LoginInfo.Merge(m, src)
}
func (m *LoginInfo) XXX_Size() int {
	return xxx_messageInfo_LoginInfo.Size(m)
}
func (m *LoginInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_LoginInfo.DiscardUnknown(m)
}

var xxx_messageInfo_LoginInfo proto.InternalMessageInfo

func (m *LoginInfo) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *LoginInfo) GetPlatform() uint32 {
	if m != nil {
		return m.Platform
	}
	return 0
}

func (m *LoginInfo) GetUser() *gw.UserInfo {
	if m != nil {
		return m.User
	}
	return nil
}

// 用户登出消息
type LogoutInfo struct {
	TraceId  string `protobuf:"bytes,1,opt,name=traceId,proto3" json:"traceId,omitempty"`
	Platform uint32 `protobuf:"varint,2,opt,name=platform,proto3" json:"platform,omitempty"`
	Uid      uint32 `protobuf:"varint,3,opt,name=uid,proto3" json:"uid,omitempty"`
	// true:正常退出，false:异常断开退出
	Expect               bool     `protobuf:"varint,4,opt,name=expect,proto3" json:"expect,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *LogoutInfo) Reset()         { *m = LogoutInfo{} }
func (m *LogoutInfo) String() string { return proto.CompactTextString(m) }
func (*LogoutInfo) ProtoMessage()    {}
func (*LogoutInfo) Descriptor() ([]byte, []int) {
	return fileDescriptor_6cd7a3b54d416296, []int{1}
}

func (m *LogoutInfo) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_LogoutInfo.Unmarshal(m, b)
}
func (m *LogoutInfo) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_LogoutInfo.Marshal(b, m, deterministic)
}
func (m *LogoutInfo) XXX_Merge(src proto.Message) {
	xxx_messageInfo_LogoutInfo.Merge(m, src)
}
func (m *LogoutInfo) XXX_Size() int {
	return xxx_messageInfo_LogoutInfo.Size(m)
}
func (m *LogoutInfo) XXX_DiscardUnknown() {
	xxx_messageInfo_LogoutInfo.DiscardUnknown(m)
}

var xxx_messageInfo_LogoutInfo proto.InternalMessageInfo

func (m *LogoutInfo) GetTraceId() string {
	if m != nil {
		return m.TraceId
	}
	return ""
}

func (m *LogoutInfo) GetPlatform() uint32 {
	if m != nil {
		return m.Platform
	}
	return 0
}

func (m *LogoutInfo) GetUid() uint32 {
	if m != nil {
		return m.Uid
	}
	return 0
}

func (m *LogoutInfo) GetExpect() bool {
	if m != nil {
		return m.Expect
	}
	return false
}

func init() {
	proto.RegisterEnum("core.PubSubChannel", PubSubChannel_name, PubSubChannel_value)
	proto.RegisterType((*LoginInfo)(nil), "core.LoginInfo")
	proto.RegisterType((*LogoutInfo)(nil), "core.LogoutInfo")
}

func init() { proto.RegisterFile("core/pubsub.proto", fileDescriptor_6cd7a3b54d416296) }

var fileDescriptor_6cd7a3b54d416296 = []byte{
	// 270 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xa4, 0x90, 0x41, 0x4b, 0xc4, 0x30,
	0x10, 0x85, 0xcd, 0xee, 0x5a, 0xb7, 0xa3, 0x95, 0x9a, 0x83, 0x94, 0x3d, 0x95, 0x9e, 0x8a, 0x60,
	0x0b, 0x2e, 0x82, 0xe0, 0x4d, 0x4f, 0x0b, 0x7b, 0x90, 0xea, 0x5e, 0xbc, 0x35, 0xe9, 0x34, 0x5b,
	0x6c, 0x3b, 0x25, 0x4d, 0x40, 0xfc, 0xf5, 0x92, 0x56, 0xfd, 0x03, 0x5e, 0x26, 0xf9, 0xe6, 0xc1,
	0x7b, 0xc9, 0x83, 0x2b, 0x49, 0x1a, 0xf3, 0xc1, 0x8a, 0xd1, 0x8a, 0x6c, 0xd0, 0x64, 0x88, 0xaf,
	0xdc, 0x6a, 0xc3, 0xed, 0x88, 0x3a, 0x77, 0xa3, 0xc2, 0x7a, 0x56, 0x12, 0x04, 0x7f, 0x4f, 0xaa,
	0xe9, 0x77, 0x7d, 0x4d, 0x3c, 0x82, 0x33, 0xa3, 0x4b, 0x89, 0xbb, 0x2a, 0x62, 0x31, 0x4b, 0xfd,
	0xe2, 0x17, 0xf9, 0x06, 0xd6, 0x43, 0x5b, 0x9a, 0x9a, 0x74, 0x17, 0x2d, 0x62, 0x96, 0x06, 0xc5,
	0x1f, 0xf3, 0x04, 0x56, 0xce, 0x33, 0x5a, 0xc6, 0x2c, 0x3d, 0xbf, 0xbb, 0xcc, 0x1c, 0x64, 0x87,
	0x11, 0xb5, 0xf3, 0x2c, 0x26, 0x2d, 0x69, 0x01, 0xf6, 0xa4, 0xc8, 0x9a, 0x7f, 0xe4, 0x84, 0xb0,
	0xb4, 0x4d, 0x35, 0xc5, 0x04, 0x85, 0xbb, 0xf2, 0x6b, 0xf0, 0xf0, 0x73, 0x40, 0x69, 0xa2, 0x55,
	0xcc, 0xd2, 0x75, 0xf1, 0x43, 0x37, 0x0f, 0x10, 0xbc, 0x58, 0xf1, 0x6a, 0xc5, 0xf3, 0xb1, 0xec,
	0x7b, 0x6c, 0xb9, 0x0f, 0xa7, 0xd3, 0x2f, 0xc3, 0x13, 0x0e, 0xe0, 0xcd, 0x2f, 0x09, 0x19, 0x0f,
	0xe1, 0xe2, 0xad, 0x91, 0x1f, 0x68, 0x0e, 0x43, 0x55, 0x1a, 0x0c, 0x17, 0x4f, 0xf7, 0xef, 0x5b,
	0xd5, 0x98, 0xa3, 0x15, 0x99, 0xa4, 0x2e, 0x57, 0xd8, 0xa3, 0x2e, 0xdb, 0x2f, 0x55, 0xe5, 0x5d,
	0x23, 0x35, 0xdd, 0x4e, 0x9d, 0xe5, 0x8a, 0xe6, 0xd3, 0x95, 0xfa, 0xe8, 0x86, 0xf0, 0xa6, 0xc5,
	0xf6, 0x3b, 0x00, 0x00, 0xff, 0xff, 0x92, 0xf2, 0xa1, 0x4d, 0x7b, 0x01, 0x00, 0x00,
}