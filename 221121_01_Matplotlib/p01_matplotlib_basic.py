#    -*- coding:utf-8 -*-

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import numpy as np

# Numpy : 
#    cmd -> pip install numpy

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

# matpltlib에서는 일반적으로 Numpy에 있는 Array를 이용
# Numpy를 사용하지 않더라도, 모든 시퀀스는 내부적으로 Array로 변환해서 사용

yData = np.array([12, 31, 1, 2])    # Numpy에 있는 Array를 사용
xData = [1, 2, 3, 4]                # Numpy를 사용하지 않아도 내부적으로 변환

# 기본
# plt.plot(yData)                   # plt에 데이터를 넣어줌 / plot : 선 그래프
# plt.show()

# x, y : 2차원 그래프
# plt.plot(xData, yData)
# plt.show()

# 축
# plt.plot(xData, yData)
# plt.xlabel("x축")
# plt.ylabel("y축")
# plt.axis([0, 10, 0, 50])                           # 각 축에 대해 최소/ 최대값 지정 [xmin, xmax, ymin, ymax]
# plt.show()

# title
# plt.plot(xData, yData)
# f = {"fontsize" : 15, "fontweight" : "light"} # bold, light, ultralight
# plt.title("제목1", loc="left")
# plt.title("제목2", loc="center")
# plt.title("제목3", loc="right",fontdict=f)
# plt.show()

# style
# plt.plot(xData, yData, "c-.h")
# plt.show()

# 색/ 선의 모양 / 마커의 모양

# 색
#    b : blue / g : green / r : red / y : yellow / k : black / w : white / c : cyan

# 선의 모양
#    ':' : 점선 / '-' : 실선 / '--' : dashed line / '-.' : 실선  + 점선

# 마커의 모양
#    '.' : 점 / 'o' : 동그라미 / 'v' : 역삼각형 / '^' : 정삼각형
#    '<' , '>' : 삼각형 왼쪽 / 오른쪽 표시 / 's' : 사각형
#    'p' : 오각형 / 'h' : 육각형 / '*' : 별 / '+' : 십자가 / 'x' 

# plt.plot(xData, yData, color="#A566FF", linestyle="--", marker="o", linewidth=5, markersize=10)
# plt.show()

# grid : 격자
# plt.plot(xData, yData)
# plt.grid(axis="both", color="#997700", linestyle="-.")
# plt.show()

# 눈금
# plt.plot(xData, yData)
# plt.xticks(xData, ["하나","둘", "셋", "넷"])                         # x축의 눈금
# plt.yticks(np.arange(0, 41, 10), ["ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ"])                                
# plt.tick_params(axis="x", direction="inout", length=10, pad=15, color="r", labelsize=20, labelcolor="#F15F5F")
#                 x, y, both    /     in, out, inout
# plt.show()

# 선
# plt.plot(xData, yData)
# # 실제 y값, xmin, xmax => 지정한 점을 따라 수평선 표시 / y의 31의 위치에서 x의 1부터 x의 2까지 선을 그음
# plt.hlines(31, 1, 2, color="r", linestyles="--")
# # 실제 x값, ymin, ymax => 지정한 점을 따라 수직선 표시 / x의 1의 위치에서 y의 31부터 y의 12까지 선을 그음
# plt.vlines(1, 31, 12, color="r", linestyles="--")
# plt.show()

# 다중 선 긋기1 (x축과 y축을 공유)
# xData = [1, 2, 3, 4]                
# yData = np.array([12, 31, 1, 2])    
# yData2 = [5, 66, 1, 10]
# plt.plot(xData, yData, "r-")
# plt.plot(xData, yData2,"g:")
# plt.legend(["빨강데이터", "초록데이터"])                    # 값들의 부연설명
# plt.show()

# 다중 선 긋기 2 (x축을 공유, y축을 나누어 표현)
yData2 = [500, 600, 100, 1000]
x1 = plt.subplot()              # 선을 여러개 긋기 위한 함수
p1 = x1.plot(xData, yData, "r-")
x1.set_xlabel("X축")
x1.set_ylabel("Y축")
x2 = x1.twinx()
p2 = x2.plot(xData, yData2, "g:")
x2.set_ylabel("Y축2")
x1.legend(p1 + p2, ["빨강선", "녹색선"])
plt.show()













































