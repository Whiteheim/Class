# -*- coding:utf-8 -*-

# abstract : Python에 존재 x 

# Java : 생성자 상속이 안됨
# Python : 생성자 상속 가능
#    멤버 변수를 생성자에서 결정 -> 생성자를 상속하지 않으면 -> 멤버변수가 상속이 되지 않음

class Avengers:
    def __init__(self, name, age):
        print("info")
        self.name = name
        self.age = age
    
    def attack(self):
        print("attack")

    def printInfo(self):
        print(self.name)
        print(self.age)
#######################################

class Ironman(Avengers):
    
    # overloading : 메소드명 동일, 파라미터 다르게      - Python X
    # overriding : 상속받은 메소드의 기능 변형시키기    - Python O
    def __init__(self, name, age, costume):
        Avengers.__init__(self, name, age)
        self.costume = costume
    
    def attack(self):
        # Avengers.attack(self)
        super().attack()
        # super() : 현재 클래스의 상위에 있는 클래스를 불러옴 
        print("리펄서ㅓㅓㅓㅓ")

    def printInfo(self):
        Avengers.printInfo(self)
        print(self.costume)
##########################################
# 헐크 (어벤져스 소속) / 이름, 나이, 바지사이즈 / 공격 / 정보 출력
class Hulk(Avengers):
    def __init__(self, name, age, pants_size):
        Avengers.__init__(self, name, age)
        self.pants_size = pants_size
    
    def attack(self):
        super().attack()
        print("헐크 스마쉬")
    
    def printInfo(self):
        Avengers.printInfo(self)
        print(self.pants_size)

##########################################

if __name__ == "__main__":
    i = Ironman("또니", 54, "mk-45")
    i.attack()
    i.printInfo()
    print("------------------")

if __name__ == "__main__":
    h = Hulk("부루스", 50, "free")
    h.attack()
    h.printInfo()
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
































