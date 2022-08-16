
public class Aug_12_Main1 {
	public static void main(String[] args) {
		// 신발 객체
		// 나이키 홈페이지
		//-------------------
		// 제품명
		// 사이즈
		// 가격
		// 브랜드
		// 신발 정보 출력
		//-------------------
		// 제품명
		// 사이즈
		// 가격
		// 브랜드
		// 신발 정보 출력
		//-------------------
		
		Nike_Shoes1_Main1 s1 = new Nike_Shoes1_Main1();
		s1.name = "나이키 에어맥스 알파 트레이너 3";
		s1.size = 265;
		s1.price = 99000;
		s1.shoseInfo();
		
		Nike_Shoes1_Main1 s2 = new Nike_Shoes1_Main1();
		s2.name = "나이키 디파이 올데이";
		s2.size = 265;
		s2.price = 59300;
		s2.shoseInfo();
		
		s2.test(s2.name);				// 나이키 디파이 올데이
										// 나이키 디파이 올데이
		System.out.println("-------");
		s2.test("zzzz");				// zzzz
		System.out.println("-------");
										// 나이키 디파이 올데이
		// 생성자 오버로딩 
		Nike_Shoes1_Main1 s3 = new Nike_Shoes1_Main1("신발", 265, 95000);
		s3.shoseInfo();
		
	}
}


















