
public class Aug_01_Main06 {

	public static void sum (int a, int b) {
		System.out.println(a + b);		
	}
	public static void sum (int a, int b, int c ) {
		System.out.println(a + b + c);
	}
	public static void sum (double a, double b, double c) {
		System.out.println(a + b + c);
	}
	public static void scream (String a) {
		System.out.println("악!");
	}
	public static void scream (int a) {
		System.out.println("윽!");
	}
	public static void scream (double a) {
		System.out.println("으아아악!");
	}	
	public static void scream () {
		System.out.println("...");
	}	
	
	
	
	
	public static void main(String[] args) {
		sum(10,20);
		sum(20, 20, 30);
		sum(1.5, 20, 30);
		
		// ***오버로딩(overloading) : 함수명 같게, 파라미터를 다르게 하는 기술
		// 		   	    			  호출 할 때, 어떤 값을 넣었느냐에 따라 그에 맞는 함수를 대입함
		// 같은 자료형을 써도, 파라미터의 개수가 다르면 오버로딩 가능
		// 파라미터의 갯수가 같아도 다른 자료형을 사용하면 오버로딩 가능
		// print 함수가 대표적 (System.out.println();)
		
		
		scream(1);
		scream("헐");
		scream(0.5);
		scream();
	
	
	}
}
