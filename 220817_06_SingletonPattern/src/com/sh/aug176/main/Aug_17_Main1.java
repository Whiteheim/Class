package com.sh.aug176.main;

import com.sh.aug176.someone.Someone;

// ���ϴ� ��ü �ϳ� ����
// �̸�, ����, ���� �Ӽ�
// ���

// �������α׷���
// 			�̱������� *** ����� final ���

public class Aug_17_Main1 {
	public static void main(String[] args) {
//		Someone s = new Someone("ȫ�浿", 30, "ȫ����");
//		s.printInfo();
//		System.out.println(s);
//		System.out.println("-------------------");
//		Someone s2 = new Someone("ȫ�浿", 30, "ȫ����");
//		s.printInfo();
//		System.out.println(s2);
		
		Someone s = Someone.getSomeone();
		s.printInfo();
		System.out.println(s);
		System.out.println("--------------------");
		Someone s2 = Someone.getSomeone();
		s.printInfo();
		System.out.println(s2);
		System.out.println("--------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
