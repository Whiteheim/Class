# exam 자료 불러오기
library(tidyverse)
library(dplyr)

exam <- read.csv("C:/Users/user/Desktop/KDT/R/exams.csv")
exam

#########################################################
# data의 빈도를 나타내는 / 조사하는 함수 
# table(), n(), count()

# table() : data의 종류별 개수가 몇 개인지 파악
# table(data.frame이름$변수명명)
table(exam$race.ethnicity)

# n() : dplyr 패키지 안에 있는 함수
# group_by() 함수에 연결이 되어있는 summarise() 함수 내부에 포함
# table()과는 다르게 세로로 출력
# date.frame명 %>% group_by(변수명) %>% summarise(표시할 변수 명=n())
exam %>% 
  group_by(race.ethnicity) %>% 
  summarise(n=n())

# count() : dplyr 패키지 안에 있는 함수
# count(data.frame명, 변수명)
count(exam, race.ethnicity)
##################################################################
# mean(평균값) vs median(중앙값)
# 중앙값 : data들의 중심이 되는 위치를 가리키는 값 >> [대표값]

# 대부분은 mean(평균)으로 계산함
# 경우에 따라서는 median(중앙값)이 더 정확할 때가 있음
#   => data에 너무 큰 값 or 너무 작은 값이 많을 경우
#   => 어느 한 쪽으로 데이터가 치우쳐져 있는 경우

# 그룹별로 인원이 몇 명, reading.score 평균, 중앙값 출력
exam %>% 
  group_by(`그룹`=race.ethnicity) %>% 
  summarise(`인원수`=n(), 
            `평균`=mean(reading.score), 
            `중앙값`=median(reading.score))
#######################################################################
# slice() : index에 의한 행 선택
# 특정한 행을 선택, 제거 가능
# 양수(+) : 해당하는 행을 선택
# 음수(-) : 해당하는 행을 제거

# 5 ~ 10번째 행 가져오기
exam %>% slice(5:10)

# 101 ~ 1000번째 행 제거
exam %>% slice(-(101:1000))

# 성별, 그룹으로 묶어 6 ~ 10번째 정보
#     -> 수학점수의 최대값, 읽기점수의 최소값, 쓰기점수 평균값
exam %>% 
  group_by(`성별`=gender, `그룹`=race.ethnicity) %>% 
  slice(6:10) %>% 
  summarise(`인원` = n(),
            `수학최고점`=max(math.score),
            `읽기최하점`=min(reading.score),
            `쓰기평균`=mean(writing.score))

# 마지막 행 출력 => n()
exam %>% slice(n())

# slice_head() : data.frame의 처음부터
# slice_tail() : data.frame의 마지막부터
# 행의 개수 지정 : n = 개수 (n = 10)
# 행의 비율 지정 : prop = 비율 (prop=0.1 //(10%))
exam %>% slice_head(n=10)
exam %>% slice_tail(prop = 0.3)
#########################################################################

insurance <- read.csv("C:/Users/user/Desktop/KDT/R/insurance.csv")
insurance

# slice_sample() : 랜덤으로 행 선택
# n, prop을 통해 갯수, 비율 성정 가능 
insurance %>% slice_sample(n=5)
insurance %>% slice_sample(prop=0.3)

# slice_max() : 특정변수가 가장 클 때
# slice_min() : 특정변수가 가장 작을 때때

insurance %>% slice_max(bmi, n=10) 
insurance %>% slice_min(charges, prop=0.1)
###################################################
# arrange() : 특정 변수를 기준으로 행을 재배열 
# 기본값은 오름차순
insurance %>% arrange(-bmi)

# exam 쓰기점수, 오름차순 
# 점수가 같으면 읽기점수를 내림차순
exam %>% 
  arrange(writing.score, desc(reading.score))

# 성별, 교육 등급을 그룹화
#     => 수학점수의 평균값 지표 => 내림차순 정렬
exam %>% 
  group_by(`성별`=gender,
           `교육등급`=parental.level.of.education) %>% 
  summarise(`수학평균`=mean(math.score)) %>% 
  arrange(desc(`수학평균`))

exam %>% 
  group_by(gender, parental.level.of.education) %>% 
  summarise(mean(math.score)) %>% 
  arrange(desc(`mean(math.score)`))
####################################################################
exams <- exam %>% 
  select(math.score, reading.score, writing.score)
View(exams)

# distinct() : 중복 없는 유일한 값 추출 
exams %>% 
  distinct(math.score)

exams %>% 
  head(12) %>% 
  distinct(writing.score, .keep_all = T)
# .keep_all = T 를 사용하지 않았으면 writing.score만 출력
# .keep_all = T(True) : 모든 열을 유지해서 보여줌, 이 옵션을 쓰지 않으면 지정한 열만 보여줌 
################################################################################
library(ggplot2)

# aes(aesthethic)은 그래프의 미적부분을 지정하는 속성
# ↓줄을 실행하면 그래프의 축, 바탕만 생성 
# 실제 그래프를 생성하기 위해서는 다음줄에 그래프를 그리는 함수를 추가해야함
ggplot(data=exam, aes(x=math.score, y=reading.score, color=gender))

# 산점도 (Scatter Plot)
exam %>% 
  ggplot(aes(math.score, reading.score, color=gender)) + 

# + 로 ggplot과 geom_point를 연결
# pipe( %>% ) 대신 + 를 사용
# pipe( %>% )는 앞의 내용 중에서 뒤에내용을 적용
# + 는 앞의 내용과 뒤의 내용을 합쳐서 적용
  geom_point() +
  scale_color_brewer(palette = 'Set1')

# scale_color_manual : 직접 색을 정함
# scale_color_gray : 색을 흑백으로 시각화
# scale_color_brewer : 이미 생성 되어있는 palette자료로 값과 색을 대응

# 색상 조합
RColorBrewer::display.brewer.all()

# 선 그래프 
exam %>% 
  ggplot(aes(math.score, reading.score, color=gender)) + 
  geom_line()

# 막대 그래프
exam %>% 
  ggplot(aes(gender)) +
  geom_bar(fill='orange')
# bar : 주로 빈도수 / 갯수 표현


exam %>% 
  group_by(gender) %>% 
  summarise(n = n(),
           m = mean(math.score)) %>% 
  ggplot(aes(gender, m)) +
  geom_col(fill='blue')
# col : 주로 평균값 표현

exam %>% 
  group_by(gender, race.ethnicity) %>% 
  summarise(n=n(),
            m=mean(reading.score)) %>% 
  ggplot(aes(gender, m, fill=race.ethnicity)) +
  geom_col(position = 'dodge')  # dodge : 복수의 데이터를 독립적인 막대 그래프로 표현 
                                #         (사용하지 않으면 누적합으로 그래프가 그려짐)

# 히스토그램 
exam %>% 
  ggplot(aes(writing.score, fill=gender)) + # 색상값을 성별로 구분한다는 표시 (없을시 모든 데이터가 흑백으로 표시됨)
  geom_histogram(position = 'identity', alpha = 0.5)
# identity : y축 값의 높이를 데이터의 기반으로 정해줄 때 사용용
# alpha : 투명도 

# 상자그래프(Box Plot)
# 아랫쪽에 점은 박스에 들어올 수 없는 동떨어진 값들
exam %>% 
  ggplot(aes(race.ethnicity, math.score, fill=gender)) +
  geom_boxplot() +
  coord_flip()   # x축 y축 반전 
 
# 열지도(Heat Map)
exam %>% 
  group_by(race.ethnicity, parental.level.of.education) %>% 
  summarise(n=n()) %>% 
  ggplot(aes(race.ethnicity, parental.level.of.education, fill=n)) +
  scale_fill_gradient(low ='yellow', high='red') +
  geom_tile()


 













