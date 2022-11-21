#    -*- coding:utf-8 -*-

import numpy as np
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm

xData = np.array([1, 2, 3, 4])
yData = np.array([12, 31, 7, 17])
yData2 = np.array([1, 51, 23, 10])

c = ['#FFB2D9', '#D941C5', '#B5B2FF', '#FFC19E']

# plt.bar(xData, yData, width=0.5, edgecolor="#670000", linewidth=5, color=c)
# plt.show()

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

# 여러 항목 
# plt.bar(xData, yData, color="#FFC19E", width=0.3, align="edge")         # width 값이 같으면 그래프가 겹쳐짐
# plt.bar(xData , yData2, color="#B5B2FF", width=-0.3, align="edge")       # 음수값을 부여해 그래프를 대칭으로 출력
# # Data에 음수값을 부여하면 왼쪽으로 좌표 이동 (위의 그래프와 대칭)
# plt.bar(xData - 0.3, yData2, color="#FFB2D9", width=-0.3, align="edge")       # 음수값을 부여해 그래프를 대칭으로 출력
# plt.show()


# 누적합 (기존 그래프의 위에 값이 새로 쌓이도록 출력)
plt.bar(xData, yData, color="#B5B2FF")
plt.bar(xData, yData2, color="#A1C6AF", bottom=xData)
plt.show()











































































