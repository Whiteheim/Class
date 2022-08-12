// 생성자 (Constructor)
// 		객체가 만들어질때 작업을 해야함
// 			=> 생성자 만들기
// 		리턴이 아예 없고, 메소드명이 클래스명과 같은 메소드
//		생성자를 만들지 않으면
// 			=> Java의 Compiler가 기본 생성자를 생성해줌.
//		생성자를 건들이면
// 			=> Java의 Compiler가 기본 생성자를 안만들어줌
//			=> 시스템이 자동으로 객체를 만들게 되면 기본생성자를 사용
//				=> 사용자가 기본생성자를 만들게 되면 에러 발생 가능



public class Nike_Shoes1_Main1 {
	String name;
	int size;
	int price;
	static String company = "나이키"; // static final String company = "나이키";
		
	public Nike_Shoes1_Main1() { // 빈공간에 자동완성(ctrl + space)을 누르면 생성자가 나옴
		// TODO Auto-generated constructor stub
	}
	// 생성자 오버로딩(Ctrl + Shift + Space)
	// Window -> Preferences -> key 검색 -> gene 검색 -> Generate constructor using field -> binding -> 단축키 설정
	public Nike_Shoes1_Main1(String name, int size, int price) { 
		super(); // 위에있는 기본 생성자를 불러옴
		this.name = name;
		this.size = size;
		this.price = price;
	}
		
		public void shoseInfo() {
			System.out.printf("모델명 : %s\n", name);
			System.out.printf("사이즈 : %d\n", size);
			System.out.printf("가격 : %d\n", price);
			System.out.printf("브랜드 : %s\n",company);
			System.out.println("==========================");
		
	}
		public void test(String name) {
			// 멤버변수명 / 파라미터명이 같다면?
			//		this. 을 붙이게 되면 무조건 멤버변수
			// 				안붙히면 가장 가까이에 있는 변수를 인식
			
			System.out.println(name);
			System.out.println(this.name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
