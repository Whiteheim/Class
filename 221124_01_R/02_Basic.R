# 라이브러리 설치
# Data Frame을 위한 전처리, 조작을 쉽고 빠르게 해줄 수 있는 패키지
# DPLYR
install.packages("dplyr") # 컴퓨터에 영구적으로 라이브러리를 설치
library(dplyr)            # Python의 import 개념, 필요할 때 마다 사용
#####################################################################
a = 1
print(a)
a

# 화살표 기호 : <- / alt + '-'
b <- 2
b

k <- a + 3
k

# 할당
# 함수 c()를 통해 벡터 생성
# 콜론 (:) , 쉼표 (,)를 활용해 연속된 데이터 표현 가능

a <- c(11, 22, 33, 44)
b = c("a", "b", "c", "d")
a
b

# list
li1 <- list(x=1, c('cat', 'dog'), z=sum)
li1

li2 <- list(aa=a, bb=b)
li2

# data.frame : 열의 묶음으로 list 만들기 
mydata = as.data.frame(li2)
mydata

DF <- data.frame(c1 = c(1, 2, 3, 4, 5), c2 = c('ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅂ'))
DF

# list내의 변수 선택 -> $
DF
DF$c1
DF$c2

# sum()
sum(a) # a <- c(11, 22, 33, 44) 다 더해줌

# paste() : 나열된 요소들을 이어붙여 하나의 결과값을 문자열로 내보냄 
paste(2, 4, 6, 8)
paste("Hello", "World")
length(paste(2, 4, 6, 8))

# rep : 반복
paste(rep('a', 7))
rep('a', 5)

# sep : seperate
paste(1, 2, 3, 4, sep="-")
#######################################################################
LETTERS # A부터 Z 까지 기본적으로 내장하고 있는 변수
# 반복문 / 조건문 
# LETTERS 활용해서 한글자씩 뜯어서, 값이 W라면 ㅋㅋ, 나머지는 그 글자 출력
for (i in LETTERS) {
  if (i == "W") {
    print("ㅋㅋ")
  } else{
    print(i)
  }
}

# R에서는 인덱스가 0이 아닌 1부터 시작 
LETTERS[5]
LETTERS[2:5]  # 2 ~ 5번째 값
LETTERS[-1]   # 1번째 값을 제외한 나머지
LETTERS[c(1, 3, 5)] # 1, 3, 5번째 값 
####################################################################
# 1 ~ 10까지 출력
x <- c(1:10)
x
# 7 을 10번 반복 출력
y <- rep(7, 10)
y
# 1 ~ 10까지 2씩 증가하며 출력
# python : range(1, 11, 2)
z <- seq(1, 10, 2)
z
##############################################################
# data.frame
myData <- data.frame(
  x = c(1, 3, 5, 7, 9),
  y = c(2, 4, 6, 8, 10)
)
myData

head(myData)

myData[1,] # 1행만 출력
myData[,1] # 1열만 출력
myData[1]  # 1열만 출력 2

# 1열의 3, 5행만 출력
myData[c(3,5), 1]
myData[c(3,5), -2]
############################################################
vt <- c(1:10)
vt

# str(객체) : 데이터 구조를 확인
str(vt)

# as : 변수의 데이터 타입을 정의
vt1 <- as.integer(vt)
str(vt1)

vt2 <- as.numeric(vt)
str(vt2)

# integer : 정수만 저장
# numeric : integer를 포함한 모든 수를 저장 (정수, 실수 등)


# summary(변수) : 변수의 구성요소를 요약
# 숫자의 경우 : 최소, 최대, 중간, 평균값, 4분위수 (1st Qu. / 3rd Qu.)
#               Median을 중심으로 1 Qu. 와 3 Qu. 사이에 값들이 몰려있음
summary(vt2)
summary(vt)
# 문자인 경우 : class와 데이터가 몇개인지 출력

vt3 <- as.character(vt)
str(vt3)
summary(vt3)
#####################################################################
# is : 변수가 어떤 자료형인지 판단 (논리 , True / False)
is.integer(vt3)
is.character(vt3)
#################################################################
# CSV파일 불러오기 
movie <- read.csv("C:/Users/user/Desktop/KDT/Python/Test/movie.csv")
movie

install.packages("data.table")
library(data.table)
movie2 <- fread("C:/Users/user/Desktop/KDT/Python/Test/movie.csv")
movie2

########################################################################
# tidyverse:
#   다양한 패키지를 포함하고 있는 메타 패키지
#   이 패키지를 다를 수 있게되면 중급 R 데이터 분석가 수준
install.packages("tidyverse")
library(tidyverse)

tibble(movie2)  # 상위 10개의 데이터 표시
# %>% : 파이프 연산자 (Ctrl + Shift + M)
#   html : table > tr > td
#   pipe operator : table %>%  tr %>%  td
movie2 %>%  tibble()

head(movie2)  # 상위 6개의 데이터 표시
View(movie2)  # 테이블 보여줌

names(movie2) # 열에 대한 정보 이름 출력
nrow(movie2)  # 행(row)의 갯수 →
ncol(movie2)  # 열(colum)의 갯수 ↓
dim(movie2)   # 행과 열의 갯수

































































