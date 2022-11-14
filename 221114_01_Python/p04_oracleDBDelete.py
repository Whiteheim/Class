# -*- coding:utf-8 -*-
from cx_Oracle import connect

# select 번호순으로 조회 -> 번호를 입력하면 해당 번호의 데이터 삭제

# 999를 입력하면 프로그램이 종료

con = connect("heim/1234@203.252.32.73:1521/xe")
cur = con.cursor()

sql = "select * from coffee order by cNo"
cur.execute(sql)
for c in cur:
    print(f"{c[0]}]{c[1]}-{c[2]}원-{c[3]}")
    

while True:
    print("----------------------------------")
    n = int(input("삭제할 메뉴의 번호 (999 입력시 프로그램 종료)\n: "))
    sql = f"delete from coffee where cNo = {n}"
    cur.execute(sql)
    
    if cur.rowcount == 1:
        con.commit()
        print("삭제 완료")
    elif n == 999:
        print("프로그램을 종료합니다")
        break
    elif cur.rowcount == 0:
        print("없는 번호입니다")
     

con.close()







































