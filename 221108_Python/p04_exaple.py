# -*- coding:utf-8 -*-
import random

# i = random.randint(1, 10)
# print(i)

# 로또 번호 뽑기
# 1 ~ 45, 중복없이 6개, 출력까지

def getNumber():
    return random.randint(1, 45)

num_list = [] # 랜덤으로 뽑은 숫자를 담을 list
count = 0 # 숫자 뽑은 횟수 

while count < 6 :
    ran_num = getNumber()
    if ran_num not in num_list: # 뽑은 숫자가 list에 없다면
        
        num_list.append(ran_num)
        count += 1

for n in num_list:
    print(n, end=' ')