import java.util.Scanner;

public class Aug_03_Main1 {
	
	// 3 �̸��� ���ڸ� ����
	public static int notbig() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �� : ");
		int a1 = s.nextInt();
		return a1 < 3 ? a1 : notbig();
	 
	}
	// Ȧ���� ����
	public static int notD2() {
		Scanner i = new Scanner(System.in);
		System.out.print("Ȧ�� :");
		int getnum = i.nextInt();
		int a = (getnum % 2 == 1) ? getnum : notD2();
		return a;
	}
	// ������
	public static int prac() {
		Scanner p = new Scanner(System.in);
		System.out.print("ū �� : ");
		int g = p.nextInt();
		return (g >= 100) ? g : prac();
	}
	// ���� 2
	public static int prac2() {
		Scanner p = new Scanner(System.in);
		System.out.println("����");
		int prac = p.nextInt();
		return (prac == 1) ? prac : (prac +(prac + 1) + (prac + 2));
				
	}
	// ���� ���� ����
	public static int range() {
		Scanner r = new Scanner(System.in);
		System.out.println("���� : ");
		int range1 = r.nextInt();
		return (range1 <=100) && (range1 >= 0) ? range1 : range();
	}
		
	public static void main(String[] args) {
		 int i = notbig();
		 System.out.println(i);
		 int q = notD2();
		 System.out.println(q);
		 int p = prac();
		 System.out.println(p);
		 int p2 = prac2();
		 System.out.println(p2);
		 int r = range();
		 System.out.println(r);
	}
}
