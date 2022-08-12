// static -> 적재적소에 사용해야함.
//		  -> 고급 클래스

// 콘솔창에 어떻게 출력이 될 지 생각해보기
class Number {
	static int num = 0;	// static 멤버변수 : 객체들의 공통속성 (값을 공유)
	int num2 = 0;	
}

public class Aug_12_Main4 {
	public static void main(String[] args) {

		Number number1 = new Number();
		Number number2 = new Number();

		number1.num++;
		number1.num2++;
		
		System.out.println(number1.num);		//  1
		System.out.println(number1.num2);		//  1
		System.out.println(number2.num);		//	1 -> static o
		System.out.println(number2.num2);		// 	0 -> static x
	}
}