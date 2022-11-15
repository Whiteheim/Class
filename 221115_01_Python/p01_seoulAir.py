# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from json import loads
from cx_Oracle import connect

# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/

# 요청하기 
# 데이터들을 이용해 Parsing
# 구 이름, 미세먼지, 초미세먼지의 이름 -> DB에 담기


url = "/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/"

hc = HTTPConnection("openapi.seoul.go.kr:8088")
hc.request("GET", url)

resBody = hc.getresponse().read()
# print(resBody.decode())

airData = loads(resBody)
#print(airData["RealtimeCityAir"]["row"][0]["MSRSTE_NM"])
con = connect("heim/1234@203.252.32.73:1521/xe")
cur = con.cursor()
for a in airData["RealtimeCityAir"]["row"]:
    sql = f"insert into airPollution values(airPollution_seq.nextval,'{a['MSRSTE_NM']}', {a['PM10']}, {a['PM25']})"
    cur.execute(sql)
    if cur.rowcount == 1:
        con.commit()
    
    
print("완료")

con.close()



































