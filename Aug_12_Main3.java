// 계산기
//		정수 2개를 넣으면 그 합을 출력하는 기능

public class Aug_12_Main3 {

	public static void main(String[] args) {
		Calculation_Main3 c = new Calculation_Main3();
		c.printSum(10, 10);				// static O
		c.sum(10, 10, 10);				// static x
		//////////////////////////////////////////
		Calculation_Main3.printSum(10, 10);	// static o -> 메모리를 덜 사용 (static 안쓴거 보다) (new Calculation(); 없이 사용 가능)
//		Calculation.sum(10, 10, 10);  	// static x 

		// Java의 내장 클래스 중 하나인 Math도 같은 맥락
		// Math 또한 객체를 만들지않고 사용함.
		System.out.println(Math.PI);
		double s = Math.sqrt(10);
		System.out.println(s);
		
	}
}
