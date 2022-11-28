#    -*- coding:utf-8 -*_
from pymongo.mongo_client import MongoClient
from http.client import HTTPConnection
from json import loads
# http://openAPI.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/SearchParkInfoService/1/132/

# 전체 공원 데이터 중
#     공원 이름 (PK), 공원 소개, 개원일, 주소
#    -> MongoDB 입력 후 출력까지
con = MongoClient("39.118.148.56")

db = con.nov28

hc = HTTPConnection("openAPI.seoul.go.kr:8088")
hc.request("get", "/4f626857416f6c6c3632586a416843/json/SearchParkInfoService/1/132/")
resBody = hc.getresponse().read()
#print(resBody.decode())
pData = loads(resBody)

for p in pData["SearchParkInfoService"]["row"]:
    db.nov28_park.insert_one({"_id" : p["P_PARK"], "content" : p["P_LIST_CONTENT"], "open" : p["OPEN_DT"], "addr" : p["P_ADDR"]})
    
park = db.nov28_park.find()
for l in park:
    print(l["_id"])
    print(l["content"])
    print(l["open"])
    print(l["addr"])
    
con.close()
print("완")

































