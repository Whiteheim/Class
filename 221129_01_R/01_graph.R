# A매치 데이터 파일
# mongoDB에 담고
# 그 데이터 활용하여 
# 우리나라 경기 기준
# ggplot2 bar
# echart bar

library(mongolite)
library(ggplot2)
library(echarts4r)
library(dplyr)
library(tidyverse)
con <- mongolite::mongo(collection = "aMatch",
                        db="nov29",
                        url="mongodb://localhost",
                        verbose = T,
                        options = ssl_options())
con

if (con$count() > 0) con$drop()

aResult <- read.csv("C:/Users/user/Desktop/KDT/Python/aMatch_results/results.csv", 
                   encoding = "utf-8")%>% tibble()

con$insert(aResult)
rm(aResult)

aResult <- con$find(query = '{}')
View(aResult)

# home, away에서 우리나라가 뛴 경기
home <- con$find('{"home_team" : {"$regex" : "South Korea"}}')
away <- con$find('{"away_team" : {"$regex" : "South Korea"}}')

View(home)
View(away)

hDF <- data.frame(home)
aDF <- data.frame(away)

View(hDF)
View(aDF)

stat = c()
differ = c()

hDF[4]
hDF[[4]]
# Home 일때 
for (i in 1:nrow(hDF)) { # 1부터 hDF의 데이터 갯수 만큼큼
  getGoal = as.numeric(hDF[[4]][i])
  lostGoal = as.numeric(hDF[[5]][i])
  
  if (getGoal > lostGoal){
      if(getGoal - lostGoal == 1){
        differ[length(differ) + 1] = "1점차"
      } else if(getGoal - lostGoal == 2){
        differ[length(differ) + 1] = "2점차"
      } else if(getGoal - lostGoal == 3){
        differ[length(differ) + 1] = "3점차"
      } else if(getGoal - lostGoal == 4){
        differ[length(differ) + 1] = "4점차"
      } else if(getGoal - lostGoal >= 5){
        differ[length(differ) + 1] = "5점차 이상"
      } 
      stat[length(stat) + 1] = "승"
  } else if(lostGoal > getGoal){
      if (lostGoal - getGoal == 1) {
        differ[length(differ) + 1] = "1점차"
        } else if(lostGoal - getGoal == 2){
          differ[length(differ) + 1] = "2점차"
        } else if(lostGoal - getGoal == 3){
          differ[length(differ) + 1] = "3점차"
        } else if(lostGoal - getGoal == 4){
          differ[length(differ) + 1] = "4점차"
        } else if(lostGoal - getGoal >= 5){
          differ[length(differ) + 1] = "5점차 이상"
        } 
      stat[length(stat) + 1] = "패"
      }
  }



# Away 일때 
for (i in 1:nrow(aDF)) { # 1부터 aDF의 데이터 갯수 만큼
  getGoal = as.numeric(aDF[[5]][i])
  lostGoal = as.numeric(aDF[[4]][i])
  
  if (getGoal > lostGoal){
      if(getGoal - lostGoal == 1){
        differ[length(differ) + 1] = "1점차"
      } else if(getGoal - lostGoal == 2){
        differ[length(differ) + 1] = "2점차"
      } else if(getGoal - lostGoal == 3){
        differ[length(differ) + 1] = "3점차"
      } else if(getGoal - lostGoal == 4){
        differ[length(differ) + 1] = "4점차"
      } else if(getGoal - lostGoal >= 5){
        differ[length(differ) + 1] = "5점차 이상"
      } 
    stat[length(stat) + 1] = "승"
    
  } else if(lostGoal > getGoal){
      if (lostGoal - getGoal == 1) {
        differ[length(differ) + 1] = "1점차"
      } else if(lostGoal - getGoal == 2){
        differ[length(differ) + 1] = "2점차"
      } else if(lostGoal - getGoal == 3){
        differ[length(differ) + 1] = "3점차"
      } else if(lostGoal - getGoal == 4){
        differ[length(differ) + 1] = "4점차"
      } else if(lostGoal - getGoal >= 5){
        differ[length(differ) + 1] = "5점차 이상"
      } 
    stat[length(stat) + 1] = "패"
    }
  }


stat
differ

goalDF = data.frame(stat, differ)
View(goalDF)

goalDF %>% 
  group_by(stat, differ) %>% 
  summarise(n=n(), .groups = "drop_last") %>% 
  ggplot(aes(stat, n, fill = differ)) +
  geom_col(position = position_dodge(0.7), width=0.5)

goalDF %>% 
  group_by(stat, differ) %>% 
  summarise(n=n(), .groups = "drop_last") %>% 
  e_chart(differ) %>% 
  e_bar(n, barwidth=10) %>% 
  e_tooltip(trigger = c("axis")) %>% 
  e_color(c("#D1BB2F1", "#F2BbF2"))
        




























  
  



