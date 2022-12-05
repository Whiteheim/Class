package com.hem.dec052.wc;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


// Combine : 자동으로 처리되는 단계
// Combine으로 들어올 때 (=Mapper에서 나갈 때)
// 유비 1
// 조조 1
// 손권 1
// 유비 1
// 유비 1
// 조조 1
// 손권 1
// 조조 1
// 조조 1
// ...
/////////////////////////////////////////////////////////
// Reduce쪽으로 들어올 떄 (=Combine에서 나갈 때)
// 유비 <1, 1, 1>
// 조조 <1, 1, 1, 1>
// 손권 <1, 1>
////////////////////////////////////////////////////////
// Reduce에서 나갈 때 
// 유비 3
// 조조 4
// 손권 2

public class WCReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	
	private static final IntWritable SUM = new IntWritable();
	
	@Override
	protected void reduce(Text arg0, Iterable<IntWritable> arg1,
			Reducer<Text, IntWritable, Text, IntWritable>.Context arg2) throws IOException, InterruptedException {
		
		// 합계 내기
		int sum = 0;
		
		for (IntWritable i : arg1) {
			sum += i.get();
		}
		
		
		// 값 세팅
		SUM.set(sum);
		arg2.write(arg0, SUM);
	
	}
	
	
	
}
