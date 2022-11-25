library(dplyr)
library(tidyverse)
# 검색어, 가게명, 위도, 경도 
# 빈 벡터에 넣어서 데이터 프레임 만들기
r <- readLines("C:/Users/user/Desktop/KDT/Python/location/location2.csv", encoding="utf-8")
location <- strsplit(r,",")

keyword = c()
place_name = c()
x = c()
y = c()

for (loc in location) {
  keyword[length(keyword) + 1] = loc[1]
  place_name[length(place_name) + 1] = loc[2]
  x[length(x) + 1] = as.numeric(loc[3])
  y[length(y) + 1] = as.numeric(loc[4])
}

keyword
place_name
x
y

locData = data.frame(keyword, place_name, x, y)
View(locData)

##################################################
install.packages("ggmap")
install.packages("devtools")

# 지도 그래프 그리기 
library(ggplot2)
library(ggmap)
library(devtools)

# AIzaSyAcisUlNxIQXAwFvEVIGBubj9IPHpZsVsU : 구글 지도 api (기간제)
register_google("AIzaSyAcisUlNxIQXAwFvEVIGBubj9IPHpZsVsU")

# 37.5547125, 126.9707878
m <- get_map(location= c(lon=126.9707878, lat=37.5547125), zoom=16,
             maptype = "satellite")
ggmap(m)
# 받아온 데이터를 활용 -> scatter (카테고리 마다 색을 다르게)
p <- geom_point(data = locData,
                aes(x, y, color=keyword))
ggmap(m) + p

# 2차원 (2d) 밀도 (density)를 보여주는 heatmap
# ..level.. : 레벨(level)이 높을수록 더 진하게 (밀도가 높을수록) 표현
# polygon : 다각형 
# bins : 선 간격
s <- stat_density_2d(data = locData,
                     aes(x, y, fill=..level.., alpha=..level..),
                     geom = 'polygon', bins=30)
ggmap(m) + s + scale_fill_gradient(low="#FFC19E", high="#F15F5F")






