#!/usr/bin/env bash

# generate go code
protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/comm/common.proto
protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/auth/auth.proto
protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/user/userdef.proto

protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/gw/bro.proto
protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/gw/gatedown.proto

protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/core/teamdef.proto
protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/core/team.proto
protoc -I proto --go_out=plugins=grpc,paths=source_relative:./goproto ./proto/core/pubsub.proto

# generate gateway
protoc -I proto --grpc-tcpgw_out=logtostderr=true,define_prefix=,paths=source_relative:./goproto ./proto/gw/gateway.proto
protoc -I proto --swagger_out=logtostderr=true:./swagger ./proto/gw/gateway.proto
protoc -I proto --grpc-httpgw_out=logtostderr=true,paths=source_relative:./goproto ./proto/gw/gateway.proto

# generate grpc proxy
protoc -I proto --grpc-tcpgw_out=logtostderr=true,define_prefix=,paths=source_relative:./goproto ./proto/proxy/grpcproxy.proto
protoc -I proto --grpc-httpgw_out=paths=source_relative:./goproto ./proto/proxy/grpcproxy.proto
protoc -I proto --swagger_out=logtostderr=true:./swagger ./proto/proxy/grpcproxy.proto

# generate oc code
protoc -Iproto --objc_out=ocproto ./proto/comm/common.proto
protoc -Iproto --objc_out=ocproto ./proto/user/userdef.proto
protoc -Iproto --objc_out=ocproto ./proto/core/teamdef.proto
# generate java code
protoc -Iproto --java_out=javaproto ./proto/comm/common.proto
protoc -Iproto --java_out=javaproto ./proto/user/userdef.proto
protoc -Iproto --java_out=javaproto ./proto/core/teamdef.proto
# generate js code
#protoc -Iproto --js_out=library=imdefproto_libs,binary:./jsproto ./proto/comm/common.proto
#protoc -Iproto --js_out=library=imdefproto_libs,binary:./jsproto ./proto/user/userdef.proto
#protoc -Iproto --js_out=library=imdefproto_libs,binary:./jsproto ./proto/imdef/imdef.proto
#protoc -Iproto --js_out=library=imdefproto_libs,binary:./jsproto ./proto/hfsys/duoteamdef.proto
# generate python code
#protoc -Iproto --python_out=pyproto ./proto/comm/common.proto
#protoc -Iproto --python_out=pyproto ./proto/user/userdef.proto
#protoc -Iproto --python_out=pyproto ./proto/imdef/imdef.proto
#protoc -Iproto --python_out=pyproto ./proto/hfsys/duoteamdef.proto




