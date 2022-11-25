aResult <- readLines("C:/Users/user/Desktop/KDT/Python/aMatch_results/K_record.csv", encoding="utf-8")
aResult

aResult <- strsplit(aResult, ",")
aResult

record = c()
count = c()
for (ar in aResult) {
  # R 에서는 인덱스 시작은 1부터 -> 1을 더해주고 시작하기
  record[length(record) + 1] =  ar[1]
  count[length(count) + 1] = as.numeric(ar[2])
}

record
count


aDF <- data.frame(record=record, count=count)
View(aDF)

aDF <- aDF[order(aDF$count),]     # 쉼표 필수

barplot(
  aDF$count, 
  names.arg = aDF$record,
  main = "대한민국 축구 역대 A매치 전적",
  xlab = "전적",
  ylab = "횟수",
  col = c("red", "blue", "green")
  )

pie(
  aDF$count,
  labels = aDF$record,
  main = "대한민국 축구 역대 A매치 전적",
  col = rainbow(7)
)



