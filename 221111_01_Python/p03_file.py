# -*- coding:utf-8 -*-

# 콘솔창에 입력 -> 파일 저장
# 입력 다 끝내면 파일을 읽어서 콘솔에 출력


inputt = input("내용 : ")
file = open("C:/Users/user/Desktop/KDT/Python/Test/exam.txt", "a", encoding="UTF-8")
file.write(inputt + "\n")
file.close()


file = open("C:/Users/user/Desktop/KDT/Python/Test/exam.txt", "r", encoding="UTF-8")

while True:
    text = file.readline()
    print(text, end="")
    if text =="":
        break
file.close()















































