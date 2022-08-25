package com.sh.aug25.main;

import java.util.ArrayList;
import java.util.Comparator;

// ArrayList(List�迭�� ��ǥ���� ����)
//	��Ҹ� index�� ����ϴ°��� �迭�� ����
//	�迭���� ������ 
//		�迭 : ������ ���� -> �������� ���� �迭�� ũ�⺸�� �������� ���� x
//		ArrayList : ����Ǵ� ������ ���� ���� ũ�Ⱑ �ڵ����� ����
//					��Ҿ翡 ���� ArraList�� ũ�⸦ �ڵ����� ������Ŵ
//					�ڷ����� ��� �����͸� �ִ� ���� ����

public class ListMain {
	public static void main(String[] args) {
//		int[] i = { 1, 2, 3 };
//		ArrayList test = new ArrayList();
//		test.add("�ǰ�");
//		test.add("����");
//		test.add("�س�");
//		test.add("Ī��");
//		test.add("1.11");
//		test.add("false");
//		for (Object object : test) { // �ڷ����� ���ϵ��� �ʾƼ�object��� ���� �򰥤�
//			System.out.println(object);
//		}
//		System.out.println("=======================");

		ArrayList<String> al = new ArrayList<String>();
		al.add("ananas");
//		al.add(1);	// ������ ���� ���� : String �� ���� �� ����
		
		// �ڷ��� ������ ���� ��
		// <	> - generic
		//	�ڷ����� �����ϴ� ����
		//	Ŭ������<�ڷ����� ��ü��>�� �Է�
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(new Integer(100));
		System.out.println(al2.get(0));
		System.out.println(al2.size());
		System.out.println("=======================");
		
		for (int j = 0; j < al2.size(); j++) {
			System.out.println(al2.get(0));
		}
		System.out.println("=======================");
		al2.add(30);
		al2.add(1, 90); // 1�� �ڸ��� 90�ֱ�
		al2.add(2, 0);	// 2�� �ڸ��� 0 �ֱ�
		al2.remove(0); // 0�� �ڸ��� �ִ� �� �����
		
		for (Integer ii : al2) {
			System.out.println(ii);
		}
		System.out.println("=======================");
		al.add("�θ���");
		al.add("�ٳ���");
		al.add("����");
		al.add("���");
		al2.add(13);
		al2.add(25);
		al2.add(39);
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		al.sort(c);
		
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("=======================");
		
		Comparator<Integer> i2 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2); // ��������
				return o2.compareTo(o1); // ��������
			}
		};
		al2.sort(i2);
		for (int integer : al2) {
			System.out.println(integer);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
