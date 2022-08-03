import java.util.Scanner;

public class Aug_03_Main2 {

	public static int number1() {
		Scanner n = new Scanner(System.in);
		System.out.println("숫자 1 : ");
		int num = n.nextInt();
		return num;
	}

	public static int number2() {
		Scanner n = new Scanner(System.in);
		System.out.println("숫자 2 : ");
		int num = n.nextInt();
		return num;
	}

	public static int sum1(int n1, int n2) {
		int sum = n1 + n2;
		int result = (sum % 2 == 0) ? sum : sum1(number1(), number2());
//		int result = (sum % 2 == 0) ? sum : sum1(n1, n2); 원치 않는 값이 입력되면 무한으로 루프됨
// 														  처음 입력한 값이 계속 돌기 때문
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sum1(number1(), number2()));
	}

}
