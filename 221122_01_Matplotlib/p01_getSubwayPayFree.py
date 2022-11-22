#    -*- coding:utf-8 -*-
from http.client import HTTPConnection
from json import loads

# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/CardSubwayPayFree/1/5/201501/

# 2015 ~ 2021년 월별 > 하나의 csv로 저장
# 연월 (ex:202211), 호선명, 지하철역, 유임승차인원, 무임승차인원, 유임하차인원, 무임하차인원

hc = HTTPConnection("openapi.seoul.go.kr:8088")


with open("C:/Users/user/Desktop/KDT/Python/CardSubWayPayFree/CardSubwayPayFree.csv", "a", encoding="utf-8") as f:
    f.write("연월, 호선명, 지하철역, 유임승차인원, 무임승차인원, 유임하차인원, 무임하차인원\n")
    for y in range(2015, 2022):
        for m in range(1, 13):
            hc.request("GET", "/4f626857416f6c6c3632586a416843/json/CardSubwayPayFree/1/800/%d%02d/" % (y, m))
            resBody = hc.getresponse().read()
            # print(resBody.decode())
            sbData = loads(resBody)
            for s in sbData["CardSubwayPayFree"]["row"]:
                f.write(f"{s['USE_MON']},")
                f.write(f"{s['LINE_NUM']},")
                f.write(f"{s['SUB_STA_NM']},")
                f.write(f"{s['PAY_RIDE_NUM']},")
                f.write(f"{s['FREE_RIDE_NUM']},")
                f.write(f"{s['PAY_ALIGHT_NUM']},")
                f.write(f"{s['FREE_ALIGHT_NUM']}\n")
print("완")










































































