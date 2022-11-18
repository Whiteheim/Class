#    -*- coding:utf-8 -*-
from cx_Oracle import connect

# Table 데이터 -> 번호값 제외한 모든 데이터 -> csv파일에 담기

with connect("heim/1234@203.252.32.73:1521/xe") as con:
    cur = con.cursor()
    sql = "select * from nov18_loc order by lNo"
    cur.execute(sql)
    with open("C:/Users/user/Desktop/KDT/Python/location/location.csv", "w", encoding="UTF-8") as f:
        for c in cur:
            f.write(f"{c[1]}, {c[2]}, {c[3]}, {c[4]}\n")
print("완")
        


















































