package com.sh.aug175.main;

import com.sh.aug175.avengers.Avenger;
import com.sh.aug175.avengers.Ironman;

// ������ (Polymorphism)
// Poly (����) + Morph(���)
// ����Ÿ�� ������ ����Ÿ�� ��ü�� ��°��� ����
// ���� �������� �ٸ� ����� �� �� ���� (overriding�� ������ ������ ����)

public class Aug_17_Main8 {
	public static void main(String[] args) {
		// ���̾���� ��� �׸� i�� ���̾���� ����� ����
		Ironman i = new Ironman("man", 1, 23);
		i.printInfo();
		// ������� ��� �׸� a�� ���̾���� ����� ���� 
		Avenger a = new Ironman("man", 1, 23);
		a.printInfo();
	}
}
