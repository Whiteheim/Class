#    -*- coding:utf-8 -*-

# sss = ["aaa", "bbb", "ccc", "aaa", "eee", "fff"]
# for s in sss:
    ## 찾는 문자열이 존재하는 경우            :  문자열이 있는 index값 리턴 (index값)
    ## 찾는 문자열이 존재하지 않는 경우       : -1 리턴
    # print(s.find("a"))

# 조조(맹덕), 유비(현덕), 손권(중모)
# text 파일에 위에 인물들이 몇번 언급되는지 카운트
# 인물, 언급횟수의 형태로 csv파일에 저장
# u = 0
# z = 0
# s = 0
# for i in range(1,11):
    # with open(f"C:/Users/user/Desktop/RomaceofThreeKingdoms/RTK{i}.txt", "r", encoding="UTF-8") as f:
        # while True:
            # data = f.readline()
            # if data.find("유") - data.rfind("비") == -1 and data.find("유") != -1 :
                # u += 1
            # elif data.find("현") - data.rfind("덕") == -1 and data.find("현") != -1 :
                # u += 1
            # elif data.find("조") - data.rfind("조") == -1 and data.find("조") != -1 :
                # z += 1
            # elif data.find("맹") - data.rfind("덕") == -1 and data.find("맹") != -1 :
                # z += 1
            # elif data.find("손") - data.find("권") == -1 and data.find("손") != -1 :
                # s += 1
            # elif data.find("중") - data.rfind("모") == -1 and data.find("중") != -1 :
                # s += 1
            # elif data == "":
                # break
                #
# print(u)
# print(z)
# print(s)

# with open(f"C:/Users/user/Desktop/RomaceofThreeKingdoms/RTK.csv", "w", encoding="UTF-8") as f:
    # f.write(f"유비(현덕) - 언급횟수 : {u}\n")
    # f.write(f"조조(맹덕) - 언급횟수 : {z}\n")
    # f.write(f"손권(중모) - 언급횟수 : {s}\n")

##############################################################################
fileName = None
line, word = None, None

wc = {"조조" : 0, "유비" : 0, "손권" : 0}

for i in range(1,11):
    fileName = f"C:/Users/user/Desktop/KDT/Python/RomaceofThreeKingdoms/RTK%02d.txt" % i
    with open(fileName, "r", encoding="UTF-8") as f:
        for line in f.readlines():
            line = line.replace("\n", "")   # 줄바꿈 삭제
            line = line.split(" ")          # 띄어쓰기 기준으로 나누기 => 단어별로 나뉘어짐
            for word in line:
                if word.find("조조") != -1 or word.find("맹덕") != -1:
                    wc["조조"] += 1           # 값이 '조조'인 Key의 value에 1씩 더하기
                elif word.find("유비") != -1 or word.find("현덕") != -1:
                    wc["유비"] += 1           
                elif word.find("손권") != -1 or word.find("중모") != -1:
                    wc["손권"] += 1           
# for key in wc:
    # print(key)
# for val in wc.values():
    # print(val)

with open(f"C:/Users/user/Desktop/KDT/Python/RomaceofThreeKingdoms/tkResult.csv", "w", encoding="UTF-8") as f:
    for k, v in wc.items():
        f.write(f"{k} - {v}\n")
    
print("완료")












































