package com.heim.dev051.wc;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// 소설책 -> 작가가 어떤 단어를 자주 사용했는지

// Hadoop : 서버급 (Linux) 컴퓨터를 여러 대로 병렬처리해 분석하는 Java프로그램

// Windows : 자동완성을 편하게 하기 위해 윈도우 사용
//			필요한것만 자동완성되면 사용 완료
//			Hadoop 전체적인건 필요없음
//			실제로 실행할 Linux에는 Hadoop 전체가 다 설치되어있음
//	-> hadoop-common, hadoop-mapreduce-client-core만 있으면 됨

// Hadoop의 마지막 단계 
public class WCMain {
	public static void main(String[] args) {
		try {
			// 설정
			Configuration c = new Configuration();
			
			// 하둡 작업 시작을 알림
			Job j = Job.getInstance(c);
			
			// map, combine, reduce 단계별 담당 클래스 지정
			j.setMapperClass(WCMapper.class);			// 이 작업의 Mapper 역할 지정
			j.setCombinerClass(WCReducer.class);		// 이 작업의 Combine 역할 지정
			j.setReducerClass(WCReducer.class);			// 이 작업의 Reduce 역할 지정
			
			// 결과 형태 - Reduce의 mapper<> 뒷부분 key, value에 맞춰 작성
			j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(IntWritable.class);
			
			// HDFS 최상위에 있는 txt 파일 분석 
			FileInputFormat.addInputPath(j, new Path("/pinoccio.txt"));
			// New Path() : 경로 지정				
			
			// 분석해서 그 결과를 HDFS 최상위에 있는 지정폴더에 담아내기
			FileOutputFormat.setOutputPath(j, new Path("/sResult"));
			
			// *** 작업 끝날 때 까지 대기 (필수적으로 명시 해야함)
			j.waitForCompletion(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}











































