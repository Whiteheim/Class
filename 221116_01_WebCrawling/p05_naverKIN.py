#    -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# https://kin.naver.com/search/list.naver?query=
q = quote(input("검색어 : "))
# print(q)
url = f"https://kin.naver.com/search/list.naver?query={q}"

# cmd -> pip install requests
# requests : HTTP요청을 간편하게 하기 위한 모듈
response = requests.get(url)        # get() : get방식 요청
# print(response.status_code)

if response.status_code == 200:
    html = response.text        # html을 str 형태로 받아오기
    print(type(html))
    soup = BeautifulSoup(html, 'html.parser')   # html을 soup로 parsing
    print(type(soup))
    # select_one : 문서의 처음부터 탐색 / 가장 처음에 만나는 해당 selector를 호출
    ul = soup.select_one('ul.basic1')   # 태그명 + .클래스명 / ul태그의 하위 내용을 'List'에 담기
    
    # s_content > div.section > ul > li:nth-child(1) > dl > dt > a -> 개발자모드에서 a태그 선택자 복사
    # select : 해당 selector들의 모든 내용이 'List'에 담김
    # > : 그 하위의 seletor들 모두를 지칭
    titles = ul.select('li > dl > dt > a')

    for title in titles:
        # print(title.text)
        print(title.get_text())
else:
    print(response.status_code)
















































