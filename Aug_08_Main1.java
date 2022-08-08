import java.util.Scanner;

public class Aug_08_Main1 {

	public static void number(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
	}

	public static void number(int x, int y, int z) {
		System.out.printf("%d + %d + %d= %d\n", x, y, z, x + y + z);
		
	}
// 정수 n개를 넣으면 그 곱을 출력하는 함수
// 함수 파라미터로 개수 무제한
//	자료형 ... 변수명 => 파라미터 무제한
	public static void number(int ...n) { // ******
		int mul = 1;
		for (int i = 0; i < n.length; i++) {
			//함수 내에서 사용할때는 배열처럼 사용
			mul *= n[i];
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		
	number();	
	}
}
