library(data.table)
library(tidyverse)
library(dplyr)

# data 불러오기 
exam <- fread("C:/Users/user/Desktop/KDT/R/exams.csv")
exam

# 관측치 첫 6개
head(exam)

# 관측치 끝 3개
tail(exam)    # default 값은 6개
tail(exam, n=3)

# 스프레드시트 형식으로 확인
View(exam)

# 변수명 확인
names(exam)

# 특정 위치의 변수명 확인
names(exam)[5:8]

# 변수명 변경
names(exam)[3:5] = c('p', 'l', 't')

# 간단한 변수별 요약
summary(exam)
sum(exam$`math score`)  # 특정 변수의 총 합
mean(exam$`math score`) # 평균값
length(exam$gender)     # 데이터의 갯수
#####################################################
head(exam)
exam %>% head()

# dplyr 패키지를 불러오면 파이프 연산자 사용 가능
# 파이프 연산자 %>%  : 체인 연산자 / 파이프 로 불림
# %>%  : Ctrl + Shift + M

# 성별, 읽기 점수, 쓰기점수의 상위 6개
exam %>%
  select(gender, `reading score`, 8) %>% head()
####################################################
insurance <- fread("C:/Users/user/Desktop/KDT/R/insurance.csv")
insurance

# 3, 6, 7열의 데이터 조회
insurance[,c(3, 6, 7)]
# 2 ~ 6번째 열의 데이터 조회
insurance[,c(2:6)]
# smoker, BMI 내용 조회
insurance %>% 
  select(smoker, bmi)
# smoker, BMI 제외한 나머지 조회
insurance %>% 
  select(-c(smoker, bmi))
# 1, 2열 제외한 나머지 조회
insurance[,-c(1,2)]
# 3열, region 제외한 나머지 조회
insurance[,-3] %>% 
  select(-region)
# 나이, 성별, BMI, 보험비용 조회
insurance %>% 
  select(age, sex, bmi, charges)

insurance %>% 
  select(age:bmi, charges)

insurance %>% 
  select(1:3, charges)
##########################################################################
# select() : 열 추출
# select()에서 사용가능한 기능 (함수)
#   - () : 모든 변수를 선택함
#   - last_col() : 가장 마지막에 있는 변수 선택
#   - starts_with(값) : 이름이 값의 내용으로 시작하는 변수 선택
#   - ends_with(값) : 이름이 값의 내용으로 끝나는 변수 선택
#   - contains(값)  : 이름에 값의 내용이 들어있는 변수 선택

# c로 시작하는 변수의 내용 조회
insurance %>% 
  select(starts_with('c'))
# n으로 끝나는 변수의 내용 조회
insurance %>% 
  select(ends_with('n'))
# s가 포함된 변수의 내용 조회
insurance %>% 
  select(contains('s'))
#########################################################################
# ! : 논리 부정(나열된 열의 여집합)
# - 연산자 (차집합)

# 1, 2, 4번째 변수를 제외한 나머지 출력
insurance %>% 
  select(!c(1,2,4))
insurance %>% 
  select(-c(1, 2, 4))
#########################################################################
# 특정 타입의 변수만 뽑아올 수 있음
insurance %>% 
  select(where(is.numeric))

exam %>% 
  select(where(is.character))
###########################################################################
# filter(): 행 추출
# exam 에서 성별이 남자인 사람의 정보, 위에서 부터 6개
exam %>% 
  filter(gender == 'male') %>% head()

# 성별이 여자이면서 C 그룹에 속하는 사람의 정보, 끝에서 부터 6개
exam %>% 
  filter(gender == 'female',`race/ethnicity` == 'group C') %>% 
  tail()

exam %>% 
  filter(gender == 'female') %>% 
  filter(`race/ethnicity` == 'group C') %>% 
  tail()
##############################################################################
# summarise()
#   평균, 빈도, ... 기본적인 통계 수치를 요약하고 싶을 때 사용

exam %>% 
  summarise(n=n(), max(`math score`)) # n() : 빈도를 가져오는 함수

exam %>% 
  summarise(min(`math score`))

exam %>% 
  summarise(mean(`math score`))

exam %>% 
  summarise(median(`math score`))  
###############################################################################
# exam의 읽기 시험점수의 최대값
#        쓰기 시험점수의 최대값
#        읽기 시험점수의 평균값
#        쓰기 시험점수의 평균값
# 을 하나로 합쳐서 출력
exam %>% 
  summarise(max(`reading score`), 
            max(`writing score`), 
            mean(`reading score`),
            mean(`writing score`))

# group_by() : 그룹화 
exam %>% 
  group_by(gender) %>% 
  summarise(min(`writing score`),
            max(`reading score`),
            mean(`math score`))

# insurance
# 흡연 여부로 나누어 bmi 최대값, 나이 최소값, 보험비 평균, bmi 중앙값
insurance %>% 
  group_by(smoker) %>% 
  summarise(max(bmi), 
            min(age), 
            mean(charges), 
            median(bmi))
########################################################################
# across() : 여러 열을 대상으로 같은 작업을 해야하는 경우
# 모든 숫자형 변수의 평균값 출력
insurance %>% 
  summarise(across(where(is.numeric), mean))

# 변수명이 b로 시작하는 변수들의 중앙값
insurance %>% 
  summarise(across(starts_with('b'), median))
# 변수명이 age, charges인 변수의 평균값
insurance %>% 
  summarise(across(c(age, charges), mean))
# 변수명이 age인 변수의 평균값과 중앙값
insurance %>% 
  summarise(across(age, c(mean, median)))



















