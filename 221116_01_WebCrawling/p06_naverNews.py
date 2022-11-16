#    -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# News페이지에서 검색어 입력시 
# 관련 뉴스 내용 5페이지 까지의 뉴스 제목들을 콘솔에 출력

q = quote(input("검색어 : "))
for i in range(1, 51, 10):
    url = f"https://search.naver.com/search.naver?where=news&sm=tab_jum&query={q}&sort=0&photo=0&field=0&pd=0&ds=&de=&mynews=0&office_type=0&office_section_code=0&news_office_checked=&nso=so:r,p:all,a:all&start={i}"
    response = requests.get(url)
    if response.status_code == 200:
        html = response.text
        soup = BeautifulSoup(html,'html.parser')
        
        ul = soup.select_one('ul.list_news')
        
        #sp_nws106 > div.news_wrap.api_ani_send > div > a
        
        titles = ul.select('li > div > div > a')
        
        for title in titles:
            print(title.text)
    else:
        print(response.status_code)

################################################################
def getTitle(addr, q):
    for i in range(0, 5):
        print(f"========================={i + 1}페이지===============================")
        start = 10 * i + 1              # 페이지 5페이지(1 ~41)까지
        address =  addr + q +"&sort=0&photo=0&field=0&pd=0&ds=&de=&mynews=0&office_type=0&office_section_code=0&news_office_checked=&nso=so:r,p:all,a:all&start=" + str(start)

        res = requests.get(address)
        soup = BeautifulSoup(res.text, 'html.parser')
        news = soup.select('.news_tit')
        for n in news:
            print(n.get_text())

if __name__ == "__main__":
    address = "https://search.naver.com/search.naver?where=news&sm=tab_jum&query="
    query = quote(input("검색어 : "))
#################################################################
getTitle(address, query)







































