# -*- coding:utf-8 -*-

# 정수 2개 입력 받아서 사칙 연산에 대한 결과와 
# 앞의 수를 뒤의 수로 나누었을 때의 나머지값 출력
x = int(input('x = '))
y = int(input('y = '))
print('-------------------------------------')
a = x + y
b = x - y
c = x * y
d = x / y
e = x % y

print(a, b, c, d, e)
#############################################

f = x // y   # 몫
print(f)

g = x ** y
print(g)

z = "문자열"
#h = x + z            # 숫자 + 문자열 = 에러
h = str(x) + z        # 숫자를 형 변환 하여 문자열 결합     
print(h)

i = x * z             # 숫자 * 문자열 = 문자열 반복
print(i)
###########################################################
# x = x + 3
# x += 3
# print(x)

# ++, -- 는 없음
# x++
# print(x)
###########################################################
j = x > 10
print(j)

# && : and, || : or 
k = (x > 10) and (y < 3)
print(k)

# ! : not 
l = not k 
print(l)

# m : x가 5 이상 10 이하 : True / 아니면 False
m = (5 <= x <= 10)
print(m) 
################################################
# 3항 연산자
# Python은 3항 연산자의 유무 의견이 갈림
# [참일때의 값] if [조건식] else [거짓일때의 값]
# 정수를 하나 입력받아 짝수면 '짝수', 홀수면 '홀수' 출력

n = int(input('n : '))
print('짝수' 
        if n % 2 == 0 
        else '홀수')

























































