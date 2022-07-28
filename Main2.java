
public class Main2 {
	public static void main(String[] args) {
		// 컴퓨터의 장치
		/* CPU / RAM / HDD / GPU
		 * 
		 * CPU : 연산장치(intel : ix - xxxx/ AMD : RyzenX)
		 * HDD / SSD : 파일 형태로 저장하는 저장장치
		 * 		=> 파일 영구 저장
		 * RAM : 변수 형태로 저장(장치)	
		 * 		=> 임시저장
		 * GPU : 그래픽처리용 (CPU + HDD + RAM를 보조)
		 * 
		 *  데이터 임시 보존시 -> RAM에 변수로 저장
		 *  데이터 영구 보존시 -> HDD에 파일로 저장
 		 */
		
		// 변수 (variable) : 데이터를 저장하는 공간 (그릇)
		// 변수를 만드는 문법
		/*		1. 변수 선언(만들기) - RAM에 공간 확보
		 * 							   무언가를 담을 수 있는 공간을 만듬
		 * 			( 자료형 변수명; )의 형태를 변수를 '선언'했다 라고 표현
		 * 			밥상으로 예시) ( 그릇종류 그릇이름; )
		 * 
		 * 		2. 변수 초기화
		 *      ( 변수명 = 값; )의 형태로 표현
		 *      - 자료형 : 변수가 값으로 저장되어지는 형태
		 *      - 변수명 : 변수의 이름
		 *      String s; : 문자열 (String)을 담을 s(그릇)를 만든 상태
		 *      int i; : 정수(int)를 담을 i(그릇)을 만든 상태
		 *      
		 * 변수 선언과 초기화를 동시에 실행 가능
		 * ( 자료형 변수명 = 값; )의 형태 => '변수를 만든다' 라고 표현
		 *  
		 */
		
		//변수명 짓는 규칙
		//  1. 숫자로 시작 시 에러 발생
		// int i = 3;
		// int 10 = 3; (error)
		// int 10i = 3; (error)
		
		//  2. 특수문자, 띄어쓰기가 들어가면 에러 발생
		// String s = "ㅋㅋ";
		// String ＠ = "ㅋㅋ"; (error)
		// String y y = "ㅋㅋ"; (error)
		
		//  3. 자바문법 (예약어) 사용 시 에러발생
		// int int = 3; (error)
		// int _int = 3; (언더바를 이용해 에러 방지 가능)
		
		// Java 문화 )
		//  4. 변수명을 봐도 파악 가능 하도록 만들기
	    //   ex ) int dfsdgagqwsdas = 2; (x)
		//        int age = 2;
		
		//  5. 가독성을 위해 띄워쓰기가 필요 한 경우
		// ex) int price of computer = 100000;
		//  => 뱀체, 낙타체 이용
		
		// 뱀체 = int price_of_computer = 1000000; (언더바 이용)
		// 낙타체 = int priceOfComputer = 1000000; (띄어쓰기가 필요한 부분에 대문자 사용)
		
		//  6. 변수명으로 한글은 사용 X
		
		
		/*
		 * 변수에서 ' = ' 의 의미 
		 * ' = ' : 대입연산자 
		 * A = B 
		 * 일반적으로) A는 B와 같다 
		 * 프로그래밍) A에 B라는 값을 넣어라
		 */
		
		/* 모든 데이터는 0 or 1로 조합이 되고, 0 or 1이 하나의 bit가 됨.
		 * 		Bit : 데이터를 나타내는 최소 단위
		 * 			  Binary Digit (이진수)
		 * 		Byte : 8bits
		 * 		부호비트 : 맨 앞쪽에 자리하는 bit.
		 * 				 : 0 이면 양수 / 1 이면 음수로 값이 나옴.
		 * 				 : 부호비트를 제외한 나머지 비트에 0 or 1의 값이 들어가고,
		 * 				   나타낼 수 있는 범위는 (부호비트를 제외한) 2의 제곱(이진수 이기 때문)
		 * 				   0을 포함하여 범위를 지정하므로 마지막 범위는 -1 을 해준다. 
		 * 				   ex) -2^7 ~ (2^7-1)
		 */
		
		// 자료형
		/* 		정수
		 * 			byte : -128 ~ 127 (-2^7 ~ (2^7-1))
		 * 			short : 약 -3만 ~ 3만
		 * 			int : 약 -21억 ~ 21억 (주로 사용)
		 * 			long : int를 벗어나는 범위
		 * 
		 * 		실수
		 * 			float : 다른 언어에서 실수를 표현할 때 주로 사용 
		 * 			double  : Java에서 실수를 표현할 때 주로 사용
		 * 
		 * 		문자
		 * 			char
		 * 
		 * 		논리
		 * 			boolean : True / False 로 결과값이 나타남
		 * 
		 * 		없음
		 * 			viod : '없음'
		 */
		
		// 참조형
		/*		기본형이 아닌 것들은 전부 '참조형'에 속함
		 * 		문자열	
		 * 			String : 문자열 (여러 글자)를 저장. 앞에 꼭 대문자 사용
		 */
		char c = 'ㅎ'; // 한 글자를 담는 char , 작은 따옴표 사용
		String s = "ㅎㅎㅎㅎㅎ"; // 여러 글자를 담는 String, 큰 따옴표 사용
		
		int floor;
		floor = 7;
		
		int Floor = 7;
		System.out.printf("수업하는 층은 %d층 이다\n", floor);
		
		int finger = 10;
		String Finger = "손가락";
		System.out.printf("%s은 %d개이다\n", Finger, finger);
		
		int subway = 9;
		double subway2 = 9;
		System.out.println(subway2);
		System.out.println(subway);
		// double에 int 값을 넣는것이 가능 / 9.0 은 9로 표현 가능하기 때문
		
		// 자료형을 쓰면 변수를 만드는 것 까지 포함함
		int a = 10; // a라는 변수 만들기 + a에 값(10) 넣기
		
		
		// 자료형을 쓰지 않으면 변수 수정 가능
		int A;
		A = 10;
		A = 20;
		
		// python : 언어가 자동으로 자료형을 맞춰줌 (Java 대비 고급 언어)
		// 	자료형을 python이 알아서 선택
		// a = 10 => 중복되는 변수가 없으면 a를 만들어 10을 넣어줌
		// a = 10 => 중복되는 변수가 있으면 a의 값을 바꾸는 형태
		
		// 변수끼리도 계산 가능
		System.out.println(floor + finger);
		
		// 메모리(RAM)의 영역
		/*  1. Stack : 실행시 화면에 나타나는 영역
		 * 			   프로그램이 종료되면 자동으로 정리
		 * 			   밑에서 부터 자료가 차곡차곡 쌓임 (기본형 자료)
		 * 
		 * 	2. Heap : 변수로 저장된 데이터들의 저장소 / Stack으로 불러내어 질 때 변수 자체가 불러내어짐
		 * 			  프로그램이 종료되어도 여전히 남아있음 (수동으로 정리(과거))
		 * 			  컴퓨터가 적당하다고 판단한 위치에 저장됨
		 *
		 * 		  ☆ Garbage Collection(Collector) : Heap 영역을 자동으로 정리해주는 시스템
		 *
		 *  3. 미지의 영역 : 알 수 없음
		 */
		
		
		
		
		
		
	}
}















































































