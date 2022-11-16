# -*- coding:utf-8 -*-
from fake_useragent.fake import UserAgent
import urllib.request as req
from json import loads

# fake-useragent
#    cmd -> pip install fake-useragent
# 몇몇 브라우저는 get, post방식의 전송을 하는 상대가 컴퓨터일때,
#    해당 웹에 접속하는 것을 차단하는 경우가 있음
#        => 컴퓨터라는 것을 숨기는 라이브러리
# fake header 정보 (가상으로 User-agent 랜덤 생성)
# Python으로 정보를 크롤링 하지만, 웹 브라우저에서 실행하는것 처럼 인식하게 만드는 효과

ua = UserAgent()
# print(ua.ie)
# print(ua.msie)
# print(ua.chrome)
# print(ua.safari)
# print(ua.random)

# 헤더 선언 : dict 형태 (key, value)
# ex) {"name" : "이름", "age" : 100}
#     {"Authorization" : "KakaoAK dfdsf12f1fqer13414e1"}
h = {
        "User-Agent" : ua.chrome,
        "referer" : "https://finance.daum.net/"             # 이 경로를 통해 보내진 데이터
    }

# 다음 주식(금융) 요청 URL
url = "https://finance.daum.net/api/search/ranks?limit=10"

# 요청
res = req.urlopen(req.Request(url, headers=h)).read().decode()

# 응답데이터 확인
# print('res : ', res)

# 순위, 주식명, 거래가를 콘솔에 출력
stockData = loads(res)
#print(type(stockData))
for r in stockData["data"]:
    print(f"순위 : {r['rank']}")
    print(f"주식명 : {r['name']}")
    print(f"거래가 : {r['tradePrice']:,}원")
    print("---------------------")










































