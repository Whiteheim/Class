package com.sh.aug175.main;

import com.sh.aug175.avengers.Avenger;
import com.sh.aug175.avengers.Ironman;

public class Aug_17_Main7 {
	// Avengers class
	// �̸�, ���� �Ӽ�
	// ���� ���
	public static void main(String[] args) {
		
		// Avenger�� ���� ��ӹ��� 
		// Ŭ�������� �˼�����
		// ���ο� ����� ���� Ŭ����
		
		// �͸� ���� Ŭ���� (anonymous inner class) ��� ��� 
		
		Avenger a = new Avenger() { // �߰�ȣ ���� �κ� = Ŭ���� �κ�
			
			@Override
			public void attack() {
				System.out.println("�Ź��� ����");
			}
		};
		
		a.printInfo();
		a.attack();
		System.out.println("----------------");
		// ���̾���� �����
		// ��� �Ӽ�
		// ������ ���޼� ��
		// �� o
		// ���� o
		Ironman i = new Ironman("�Ǵ�", 52, 1000000000);
		i.printInfo();
		i.attack();
		i.drive();
		i.smoke();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
