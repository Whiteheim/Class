# -*- coding:utf-8 -*-

# 변수 (Variable)
# Java : 값을 표현하기 위해서 최적의 자료형을 개발자가 직접 선정
#            -> 메모리의 사용량이 최적화
#        자료형 변수명 = 값; 
#        int a = 10;

# Python : Python이 알아서 자료형을 선정
#        '자료형' 공부가 따로 필요가 없음 -> 개발자가 편함
#        자료형을 자동으로 선정하는 시간 만큼 메모리 사용량 최적화 컨트롤이 불가능
#        기본형이 없음 / 모두 참조형 >> 메모리의 사용량이 많음
#        변수명 = 값    (; 기입 X)

a = 10
print(a)
print(type(a))  # type(변수) : 자료형 확인
print(id(a))    # id(변수) : 주소값 확인

# Java 버전 값 변경
# int b = 10;
# b = 20;
print('#########################################')
a = 20      # 값을 바꾸기 보단 새로운 객체 생성에 가까움 (다른 주소값), 기존 값은 Garbage Collection에 의해 처리
print(a)
print(type(a))
print(id(a))
print('#########################################')
a = 'ㅎ'
print(a)
print(type(a))
print(id(a))
print('#########################################')

# Python의 data type (자료형)
p_str = 'name'      # str : 문자열
print(p_str, type(p_str))
p_int = 10          # int : 숫자형
print(p_int, type(p_int))
p_float = 1.234     # float : 실수
print(p_float, type(p_float))
p_bool = True       # boolean : 논리형 (True, False / 앞자리는 대문자)
print(p_bool, type(p_bool))

p_list  = [3, 5, 7] # list : 리스트
print(p_list, type(p_list))
p_list2 = [p_str, p_int]
print(p_list2, type(p_list2))

p_dict = {
        'name' : 'name',
        'age' : 100
    } #dict : 사전(dictionary)
print(p_dict, type(p_dict))

p_set = {3, 6, 9}   # set : 집합
print(p_set, type(p_set))

p_tuple = (3, 6, 9)  # tuple : 튜플
p_tuple2 = 3, 6, 9
print(p_tuple, type(p_tuple))
print(p_tuple2, type(p_tuple2))
###########################################################
# 형 변환(Type Casting)
print('#########################################')
d = 1
print(type(d))
d = str(d)
print(type(d))
e = False
e = int(e)
print(e) # False = 0, True = 1
###########################################################
# 키보드 입력 받기 (keyboard input)
ki = input('키 : ')
print(ki, type(ki))       # input으로 가져온 값은 기본적으로 str
                # 정수, 실수는 형변환이 필요함

ki = float(ki)
print(ki, type(ki))       

ki2 = float(input('체중 : '))
print(ki2, type(ki2))




























































































