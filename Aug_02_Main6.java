import java.util.Random;

public class Aug_02_Main6 {
	/* public static A B ( C ) {
	 * 		내용
	 * 		return
	 * }
	 * 
	 * B : 함수명 / 기능의 가늠이 가능하도록 작명 / 동사 처럼 작명하기
	 * 	   띄어쓰기 처리는 낙타체 or 뱀체 사용
	 * 
	 * C : 파라미터(Parameter) / 함수를 호출하는 쪽 (main함수) 에서 해당 함수 쪽으로
	 * 	   						 데이터를 보낼 때 사용 
	 * 							 형태 : (자료형 변수명, 자료형 변수명, ...)
	 * 
	 * A : 리턴타입(Return Type) / 해당 함수에서 작업한 결과를 호출한 쪽(main 함수)으로 보낼때 사용
	 * 							   void를 제외한 다른 리턴타입들은 return과 함께 사용
	 */
	public static int randomizer() {
		Random i = new Random ();
		int r = i.nextInt();
		return r;
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b); 
	

	}
	
	public static void main(String[] args) {
		int r1 = randomizer();
		int r2 = randomizer();
		sum(r1,r2);		
	}
	
	
	
	
	
	
}
