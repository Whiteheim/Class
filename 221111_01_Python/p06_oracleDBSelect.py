# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 각각의 커피 이름, 가격, 원두 정보를 가격 오름차순으로 정렬해서 출력
# select결과가 cursor에 들어가게 됨

con = connect("heim/1234@203.252.32.73:1521/xe")
sql = "select cName, cPrice, cBean from coffee order by cPrice"
cur = con.cursor()
cur.execute(sql) # 수행시 select의 결과가 cur에 tuple로 입력 

# for c in cur:
    # print(c, type(c))

for n, p, b in cur:
    print(n, p, b)
    print("----------------")

con.close()























































