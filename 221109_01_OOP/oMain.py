# -*- coding:utf-8 -*-

# OOP(객체지향) : 객체 단위로 실생활을 표현 -> 유지보수가 편하게 
#    캡슐화 -> 데이터를 안전하게 처리
#    1 file == 1 class -> 코드 재사용

# Java : 비교적 완벽한 형태의 OOP
#    Java file(class) -> 파일 하나가 곧 클래스 하나
#    클래스명은 항상 대문자로 시작 ex) Cat / Dog / ...

# Python : 비교적 hybrid한 OOP 
#    python file(module) -> 파일 하나에 여러개의 클래스를 입력 가능
#                            (1 file != 1 class)
#    클래스명 무조건 대문자로 시작하지 않아도 됨
#    접근제어자(ex: public, private, ...) 없음 -> 캡슐화 없음
#    static 멤버변수 없음

###########################################################
class Shop:
    def showInfo(self):
        print(self.name, self.floor)
    
class Dog:
    name = "asdf"       # 자바에서 쓰던 멤버변수 -> 의미없음
    
    def bark(self):     # 메소드의 첫번째 파라미터로 self
        print("왈왈")
        
    def printInfo(self):
        # Java : this.name -> this. 은 생략가능 -> name으로 사용
        # this = self 의미는 같음
        # Python : slef.name -> self.은 생략 불가능 -> self.name으로 사용
        print(self.name, self.age)
        
    # Python 에서는 overlaoding 지원 X -> 모든 method명이 다 달라야 함.
    def printInfo2(self, c):
        for _ in range(c):
            print(self.name, self.age)
            
    # static method : 객체를 만들지 않고 사용 가능한 메소드
    @staticmethod
    def staticMethodTest():
        print("메소드")
    
    
###########################################################
Dog.staticMethodTest()


s = Shop()
s.name = "카페"
s.floor = 1
s.showInfo()
print("--------------------------")
d = Dog()
d.name = "왈왈이"
d.age = 8
print(d, type(d))
d.printInfo()
d.bark()        # 메소드 호출 방법 1
Dog.bark(d)     # 메소드 호출 방법 2 (파라미터 값으로 객체 사용)




































