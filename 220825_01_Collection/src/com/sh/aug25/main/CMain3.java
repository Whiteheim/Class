package com.sh.aug25.main;

import java.util.HashMap;
import java.util.Scanner;

public class CMain3 {
	public static void main(String[] args) {
		
		// �л��� �̸��� �Է����� ��
		Scanner k = new Scanner(System.in);
		System.out.print("�л� �̸� : ");
		String name = k.next();
		// �� �л��� ��ü ���� ���
		HashMap<String, Student> student = new HashMap<String, Student>();
		student.put("�л�1", new Student("�л�1", 100, 90 , 80));
		student.put("�л�2", new Student("�л�2", 80, 90 , 70));
		student.put("�л�3", new Student("�л�3", 100, 90 , 100));
		student.put("�л�4", new Student("�л�4", 700, 90 , 100));
		
		//�Է��� �л� �̸��� ��ü ����
		student.get(name).printInfo();
		
	}
}
