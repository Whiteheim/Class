package com.sh.aug19.main;

import java.util.Scanner;

public class Aug_19_Main1 {

	// error
	// �ѿ� ����
	// ��� apple
	// �ٳ��� banana
	// ���� ???
	// Java�� ������ �����ʰ� ����Ͽ� �������� �Ұ����� ����
	// ������ ���� 100%
	// �ϼ����� ������ ����

	// warning
	// �������� �ڵ�
	// ������ ����
	// �������� ���� => �ϼ����� ����(���࿡�� ���� ����)
	// ��Ŭ������ �ܼҸ��� ��
	// ex) Scanner k = new Scanner(); ��� �� ����� �ȴ���

	// exception
	// ���α׷��� �ϼ� �� ����
	// ���� �� �ܺ����� ���ο� ���� �۵��� �Ͼ���ʴ� ���
	// ������ ���� x
	// �������� ���� -> �����ڰ� ��Ȳ�� �����ؼ� �̸� ��ȹ�� ��������

	public static void main(String[] args) {
		// x : ?
		// y : ? �Է¹޾�
		// + - * /���

		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		System.out.println("------------------");
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
//		System.out.println(x/y);

		// y���� 0�� ������ exception �߻�

		// Exception ó�����
//		try {
		// ���� �κ��� ����
//		} catch (// ��������	������) {
//				try���� �����ϴٰ� �ش� ������ ���ܰ� �߻��ϸ� �� �κ��� ����
		// ���ܾ��� ���������� ������� ���, catch�κ��� �׳� ����ġ��
		// �� ���� �ҽ��� ����
//		} catch() {
		// .... ���� ���� ���� ����
//		} finally {
//			���������� ���α׷��� ����ƴ���,
//			���ܰ� �������� ������� �����, 
//			return���� ���� ����
//		}

		// �ΰ��� ������ ���ÿ� ������ ���� �Է��� catch�� ���븸 ���
		// Java�� ���忡�� ù��° ���ܰ� ������ �� , ��� �������� �� �ش��ϴ� ����ó���κ����� �Ѿ
		
		// x : 10, y : 0 => 67 - 68(Arith) - 72 - 73 
		
//		try {
//			int d = x / y;
//			System.out.println(d);
//			int[] ar = { 1, 2, 3 };
//			System.out.println(ar[x]);
//		} catch (ArithmeticException ae) {
//			System.out.println("����");
//		} catch (IndexOutOfBoundsException aoe) {
//			System.out.println("���� ��ȣ �Դϴ�");
//		}

		// x : 10, y : 1 => 67 - 68 - 69 - 70(IndexOut) - 74 - 75
		// x : 2, y : 1 => 67 - 68 - 69 - 70 - 71  
		
		try {
			int d = x / y;
			System.out.println(d);
			int[] ar = { 1, 2, 3 };
			System.out.println(ar[x]);
		} catch (Exception e) {	// ��� exception�� �� �����
			System.out.println("�ȵ�");
			e.printStackTrace(); // � exception�� �߻� �ߴ��� ��Ȳ ��� (�����ڿ�)
		} finally {
			System.out.println("�������");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
