# -*- coding:utf-8 -*-
from datetime import datetime

# 현재 시간날짜
now = datetime.today() # 자동완성 주의 (_datetime X)
print(now)

yesterday = datetime(2022, 11, 8)
print(yesterday)
print(type(yesterday))
print(yesterday.year)
print(yesterday.month)
print(yesterday.day)

# 생일을 입력 받아서 나이를 계산해주는 프로그램
# def birthday():
    # birth = datetime(int(input('년 : ')), int(input('월 : ')), int(input('일 : ')))
    #
    # age = now.year - birth.year
    # print(age)
    #
# birthday()

birthday = input('생년월일 (yyyy/mm/dd) : ')
curYear = now.year
print(type(curYear))
# K - 나이 계산 : 올해 연도 - 태어난 연도 + 1
print(curYear - int(birthday[0:4]) + 1)

# strptime :  str -> datetime
bd = datetime.strptime(birthday, "%Y/%m/%d")
print(type(bd))
# strftime : datetime -> str
bd = datetime.strftime(bd, "%A")    # 요일
print(bd)
#############################################
# Pattern
# %Y : 연도 4자리 / %y : 연도 뒤 2자리
# %m : 월 / %d : 일 / %H : 24시간 / %I : 12시간 / %p : AM, PM
# %M : 분 / %S : 초 / %a : 요일(축약형) / %A : 요일(풀네임)
#############################################
# 특정 날짜를 연/월/일 형태로 입력 -> 일/월 형태의 문자열로 출력
someday = input("날짜 (YYYY/MM/DD) : ")       # 현재 str

# str -> datetime
sday =  datetime.strptime(someday, "%Y/%m/%d")
print(type(sday))

# datetime -> str
sday = datetime.strftime(sday, "%d/%m")
print(sday)
print(type(sday))




































