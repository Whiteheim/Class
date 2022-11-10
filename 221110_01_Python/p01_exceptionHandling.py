# -*- coding:utf-8 -*-

# Exception 관리
# Java : 강제적 컨트롤 -> 언제 해야하 하는지 몰라도 알아서 표기 해줌 (빨간선)
#        예외처리에 예외가 없었음 (예외 처리 하고싶지 않아도 무조건 해야함)
#        직접 관리 : try - catch - finally
#        미루기 : throws

# Python : 강제적 x
#        직접 관리 : try - except - else - finally

# error     : Compile (소스를 기계어로 번역)할 때, compile을 실행하지 못하는 상황
# warning   : 소스가 정상적으로 실행되지만, 정리가 되지 않은 소스 (사용되지 않는 병수 설정, 기능을 close() 하지 않은 상황 (노란선))
# exception : 실행 중 예외적인 상황이 발생해서 정상적으로 돌아가지 않는 상황

# Interpreter 방식 (Python) : 
#    실행 시작 부터 한 줄씩 기계어로 바꾸어가며 실행
#    -> 실행중 번역이 불가능 (예외적 상황)한 상황이 발생  # 22번줄
#    error / exception의 경계가 모호함
##########################################################################
    # ㅂㅂㄴㄴㄴㅁㄴㅇㄻ        => 번역 불가능한 

try:    
    # 정수 2개 입력 받아 앞의 숫자를 뒤의 숫자로 나눴을 때 몫 출력
    x = int(input('x : '))
    y = int(input('y : '))
    z = x // y
    print(z)
    
    l = [34, 12, 556]
    print(l[y])
    
# except ZeroDivisionError: 
    # print("0으로 나눌 수 없어용")
# except IndexError:
        # print('list 범위를 벗어남')
# ==> 세세하게 구분해서 exception 사용 가능

except Exception as nickName:   # 별칭 사용 가능 / 일괄적으로 처리
    print(nickName)             # 어떤 내용의 문제인지 알고 싶을 때 exception을 직접 print
        
# try 문에서 else 사용하는 이유 
#    성능적인 부분 보다는 에러가 발생 할 가능성이 있는 부분과 그렇지 않은 부분을 정확히 구분지어
#    작성자의 의도를 명확하게 하기 위함
else:
    print("문제 미발생시 실행") # 문제 발생시 except에서 처리
        
finally:
    print("문제 유무에 상관 없이 실행 (return보다 우선순위)")

































