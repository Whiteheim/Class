#    -*- coding:utf-8 -*-

# http://openAPI.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/

# 서북권, 도심권, 동남권, .. 의 미세먼지 / 초미세먼지 
#    각각의 평균값을 bar 그래프로 표현(누적합)
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
from http.client import HTTPConnection
from json import loads

hc = HTTPConnection("openAPI.seoul.go.kr:8088")
hc.request("GET", "/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/")
resBody = hc.getresponse().read()
airData = loads(resBody)

ct = {"PM10" : 0, "PM2.5":0}
nw = {"PM10" : 0, "PM2.5":0}
ne = {"PM10" : 0, "PM2.5":0}
sw = {"PM10" : 0, "PM2.5":0}
se = {"PM10" : 0, "PM2.5":0}
for a in airData["RealtimeCityAir"]["row"]:
    if a["MSRRGN_NM"] == "도심권":
        ct["PM2.5"] += a["PM25"]
        ct["PM10"] += a["PM10"]
    elif a["MSRRGN_NM"] == "서북권":
        nw["PM2.5"] += a["PM25"]
        nw["PM10"] += a["PM10"]
    elif a["MSRRGN_NM"] == "동북권":
        ne["PM2.5"] += a["PM25"]
        ne["PM10"] += a["PM10"]
    elif a["MSRRGN_NM"] == "서남권":
        sw["PM2.5"] += a["PM25"]
        sw["PM10"] += a["PM10"]
    elif a["MSRRGN_NM"] == "동남권":
        se["PM2.5"] += a["PM25"]
        se["PM10"] += a["PM10"]
        
x = ["도심권", "서북권", "동북권", "서남권", "동남권"]
pm10 = [ct["PM10"] / 3, nw["PM10"] / 3 , ne["PM10"] / 8, sw["PM10"] / 7, se["PM10"] / 4]
pm25 = [ct["PM2.5"] / 3, nw["PM2.5"] / 3 , ne["PM2.5"] / 8, sw["PM2.5"] / 7 , se["PM2.5"] / 4]

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)        

plt.bar(x, pm10 , color="g")
plt.bar(x, pm25 , color="b" , bottom=pm10)
plt.title("서울 미세먼지 평균값", loc="center")
plt.legend(["미세먼지", "초미세먼지"])
plt.show()


################################################################################
where, pm10, pm25 = None, None, None
whereDict = {}
pm10Dict = {}
pm25Dict = {}

for a in airData["RealtimeCityAir"]["row"]:
    where = a["MSRRGN_NM"]
    pm10 = float(a["PM10"])
    pm25 = float(a["PM25"])
    
    if where in pm10Dict:           # 중복된 값이 집어넣어 질 때
        pm10Dict[where] += pm10
        pm25Dict[where] += pm25
        whereDict[where] += 1
    else:                           # 처음 where갑을 집어넣을 떄
        pm10Dict[where] = pm10
        pm25Dict[where] = pm25
        whereDict[where] = 1
print(whereDict, pm10Dict, pm25Dict)
############################################################
names = []
pm10s = []
pm25s = []
for k, v in whereDict.items():
    names.append(k)
    pm10s.append(pm10Dict[k] / v)
    pm25s.append(pm25Dict[k] / v)

print("-----------------------------------")
print(names)
print(pm10s)
print(pm25s)

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)  

plt.bar(names, pm10s, color="#FFA7A7")
plt.bar(names, pm25s, color="#B2CCFF", bottom=pm10s)
plt.legend(["미세먼지", "초미세먼지"])
plt.show()






























































