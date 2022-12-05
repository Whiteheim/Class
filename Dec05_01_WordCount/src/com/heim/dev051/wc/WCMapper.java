package com.heim.dev051.wc;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// Hadoop 작업의 첫번째 단계 : Map

// 1단계 : 다운받은 소설책을 분석하라고 넣어줄 것
//		>> Key : 값은 딱히 없음, Text파일로 설정
//		   Value : String (hadoop에서는 String이 Text)
// 2단계 : 결과 받아오기
//		>> Key : Text(String / 뜯어놓은 단어 하나 하나들)
//		   Value : int
//		ex) I, 1
//			am, 1
//			sleepy, 1
public class WCMapper extends Mapper<Object, Text, Text, IntWritable>{
	// 결과처리를 위해 자료형을 맞추기 위해서는 메소드 밖으로 빼내어 자료형을 맞추는게                                                                                                                            
	// 메모리 절약을 위해 Singleton 처리
	private static final Text WORD = new Text();
	private static final IntWritable ONE = new IntWritable(1);
	// String 뒤에 1을 붙여줌
	// Map을 override >> 한 문장 마다 이 method가 호출이 될 것
	@Override
	protected void map(Object key, // data의 유무 체크 (크게 중요 x)
			Text value, // *** 문장 자체를 의미 << 해당 문장을 가져오기 위해 필요 
			Mapper<Object, Text, Text, IntWritable>.Context context) // 결과처리용
			throws IOException, InterruptedException {
		
		// 기존에 사용하던 String 객체로 바꿔주는 작업
		String line = value.toString();
		
		// 정확하게 단어의 위치를 체크해야 할 때 : Split 사용
		
		// 단순한 단어 체크 (문장을 단어로 분리하는 작업): StringTokenizer
		StringTokenizer st = new StringTokenizer(line, " ");
		while (st.hasMoreTokens()) { // 반복문으로 단어들 가져오기
			// 결과처리 (자료형을 맞춰주어야함) 
			WORD.set(st.nextToken());
			context.write(WORD, ONE);
			
		}
	}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		




















































































































