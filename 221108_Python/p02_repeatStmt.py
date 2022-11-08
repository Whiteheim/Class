# -*- coding:utf-8 -*-

# for (int i = 0; ... )
# for (int ii : i)

# Python 에는 for 문은 없고 for-each에 해당하는 반복문만 존재
l = [123, 4, 1, 44, 5435, 534]

for ll in l :       # for (int ll : l)
    print(ll)

# ㅋ 을 열번 출력
for lgh in range(10):
    print("ㅋ")

# 1부터 20까지의 숫자 중 홀수만 출력
for h in range(1,21,2):
    print(h) 

#########################################
# while
while True: 
    y = int(input("y : "))
    if y % 2 == 0:
        print("짝수")
        break

# do{}while문 : 존재 하지 않음
#########################################
# enumerate : 반복문이 몇번 동작하였는지 확인할 때 사용
#            (인덱스, 값) 의 tuple 형태로 리턴
ll = ["컴퓨터", "모니터", "마우스", "키보드"]
for i, v in enumerate(ll):
    print(i + 1, v)

print("------------------------")
score = [10, 24, 34, 55, 96, 69, 64, 60, 79, 88]
# 1등 학생의 위치와 점수 출력
maxI, maxS = 0, 0
for i, v in enumerate(score):
    if maxS < v:
        maxS = v 
        maxI = i
print(maxI, maxS)
        





























