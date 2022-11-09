# -*- coding:utf-8 -*-
from random import randint


# 숫자야구 (3자리 숫자)
# 012 ~ 987 중 랜덤 숫자가 정답(각 자릿수의 숫자는 중복 x)
# 유저가 입력 -> 자릿수와 값까지 같으면 S
#                자릿수는 다르고 값이 같으면 B
# S가 3개 나오면 정답 -> 종료
def getNumber():
    numbers = []
    while len(numbers) < 3:
        num = randint(0, 9)
        if num not in numbers:      # 리스트에 뽑은 숫자값이 없으면
            numbers.append(num)     # 리스트에 값을 추가
    print('번호 지정 완료')
    return numbers

def get_userAns():
    userAns = input('답은? : ') # int로 받아오면 두자리 수들은 백의자리의 0 값을 받아올 수 없음
    if((userAns[0] == userAns[1]) or
       (userAns[0] == userAns[2]) or
       (userAns[1] == userAns[2])) :
        print('중복 없이 입력해 주세요.')
        get_userAns()
    return userAns

def check(gn, ua):
    strike, ball = 0, 0
    for i in range(0, 3):
        for j in range(0, 3):
            if gn[i] == int(ua[j]):
                if i == j:
                    strike += 1
                else :
                    ball += 1 
    return strike, ball            

def playGame(gn, s, b):
    while s != 3:
        s, b = check(gn, get_userAns())
        print("{}S! {}B!".format(s, b))
        if s == 3:
            print("우승!")

gn = getNumber()
s = 0
b = 0
playGame(gn, s, b)











































