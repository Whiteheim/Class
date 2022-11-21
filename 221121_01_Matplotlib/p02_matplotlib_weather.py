#    -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm


# 기상청 데이터
#        -> 각 시간별 기온과 습도를 선그래프로 표현
# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113554500
hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=4113554500")
resBody = hc.getresponse().read()
# print(resBody.decode())

    
fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

hour = []
temp = []
hmd = []
for w in fromstring(resBody).iter("data"):
    hour.append(w.find("hour").text + "시")
    temp.append(float(w.find("temp").text))
    hmd.append(float(w.find("reh").text))
    

indexes = range(len(hour))          # hour 요소의 길이만큼 x축 설정


# # print(hData)
# # print(tData)
# # print(hdData)
# plt.plot(hData, temp, "r-")
# plt.plot(hData, hmd, "b:")
# plt.legend(["온도", "습도"])
# plt.show()
x1 = plt.subplot()
p1 = x1.plot(indexes, temp, "r-")
x1.set_xlabel("시간")
x1.set_ylabel("온도")

x2 = x1.twinx()
p2 = x2.plot(indexes, hmd, "b:^")
x2.set_ylabel("습도")

plt.title("날씨", loc="center")
x1.legend(p1 + p2, ["온도", "습도"])

plt.xticks(indexes, hour)

plt.show()

























































































