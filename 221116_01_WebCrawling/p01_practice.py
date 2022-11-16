# -*- coding:utf-8 -*-

import urllib.request as req

# xml, json => 대기업들이 제공하는 데이터, 공공기관에서 제공하는 데이터로 한정

# 웹 크롤링 (Web Crawling) / 웹 스크랩핑 (Web Scraping)
#    : 웹 페이지에 널려있는 데이터들을 프로그래밍적으로 추출하는 작업
# 웹은 개발자들이 만든 정형화 되어있는 형태로 관리 => 규칙이 생김
#    ->  그 규칙을 분석하여 원하는 정보들만 뽑아내는 작업
# 웹 크롤링 자체가 불법은 아니지만, 불법으로 간주되는 경우도 있음
#    => 조심해서 사용해야함

# url - 이미지 (이미지 주소 복사) 
img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNCjgitVeVcX-RATSk-yn5Puix0iXdujG-Pw&usqp=CAU"
html = "https://www.google.com"

# 다운로드 경로
path1= "C:/Users/user/Desktop/KDT/Python/Test/zzal.jpg"
path2= "C:/Users/user/Desktop/KDT/Python/Test/google.html"

# 예외 처리
try:
    f1, h1 = req.urlretrieve(img, path1)       # urlretrieve : 다운받을 파일 및 저장정보를 return
    f2, h2 = req.urlretrieve(html, path2)
except Exception as e:
    print(e)
    print("실패")
else:
    # 정상적으로 실행 되었을 때
    # Header 정보를 출력 : 개발자도구 -> Network -> Headers // 현재 h1, h2에 담겨져있음
    print(h1)
    print("----------------")
    print(h2)

# 다운로드 파일 정보
print(f"이미지 정보 : {f1}")
print(f"파일 정보 : {f2}")

print("완료")



































