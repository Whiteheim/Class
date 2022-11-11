# -*- coding:utf-8 -*-

# 파일처리
#    - 파일로부터 데이터를 읽어와 프로그램에서 활용하기 위해
#    - 프로그램에서 만들어 낸 데이터를 파일 형태로 저장하기 위해

# 순서
# 파일 열기 -> 작업(읽기, 쓰기) -> 파일 닫기

# .txt 파일 / .csv 파일 (데이터를 다루는 작업) 

# 1. 파일에 내용 작성 (write)
# 폴더는 미리 생성 / 파일은 실행시 자동 생성
# w : 덮어쓰기
# file = open("C:/Users/user/Desktop/KDT/Python/Test/test.txt", "w", encoding="UTF-8")
# file.write("내 오늘도 그댈 담을 말이 없는걸")
# print("완료")
# file.close()

# 2. 파일에 내용 추가 (append)
# file = open("C:/Users/user/Desktop/KDT/Python/Test/test.txt", "a", encoding="UTF-8")
# file.write("\n뜸을 들이다 그댈 추억하오")
# print("완료")
# file.close()

# 3. 파일 읽어오기 (read)
file = open("C:/Users/user/Desktop/KDT/Python/Test/test.txt", "r", encoding="UTF-8")

# 3-1. 파일 전체 읽기
# data = file.read()
# print(data)
# file.close()

# 3-2. 파일 한 줄씩 읽어오기
while True: # 읽으려는 파일의 길이를 모르기 때문에 True로 설정
    data = file.readline() # 한 줄을 읽어옴
    print(data, end="")
    # readline의 결과가 공백인 상황 (파일의 내용을 모두 읽은 후의 상황) 
    if data == "": # 공백이 이어지면 종료 처리
        break
file.close()
    












































