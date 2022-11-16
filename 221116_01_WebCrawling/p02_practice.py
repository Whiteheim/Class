# -*- coding:utf-8 -*-

import urllib.request as req
from urllib.error import HTTPError, URLError

# 저장 경로 - list 형식으로 지정

pathList = ["C:/Users/user/Desktop/KDT/Python/Test/snatch.jpg",
            "C:/Users/user/Desktop/KDT/Python/Test/index.html"]

urlList = ["https://mblogthumb-phinf.pstatic.net/MjAxNzAyMDFfMTI0/MDAxNDg1OTI2NjA5NDM0.FJTXQumRDvxP_dpqYXJVpKcV9JNz2kHnLm5p-7hO4Zsg.SMY02hqZbjidFM7Vy01iBRE56YlR3adJFLr2tMRDebYg.JPEG.jnsion/_%EC%8A%A4%EB%82%B4%EC%B9%98_%EA%B5%AC%EA%B0%84.jpg?type=w800"
           , "https://www.google.com"]

for i, url in enumerate(urlList): # enumerate(index값 확인 가능)
    # 예외 처리
    try:
        # Web의 수신정보 확인
        res = req.urlopen(url)
        
        # 수신받는 내용
        content = res.read()
        print("--------------------------")
        
        # 상태정보 중간 확인
        print(f"헤더 정보 : {i, res.info()}")
        print(f"http status : {res.getcode()}")
        print("--------------------------")
        
        # 파일 쓰기
        # with : 파일을 열고 닫는 작업(f.close())을 함께 해줌
        with open(pathList[i], "wb") as f: # 'b' : binary mode (2진법)
            f.write(content)
        
    except HTTPError as e:
        print("HTTPError Code : ", e.code)
    except URLError as e:
        print("URLError Code : ", e.code)
    else:
        print("--------------------------------")
        print("완료")
        print("--------------------------------")










































