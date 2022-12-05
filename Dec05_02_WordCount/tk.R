# Hadoop 결과파일 불러오기 
tkResult <- readLines("C:/Users/user/Desktop/KDT/Linux/tkResult.txt")

tkResult <- strsplit(tkResult, "\t")

name = c()
count = c()

for (tr in tkResult) {
  name[length(name) + 1] = tr[1]
  count[length(count) + 1] = as.numeric(tr[2])
}
name
count

# DataFrame으로 전환
trDF = data.frame(name = name, count = count)
View(trDF)

# barplot
barplot(
  trDF$count,
  names.arg = trDF$name,
  main = "삼국지",
  xlabel = "인물",
  ylabel = "언급 횟수",
  col = c("#D1B2FF", "#BBFFD4", "#B2CCA4")
)

# pie
trDf <- trDF[order(-trDF$count), ]
trDf

pie(
  trDF$count,
  labels = trDF$name,
  main = "삼국지",
  col = c("#D1B2FF", "#BBFFD4", "#B2CCA4")
)

















