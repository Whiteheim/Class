# -*- coding:utf-8 -*-
import random

# Up / Down 게임
# 함수 사용
# 유저 이름 입력 받고 인삿말 출력
# 컴퓨터는 1~100 사이의 랜덤 숫자를 하나 뽑아
# 유저에게 정답을 입력하도록 했을 때
# 해당 숫자가 아니면 다시 입력하도록, 정답보다 작으면 up , 크면 down 출력
# 정답을 맞췄을 때, 몇번의 시도가 있었는지 출력 후 종료
# 기회는 10번으로 제한 


def getNum():
    return random.randint(1, 100)


def glad():
    name = input("성함을 말씀해주세요 : ")
    print("%s님 환영합니다!" % name)


def explane():
    print("1~100 중 하나를 골라주세요.")
    print("기회는 총 10번입니다.")

    
def answer():
    ans = int(input("정답은? : "))
    if ans > 100 or ans < 0:
        print("1~100 사이의 숫자를 입력해주세요.")
        answer()
    return ans

def playGame(n):
    for t in range(1, 11):
        ans = answer()
        if ans > n:
                print("Down")
                if t >= 10:
                    print("기회를 다 사용하셨습니다. 정답은 %d였습니다."%n)
                    break
        elif ans < n:
                if t >= 10:
                    print("기회를 다 사용하셨습니다. 정답은 %d였습니다."%n)
                    break
                print("Up")
        elif ans == n:
            print("%d번째 시도!" % t)
            print("정답! 답은 %d입니다!" % n)
            break
        

####################################################
glad()
explane()
n = getNum()
playGame(n)
    
    
    
    
    
    
    
    
    
    
    
