// 라이브러리용 Class (API : Application Program Interface)
//		: 다른 Class에서 이용할 목적
// 프로그램에서 실행되는 Class가 여러개, 단 하나를 빼고는 전부 라이브러리용으로 사용
//		: 제외됐던 하나의 Class는 실행용이 됨 
public class Student {
	
	// 멤버번수 (Member Variable) / 필드 (Field)
	// 			: 객체의 데이터가 저장되는 곳
	// 			: 변수와 비슷하게 생겼지만 변수가 아님
	// 				- 변수 : 생성자, 메소드 내 에서만 사용
	// 						생성자, 메소드가 실행이 종료되면 변수도 자동으로 종료
	// 				- 필드 : 생성자, 메소드 전체에서 사용이 가능
	//				 		객체가 소멸 되지 않는 한, 객체와 함께 공존하게됨
	
	// 초기값이 지정되지 않은 멤버변수는 객체 생성시 자동으로 기본 초기값을 설정
	
	int studentId;
	String studentName;
	String studentAdress;
	
	// method (메소드) : 객체의 동작에 해당하는 실행 블록
	//		- 블록 (중괄호) : 이름 붙인 것이 method명 (like 동사)
	//		- 메소드 호출 시, 메소드 영역 안의 모든 코드를 일괄적으로 실행
	//		- 객체간 데이터 전달 수단
	public void showStudentInfo() {
		System.out.println(studentName + " " + studentAdress);
	}
	
}
