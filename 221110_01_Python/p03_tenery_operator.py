# -*- coding:utf-8 -*-
from Tools.scripts import pindent

# 3항 연산자 (tenery operator)
# [참 일때의 값] if [조건문] else [거짓일때의 값]
def getWeight():
    weight = float(input('체중 : '))
    return weight if weight >= 0 else weight * -1

# weight = getWeight()
# print(weight)

# 숫자 입력시 홀/짝 출력 프로그램
#    3항 연산자와 f-string 이용
num = int(input('숫자 입력 : '))
print((f"{num}은(는) 짝수") if num % 2 == 0 else (f"{num}은(는) 홀수"))  

# 3항 연산자 중첩
# [참 1] if [조건 1] else [참 2] if [조건 2] else ... [거짓] 

# 15, 16, 17 을 list에 담아
# list 각각의 요소가 2의 배수인지 3의 배수인지, 둘 다 아닌지 출력

list1 = [15, 16, 17]
for i in list1:
    print(f"{i}는 2의 배수"
          if (i % 2 == 0) 
            else f"{i}는 3의 배수" 
            if (i % 3 == 0) 
                else f"{i}는 둘 다 아님")
print("-----------------------------")

# 조건이 점점 중첩 된다면 그냥 if문 사용하기(가독성)
for val in list1:
    if (val % 2 == 0):
        print(f"{val}은 2의 배수")
    elif (val % 3 == 0):
        print(f"{val}은 3의 배수")
    else:
        print(f"{val}은 둘 다 아님")
























