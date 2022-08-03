import java.util.Scanner;

public class Aug_03_Main6 {
	// switch-case (ex : 권한 설정)

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("너의 계급은?");
		String soldier = enter.next();

		switch (soldier) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");
			break;
		default:
			System.out.println("자네 내가 누군지 아나?");
		}
	}
}
