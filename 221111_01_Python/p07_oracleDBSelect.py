# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 원두를 검색해서
# 원두를 사용하는 커피 종류의 갯수, 평균가 출력

con = connect("heim/1234@203.252.32.73:1521/xe")
b = input("원두 종류 : ")

sql = ("select count(*), avg(cPrice) "
       + "from coffee "
       + "where cBean like '%%'||'%s'|| '%%'" % b)    

cur = con.cursor()
cur.execute(sql)

# for c in cur:
    # print(c, type(c))

for c, p in cur:
    print("커피 갯수 : ", c, "평균가 : ", p)
    print("-----------------")

con.close()
































