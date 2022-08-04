import java.util.Scanner;

public class Aug_04_Main3 {

	public static int f1() {
		Scanner enter = new Scanner(System.in);
		System.out.println("숫자 : ");
		int f = enter.nextInt();
		if (f == 0) {
			System.out.println("0");
		} else if (f > 0) {
			System.out.println("양");
		} else if (f < 0) {
			System.out.println("음");
		}
		return f;
	}

	public static void f2(int a) {
		System.out.println("어떤 수의 배수 인가?");
		if (a % 12 == 0) {
			System.out.println("3과 4의 공배수");
		} else if (a % 3 == 0) {
			System.out.println("3의 배수");
		} else if (a % 4 == 0) {
			System.out.println("4의 배수");
		} else {
			System.out.println("몰?루");
		}
	}

	public static void main(String[] args) {
		f2(f1());
	}

}
