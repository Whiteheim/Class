sResult <- readLines("C:/Users/user/Desktop/KDT/Linux/sResult.txt")
sResult <- strsplit(sResult, "\t")

word = c()
count = c()

for (s in sResult) {
  word[length(word) + 1] = s[1]
  count[length(count) + 1] = as.numeric(s[2])
}

sDF <- data.frame(word=word, count=count)
sDF
library(devtools)
devtools::install_github("lchiffon/wordcloud2")
library(wordcloud2)

sDF <- sDF[order(-sDF$count), ]
View(sDF)
wordcloud2(sDF)
wordcloud2(sDF, size = 5, fontFamily = "D2Coding", color = "random-light")
