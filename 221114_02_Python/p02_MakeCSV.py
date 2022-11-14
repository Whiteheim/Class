# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 기상청 정보를 csv로 만들기 
# (번호, 시간, 온도, 최고기온, 최저기온의 형태로)
# DB에 있는 데이터 이용

con = connect("heim/1234@203.252.32.73:1521/xe")
cur = con.cursor()

sql = "select * from nov14_weather"
cur.execute(sql)

file = open("C:/Users/user/Desktop/KDT/Python/Test/weather.csv","a", encoding="UTF-8")

for n, t, tp, tmx, tmn in cur:
    file.write(f"{n}, {t}, {tp}, {tmx}, {tmn}\n") # 구분자 (",")를 지정해 다음에 파일을 불러왔을 때 데이터 분할이 용이하게 하기

file.close()
con.close()
print("완료")











































