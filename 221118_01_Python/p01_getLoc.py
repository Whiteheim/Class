#    -*- coding:utf-8 -*-
from urllib.parse import quote
from http.client import HTTPSConnection
from json import loads
from cx_Oracle import connect

# api key : 1ed1f2269397e4965c87eb293ef3a716
# 좌표 : 37.557527 / 126.9244669  
# 검색어 입력 -> 위도/경도 지정 -> 반경 1km 내에 있는 검색어에 대한 위치 정보
#    -> 장소명 (업체명), 전화번호, 경도, 위도 -> DB에 저장
#    -> 전화번호 : 없는 부분은 '-' 으로 대체
#    -> 경도, 위도 : 소수점 6자리 까지
# https://dapi.kakao.com/v2/local/search/keyword.json?y=37.514322572335935&x=127.06283102249932&radius=20000
q = quote(input('검색어 : '))
a = "/v2/local/search/keyword.json?x=126.9244669&y=37.557527&radius=1000&query=" + q
hc = HTTPSConnection("dapi.kakao.com")
h = {
       "Authorization": "KakaoAK 1ed1f2269397e4965c87eb293ef3a716"
    }
hc.request("GET", "/v2/local/search/keyword.json?x=126.9244669&y=37.557527&radius=1000&query=" + q, headers = h)
resBody = hc.getresponse().read()
#print(resBody.decode())

locData = loads(resBody)

with connect("heim/1234@203.252.32.73:1521/xe") as con:
    cur = con.cursor()
    for l in locData["documents"]:
        p = l['phone']
        if p == "":
            p = 'default'
            sql = f"insert into nov18_loc values(nov18_loc_seq.nextval, '{l['place_name']}', {p}, {float(l['y']):.6f}, {float(l['x'])})"
                                # nvl 함수 nvl('{l['phone']}', '-')
            cur.execute(sql)
            if cur.rowcount == 1:
                con.commit()
        else: 
            sql = f"insert into nov18_loc values(nov18_loc_seq.nextval, '{l['place_name']}', {p}, {float(l['y']):.6f}, {float(l['x'])})"
            cur.execute(sql)
            if cur.rowcount == 1:
                con.commit()
print("완료")






























































