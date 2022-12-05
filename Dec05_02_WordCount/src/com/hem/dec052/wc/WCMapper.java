package com.hem.dec052.wc;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// IN
//		key : ??
//		value : 유비는 귀가 큽니다.
//				장비는 애주가
//				...
////////////////////////////////////////
// OUT
//		key : 유비
//		value : 1

public class WCMapper extends Mapper<Object, Text, Text, IntWritable> {

	private static final Text WHO = new Text();
	private static final IntWritable ONE = new IntWritable(1);

	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		String line = value.toString();

		StringTokenizer st = new StringTokenizer(line, " ");

		// 각각 유비 / 조조 / 손권 단어 뽑아내기
		String word = null;

		while (st.hasMoreTokens()) {
			word = st.nextToken(); // 나누어진 토큰으로 단어 비교하기
			// 유비는
			// 장차
			// 큰
			// 인물이 ...
			if (word.contains("유비") || word.contains("현덕")) {
				WHO.set(word);
				context.write(WHO, ONE);
			} else if (word.contains("조조") || word.contains("맹덕")) {
				WHO.set(word);
				context.write(WHO, ONE);
			} else if (word.contains("손권") || word.contains("중모")) {
				WHO.set(word);
				context.write(WHO, ONE);
			}
		}
	}

}
