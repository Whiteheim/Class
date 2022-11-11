# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 1. DB 연결
con = connect("heim/1234@203.252.32.73:1521/xe")

# 3. data 확보
n = input("커피 이름 : ")
p = int(input("커피 가격 : " + "\n"))
b = input("원두 : ")

# 4. sql문 작성
#    Java : ?, ?
#    MyBatis : #{멤버변수명 }
#    Python : 완성된 형태의 sql문 사용
#                sql문 끝난 뒤 ";" 생략

sql = "insert into coffee values(coffee_seq.nextval, '%s', '%d', '%s')" % (n, p, b)

# print(sql)

# 5. DB 관련 작업 (sql문을 서버로 전송, 실행, 결과 받기) : 총괄객체
#    Java : PreparedStatement (pstmt)
#    Python : cursor()
cur = con.cursor()

# 6. sql문 수행 (sql문을 서버로 전송, 실행, 결과 받기)
cur.execute(sql)

# 7. 결과처리 
if cur.rowcount == 1:       # 6의 작업으로 영향을 받은 행 수가 하나라면 
    print("성공")
    con.commit()            # commit을 해야지만 DB서버에 반영 가능


# 2. DB 연결 종료
con.close()





































