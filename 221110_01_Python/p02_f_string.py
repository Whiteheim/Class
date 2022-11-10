# -*- coding:utf-8 -*-
from datetime import date

# 선호하는 음료 이름, 마시는 횟수 입력받아 내용 출력

drink = input('좋아하는 음료 : ')
count = int(input('섭취 횟수 : '))

print("저는 %s을(를) 좋아하고, 하루 %d잔을 마십니다" % (drink, count))

# ==> 일반적인 formatting
print("-------------------------------")
# Python 3.6.X 부터 f-string 이라 부르는 formatting 보다 더 편한 방법이 추가됨

# f-string의 모양은 f와 {}만 있으면 사용 가능
# f"문자열 {변수명} 문자열 ..." 의 형태
print(f"저는 {drink}을(를) 좋아하고, 하루 {count}잔을 마십니다.")

# 정리
# 1. 문자열 맨 앞(""의 앞)에 'f'를 붙여줌
# 2. 사용하고 싶은 변수, 값을 중괄호 {} 안에 기입
# 3. 출력

# 소수점 반올림 표현 
# => 기본적으로 '% formatting'과 거의 유사
# {}를 이용할 때는, formatting 값의 자료형에 상관없이 {}안에 기입

#f = 1.125
f = 1.135
                        # 예상해보기
print(f"{f}")           # 1.125         / 1.135 
                        #  => 1.125     / => 1.135
print(f"{f:.1f}")       # 1.1           / 1.1
                        #  => 1.1       / => 1.1
print(f"{f:.2f}")       # 1.13          / 1.14
                        #  => 1.12      / => 1.14
# Python의 반올림
#     => 반올림 하려는 수를 올림 / 내림 할 때, 
#        값이 동일하게 차이가 난다면 반올림이 됨
#     0, 1, 2는 적용 x
#     10진법을 2진법으로 변환하는 과정에서 정확하게 변환이 불가능해 생기는 일

print("-------------")

# 문자 정렬
s1 = "left"
result = f"|{s1:<20}|"
print(result)

s2 = "mid"
result2 = f"|{s2:^20}|"
print(result2)

s3 = "right"
result3 = f"|{s3:>20}|"
print(result3)

# 중괄호 {} 안의 변수 뒤에 콜론(:)을 붙인 후
# 왼쪽 정렬 (<) / 오른쪽 정렬 (>) / 가운데 정렬 (^)의 옵션을 넣고
# 자릿수를 알려주는 숫자를 넣어 정렬 옵션 완성

# f-string에서 중괄호를 출력하는 방법
num = 10
result4 = f"my age : {num}, {{num}}, {{{num}}}"    
print(result4)

# 중괄호를 두번 {{변수명}} 적으면 안쪽 중괄호의 내용을 문자로 인식
#     => 값을 받아오지는 못함 : 
#            {변수명} 으로 출력
#     => 중괄호를 세번 {{{변수}}} 적으면 값을 받아오는것이 가능 :
#            {값} 으로 출력


# f-string과 dict
d = {
        "name": "이름",
        "gender": "남성",
        "age": 20 
    }

result5 = f"name: {d['name']}, gender: {d['gender']}, age: {d['age']}"
print(result5)

# f-string 과 list
n = [100, 200, 300]
# list 의 각 요소를 출력
print(f"list: {n[0]}, {n[1]}, {n[2]}")

for v in n:
    print(f"리스트 요소 : {v}")

# 기존에 list에 접근하는 방법과 동일하게 {}안에 list에 대한 접근법을 활용
print("-------------------------------")

num2 = 1234567890
print({num2})

# 1,234,567,890
print(f"{num2:,}")  # 통화 표기법
print("-------------------------------")
date1 = date.today()
print(date1)
# 연-월-일 => 요일
print(f"{date1:%Y-%m-%d} is on a {date1:%A}")



































