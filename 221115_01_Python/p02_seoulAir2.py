# -*- coding:utf-8 -*-
from cx_Oracle import connect

# DB에 있는 미세먼지 데이터 -> csv파일에 저장

con = connect("heim/1234@203.252.32.73:1521/xe")
sql = "select * from airPollution order by aNo"
cur = con.cursor()
cur.execute(sql)
file = open("C:/Users/user/Desktop/KDT/Python/Test/airPollution.csv", "a", encoding="UTF-8")

for n, r, p, up in cur :
    #print(n, r, p, up)
    file.write(f"{n}, {r}, {p}, {up}\n")
    
file.close()
con.close()
print("완료")











































