package com.heim.dec053.bd;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class BusMain {
	public static void main(String[] args) {
		try {
			Configuration c = new Configuration();
			Job j = Job.getInstance(c);
			
			j.setMapperClass(BusMapper.class);
			j.setCombinerClass(BusReducer.class);
			j.setReducerClass(BusReducer.class);
			
			j.setOutputKeyClass(Text.class);
			j.setOutputValueClass(LongWritable.class);
			
			String fileName = null;
			for (int i = 2019; i < 2022; i++) {
				fileName = String.format("/bus%d.csv", i);
				FileInputFormat.addInputPath(j, new Path(fileName));
			}
			
			FileOutputFormat.setOutputPath(j, new Path(args[0]));
		
			j.waitForCompletion(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
