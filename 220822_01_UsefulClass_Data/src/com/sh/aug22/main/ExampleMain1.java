package com.sh.aug22.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// 학생의 이름/생년월일(yyyy.MM.dd)/국어/수학/영어 입력받아
	// 학생의 나이, 총점, 평균값을 출력
	// split
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("이름/생년월일(yyyy.MM.dd)/\n국어/수학/영어 점수 입력 : ");
		String s = k.next();
		
		String[] s2 = s.split("/");
		
	
		try {
			String s3 = s2[1];
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			Date birthday = sdf.parse(s3);
			
			Date now = new Date();
			SimpleDateFormat yrFmt = new SimpleDateFormat("yyyy");
			String nowYr = yrFmt.format(now);
			String birthdayYr = yrFmt.format(birthday);
			
			int ny = Integer.parseInt(nowYr);
			int by = Integer.parseInt(birthdayYr);
			int age = ny - by +1;
//			
//			String[] s4 = s2[1].split("\\.");
//			int n = Integer.parseInt(s4[0]);
//			int n2 = now.getYear() + 1900;
//			int age = n2 - n + 1;
			System.out.println(age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		int num = 0;
		int sum = 0;
		for (int i = 2; i < s2.length ; i++) {
			num = Integer.parseInt(s2[i]);
			sum += num; 
		}
		System.out.println(sum);
		System.out.println((double) sum / 3);
	}
}
