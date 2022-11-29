library(dplyr)

# 데이터 전처리 (Data Preprocessing)
# 주어진 원래 데이터를 그대로 사용하기보다, 원하는 형태로 변형해서 분석하는 경우
# 데이터 가공 (Data Manipulation), 데이터 핸들링 (Data Handling), 
# 데이터 클리닝 (Data Cleaning), ... 

# 성별, 사는지역, 흡연여부 -> 문자를 숫자형태로 변형해서 분석 
#   => 모든것이 전처리 (Parsing도 전처리의 일부)
bike <- read.csv("C:/Users/user/Desktop/KDT/R/bike.csv") %>% 
  tibble()
View(bike)

# "자전거번호","대여일시","대여 대여소번호","대여 대여소명",
# "대여거치대","반납일시","반납대여소번호","반납대여소명",
# "반납거치대","이용시간","이용거리"

bike <- bike %>% 
  rename(bikeNo = "자전거번호",       # rename = dplyr의 기능
         br_dt = "대여일시",
         br_no = "대여.대여소번호",
         br_nm = "대여.대여소명",
         br_std = "대여거치대",
         re_dt = "반납일시",
         re_no = "반납대여소번호",
         re_nm = "반납대여소명",
         re_std = "반납거치대",
         ride_time = "이용시간",
         ride_dist = "이용거리"
         )
View(bike)

# 대여.대여소명 어디가 가장 많이 이용되었나
bike %>% 
  count(br_nm, sort = T)    # 빈도수 기준 내림차순

# 가장 많이 반납된 대여소명 
bike %>% 
  count(re_nm, sort = T)

# 쓸모없는 변수의 열은 제외 (자전거 번호, 대여거치대, 반납거치대)
bike <- bike %>% 
    select(-c(bikeNo, br_std, re_std))
View(bike)

# 이용거리가 10m 이하인곳 제외 (데이터 : m 단위)
# filter() : 조건에 맞는 데이터만 필터링 해서 결과값으로 나타내는 함수 
bike <- bike %>% 
  filter(ride_dist > 10)
# 이용시간이 1분 이하인곳 제외 (데이터 : 분 단위)
bike <- bike %>% 
  filter(ride_time > 1)
# 이용거리, 이용시간에 대한 통계 수치 조회 (최소, 중앙, 평균, 최대)
bike %>% 
  summarise(min(ride_dist),
            median(ride_dist),
            mean(ride_dist),
            max(ride_dist),
            min(ride_time),
            median(ride_time),
            mean(ride_time),
            max(ride_time),
            )
# 대여.대여소명, 반납대여소명 빈도수가 많은대로 내림차순 -> 상위 30개 출력
bike %>%
  count(br_nm, re_nm, sort =T) %>%   
  print(30)
  # head(30)

install.packages("ISOweek")
install.packages("lubridate")

library(ISOweek)
library(lubridate) # 날짜와 시간을 다루는 패키지 

bike <- bike %>% 
  # mutate() 함수는 기본적으로 dataframe 자료형에 새롭게 파생되는 열(column)을 만드는 함수
  mutate(wk = paste0(br_dt %>% isoweek(), '주차'), # 1년중 몇주차인지
# paste0 = 결과값과 문자열을 이어붙여줌
  yoil = br_dt %>% lubridate::wday(label = T),   # 요일을 나타내는 함수 (일 ~ 토)
  date = br_dt %>% substr(1, 10),
  hour = br_dt %>% substr(12, 13)) %>% 
  select(-c(br_no, re_no))
  # substr() = 문자열을 끊어주는 함수

View(bike)

library(echarts4r)
# 일자별 자전거 이용량(건수)을 bar그래프로 표현 -> 주차별로 그래프 색상이 다르도록
# (echart4r)
bike %>% 
  group_by(wk, date) %>% 
  # .groups = "drop_last" : group_by()의 상태를 summarise 이후에
  # 유지 or 삭제 선택하는 옵션 , drop_last = 마지막에 삭제제
  summarise(n=n(), .groups = "drop_last") %>% 
  e_chart(date) %>% 
  e_bar(n, barwidth = 15) %>% 
  e_tooltip(trigger = "axis")


bike %>% 
  group_by(wk, date)























