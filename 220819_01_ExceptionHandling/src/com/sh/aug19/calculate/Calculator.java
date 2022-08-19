package com.sh.aug19.calculate;

public class Calculator {

	// 1. try - catch - finally : ���⿡�� ���� ��
	// ������� : 9 - 10 - 11 - [16 - 17 - 18] - 12 ([] : finally)
	// ���԰� 0 : 9 - 10 - 11(Arith) - 13 - 14 - [16 - 17 - 18] - 15 ([] : finally)

	public static int divide(int price, int weight) {
		try {
			int d = price / weight;
			return d;
		} catch (Exception e) {
			System.out.println("����");
			return -999;
		} finally {
			System.out.println("�ٽ��Է�");
		}
	}

	// 2. �̷�� : throws
	// divide2�� �����ϴٰ� Arithmetic... �� ������
	// divide2�� ȣ���� �ʿ��� �ذ��ض�
	public static int divide2(int price, int weight) throws /* Arithmetic */Exception {
		int d = price / weight;
		return d;
	}

}
