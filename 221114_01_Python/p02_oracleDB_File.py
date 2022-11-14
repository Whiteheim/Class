# -*- coding:utf-8 -*-
from cx_Oracle import connect

# DB연결 -> 커피이름, 가격, 원두정보 -> .csv파일로 생성(, 를 기준으로)
# ex) 이름,가격,원두
#     이름,가격,원두
#     ...

con = connect("heim/1234@203.252.32.73:1521/xe")
file = open("C:/Users/user/Desktop/KDT/Python/Test/coffee.csv","a", encoding="UTF-8")

sql = "select cName, cPrice, cBean from coffee"

cur = con.cursor()
cur.execute(sql)

for n, p, b in cur:
    file.write(f"{n},{p},{b}\n")

file.close()
con.close()
print("완료")







































