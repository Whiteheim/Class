package com.sh.aug18.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Date.java :1900��뿡 ������� Class
//			Y2K�� ������ ���� ���� (Year 2000 Problem) >> (k(kilo) = 1000)
//			���� �������� ���� ����
//			1900��� ���, �뷮�� ������ ������ ���� �� 2�ڸ��� ���
//			1970��� ������ ��ǻ�� : �ӵ��� ������ ��ġ�� �뷮�� ������.
//			�����͸� �Ƴ��� ���� ���� ó���� 4byte�� �ƴ� 2byte�� �Ҵ� (���� 2�ڸ�)
//			���������Ŷ� ���� 2000���� �͹����� 1900��, 2000�� ���� �� �ڸ��� 00���� �νĵǾ� ���ϵ�
//				-> ��ǻ�Ͱ� ���� �Ұ���
//				-> ��ǻ���� ���۵� ���ɼ� ����

// deprecated
//		������ �帣��, ��ǻ�͵� ���� -> ������ ����� �������� �ʹ� ����
//		���α׷��� �� ������Ʈ�� �Ǿ�� �ϴµ� �߿��� �޼ҵ�� �ٷ� ���� �� ����
//		���� �ڹٹ��������� ��� �����ϳ�, ���� ������ ��ü�ɰ��̶�� �ǹ� ����

// Date : ��¥ / �ð�

public class Aug_19_DateMain {

	public static void main(String[] args) {
		// �⺻���� -> ���� �ð� / ��¥
		Date now = new Date();
		// ���� �ð� ��¥ ���
		System.out.println(now);
		
		// ����
		System.out.println(now.getYear() + 1900); // 1900�� �������� �帥 ������ŭ ������� ����
		
		// ��
		System.out.println(now.getMonth() + 1); // 1���� ���α׷��� ����� ������ 0 ���� �����
		
		// ��
		System.out.println(now.getDate());
		
		// ����
		System.out.println(now.getDay()); // 0 ~ 6 (�� ~ ��)
		
		// ���� ����ǥ��
		String[] day = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.println(day[now.getDay()] + "����");
		System.out.println("=================================");
		//�ѱ�ó�� / ��¥/ �ð� : ���� ����
		
		// Date - ���� ���� -> String���� ǥ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd E a k:mm" /*Locale.FRANCE*/);
		
		String s1 = sdf.format(now);
		System.out.println(s1);
		System.out.println("=================================");
		
		// Ư�� �ð� ��¥
		Date d2 = new Date(93, 05, 16);
		System.out.println(d2);
		
		//String - �������� -> DateŸ��
		try {
			String s2 = "1993/06/16";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
			Date d3 = sdf2.parse(s2);
			System.out.println(d3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("=================================");

		// 10�� �� ũ���������� ������?
		try {
			String ch = "2012/12/25";
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
			Date d4 = sdf3.parse(ch);
//			System.out.println(d4);
			
			SimpleDateFormat sdf4 = new SimpleDateFormat("E");
			String ch2 = sdf4.format(d4);
			System.out.println(ch2 + "����");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
