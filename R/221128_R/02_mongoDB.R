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

exams <- read.csv("링크 주소", encoding = "utf-8") %>% 
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

# 접속 해제 : 정해진 명령어는 없음 
#             접속에 대한 것을 제거
rm(con)












































