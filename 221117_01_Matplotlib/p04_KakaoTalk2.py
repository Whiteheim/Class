#    -*- coding:utf-8 -*-
# import matplotlib.font_manager as fm
# import matplotlib.pyplot as plt
from wordcloud.wordcloud import WordCloud

# 카톡 내용 txt 파일 정제 
# ㅋ : ?, ㅎ : ?, ㅠ : ?, ? : ?, ! : ? -> pie chart로 나타내기


# wc = {"ㅋ" : 0, "ㅎ" : 0, "ㅠ" : 0, "?" : 0, "!" : 0}
# line , wd, c = None, None, None
#
# for i in range(1, 13):
    # with open("C:/Users/user/Desktop/KDT/Python/KakaotalkChat/Talk%02d.txt" % i, "r", encoding="UTF-8") as f:
        # for line in f.readlines():
            # word = line.replace("\n", "").split(" ")
            # for wd in word:
                # char = list(wd)
                # for c in char:
                    # if c.find("ㅋ") != -1:
                        # w["ㅋ"] += 1
                    # elif c.find("ㅎ") != -1:
                        # w["ㅎ"] += 1
                    # elif c.find("ㅠ") != -1:
                        # w["ㅠ"] += 1
                    # elif c.find("?") != -1:
                        # w["?"] += 1
                    # elif c.find("!") != -1:
                        # w["!"] += 1
#for key in wc.values():
#   print(key)                        

# with open("C:/Users/user/Desktop/KDT/Python/KakaotalkChat/Talk.csv", "w", encoding="UTF-8") as f:
    # for k, v in w.items():
        # f.write(f"{k},{v}\n")
        #
# print("완료")
###################################################################                        
                # line = line.replace("\n", "").split(" : ")
                # if len(line) == 2:
                    # for w in line[-1]:
                        # if w == "ㅋ" or w == "ㅎ" or w == "ㅠ" or w == "?" or w =="!" :
                            # wc[w] += 1


# char = []
# count = []
# with open("C:/Users/user/Desktop/KDT/Python/KakaotalkChat/Talk.csv", "r", encoding="UTF-8") as f:
    # for line in f.readlines():
        # line = line.replace("\n", "").split(",")
        # char.append(line[0])
        # count.append(int(line[1]))
        # print(char, count)
        #
# w = {'width' : 0.7, 'edgecolor' :'pink', 'linewidth': 5}
# fontFile = "C:/Windows/Fonts/malgun.ttf"
# fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
# plt.rc("font", family=fontName)
#
# c = ['yellow', '#B2CCFF', '#FFA7A7', 'blue', 'red']
# plt.pie(count, labels=char, autopct="%.2f%%" ,colors=c, wedgeprops=w, shadow=True, explode=(0.1, 0.1, 0.1, 0.1, 0.1))
# plt.title("KakaoTalk")
# plt.show()
#
chat = []
for i in range(1, 13):
    with open("C:/Users/user/Desktop/KDT/Python/KakaotalkChat/Talk%02d.txt" % i, "r", encoding="UTF-8") as f:
        for line in f.readlines():
            # # line = line.replace("오전", "")
            # # line = line.replace("오후", "")
            # # line = line.replace(":", "")
            # # line = line.replace("\n", "")
            # # line = line.split(",")
            # # del line[0]
            line = line.split(" : ")
            #print(len(line))
            if len(line) == 2:
                line1 = line[0].replace("\n", "").split(",")
                if len(line1) ==2:
                    chat.append(line1[1])
                chat.append(line[1])
                # chat.append(line)
            
with open("C:/Users/user/Desktop/KDT/Python/KakaotalkChat/TalkAE.txt", "w", encoding="UTF-8") as fw:
    for l in chat:
        l = l.replace(" ", "")
        l = list(l)
        for c in l:
            c = c.replace("\n","")
            c = c.replace("'","")
            print(c)         
            fw.write(c)
            
wc = WordCloud(font_path="C:/Windows/Fonts/malgun.ttf", background_color="black", max_font_size=500, width=1500, height=1500)
cloud = wc.generate(str(chat))
wc.to_file("C:/Users/user/Desktop/KDT/Python/KakaotalkChat/Talk.jpg")
print("완")































