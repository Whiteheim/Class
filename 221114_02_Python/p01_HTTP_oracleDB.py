# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from cx_Oracle import connect
from xml.etree.ElementTree import fromstring

# 기상청 (rss 주소값)
# 기상청 데이터 xml 파싱 -> DB에 적재 
# 시간대 / 기온 / 최고기온 / 최저기온

# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113554500

hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=4113554500")
resBody = hc.getresponse().read()
# print(resBody.decode())
con = connect("heim/1234@203.252.32.73:1521/xe")
cur = con.cursor()
for w in fromstring(resBody).iter("data"):
    sql = (f"insert into nov14_weather values(weather_seq.nextval, '{w.find('hour').text}시', "
           + f"'{w.find('temp').text}℃', "
           + f"'{w.find('tmx').text}℃', "
           + f"'{w.find('tmn').text}℃')")
    cur.execute(sql)

# for w in fromstring(resBody).iter("data"):
    # wInfo = [w.find('hour').text, w.find('temp').text, w.find('tmx').text, w.find('tmn').text ]
    # #print(wInfo)
    # sql = f"insert into nov14_weather values(weather_seq.nextval, {wInfo[0]}, {wInfo[1]}, {wInfo[2]}, {wInfo[3]})"
con.commit()
con.close()
print("완료")
