# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring

# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4812757000

# HTTP 통신
hc = HTTPConnection("www.kma.go.kr")  # 서버 주소 (폴더 전 까지)
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=4812757000")  # GET방식으로 요청 / 폴더 주소 기입

res = hc.getresponse()  # 응답 받아오기
resBody = res.read()    # 응답 내용 읽기
# print(resBody)

print(resBody.decode()) # 출력 (한글 처리)
print("-------------------")
###########################################
# XML Parsing
# DOM객체 여러개 찾기 : .getiterator("태그명") / .iter("태그명")  ***
# DOM객체 하나 찾기 : .find("태그명")                             ***

# kmaWeather = fromstring(resBody)
# weathers = kmaWeather.iter("data")
# for w in weathers:
    # print(ws)
    # print("-------------------")

for w in fromstring(resBody).iter("data"):
    print(w.find("hour").text)
    print(w.find("temp").text)
    print(w.find("wfKor").text)
    print("-------------------")




















