#empty name error
curl -X POST \
  http://localhost:8080/account/c \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 5acfe9e2-602f-070a-3aed-bc6fee498146' \
  -d '{
	"cqrsId":"1",
	"payload":{
		 "name":null,
	     "password":"111"
	}
}'
#empty password error
curl -X POST \
  http://localhost:8080/account/c \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: a9a0a496-3e6c-843f-fd58-9bdca97f182d' \
  -d '{
	"cqrsId":"1",
	"payload":{
		 "name":"test1",
	     "password":null
	}
}'
#add account success
curl -X POST \
  http://localhost:8080/account/c \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 81f0743c-2132-d465-2e59-88ea1226bede' \
  -d '{
	"cqrsId":"1",
	"payload":{
		 "name":"test1",
	     "password":"111"
	}
}'
#add account duplicate validation error
curl -X POST \
  http://localhost:8080/account/c \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 81f0743c-2132-d465-2e59-88ea1226bede' \
  -d '{
	"cqrsId":"1",
	"payload":{
		 "name":"test1",
	     "password":"111"
	}
}'
