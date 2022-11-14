# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 커피테이블 활용
# input 으로 숫자 2개 입력 => 오름차순으로 정렬된 가격의 ? ~ ? 번째의 평균가격 구하기 

start = int(input("시작 : "))
end = int(input("끝 : "))

con = connect("heim/1234@203.252.32.73:1521/xe")
sql = ("select avg(cPrice) "
      +"from( "
            +"select rownum rn, cPrice "
            +"from ( "
                    +"select cPrice "
                    +"from COFFEE "
                    +"order by cPrice)) "
       +f"where rn between {start} and {end}")

cur = con.cursor()
cur.execute(sql)

for p in cur:   # cur 안에 tuple의 형태로 값이 담겨짐
    print(p[0])

con.close()








































