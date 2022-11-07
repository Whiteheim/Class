# -*- coding:utf-8 -*-

# str 
s = "Can't tuna lol"
print(s)
print(s[0])
print(s[0:6])       # 0번째 부터 (6-1)번째 까지의 문자열
print(s[2:10:2])    # 2번째 부터 (10-1)번째 까지 문자열을 2칸씩 건너서 출력
print("-------------------------")    

# List : 리스트 (순서 개념 존재 , 요소 중복 가능, 값 수정 가능, 요소 삭제 가능)
a = [1324, 32, 1, 23, 4, 53]
print(a, type(a))
print(a[0])
print(a[0:3])
print(a[0:5:2])
print(a[-1])        # 뒤에서 첫번째 요소의 값

print(len(a))
a.append(1123)      # 마지막 부분에 요소 추가
print(a)
a.insert(2, 123)    # 원하는 위치에 요소 추가
print(a)
a[4] = 6654         # 원하는 위치의 요소값 변경
print(a)
del a[0]            # 원하는 위치의 요소값 삭제
print(a)
a.sort()            # 오름차순 정렬
print(a)
a.sort(reverse=True)# 내림차순 정렬
print(a)
print("-------------------------")
# Tuple : 튜플 (순서 개념 존재, 요소 중복 가능, 값 수정 / 삭제 불가)    
tuple1 = ('1', '2', '3')
# del tuple1[0]        # 삭제 불가
# tuple1[0] = 'c'      # 수정 불가
# print(tuple1)
t = (1, 2, 3, 4, 5 ,6, 7)
print(t)
# index안의 요소가 있는 위치 반환
print(t.index(5))

# index안의 요소가 tuple 안에서 몇개가 있는지, 갯수를 세어 반환
print(t.count(3))

a1 = 10
b1 = 20

(a1, b1) = (10, 20) # 값을 줄 때 tuple로 묶어 생성 가능 (괄호 제외 가능)
print(a1)
print(b1)
(a1, b1) = (b1, a1) # 서로의 값 바꾸기 가능
print(a1, b1)

x, y, z = 10, 20, 30
x, y, z = y, z, x
print(x, y, z)
print("-------------------------")
# Set(집합) : 중복 제거 기능, 순서는 랜덤
s = {"a","a","a", "b", "c", "d", "e", "f"}
print(len(s))
s = list(s)
print(s)
print("-------------------------")
# Dict (= map)
d = {"name" : "이름", "age" : "나이"}
print(type(d))

print(d["name"])
print(d["age"])
# dic - MongoDB / ElasticSearch
print("-------------------------")

# Range
r = range(10)       # 0 ~ 10-1 까지의 범위            
r = range(2, 10)    # 2 ~ 10-1 까지의 범위
r = range(2, 10, 3) # 2 ~ 10-1 까지 3칸씩            
print(r, type(r))

# 0 ~ 9 까지 있는 list
r2 = range(10)
r2 = list(r2)
print(r2, type(r2))

# 1 ~ 20 까지 홀수만 담긴 리스트 출력
r3 = list(range(1, 21, 2))
print(r3)







































