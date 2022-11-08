# -*- coding:utf-8 -*-
import random
from random import randint

# Java : null = Python : None

# 가위 바위 보 게임
# 질 때 까지 반복
# 이긴 횟수 출력 

# def getComAnswer():
#     return random.randint(0, 3)
#
# def getPlayerAnswer():
#     ans = input("가위? 바위? 보? : ")
#     if ans.__eq__("가위"):
#         return 0
#     elif ans.__eq__("바위"):
#         return 1
#     elif ans.__eq__("보"):
#         return 2
#
# def comAns(com):
#     if com == 0:
#         return "가위"
#     elif com == 1:
#         return "바위"
#     elif com == 2:
#         return "보"
#
# def playGame(win):    
#     while True:
#         com = getComAnswer()
#         player = getPlayerAnswer()
#         c = comAns(com)
#         if player + 1 == com or player - 2 == com:
#             print("컴퓨터는 %s"%c)
#             print("졌소")
#             print("%d번 이겼네"%win)
#             break
#         elif player - 1 == com or player + 2 == com :
#             print("컴퓨터는 %s"%c)
#             print("이김")
#             win += 1
#         else:
#             print("컴퓨터는 %s"%c)
#             print("비김")
#############################################
#win = 0    
#playGame(win)


handTable = [None, "가위", "바위", "보"]

def printRule():
    for i, h in enumerate(handTable):
        if (i != 0):
            print("[%d] %s"% (i,h))
            
def comFire(): 
    return randint(1,3)

def userFire():
    uh = int(input("골라"))
    if (1 <= uh <= 3):
        return uh
    return userFire()

def printHand(uhuh, chch):
    print("유저 : %s" % handTable[uhuh])
    print("컴퓨터 : %s" % handTable[chch])
    
def judge(uhuh, chch):
    t = uhuh - chch
    if t == 0:
        print("무승부")
        return 0
    elif t == -1 or t == 2:
        print("패배")
        return 999
    else:
        print("승리")
        return 1           
    
def playGamee(uHand, cHand, result, win):
    while True:
        uHand = userFire()
        cHand = comFire()
        printHand(uHand, cHand)
        result = judge(uHand, cHand)
        if result == 999:
            print("종료")
            break
        win += result
    print("%s승" % win)
#####################################
printRule()
uHand, cHand, result, win = 0, 0, 0, 0
playGamee(uHand, cHand, result, win)







































