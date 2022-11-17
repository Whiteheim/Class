#    -*- coding:utf-8 -*-

# Python의 시각화를 위한 Library - Matplotlib
# cmd -> pip install matplotlib

import matplotlib.font_manager as fm    # 폰트 
import matplotlib.pyplot as plt         # 그래프

name = []
count = []
with open("C:/Users/user/Desktop/RomaceofThreeKingdoms/tkResult.csv", "r", encoding="UTF-8") as f:
    for line in f.readlines():
        # print(line)
        line = line.replace("\n","").replace(" ", "").split("-")        # 이름과 숫자를 공백 삭제 후 나누기
        name.append(line[0])
        count.append(int(line[1]))

# print(name, count)

# 그래프에 나타낼 글꼴 설정
fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

# 막대그래프 - 절대적인 값을 비교할 때 주로 사용
c = ['yellow', '#B2CCFF', '#FFA7A7']
# plt.bar(name, count, width=0.4, color=c)
# plt.title("Three Kingdoms")
# plt.xlabel('name')
# plt.ylabel('count')
# plt.xticks(range(len(name)), name)  # 눈금 설정
# plt.ylim(0, 10000)
# plt.show()

# 파이차트 (pie)
plt.pie(count, labels=name, colors=c, shadow=True, explode=(0.1, 0.1, 0.1))
# explode : 각 항목이 원점에서 튀어나오는 정도
plt.title("Three Kingdoms")
plt.show()










































