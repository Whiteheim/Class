
public class Aug_01_Main04 {
	
	public static void test(int b) {
		int a = 123;
		System.out.println(b); // 30
		System.out.println(a + b); // 153
}
		
	public static void main(String[] args) {
		int a = 10;		// 지역변수(local variable) :
		int b = 20;		// 		 함수 내에서 만든 변수
		int c = 30;		//		 그 함수 내에서만 사용 가능
		
		test(c);
		System.out.println(b); // 20
	// 같은 함수 안에서는 같은 이름의 변수를 만들 수 없음
	// 프로그램 실행 시 main의 식 먼저 실행 되고 나머지 함수는 위에서부터
	// 순차적으로 실행되어 메모리의 Stack에 쌓이게 됨
		
		
	}
}
