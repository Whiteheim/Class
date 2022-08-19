package com.sh.aug18.main;

import java.util.StringTokenizer;

public class TextMain {
	// ����
	// 1.8.12
	// ���ڸ� : major ���� (1);
	// ���ڸ� : minor ���� (8.12)
	// �� ���ڸ��� �� ���� �� minor
	// ������ (1.8.12 -> 1.8.13) : ���� ���� ���� (����)
	// ������ (1.8.12 -> 1.9.0) : ��ȭ�� ü�� �� ���� (��Ը� ������Ʈ)
	// ������ (1.8.12 -> 2.0.0) : ���ο� ���α׷�

	// ��Ʈ��ũ�� ���ؼ� ������ �޾ƿ��� : �������·� �޾ƿ�
	// ��Ʈ��ũ�� ���ؼ� ������ ������ : �������·� �Ѱ���
	// �ѱ�ó���� ��ٷο� �� �� ����
	public static void main(String[] args) {
		String s1 = "�����Ϥ�����"; // ���� x ���o

		String s2 = new String("�� ������ �߼� ! �ʹ� �ų��� !"); // ���� o
		// 3��° �ִ� ���� ���
		char c = s2.charAt(2);
		System.out.println(c);
		// �����
		int l = s2.length();
		System.out.println(l);
		// �ʹ� ��� �ܾ �ִ°�
		boolean b = s2.contains("�ʹ�");
		System.out.println(b);
		// �� �̶�� �ܾ�� ����?
		boolean b2 = s2.startsWith("��");
		System.out.println(b2);
		// �߼� -> ���� ��ü
		String s3 = s2.replace("�߼�", "����");
		System.out.println(s3);
		// 2~5��° ���ڸ� ���
		// substring() : ���ϴ� ��ġ�� ���ڸ� ���� �� (������ġ, ������ ��ġ - 1)
		String s4 = s2.substring(2, 6);
		System.out.println(s4);
		System.out.println("=========================");
		// ������ ��� String ��ü ����
		String s5 = String.format("���� : %.2fkg", 1234.456);
		System.out.println(s5);
		System.out.println("=========================");

		// s2�� ���� �߰�
		s2 = s2 + " �;ƾƾƾ�";
		System.out.println(s2);
		s2 += " �;ƾƾƾ�";
		System.out.println(s2);

		s2 = new String(s2 + " ����");
		System.out.println(s2);

		// String �뷮���� �߰�
		StringBuffer sb = new StringBuffer(s2);
		sb.append("��ƾƾƾƾ������߰���");
		sb.append("���ƾƾƾƾƾƾ�");
		sb.append("���ƾƾƾƾƾƾ�");
		System.out.println(sb);

		String s6 = sb.toString();
		System.out.println(s6);

		System.out.println("=========================");
		// String �и�
		String s7 = "��,��,��,��,��,��";
		// 1. Split
		String[] s7Ar = s7.split(","); // ���ڿ��� �̾Ƴ��� ���ϴ� ���� ��� ��� ����
		System.out.println(s7Ar[0]);
		System.out.println(s7Ar[3]);
		System.out.println(s7Ar[5]);

		System.out.println("=========================");
		// 2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s7, ","); // ������� ����
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) { // �ݺ����� ���� + �������
			System.out.println(st.nextToken());
		}

		// ������ ���� Ȯ�� �� �� : StringTokenizer
		// data�ӿ��� ������ ���ٸ� : split

	}
}
