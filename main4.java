// 프로그래밍 언어들 마다 가지고 있는 기본 자료형
// 		어떠한 처리를 하지 않고 값만 있을 때, 어떤 자료형으로 인식하는가?

/* Java의 기본 자료형 
 * 		정수 : int
 *		실수 : double(Java 한정, 다른 언어들은 대부분 float)
 *		문자열 : String
 *		논리 : boolean (true / false)
 */




public class main4 {
	public static void main(String[] args) {
	
// 형 변환 (type casting)
// 		자료형을 바꾸는 행위
// 		Java가 자동으로 형 변환을 시킴 
// 		Java는 실수형 자료형을 double로 사용
// 		자동 형 변환이 안되는 경우 -> IDE(eclips같은 개발환경)가 처리 (해결방법을 알려줌)
//		(자료형) 값; ex) int x + a = (double) x;
// 		double이 아닌 float를 사용할 때 error가 남
// 		float를 사용하기 위해서는 f를 붙혀주어야함 
// 		float = 1.234 (X) / float = 1.234f (O)
		
		float f = 1.234f;
		float f1 = (float) 1.234;
		
//		datatype name = (datatype) value;
		
		double d = 9;
		System.out.println(d); // 자동적으로 변환이 적용됨
		
		
		
		
		
		
	}
}
