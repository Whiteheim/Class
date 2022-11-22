#    -*- coding:utf-8 -*-

# cmd -> pip instal pandas
#    Pandas : 데이터 조작, 분석을 쉽게 하기 위한 모듈(라이브러리)

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import pandas as pd

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)  

df = pd.read_csv("C:/Users/user/Desktop/KDT/Python/CardSubWayPayFree/CardSubWayPayFree.csv", names=["연월", "호선", "역명", "유임승차", "무임승차", "유임하차", "무임하차"])

# groupby() : 집단, 그룹별로 데이터를 집계, 요약 
df2 = df.groupby('연월').sum()
plt.plot(range(df2.index.size), df2['유임승차'], "r-")
plt.plot(range(df2.index.size), df2['유임하차'], "b:")
plt.plot(range(df2.index.size), df2['무임승차'], "y-")
plt.plot(range(df2.index.size), df2['무임하차'], "g:")
plt.legend(["유임승차인원", "유임하차인원", "무임승차인원", "무임하차인원"])
plt.title("월별 지하철 유.무임 승차 정보")
plt.xticks(range(df2.index.size), df2.index)
plt.show()


















































































