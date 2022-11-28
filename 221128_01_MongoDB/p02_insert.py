#    -*- coding:utf-8 -*-
from pymongo.mongo_client import MongoClient

con = MongoClient("39.118.148.56")

db = con.nov28

# 음식 메뉴와 가격을 입력받아 mongodb에 저장하기
m = input("메뉴 이름 : ")
p = int(input("가격 : "))

db.apr28_lunch.insert_one( {"_id": m, "price": p } )
db.apr28_lunch.insert_many()
# update / delete 다 같음
con.close()
print("완")










































