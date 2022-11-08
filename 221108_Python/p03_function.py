# -*- coding:utf-8 -*-

# function(함수)
# def 함수명(파라미터명):
#    code작성

def test():
    print("테스트")
    
def test2(): # : 사용시 그 다음줄은 반드시 들여쓰기.
                # 코드에 기입할 내용이 없을 때, pass를 사용해 자리를 채워줌
    # 빈 함수를 만들면 이 다음 함수식의 인식이 안됨
    # -> pass 사용
    pass     

# 정수 2개를 넣으면 그 합을 출력 해주는 함수
def printSum(x = 5, y = 6): # 호출 시 값을 넣지 않으면 함수 파라미터의 값을 기본값으로 사용 
    print(x + y)
    
# 정수 3개를 넣으면 그 합을 출력해주는 함수
def printTripleSum(x = 3, y = 2, z = 8): # 파이썬은 overloading이 되지 않기 때문에 함수명을 다 다르게 설정해주어야 함
    print(x + y + z)
    
# 정수 2개를 넣으면 그 합을 구하는 함수
def getSum(a, b):
    return a + b

# 정수 2개를 넣으면 사칙연산 결과를 구하는 함수
def calc(a , b):
    '''
       설명서
       함수가 어떤 함수인지 파악하기 힘들 떄 주석처럼 사용가능
       하지만 문자열 -> help() 로 출력이 가능  
    '''
    q = a + b 
    w = a - b
    e = a * b
    r = a / b
    return q,w,e,r

#########################
test()
test2()
printSum(4, 8)
printSum()
printTripleSum(1, 3, 5)
printTripleSum()

c = getSum(10, 20)
print(c)
d = calc(10, 20)
print(d)
u, i, o, p = calc(20, 10)
print(u, i, o, p)    

u, i, _, p = calc(20, 10) # _ 처리를 해주면 값을 가져오지 않는것도 가능
print(u, i, p)

help(calc) # 함수에 대한 설명을 출력해줌  
























