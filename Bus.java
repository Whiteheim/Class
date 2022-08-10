// function - 클래스 외부에 만든 것
// 사실상 Java에는 function 이라는 용어는 없다.
// method - Class 속에 만든 것 (Class에 종속된 함수)

// Class : 객체를 찍어내는 틀 (ex : 주물)
public class Bus {
	//멤버변수 (Member Variable) - 속성 (= attribute, field, 전역변수)
	//							 - 객체의 데이터가 저장되는 공간
	//							 - Class에 포함되는 변수 (Variable)
	
	// 버스 번호
	int busNum;
	// 차종
	String car;
	// 회사명
	String company;
	// 운전사
	String driver;
	// 출발지
	String start;
	
	public void printInfo() { // function 이 아닌 method라고 불림
		//this 의 의미 : 스스로를 지칭. (생략 가능, 명확히 하고싶을 때 사용)
		System.out.println(this.busNum);
		System.out.println(this.car);
		System.out.println(this.company);
		System.out.println(this.driver);
		System.out.println(start);
	}
	
	
	
	// method(멤버 메소드) - 액션, 프로그램상 필요한 기능
	//					   - 객체의 동작에 해당하는 실행 블록
	public void go() {
		// 블록 - {}안의 부분 지칭
		System.out.println("부릉부릉");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
