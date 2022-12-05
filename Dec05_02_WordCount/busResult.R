library(tidyverse)
library(dplyr)


bResult <- readLines("C:/Users/user/Desktop/KDT/Linux/busResult.txt")
bResult

bResult <- strsplit(bResult, "\t")
bResult

day = c()
people = c()

for (n in bResult) {
  day[length(day) + 1] = n[1]
  people[length(people) + 1] = as.numeric(n[2])
}

day
people

bDF <- data.frame(day=day, people=people)
View(bDF)

bDF[1,"day"] = "금"
bDF[2,"day"] = "월"
bDF[3,"day"] = "토"
bDF[4,"day"] = "일"
bDF[5,"day"] = "목"
bDF[6,"day"] = "화"
bDF[7,"day"] = "수"

bDF











