#    -*- coding:utf-8 -*-
from wordcloud.wordcloud import WordCloud

# wordcloud
#    cmd -> pip install wordcloud

with open("C:/Users/user/Desktop/KDT/Python/kakaotalk.txt", "r", encoding="UTF-8") as f:
    txt = f.readlines()
    # print(txt)
    
wc = WordCloud(font_path="C:/Windows/Fonts/malgun.ttf", background_color="black", max_font_size=200, width=800, height=800)
cloud = wc.generate(str(txt))

wc.to_file("C:/Users/user/Desktop/KDT/Python/Kakao.jpg")
print("완")































































