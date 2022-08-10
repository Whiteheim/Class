// Java : 완벽한 객체지향 언어(구조가)라고 알려져있음
// C++, Python : Hybrid 객체지향언어 (구조가)

// 실생활을 묘사 -> 보기가 쉬워짐 -> 유지보수에 용이해짐

// main()있는 클래스 : XXXMain으로 표현, 나머지는 Class(주물)로 활용
public class Aug_10_Main2 {
	public static void main(String[] args) {
		// 버스를 Java로 표현 -> 표현하고싶을 때 마다 항상 클래스를 새로 생성해야함.
		// 버스 번호 / 차종 / 회사 / 기사님 / 출발점 => 출력
		// int, double, String ... etc : 구체적으로 설명하기 어려움
		// 주석을 달 필요가 없다는게 장점 -> 표현하고자 하는걸 알기 쉬움
		// b = 객체, instance라고 부름
		
		Bus b = new Bus(); // 버스 1대 완성
		b.busNum = 10547;
		b.car = "횬대";
		b.company = "ㅇㅇ여객";
		b.driver = "홍길동";
		b.start = "ㅇㅇ아파트 5단지";
//		System.out.println(b.busNum);
//		System.out.println(b.car);
//		System.out.println(b.company);
//		System.out.println(b.driver);
//		System.out.println(b.start);
		b.printInfo();
		b.go();
		System.out.println("==========================");
		//핸드폰
		//		모델명
		// 		제조사
		//		가격
		//		정보 출력
		//		전화왔을 때 - 띠리링~ 출력
		Mobilephone m1 = new Mobilephone(); //만드는 순간 Stack에 쌓이게 됨
		System.out.println(m1); // 기본형이 아닌 것들은 다 참조형
		m1.printMobile(); // 기본값
		System.out.println("==========================");
		m1.modelName = "iPhone 12";
		m1.company = "Apple";
		m1.cost = 1009000;
		m1.printMobile();
		m1.ringTheBell();
		System.out.println("==========================");
		// m1과 같은 속성값을 가진 m2 생성 -> m1 = m2의 방식으로는 불가능
		// 무조건 new 로 생성해야 함*.
		Mobilephone m2 = m1; // 같은 객체 공유, m1의 별명이 하나 더 생긴 상황.
		System.out.println(m2);	// 하나의 객체를 둘이서 공유하는 상황
		System.out.println("==========================");
		m2.modelName = "iPhone 12";
		m2.company = "Apple";
		m2.cost = 809000; // 값이 변경
		m2.printMobile();
		System.out.println("==========================");
		m1.printMobile(); // m2와 같은 번지값을 가지고 있어 정보가 바뀌면 함께 바뀜
		System.out.println("==========================");
	
	
	
	}
}






























