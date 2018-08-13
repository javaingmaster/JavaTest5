curl -X POST http://192.168.99.100:8081/customers?name=PATRICIA\&password=JOHNSON

curl -X GET -H "Content-Type:application/json" -d '{"page":"2","pageSize":"15"}' http://192.168.99.100:8081/films

curl -X PUT -H "Content-type:application/json" -d '{"firstName":"ff","lastName":"lll","email":"eee","addressId":"5"}' http://192.168.99.100:8081/customers

curl -X POST http://192.168.99.100:8081/customers/600

curl -X DELETE -b "cid=600" http://192.168.99.100:8081/customers