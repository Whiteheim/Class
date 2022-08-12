
// 1. 기계어 상태의 소스가 stack 영역에 쌓이게됨
// 2. static 멤버변수들이 static 영역에 배치
// 3. JVM이 Main2.main(...); 를 호출
// 4. 실행

public class Aug_12_Main2 {
	public static void main(String[] args) {
		//과자 객체
		// 과자 이름, 중량, 가격
		// 출력
		
		// main에 과자의 객체가 없는 상태
		// 과자 이름 -> 모름
		// 과자 무게 -> 모름
		// 과자 가격 -> 모름
		// 생산자 -> 김비버
		
//		System.out.println(Snack.MANUFACTUTER);
//		System.out.println("----------------");
		
		Snack_Main2 s1 = new Snack_Main2();
		s1.name = "화이트하임";
		s1.weight = 300;
		s1.price = 3500;
		s1.printSnack();
	
		System.out.println("----------------");
		
		Snack_Main2 s2 = new Snack_Main2();
		s2.name = "자가비";
		s2.weight = 60;
		s2.price = 1500;
		s2.printSnack();
		
		System.out.println("----------------");
		
//		s2.MANUFACTUTER = "최비버";
//		s2.printSnack();
//		System.out.println("----------------");
		
//		s2.MANUFACTUTER = "초이비버"; // 에러발생
		
		Snack_Main2.printtaste();
		
		
		
		
		
		
	}
}
