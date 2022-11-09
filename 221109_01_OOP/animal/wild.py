# -*- coding:utf-8 -*-

class Emu:
    def __init__(self, species, nation):
        self.species = species
        self.nation = nation
    
    def printInfo(self):
        print(self.species, self.nation)
        
# [현재 모듈을 실행 했을 때 동작]이 가능한 조건
#    프로그램의 시작점이라는 뜻
# 현재 모듈이 import 되었을 때는 실행 되지 말고, 
#    현재 모듈에서 코드가 실행되었을때만 동작하도록 하는 함수
#    >> 실질적인 main 역할이 가능
if __name__ == "__main__":
    from animal.pet import Dog
    d = Dog('망마이', 3)
    d.printInfo()
    




































