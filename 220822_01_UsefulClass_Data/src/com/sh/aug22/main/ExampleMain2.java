package com.sh.aug22.main;

import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {
	// �л��� �̸�/�������(yyyy.MM.dd)/����/����/���� �Է¹޾�
	// �л��� ����, ����, ��հ��� ���
	// Stringtokenizer
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("�̸�/�������(yyyy.MM.dd)\n/����/����/���� �Է� : ");
		String info = k.next();
		
		StringTokenizer st = new StringTokenizer(info,"/");
		
		st.nextToken();
		
		try {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),".");
			int birthYear = Integer.parseInt(st2.nextToken());
			Date now = new Date();
			int year = now.getYear() + 1900;
			int age = year - birthYear + 1;
			System.out.println(age);
			int kor = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			
			int sum = kor + math + eng;
			int avg = sum / 3;
			System.out.println(sum);
			System.out.println(avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
