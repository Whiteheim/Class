#    -*- coding:utf-8 -*-
from bs4 import BeautifulSoup

# Beautiful Soup
# cmd -> pip install bs4

htmlEX = """
<html>
<head>
<meta charset="UTF-8">
<title>타이틀</title>
</head>
<body>
<h1>에이치원</h1>
<h2>에이치투</h2>
<p><b>b는 뭐지</b></p>
<div>이건 디브</div>
<span>이건 스판</span>
<div><p><span>디브속 피 속 스판</span></p></div>
<p>Python에서 Crawling할 때 유용하게 쓰는 library = beautifulSoup</p>
<p>html 너무 재미 없어요</p>
<a href="#">구글</a>
<a href="#">네이버</a>
<a href="#">아마존</a>
<a href="#">유뚜브</a>
<p>How to use bs4</p>
</body>
</html>
"""
# bs4 초기화 (객체 생성)
# html.parser : HTML 문법 규칙에 따른 문자열, 해당 문법을 바탕으로
#                단어의 의미나 구조를 분석하는 프로그램
soup = BeautifulSoup(htmlEX, 'html.parser')

# print(soup)

# 코드 정리 - prettify
# print(soup.prettify())

# title 부분 찾기
title = soup.html.head.title

print(title)    # title 태그까지 가져옴
print(title.string)     # title의 내용만 가져옴 (bs4 내부의 string)
print(title.text)       # Python의 string
print("--------------------------------")
# h1 태그
h1 = soup.html.body.h1
print(h1)
print(h1.string)
print(h1.text)
print("--------------------------------")
# p 태그
p1 = soup.html.body.p
print(p1)
print(p1.string)
print(p1.text)
print("--------------------------------")

# next_sibling : 동일한 level의 다음 요소를 불러올 수 있는 기능
#            <-> previous_sibling (같은 종류의 태그로 넘어가는게 아닌 다음줄의 태그로 넘어감)
# 태그와 태그 사이에 개행 (줄바꿈)이 있는 경우, enter처리로 취급하여 요소로 인식을 함
# p2 = p1.next_sibling
p2 = p1.next_sibling.next_sibling
print(p2)
print(p2.text)






































