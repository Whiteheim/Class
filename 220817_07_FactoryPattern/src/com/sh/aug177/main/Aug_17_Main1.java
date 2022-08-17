package com.sh.aug177.main;

import com.sh.aug177.academy.Academy;
import com.sh.aug177.academy.Student;

// �п����� �л��� ����� �� �ش� Ŀ��ť�� ����ڷ� ����Ϸ��� ��
// �л��� ������ �̸� / ����
// ��ϼ������ ��ȣ �ο�

// ��ü�� �ʿ� ���� ��� : static �޼ҵ� ���
// ��ü�� �ʿ��� ���
// 		�ϳ� �ʿ��� ��� : Singleton ���� (static final)
//		������ : 
//				�뷮����, �ڵ�ȭ�� : Factory ����
//		������ : ��� �ϴ� ���

public class Aug_17_Main1 {
	public static void main(String[] args) {
		Academy ac = new Academy();
		
		Student s1 = ac.consult("��", 15);
		s1.printInfo();
		System.out.println("==============");
		Student s2 = ac.consult("��", 15);
		s2.printInfo();
		System.out.println("==============");
		Student s3 = ac.consult("��", 15);
		s3.printInfo();
		System.out.println("==============");
		Student s4 = ac.consult("��", 15);
		s4.printInfo();
		
	}
}
