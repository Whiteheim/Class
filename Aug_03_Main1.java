import java.util.Scanner;

public class Aug_03_Main1 {
	
	// 3 미만의 숫자만 가능
	public static int notbig() {
		Scanner s = new Scanner(System.in);
		System.out.print("작은 수 : ");
		int a1 = s.nextInt();
		return a1 < 3 ? a1 : notbig();
	 
	}
	// 홀수만 가능
	public static int notD2() {
		Scanner i = new Scanner(System.in);
		System.out.print("홀수 :");
		int getnum = i.nextInt();
		int a = (getnum % 2 == 1) ? getnum : notD2();
		return a;
	}
	// 연습용
	public static int prac() {
		Scanner p = new Scanner(System.in);
		System.out.print("큰 수 : ");
		int g = p.nextInt();
		return (g >= 100) ? g : prac();
	}
	// 연습 2
	public static int prac2() {
		Scanner p = new Scanner(System.in);
		System.out.println("숫자");
		int prac = p.nextInt();
		return (prac == 1) ? prac : (prac +(prac + 1) + (prac + 2));
				
	}
	// 숫자 범위 지정
	public static int range() {
		Scanner r = new Scanner(System.in);
		System.out.println("숫자 : ");
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
