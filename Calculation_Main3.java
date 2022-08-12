// 변수 생성 이유 : 데이터를 저장하기 위해 -> Memory상의 공간에 저장
// 		변수 : 데이터를 저장하는 공간(그릇)

// 객체 생성 이유 : 실생활스러운 변수(속성)를 만들어서 알아보기 편하게 하기위함
//		-> static 없는 method를 가지고 오려고

public class Calculation_Main3 {
	// 멤버변수가 없음 -> 저장할게 없음
	// 		-> 계산기 객체를 만들 필요가 없음.
	// 		-> static 메소드 기반으로 생성
	
	public static void printSum(int a , int b) {
		System.out.println(a + b);
	}
	
	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	
}
