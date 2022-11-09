# -*- coding:utf-8 -*-

# 강아지 클래스 -> 생성자에 이름, 나이 + 그 속성들 출력 기능
class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def printInfo(self):
        print(self.name, self.age)
#########################################

if __name__ == "__main__":
    # 야생동물 모듈을 불러와 객체 생성 -> 출력
    from animal.wild import Emu
    a = Emu('조류', '오스트레일리아')
    a.printInfo()




































