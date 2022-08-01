import java.util.Scanner;

//함수 (Function)
//		관련 있는 기능(작업)들을 묶어 필요시 사용.

// 초기 OS 들은 언어파일을 같은 OS(운영체제) 끼리만 공유 가능 (windows<=>windows)
// Java 등장 이후 JVM에서 다른 OS끼리 언어파일 공유하는 기능 제공
// JDK (자바 개발 키트) > JRE (자바 실행 환경)
// 프로그램 실행 시 JRE가 OS에 맞춰 JVM(자바 가상 머신) 생성
//		-> WORA (Write Once Read Anywhere) - Java의 장점 중 하나 
// 		OS마다의 프로그램을 만들지 않아도 되는 기능 제공

//형태
/* public static '리턴 타입 함수 명'(파라미터, 파라미터, ...) {
 * 	내용
 * 	return
 * }
 */
// 리턴 타입 : 반환 될 값의 자료형
//		함수 내에서 식이 완성이 되고, main으로 반환 할 결과값에 대한 자료형
// 		return 을 사용해서 반환

// 함수명 : 함수의 이름
/* 		1. 숫자 -> 에러 발생
 * 		2. 특수문자 , 띄어쓰기 -> 에러 발생
 * 		3. Java문법 (예약어) -> 에러 발생
 * 			=> '_' 사용해서 에러를 방지
 * 		4. 함수명을 봐도 어떤 기능인지 알 수 있도록 작명
 * 		5. 소문자로 시작
 * 		6. 가독성을 위해 뱀체 / 낙타체 사용
 * 		7. 한글 사용 x 
 * 	
 * 변수명과 함수명의 작명 차이
 *  변수명 : 명사
 *  함수명 : 동사
 */

// 파라미터 (인자, parameter) : 함수를 실행하는데 필요한 재료
// 필요한 갯수만큼 사용하되, 자료형에 맞춰 사용

public class Aug_01_Main03 {
	// 실행 시 JVM이 main을 자동으로 호출

	//           (↓리턴타입)
	public static void mythink() {
		System.out.println("????????????");

	}

	public static void myinformation() {
		System.out.println("이름 : 강성훈");
		System.out.println("사는곳 : 성남");
		System.out.println("H.P : 01054776046");

	}
//						    (parameter)
	public static void calculation(int x, int y) {
			
		int sum = x + y;
		int minus = x - y;
		int multiply = x * y;
		double devide = x / (double) y;
		
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(devide);
		
	}
	
	public static void main(String[] args) {

		mythink();
		myinformation();
		calculation(10, 5);
		calculation(8, 3);
	}

}














