# -*- coding:utf-8 -*-

class Avengers:
    def __init__(self, realName):
        self.realName = realName
    def attack(self):
        print("어따끄")
    def printInfo(self):
        print(self.realName)
#######################################
class Human:
    def __init__(self, age):
        self.age = age
    def eat(self):
        print("얌얌")
    def attack(self):
        print("짱돌맛좀봐라")
    def printInfo(self):
        print(self.age)
#######################################
# Java : 다중상속 불가 (interface로 흉내만 냄/ 추상메소드를 만들어 그것만 넘겨줌)
# Python : 다중상속 가능
#            상속을 중복으로 하게 되면 (ex: attack) -> 먼저 상속 받은것을 불러옴 (Avengers의 attack)
#            -> Human의 attack을 불러오고 싶을 때 -> 직접 입력해주어야함
class CaptainAmerica(Avengers, Human):
    def __init__(self, realName, age):
        Avengers.__init__(self, realName)
        Human.__init__(self, age)
    def attack(self):
        Avengers.attack(self)
        Human.attack(self)
    def printInfo(self):
        Avengers.printInfo(self)
        Human.printInfo(self)
########################################
if __name__ == "__main__":
    c = CaptainAmerica("스티브", 70)
    c.eat()
    c.attack()
    c.printInfo()





































