package com.sh.aug25.main;

import java.util.ArrayList;
import java.util.Scanner;

public class CMain2 {
	public static void main(String[] args) {
		// �л� ��ü - �̸�, ��������, ��������, �������� + ��±��
	
		// �л��� ��ȣ�� �Է��ϸ� �� �л��� ������ ���
		Scanner k = new Scanner(System.in);
		System.out.print("�л���ȣ(1~4)");
		int no = k.nextInt();
		// ����ؾ��� Collection��? -> map? List!
		
		// �л� 4�� ����
		ArrayList<Student> school = new ArrayList<Student>();
		school.add(new Student("�л�1", 100, 90 , 80));
		school.add(new Student("�л�2", 80, 90 , 70));
		school.add(new Student("�л�3", 100, 90 , 100));
		school.add(new Student("�л�4", 700, 90 , 100));
		
		// �ش� ��ȣ �л��� ��ü������ ���
		school.get(no - 1).printInfo();
		System.out.println("-----------------");
		
		// �ش� ��ȣ �л��� ���������� ���
		System.out.println("�������� : " + school.get(no - 1).getEng() + "��");
		System.out.println("-----------------");
		// ��ü �л��� ����
		for (int i = 0; i < school.size(); i++) {
			//������
			System.out.println(school.get(i));
			//��ü����
			school.get(i).printInfo();
			System.out.println("-----------------");
		}
	}
}
