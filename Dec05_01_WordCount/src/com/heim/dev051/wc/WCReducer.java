package com.heim.dev051.wc;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

// Hadoop작업 두번째 단계 : Combine
// 단어와 단어와 등장횟수를 통합 ( I <1, 1> )
// Combine은 알아서 처리 됨

// Hadoop 작업 세번째 단계 : Reduce
// Combine 단계의 결과물 분리
// Name Node 와 Data Node들 별로 단어를 분류해 단어 등장 횟수를 세어줌 ( I 2 ) 
// in : sleepy <1, 1, 1>	>> mapper<> 앞의 두자리
// out : sleepy 3			>> mapper<> 뒤의 두자리


// public class WCMapper extends Mapper<Object, Text, >>Text<<, >>IntWritable<< >{
										// 앞의 두자리는 Mapper클래스쪽 뒤의 두자리와 같아야함
public class WCReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	// 메모리 절약을 위한 Singleton 처리 (결과처리)
	private static final IntWritable SUM = new IntWritable();
	
	
	// in : sleepy <1, 1, 1> 한세트 만날 때 마다 호출 할 method
	@Override
	protected void reduce(Text arg0, 		// map단계에서 처리해준 Key값 : sleepy 
			Iterable<IntWritable> arg1,		// 유사 list : <1, 1, 1> 
			Reducer<Text, IntWritable, Text, IntWritable>.Context arg2)		// 결과 처리용 
					throws IOException, InterruptedException {
		int sum = 0;
		// <1, 1, 1> 합쳐주는 작업
		for (IntWritable i : arg1) {
			// sum은 int, i는 intWritable => 형 변환을 해줘야함
			// => .get()
			sum += i.get(); // 1 + 1 + 1 = 3
		}
		SUM.set(sum);	// singleton에 등록
		arg2.write(arg0, SUM);	// 결과값 내 보내기
	
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
