package com.sh.aug19.main;

public class Aug_19_Main2 {
	public static void main(String[] args) {
		// Exception�� ����
		
		// 1. NullPointerException
		//		��ü������ ���� ��Ȳ
		//		null���� �ִ� ���������� .~~()�� ����� �� ���� �߻�
//		String s = null;
//		System.out.println(s.length()); //����
		
		// 2. ArrayIndexOutOfBoundsException
		//		�迭���� �ε����� ������ �ʰ��ϰ� �Ǵ� ��Ȳ���� �߻�
//		int[] ar = { 1, 2, 3 };
//		System.out.println(ar[3]);
		
		// 3. NumberFormatException
		//		���ڿ�(String) ->  ����(int, double)�� �ٲٴ� ��Ȳ
		// 		��ȯ�� �� ���� ���ڰ� �ִ� ��Ȳ���� �߻�
		String s = "a12345";
		int i = Integer.parseInt(s);
		System.out.println(i + 20);
		
	}
}
