
# 조건문 : 흐름제어

if True:
    print('조건문 출력')
if False:
    print('조건문 출력 안해')

########################
# 우선순위 (산술, 관계, 논리)
# 산술 > 관계 > 논리 
print(10 + 2 > 8 + 3) # 산술이 관계보다 앞서서 => 12 > 11
print(10 + 2 * 2 > 8 + 3 * 2) # 14 > 14
print(((10 + 2)> 3) and (6 + 4 == 10))
###########################
# 놀이동산 >> A : 성인, 150 이상 (값은 입력 받아 )
# 입력시 -> 탑승 가능 여부
age = int(input('나이 : '))
height = float(input('키 : '))

# if age >= 20 and height >= 150 :
#     print('탑승 가능')
# else : 
#     print('탑승 불가능')
    

print("탑승가능" if (age >= 20 and height >= 150) else "탑승불가")
########################################
# 다중 조건문
# Java : if - else if - else
# Python : if - elif - else

# 점수 입력 ->80 >=A
#            70 >= B
#            60 >= C
#            나머지는 D

score = int(input("점수 : "))
if score >= 80 : 
    print("A")
elif score >= 70 :
    print("B")
elif score >= 60:
    print("C")
else: 
    print("D")
######################################
# switch-case : 파이썬엔 없음

# in, not in
abc = {"name" : "이름", "age" : 20, "phone" : "010-2222-5555"}
# dic에 요소가 있는지 확인하는 키워드
print("name" in abc)
print(19 in abc.values())
print("height" not in abc)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    