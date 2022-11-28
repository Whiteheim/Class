#    -*- coding:utf-8 -*-
from pymongo.mongo_client import MongoClient

con = MongoClient("39.118.148.56")

db = con.nov28

s = db.nov28_lunch.find()

for l in s:
    print(l["_id"])
    print(l["price"])

con.close()
print("완")







































