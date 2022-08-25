package com.sh.aug25.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

// Set �迭
//		����������
//		�ߺ��� �����ʹ� �ڵ� ����
//			���� ��ü�� ������ ���� �ϳ��� ����
//		������ ����
//		HashSet, TreeSet, ...
//			=> ���������� �������� �ʾ� ������� ����

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("�ϳ�");
		hs.add("��");
		hs.add("��");
		hs.add("��");
		hs.add("��");
		hs.add("��");
		hs.add("��");
		// ũ��
		System.out.println(hs.size());
		System.out.println("-------------");
		// ��ҵ�
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("-------------");

		// ArrayList�� ������ �޾ƿ��� => ���� 10��
		// �ߺ������ؼ�
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(10));
		al.add(50);
		al.add(55);
		al.add(70);
		al.add(50);
		al.add(80);
		al.add(88);
		al.add(1231);
		al.add(50);
		al.add(1000);

		HashSet<Integer> hs2 = new HashSet<Integer>(al); // set�� list�� ��� �ߺ� ��
		al = new ArrayList<Integer>(hs2); // �ߺ� ���� �� �ٽ� List��

		// HashSet���� sort����� ��� list�� �ٽ� ����������

		// �������� ���� ���
		Comparator<Integer> i = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		al.sort(i);

		for (Integer i2 : al) {
			System.out.println(i2);
		}

	}
}
