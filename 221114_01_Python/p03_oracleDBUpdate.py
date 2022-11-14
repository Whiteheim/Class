# -*- coding:utf-8 -*-
from cx_Oracle import connect

# input 2개 : 원두 이름 검색 / 숫자 입력
# 검색한 원두의 커피 -> 가격을 입력값만큼 인상

con = connect("heim/1234@203.252.32.73:1521/xe")
bean = input("원두명 : ")
price = int(input("가격 : "))
 
sql = f"update coffee set cPrice = cPrice + {price} where cBean = '{bean}'"

cur = con.cursor()
cur.execute(sql)

if cur.rowcount >= 1:
    print("완료")
    con.commit()

con.close()












































