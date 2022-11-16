#    -*- coding:utf-8 -*-
import requests
from bs4 import BeautifulSoup

# 네이버 영화 페이지 crawling 해서 
# 1 ~ 10 페이지까지의 
# 영화제목, 평점, 감상평의 평태로 csv에 저장

# for i in range(0, 10):
    # page = i + 1
    # # print(f"========================{page}페이지==================================")
    # url = "https://movie.naver.com/movie/point/af/list.naver?&page=" + str(page)
    #
    # res = requests.get(url)
    # soup = BeautifulSoup(res.text, 'html.parser')
    #
    # title = soup.select('.movie.color_b')[0].text
    # score = soup.select_one('.list_netizen_score').select('em')[0].text
# #    impression = soup.select_one(".title").select('a')
    # # impression = soup.select_one(".title").find_all('a')[1].attrs['onclick'].split(',')[2]
    # impression = soup.select(".title")
    # #print(impression)
    # audience = [title, score, impression]
    #
    # # for t in audience:
        # # print(t)

#############################################################################
with open("C:/Users/user/Desktop/KDT/Python/Test/movie.csv", "a", encoding="UTF-8") as f:
    for i in range(1, 11):
        addr = "https://movie.naver.com/movie/point/af/list.naver?&page=" + str(i)
        res = requests.get(addr)

        soup = BeautifulSoup(res.text, 'html.parser')
        movies = soup.select('.title')
        for m in movies:
            f.write(m.get_text().split("\n")[1] + ",")
            f.write(m.get_text().split("\n")[3].split("중")[1] + ",")
            f.write(m.get_text().split("\n")[5] + "\n")




















































