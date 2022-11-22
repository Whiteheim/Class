#    -*- coding:utf-8 -*-

# subway csv 불러오기 -> 연월에 맞춰 각각의 유임승하차, 무임승하차 인원에 대한 데이터로 선 그래프 (총 4개) 그리기

import matplotlib.pyplot as plt
import matplotlib.font_manager as fm



with open("C:/Users/user/Desktop/KDT/Python/CardSubWayPayFree/CardSubWayPayFree.csv", "r", encoding="utf-8") as f:
    pRideDict, pAlightDict, fRideDict, fAlightDict = {}, {}, {}, {}
    for s in f.readlines():
        s = s.replace("\n", "").split(",")
        when = s[0]
        pRide = float(s[3])
        pAlight = float(s[5])
        fRide = float(s[4])
        fAlight = float(s[6])
        if when in pRideDict:
            pRideDict[when] += pRide
            pAlightDict[when] += pAlight
            fRideDict[when] += fRide
            fAlightDict[when] += fAlight
        else:
            pRideDict[when] = pRide
            pAlightDict[when] = pAlight
            fRideDict[when] = fRide
            fAlightDict[when] = fAlight
            
            
whens, pRides, pAlights, fRides, fAlights = [], [], [], [], []
for k, v in pRideDict.items():
    whens.append(k)
    pRides.append(v)
    pAlights.append(pAlightDict[k])     # key에 해당하는 value 값
    fRides.append(fRideDict[k])
    fAlights.append(fAlightDict[k])

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)  

# x1 = plt.subplot()
# p1 = x1.plot(whens, pRides, "r-")
# x1.set_xlabel("연월")
# x1.set_ylabel("인원수")
# x2 = x1.twinx()
# p2 = x2.plot(whens, pAlights, "b-")
# x3 = x1.twinx().plot(whens, fRides, "k:")
# x4 = x1.twinx().plot(whens, fAlights, "g:")
# plt.legend(["유임승차인원", "유임하차인원", "무임승차인원", "무임하차인원"])

plt.plot(whens, pRides, "r-")
plt.plot(whens, pAlights, "b:")
plt.plot(whens, fRides, "y-")
plt.plot(whens, fAlights, "g:")
plt.legend(["유임승차인원", "유임하차인원", "무임승차인원", "무임하차인원"])
plt.title("월별 지하철 유.무임 승차 정보")
plt.show()


































































