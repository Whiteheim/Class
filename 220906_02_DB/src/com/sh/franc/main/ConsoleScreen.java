package com.sh.franc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.sh.franc.Reserve.Reservation;
import com.sh.franc.Reserve.Resist;

// ����ڰ� Console �� �� �ְų�, Console�� �Է��� �� �ֵ��� ����� Class

// �Ʒ� �޴��� �� �� �ִ� ���

// 1. �����ϱ� ��� (���� �Է�, ��¥�� ��-��-��/ ��:��)
// 2. ���� ��� ��� 
// 3. ��ü ���� Ȯ�� ��� (��¥�� ��-��-�� ���� ����/���� ��:��)
// 4. ��ü ���� ��ȸ (��ġ(�¼���) - ����� �̸�)
// 5. ���� ã�� (�ּ� �¼� ��)
// 6. ���� ã�� (�������� �̸� �Է��ϸ� �������� ���� ���)
// 9. ���α׷� ����

public class ConsoleScreen {

	public static int selectNum() {
		Scanner k = new Scanner(System.in);
		// �޴� ���� â
		System.out.println("=====���Ͻô� �޴��� ��ȣ�� �Է����ּ���=====");
		System.out.println("|1.     ����     | 2. ���� ��� | 3. ����Ȯ��|");
		System.out.println("|4. ��ü������ȸ | 5. ���� ã�� | 6. ����ã��|");
		System.out.println("|7.  ���ຯ��    | 8. �������  | 9.   ����  |");
		System.out.println("=============================================");
		// ��ȣ �Է�
		System.out.print("��ȣ �Է� : ");
		int number = k.nextInt();
		return number;
	}

	public static void printResult(String result) {
		System.out.println(result);
	}

	public static Reservation showRsvMenu() throws ParseException {
		Scanner k = new Scanner(System.in);

		System.out.print("������ : ");
		String name = k.next();

		System.out.print("���� ��¥ (YYYY-MM-DD/HH:mm) : ");
		String when = k.next();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD/HH:mm");
		Date when2 = sdf.parse(when);

		System.out.print("����ó : ");
		String phoneNum = k.next();

		System.out.print("������ ���� : ");
		String location = k.next();

		Reservation r = new Reservation(0, name, when2, phoneNum, location);
		return r;

	}

	// ��ü ���� Ȯ��
	public static void showRsvResult(ArrayList<Reservation> rsvs) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E a hh:mm");
		for (Reservation r : rsvs) {
			System.out.printf("�����ȣ : %d\n", r.getNo());
			System.out.printf("������ �̸� : %s\n", r.getName());
			System.out.printf("�޴��� ��ȣ : %s\n", r.getPhone());
			System.out.printf("������ : %s\n", r.getLocation());
			System.out.println(sdf.format(r.getWhen()));
		}
	}

	public static void showReslutMenu(ArrayList<Resist> alrs) {
		for (Resist r : alrs) {
			System.out.printf("%s(%d��)", r.getLocation(), r.getSeat());
			System.out.printf("- %s\n", r.getOwner());
		}
	}

	// ���� ã��
	public static Resist showResMenu() {
		Scanner k = new Scanner(System.in);

		System.out.print("���� ��ġ : ");
		String location = k.next();

		System.out.print("���� ���� : ");
		String owner = k.next();

		System.out.print("�¼� �� : ");
		int seat = k.nextInt();

		Resist r = new Resist(location, owner, seat);
		return r;
	}

// �¼����� ���� ã��	
	public static Resist searchR() {
		Scanner k = new Scanner(System.in);

		System.out.print("�¼����� �˻� : ");
		int seat = k.nextInt();

		return new Resist(null, null, seat);
	}

// ���� ã��
	public static String searchReserve() {
		Scanner k = new Scanner(System.in);

		System.out.print("������ �̸� : ");
		String name = k.next();

		return name;
	}

// 7. ���� ���� ���� (���� ��ȣ�� �Է��ϸ� ����ó�� ���� ����)
	public static Reservation cReserve() {
		Scanner k = new Scanner(System.in);
		
		System.out.println("�����ȣ : ");
		int rNum = k.nextInt();
		
		System.out.println("�����Ͻ� �޴��� ��ȣ :");
		String pNum = k.next();
		
		return new Reservation(rNum, null, null, pNum, null);
		
	}
// 8. ���� ��� (�����ȣ �Է� ��, ���� ���)
	public static Reservation cancelR() {
		Scanner k = new Scanner(System.in);
		
		System.out.println("�����ȣ : ");
		int rNum = k.nextInt();
		
		return new Reservation(rNum, null, null, null, null);
	}

	
	
	
	
	
	
	}
