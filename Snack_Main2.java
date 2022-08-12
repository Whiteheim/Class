// 멤버변수 : 객체의 속성 -> (객체.속성)으로 표현
//							 this : 객체 스스로를 지칭, 생략가능

// 이 세상의 모든 과자를 김비버가 만든다 라고 표현
//			-> ***static 멤버변수 사용
//						- 객체가 없어도 쓸 수 있는 정보
//							=> 클래스명.xxx 로 사용
//						- 객체들의 공통적인 속성
//							=> 객체를 여러개 찍어내도 static멤버 변수는 하나만 있어도 가능.
//							   메모리 절약 가능

// static final 멤버변수 
// 			수정불가능 -> 값을 상수화 시킴 (값을 변경하지 않겠다)
//			static final 자료형 변수명(전부 대문자로 입력하는것이 문화) = 내용;
//			메모리의 stack / heap이 아닌 나머지 static영역에 저장이 됨.


// static method
//		static 사용시 메모리 절약 가능
// 		객체가 없어도 사용 가능
//			static이 아닌 멤버변수에는 접근이 불가함


public class Snack_Main2 {
	String name;
	double weight;
	int price;
//	static String manufactuter = "김비버"; //과자 생산자
	static final String MANUFACTUTER = "김비버";
	
	public void printSnack() {
		System.out.printf("과자명 : %s\n", name);
		System.out.printf("중량 : %.1fg\n", weight);
		System.out.printf("가격 : %d원\n", price);
//		System.out.printf("생산지 : %s\n", manufactuter);
		System.out.printf("생산지 : %s\n", MANUFACTUTER);
	}
	
	public static void printtaste() {
		System.out.println(MANUFACTUTER);
//		System.out.println(name); static이 아닌 멤버변수라서 에러발생
		System.out.println("바삭바삭");
		System.out.println("-------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
