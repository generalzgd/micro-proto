// Code generated by protoc-gen-go. DO NOT EDIT.
// source: gw/gatedown.proto

// protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/gw/gatedown.proto

package gw

import (
	context "context"
	fmt "fmt"
	comm "github.com/generalzgd/micro-proto/goproto/comm"
	proto "github.com/golang/protobuf/proto"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
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

func init() { proto.RegisterFile("gw/gatedown.proto", fileDescriptor_c72521daa853f599) }

var fileDescriptor_c72521daa853f599 = []byte{
	// 219 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x74, 0x8f, 0xbb, 0x4e, 0x03, 0x31,
	0x10, 0x45, 0x03, 0x45, 0x22, 0x39, 0x45, 0xb4, 0x16, 0x95, 0xcb, 0xd4, 0xe0, 0x11, 0x50, 0xd2,
	0xf1, 0x10, 0x05, 0x8f, 0x48, 0x69, 0x90, 0xe8, 0x9c, 0xdd, 0xc9, 0x60, 0x11, 0x7b, 0x82, 0xd7,
	0x96, 0xb5, 0x7c, 0x0b, 0x1f, 0x8b, 0xbc, 0xde, 0x36, 0xcd, 0x1d, 0xdd, 0xa3, 0x7b, 0x8a, 0x11,
	0x0d, 0x65, 0x20, 0x13, 0xb1, 0xe3, 0xec, 0xf5, 0x31, 0x70, 0x64, 0x79, 0x4e, 0x59, 0xc9, 0xd4,
	0x63, 0x80, 0x12, 0x1d, 0xee, 0x2b, 0x57, 0x4d, 0xcb, 0xce, 0x41, 0x09, 0x9e, 0xa6, 0x37, 0x7f,
	0x67, 0x62, 0xf9, 0x6c, 0x22, 0x7e, 0x98, 0xe1, 0x91, 0xb3, 0x97, 0x97, 0x62, 0xfe, 0xce, 0xd1,
	0xee, 0x07, 0xb9, 0xd2, 0x45, 0xd6, 0x6f, 0x3d, 0x55, 0xa0, 0x56, 0xba, 0x98, 0xfa, 0x81, 0x9d,
	0xdb, 0xe2, 0xf1, 0x30, 0xac, 0x67, 0x12, 0xc4, 0x62, 0xe3, 0x5f, 0x99, 0xac, 0x97, 0x4d, 0x9d,
	0x8f, 0xe5, 0xb4, 0xa0, 0xc5, 0xe2, 0xc5, 0xb6, 0xdf, 0x9b, 0x14, 0xe5, 0x45, 0x15, 0xa6, 0xba,
	0xc5, 0x9f, 0x84, 0x7d, 0x54, 0xcb, 0xea, 0x3c, 0x85, 0xc0, 0x61, 0x3d, 0xbb, 0xbf, 0xfe, 0x04,
	0xb2, 0xf1, 0x2b, 0xed, 0x0a, 0x06, 0x42, 0x8f, 0xc1, 0x1c, 0x7e, 0xa9, 0x03, 0x67, 0xdb, 0xc0,
	0x57, 0xe3, 0x0f, 0x40, 0x3c, 0xdd, 0x7c, 0x47, 0x79, 0x37, 0x1f, 0xcb, 0xed, 0x7f, 0x00, 0x00,
	0x00, 0xff, 0xff, 0x28, 0x85, 0x84, 0x26, 0x18, 0x01, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// GateWayDownClient is the client API for GateWayDown service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type GateWayDownClient interface {
	// 广播通知
	Notify(ctx context.Context, in *MsgNotify, opts ...grpc.CallOption) (*comm.CommReply, error)
	// 用户登录通知给所有网关
	OnLogin(ctx context.Context, in *LoginNotify, opts ...grpc.CallOption) (*comm.CommReply, error)
	// 登录验证，互踢判断需要
	KickOut(ctx context.Context, in *KickOutRequest, opts ...grpc.CallOption) (*comm.Error, error)
}

type gateWayDownClient struct {
	cc *grpc.ClientConn
}

func NewGateWayDownClient(cc *grpc.ClientConn) GateWayDownClient {
	return &gateWayDownClient{cc}
}

func (c *gateWayDownClient) Notify(ctx context.Context, in *MsgNotify, opts ...grpc.CallOption) (*comm.CommReply, error) {
	out := new(comm.CommReply)
	err := c.cc.Invoke(ctx, "/gw.GateWayDown/Notify", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *gateWayDownClient) OnLogin(ctx context.Context, in *LoginNotify, opts ...grpc.CallOption) (*comm.CommReply, error) {
	out := new(comm.CommReply)
	err := c.cc.Invoke(ctx, "/gw.GateWayDown/OnLogin", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *gateWayDownClient) KickOut(ctx context.Context, in *KickOutRequest, opts ...grpc.CallOption) (*comm.Error, error) {
	out := new(comm.Error)
	err := c.cc.Invoke(ctx, "/gw.GateWayDown/KickOut", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// GateWayDownServer is the server API for GateWayDown service.
type GateWayDownServer interface {
	// 广播通知
	Notify(context.Context, *MsgNotify) (*comm.CommReply, error)
	// 用户登录通知给所有网关
	OnLogin(context.Context, *LoginNotify) (*comm.CommReply, error)
	// 登录验证，互踢判断需要
	KickOut(context.Context, *KickOutRequest) (*comm.Error, error)
}

// UnimplementedGateWayDownServer can be embedded to have forward compatible implementations.
type UnimplementedGateWayDownServer struct {
}

func (*UnimplementedGateWayDownServer) Notify(ctx context.Context, req *MsgNotify) (*comm.CommReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Notify not implemented")
}
func (*UnimplementedGateWayDownServer) OnLogin(ctx context.Context, req *LoginNotify) (*comm.CommReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method OnLogin not implemented")
}
func (*UnimplementedGateWayDownServer) KickOut(ctx context.Context, req *KickOutRequest) (*comm.Error, error) {
	return nil, status.Errorf(codes.Unimplemented, "method KickOut not implemented")
}

func RegisterGateWayDownServer(s *grpc.Server, srv GateWayDownServer) {
	s.RegisterService(&_GateWayDown_serviceDesc, srv)
}

func _GateWayDown_Notify_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(MsgNotify)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GateWayDownServer).Notify(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/gw.GateWayDown/Notify",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GateWayDownServer).Notify(ctx, req.(*MsgNotify))
	}
	return interceptor(ctx, in, info, handler)
}

func _GateWayDown_OnLogin_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(LoginNotify)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GateWayDownServer).OnLogin(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/gw.GateWayDown/OnLogin",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GateWayDownServer).OnLogin(ctx, req.(*LoginNotify))
	}
	return interceptor(ctx, in, info, handler)
}

func _GateWayDown_KickOut_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(KickOutRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GateWayDownServer).KickOut(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/gw.GateWayDown/KickOut",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GateWayDownServer).KickOut(ctx, req.(*KickOutRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _GateWayDown_serviceDesc = grpc.ServiceDesc{
	ServiceName: "gw.GateWayDown",
	HandlerType: (*GateWayDownServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Notify",
			Handler:    _GateWayDown_Notify_Handler,
		},
		{
			MethodName: "OnLogin",
			Handler:    _GateWayDown_OnLogin_Handler,
		},
		{
			MethodName: "KickOut",
			Handler:    _GateWayDown_KickOut_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "gw/gatedown.proto",
}
