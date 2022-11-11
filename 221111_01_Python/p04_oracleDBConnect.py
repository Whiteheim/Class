# -*- coding:utf-8 -*-
from cx_Oracle import connect

# OracleDB와 연동이 되는 Java : instantClient에 있는 ojdbc8.jar (library)
# OracleDB와 연동이 되는 Python : cx_Oracle.py (library) 가 instantClient를 사용

# 기본적으로 Python에는 OracleDB 연결 기능이 없음
# cx_Oracle.py -> ojdbc8.jar를 사용
# 시작 - cmd - pip install cx_oracle - pip list (cx_oracle 확인)

# sqlplus로 접속시 사용하는 주소
#    sqlplus [ID]/[PW]@[IP Address]:[PORT]/[SID]
#    sqlplus heim/1234@203.252.32.73:1521/xe

try:
    c = connect("heim/1234@203.252.32.73:1521/xe")
    print("연결완료")
except Exception as e:
    print(e)
    
c.close()















































