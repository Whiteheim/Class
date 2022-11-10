# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from json import loads

# https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

# 도시이름 입력
# 요청 후 응답 내용 출력
# 요청파라미터 추가 (옵션)
city = input("City : ")
api = "42008a8c8e7402a3fc9d3b1a7df8fee9"
url = f"/data/2.5/weather?q={city}&appid={api}&lang=kr&units=metric"

hc = HTTPSConnection("api.openweathermap.org")
hc.request("GET", url)

resBody = hc.getresponse().read()
#print(resBody.decode())         # ==> HTTP 통신

weatherData = loads(resBody)    # JS형식 -> Python 형식 

# 날씨 / 기온 / 체감기온 / 습도 / 바람속도 출력
# dict : {"key" : "value"}   / JS = object
# list : list[index값(숫자)] / JS = array
# 데이터가 하나 => 반복문 돌릴 필요 x
print(f"날씨 : {weatherData['weather'][0]['main']}")
print(f"기온 : {weatherData['main']['temp']}℃")
print(f"체감기온 : {weatherData['main']['feels_like']}℃")
print(f"습도 : {weatherData['main']['humidity']}%")
print(f"풍속 : {weatherData.get('wind')['speed']}m/s")
































































