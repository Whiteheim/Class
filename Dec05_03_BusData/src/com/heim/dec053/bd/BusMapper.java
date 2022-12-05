package com.heim.dec053.bd;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// IN
//		key : ?
// 		value : 2019,01,01,100, 명륜3가.성대입구, 61, 104
// OUT
//		key : 금
//		value : 165 (61 + 104)


public class BusMapper extends Mapper<Object, Text, Text, LongWritable> {
	
	private static final Text DAY = new Text();
	private static final LongWritable SUM = new LongWritable();
	
	@Override
	protected void map(Object key, Text value, Mapper<Object, Text, Text, LongWritable>.Context context)
			throws IOException, InterruptedException {
		try {
			String line = value.toString();
			String[] busData = line.split(",");
			
			// 날짜 처리
			String y = busData[0];
			int m = Integer.parseInt(busData[1]);
			int d = Integer.parseInt(busData[2]);
			String date = String.format("%s%02d%02d", y,m,d);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date date2 = sdf.parse(date);
			
			sdf = new SimpleDateFormat("E");
			String day = sdf.format(date2);
			DAY.set(day);
			
			Long l1 = Long.parseLong(busData[5]);
			Long l2 = Long.parseLong(busData[6]);
			SUM.set(l1 + l2);
			context.write(DAY, SUM);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
