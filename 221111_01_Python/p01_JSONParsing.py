# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from urllib.parse import quote
from json import loads
from ctypes.wintypes import PINT

# Parsing에 필요한 데이터 챙기기
# 책 검색 후 책 제목 - 작가 / 할인가 / 책 정보 출력

# https://dapi.kakao.com/v3/search/book?target=title

search = input("책 제목 : ")
encode = quote(search)
#print(encode)
h = {"Authorization": "KakaoAK 1ed1f2269397e4965c87eb293ef3a716"}
hc = HTTPSConnection("dapi.kakao.com")
hc.request("GET", "/v3/search/book?query=" + encode, headers = h)

resBody = hc.getresponse().read()
# print(resBody.decode())

bookData = loads(resBody)

for b in bookData["documents"]:
    print(b["title"], "-", b["authors"][0])
    print(b["sale_price"], "원")
    print(b["contents"])
    print("------------------")





































