import java.util.Scanner;

public class Aug_03_Main4 {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.print("x : ");
		int x = enter.nextInt();
		// if 문 안에 변수를 만들면 실행되면서 계속해서 int y를 생성하게 됨 	
		//						->	비효율 (값을 변경(할당)할수 있게 해야함)
		 
		if (x > 5) {
			int y = 10;
			System.out.println(y);
		} else if (x > 3) {
			int y = 20;
			System.out.println(y);
		}
		
		/*
		 * int z; => 변수 선언만 해도 사용 가능
		 *(int z = 0;) 기본값을 정해놓지 않으면 main함수에서 print 되지 않음.
		 * if (x > 5) { 
		 * 		z = 10; 
		 * 		System.out.println(z); 
		 * 	} else if (x > 3) {
		 * 		 z = 20;
		 * 		System.out.println(z);
		 *  }
		 */
		//	↑↑↑↑↑↑↑↑
		// if 문 바깥에 변수를 생성하고 if문 안에서 그 변수의 값을 변경 할 수 있게 하는것이 효율적
	 
		// 기본값이 없는 변수를 사용하려면 초기화가 진행 되어야 사용 가능 (int z = 0;)
		
		
	}
}
