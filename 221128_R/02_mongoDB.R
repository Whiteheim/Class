# R + MongoDB 연동
# 1. 패키지 설치
install.packages("monglite")

# 2. import
library(mongolite)

# 3. mongoDB server on

# 4. mongodb connection
# 접속 관련 함수로 현재 실행되어있는 mongodb와 연결
con <- mongolite::mongo(collection = "exams",
                        db = 'nov28',
                        url = "mongodb://localhost",
                        verbose = TRUE, # 함수 수행시 발생하는 정보들을 자세히 보여줌
                        options = ssl_options() # 접속시에 보안 설정
                        )
# 5. 기존 collection 삭제
# 기존 colletion이 있는 경우 삭제 
if (con$count() > 0) con$drop()

# 6. csv 파일 불러오기
# file로 첨부한 csv는 data.frame으로 로딩
library(dplyr)

exams <- read.csv("C:/Users/user/Desktop/KDT/R/exams.csv", encoding = "utf-8") %>% 
  tibble()
# tibble() : data.frame으로 만들어주는 함수, 
#             처음 10개의 행만 보여주는 기능

# 7. document 삽입
# 다른 r-mongodb 연동 패키지는
# document 삽입 시 json으로 포맷을 해야함.
# mongolite의 경우에는 insert() 함수가 내부에서 자동으로 json 변환, 포맷이 가능 
con$insert(exams)

# mongodb에서 확인
# use nov28 => db.exams.find().pretty()

# document 확인 
# 원래 data.frame 갯수 = db데이터 => 데이터 잘 들어감
dim(exams)[1]
con$count()

# 8. db에 있는 document 받아오기
# 원래 data.frame  (=exams) 에 있는 데이터 삭제
rm(exams) #(remove 줄임말)

# 새로 exams 를 만들어서 mongDB에 있는 데이터를 import
exams <- con$find(query = '{}')
dim(exams)
View(exams)
# 성별이 여자, 수학 44점, 읽기 55점인 사람의 데이터 조회
exams <- con$find(query = '{
                  "gender":"female", "math_score":44, "reading_score":55}')
exams

# data update
# con$update()
# 성별이 여자, 수학 44점, 읽기 55점인 사람 -> 소속그룹을 'group A'로 변경
exams <- con$update(query = '{
                    "gender":"female", "math_score":44, "reading_score":55}',
                    update = '{
                    "$set":{"race_ethnicity":"group A"}}')
# 기본 병수에 담긴 내용 삭제하고 다시 확인인
rm(exams)
exams <- con$find(query = '{
                  "gender":"female", "math_score":44, "reading_score":55}')
exams

# 9. 조건으로 document 찾기
# Regular Expressing (정규식) (regex)

# gender 변수의 값에 'f'가 포함되어있는 데이터 조회
# 문자열을 포함하는 검색
exams <- con$find(query = '{"gender" : {"$regex" : "f"}}')
head(exams)

# MongoDB 문자열 검색
# 문자열이 포함되어 있는지 확인 = {"$regex" : "문자열"}
# 특정 단어로 시작하는지 확인 = {"$regex" : "^문자열"}
# 특정 단어로 끝나는지 확인 = {"$regex" : "문자열$"}
# 대소문자를 구분없이 문자열 출력 
#   = {"$regex" : "문자열"}, "$options" : "i"

exams <- con$find(query = "{}")
View(exams)

dafr<- data.frame(exams)
View(dafr)

# 이 데이터를 활용해 그룹별 수학 평균점수를 bar그래프로 표현 (ggplot)
library(ggplot2)
library(tidyr)
dafr %>% 
  group_by(race_ethnicity) %>% 
  summarise(n=n(), m = mean(math_score)) %>% 
  ggplot(aes(x=race_ethnicity, y=m)) +
  geom_bar(stat="identity", fill=rainbow(5))
  # geom_col()
  # stat = "identity" : y축의 높이를 데이터의 값으로 하는 bar 그래프의 형태로 지정

install.packages("echarts4r")
library(echarts4r)

# exam 데이터 -> 성별 기준으로 그룹화 -> 각 통계 수치가 얼마나 되는지 출력
exams %>% 
  group_by(gender) %>% 
  summarise(n=n())

exams %>% 
  group_by(gender) %>% 
  summarise(n=n()) %>% 
  e_chart(gender) %>% 
  e_bar(n, barwidth=10) %>% 
  e_tooltip(trigger = c("axis"))


# 접속 해제 : 정해진 명령어는 없음 
#             접속에 대한 것을 제거
rm(con)












































