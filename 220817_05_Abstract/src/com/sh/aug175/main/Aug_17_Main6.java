package com.sh.aug175.main;

import com.sh.aug175.animal.Cat;

public class Aug_17_Main6 {
	public static void main(String[] args) {
		// �߻�ȭ (Abstraction) : ������ �Ӽ��̳� ����� ��� �̸��� ���̴� ��
	Cat c = new Cat("����̰�", 2, 4);
	c.printInfo();
	c.roar();
	c.bite();
	}
}
