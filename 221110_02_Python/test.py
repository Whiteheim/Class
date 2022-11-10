# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from xml.etree.ElementTree import fromstring

# http://www.kma.go.kr/repositary/xml/fct/mon/img/fct_mon1rss_108_20221110.xml
hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/repositary/xml/fct/mon/img/fct_mon1rss_108_20221110.xml")

resBody = hc.getresponse().read()

# print(resBody.decode())

for i in fromstring(resBody).iter("body"):
    print(i.find("summary").text)
    print(i.find("weather_forecast").text)
    print(i.find("onemonth_ta_forecast").text)
