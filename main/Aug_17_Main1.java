package com.today.aug171.main;

import com.today.aug171.electronic.Computer;
import com.today.aug171.electronic.Scanner;

// package : ������ ��Ƶδ� ����
public class Aug_17_Main1 {

	public static void main(String[] args) {
		// ���������̼�, 80����, i5-1234, 8GB, 500GB ��ǻ��
		Computer c = new Computer("���������̼�", 800000, "i5-1234", 8, 500);
		c.printInfo();
		System.out.println("--------------------------");
		// ��Ƽ �ͽ�������, 50����, ��ĳ��
//		Scanner s = new Scanner("��Ƽ�ͽ�������", 500000);
//		s.printInfo();
		com.today.aug171.electronic.Scanner s 
			= new com.today.aug171.electronic.Scanner("��Ƽ�ͽ�������", 500000);
		s.printInfo();

	}

}
