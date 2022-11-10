# -*- coding:utf-8 -*-
from urllib.parse import quote
from urllib.request import Request, urlopen
from http.client import HTTPSConnection
from xml.etree.ElementTree import fromstring


# https://openapi.naver.com/v1/search/shop.xml
# id : rss/channel/item/category1
# pw : 90eiD75yl4
# 상품명 : 입력
# xml 파싱
# 문서 제목/ 최저가/ 브랜드/ 대분류 카테고리 정보 출력

def cut(t):
    t = t.replace("<b>", "").replace("</b>", "")
    return t

client_id = "rss/channel/item/category1"
client_secret = "90eiD75yl4"
pn = input('상품명 : ')
encText = quote(pn)
#url = "https://openapi.naver.com/v1/search/blog?query=" + encText # JSON 결과
url = "https://openapi.naver.com/v1/search/shop.xml?query=" + encText # XML 결과

request = Request(url)
request.add_header("X-Naver-Client-Id", "FB78_6Ve0CdlU4I_Kom8")
request.add_header("X-Naver-Client-Secret", "90eiD75yl4")
response = urlopen(request)
rescode = response.getcode()
if(rescode==200):
    response_body = response.read()
    print(response_body.decode('utf-8'))
else:
    print("Error Code:" + rescode)

####################################################
hc = HTTPSConnection("openapi.naver.com")
# 요청헤더 처리 (dict)
h = {
    "X-Naver-Client-Id": "FB78_6Ve0CdlU4I_Kom8",
    "X-Naver-Client-Secret": "90eiD75yl4"
    }
hc.request("GET","/v1/search/shop.xml?query=" + encText, headers = h)

# http 통신 -> 응답결과가 콘솔에 출력
resBody = hc.getresponse().read()
# print(resBody.decode())

# XML Parsing
# DOM객체 여러개 찾기 : .getierator("태그명") / .iter("태그명")
# DOM 객체 하나 찾기 : .find("태그명")

for p in fromstring(resBody).iter("item"):
    print(cut(p.find("title").text))
    print(p.find("lprice").text)
    print(p.find("brand").text)
    print(p.find("category1").text)
    print("------------------------")























