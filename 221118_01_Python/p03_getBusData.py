#    -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring
from json import loads

# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/CardBusStatisticsServiceNew/1/5/20151101/
# 2017년 ~ 2021년의 데이터를
# 연, 월, 일, 노선번호, 정류장명(역 명), 승차 총 승객수, 하차 총 승객수
# 연도별로 csv 파일에 저장
# 정류장명 (역명) => ,가 있는 경우, .로 바꾸어 저장
# 인원수 관련 -> 정수형태


hc = HTTPConnection("openapi.seoul.go.kr:8088")
for y in range(2018, 2022):
    with open(f"C:/Users/user/Desktop/KDT/Python/bus/bus{y}.csv", "a", encoding="utf-8") as f:
        for m in range(1, 13):
            for d in range(1, 32):
                for start in range(1, 39000, 1000):
                    hc.request("GET", f"/4f626857416f6c6c3632586a416843/xml/CardBusStatisticsServiceNew/{start}/{start + 999}/{y}{m:02d}{d:02d}/" )
                    resBody = hc.getresponse().read()
                    for b in fromstring(resBody).iter("row"): # iter : 반복
                        date = b.find("USE_DT").text
                        rTn = b.find("BUS_ROUTE_NO").text
                        bSn = b.find("BUS_STA_NM").text.replace(",", ".")
                        rPn = b.find("RIDE_PASGR_NUM").text
                        aPn = b.find("ALIGHT_PASGR_NUM").text
                        f.write(f"{y},{m:02d},{d:02d},{rTn}, {bSn}, {rPn}, {aPn}\n")
                print(y, m, d)           
                

print('끝')

#
# con = HTTPConnection("openapi.seoul.go.kr:8088")
#
# y = 2017
# with open(f"C:/Users/user/Desktop/KDT/Python/bus/bus{y}.csv", "a", encoding="utf-8") as f:
    # for m in range(1, 13):
        # for d in range(1, 32):
            # for start in range(1, 39000, 1000): # 한 페이지에 보여지는 데이터의 수
                # url = ("/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/"
                       # + f"{start}/{start + 999}/{y}{m:02d}{d:02d}/" )               # 1 ~ 1000 / 1001 ~ 2000 / ...
                # con.request("GET", url)
                # resBody = con.getresponse().read()
                # busData = loads(resBody)
                #
                # if "CardBusStatisticsServiceNew" in busData: 
                        # for b in busData["CardBusStatisticsServiceNew"]["row"]:
                            # f.write(f"{y},{m},{d},")
                            # f.write(f"{b['BUS_ROUTE_NO'].replace(',', '.')},")
                            # f.write(f"{b['BUS_STA_NM'].replace(',', '.')},")
                            # f.write(f"{b['RIDE_PASGR_NUM']:.0f},")
                            # f.write(f"{b['ALIGHT_PASGR_NUM']:.0f}\n")
                            #
# f.close()
# con.close()
                            #



























