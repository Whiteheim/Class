# -*- coding:utf-8 -*-

class Book:
    # def __init__(self):
        # print("기본생성자 - Book 생성")
    
    # 생성자 : 객체가 메모리상에 만들어질 때 호출하는 메소드
    # overloading이 안되서 생성자는 하나만 사용
    def __init__(self, title, price):
        print("오버로딩 된 생성자")
        self.title = title          # 이런식으로 생성자에서 멤버변수를 만들어 결정
        self.price = price
        
    def printInfo(self):
        print(self.title, self.price)
        
    # 소멸자 (destructor) : 객체가 메모리상에서 사라질 때 호출하는 메소드 존재
    def __del__(self):
        print("책 삭제")
###########################################
# 사람 클래스 : 이름, 나이 / 그 속성들 출력하는 기능 / 생성자 / 소멸자
class Human:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def printInfo(self):
        print(self.name, self.age)
        
    def __del__(self):
        print("정보 삭제")

         
###########################################
# b1 = Book()
b2 = Book("책", 13000)
b2.printInfo()
print("---------------------------------")
###########################################
# Garbage Collection : 그 객체를 가리키는 변수가 없어지면 Heap 영역을 자동으로 정리
h1 = Human("홍길동", 28)
h1.printInfo()
print("---------------------------------")
h2 = Human("머털", 36)
h2.printInfo()
print("---------------------------------")
h3 = h1                     
h3.printInfo()

h1 = None
h3 = None
# 각각의 소멸자가 언제 발동할까?
# h1 과 h3 는 같은 생성자 (복제가 아닌 별명이 두개가 된 것)
# h1 = None 에서 h1은 사라지지만 정보는 h3에 저장되어있음
# h3 = None 에서 h1, h3의 정보는 완전히 삭제되고 소멸자 발동
 
print("프린트아무말")
























































