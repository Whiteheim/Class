install.packages('readxl')
library(readxl)
library(dplyr)
xlsData = read_excel('C:/Users/gns24/OneDrive/바탕 화면/R/선별진료소_20221128094709.xls')
View(xlsData)

# 시도, 시군구, 의료기관명, 주소
# 추출해 새로운 변수에 담기
province = c()
city = c()
name = c()
addr = c()

province <- xlsData[2]
city <- xlsData[3]
name <- xlsData[4]
addr <- xlsData[5]

data_raw <- xlsData[2:5]
head(data_raw)
# 변수명(컬럼명)이 한글이라 데이터 분석중 오류가 발생 할 수 있음
#  -> 변수명 영어로 변경
names(province) <- c('province')
names(city) <- c('city')
names(name) <- c('name')
names(addr) <- c('addr')

names(data_raw) <- c('province', 'city', 'name', 'addr')

# 빈도 분석 (시/도에 대해)
xlsData %>% 
  summarise(n=n())
table(data_raw$province)
barplot(table(data_raw$province))

# 시/도 중 서울시 데이터 추출 -> 시/도 이름이 서울인것만 새로운 변수에 담기
seoul_data <- data_raw[data_raw$province == '서울',]
head(seoul_data)
nrow(seoul_data)

# 지도 시각화
install.packages('ggmap')
library(ggmap)
library(ggplot2)
register_google(key = "AIzaSyAcisUlNxIQXAwFvEVIGBubj9IPHpZsVsU")

# mutata_geocode()
# 데이터프레임의 컬럼명, 주소가 있는 열을 기준으로 
# 여러 주소의 경도, 위도 데이터를 한 번에 가져올 수 있음

# mutate_geocode(data = 데이터프레임명, location = 주소가 적힌 변수명, source = 'google')
seoul_data <-  mutate_geocode(data = seoul_data, location = addr, source = 'google')
View(seoul_data)

# 결측치 제거
is.na(seoul_data) # NA가 있는 위치는 True표시가 뜸
# na.omit() -> na(결측치)가 포함된 행 제거
seoul_data <- na.omit(seoul_data)

# 서울시 지도 시각화 (산점도)
seoul_data <- get_googlemap('서울', maptype = 'roadmap', zoom = 11)
ggmap(seoul_data) +
  geom_point(data = seoul_data, aes(x = lon, y = lat, color = name, size = 3))

# 마커로 위치 표시하고 위치 이름 넣기
# get_googlemap()의 marker 옵션은 데이터프레임 형태의 위도, 경도 데이터를 지정해줘야함

seoul_data_marker <- data.frame(seoul_data$lon, seoul_data$lat)
#View(seoul_data_marker)
seoul_map <- get_googlemap('서울', maptype = 'roadmap', zoom = 11, markers = seoul_data_marker)
ggmap(seoul_map) +
  geom_text(data = seoul_data, aes(x = lon, y = lat), size = 3, label = seoul_data$name)












