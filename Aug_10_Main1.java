// 최근에는 알고리즘 보다 유지보수에 조금 더 집중하는 중
// 유지보수를 위해 방법이 조금 수정됨


// 절차지향 프로그래밍(Procedural Programming, PP)
// 		순서대로 프로그래밍 해서 결과를 내자
//		변수 하나 덜 쓰고, 효율적으로 코드를 짜는 방법 공부
// 		조건문, 반복문, ...etc
//		장점 : 처리, 실행속도가 빠르다

// 객체지향 프로그래밍(Object-Oriented Programming, OOP)
// 		실생활을 표현 / 묘사 (현실을 모델링 하는 기법)
//		소스코드 보기가 더 편함
//		유지 / 보수에 용이
// 		장점 : 코드의 재 사용성, 유지보수 용이, 대규모 프로젝트에 적합

public class Aug_10_Main1 {
	public static void main(String[] args) {
// 강의장이 있는 건물 1층 => 카페
// 그 카페의 정보표현하려고 함.
// 이름은 할로나
// 위치는 건물 1층
// 강의장과의 거리는 61.7m
		String name = "할로나";
		String locate = "건물 1층";
		double distance = 61.7;
		
		System.out.printf("카페의 이름은 %s 이고, %s 에 위치해 있다.\n", name, locate);
		System.out.printf("강의실과 카페의 거리는 %.1fm정도 떨어져 있다.\n", distance);
		System.out.println("------------------------------------------------");
		// OOP로 할로나 표현
		// 객체(Object) : 실생활에 존재하는 모든 것 (= 인스턴스(instance))
		// 		붕어빵을 만드려면 붕어빵 틀이 필요
		// 		객체를 만드려면 'Class'라는 것이 필요함
		// 객체를 사용해서 하나의 완성품을 만들어내는 프로그래밍 기법
		// 		=> 객체지향 프로그래밍
		// 		=> class 를 많이 필요로 하게됨
		// r객체 c
		Cafe c = new Cafe();
		c.name = "할로나";
		c.Location = "건물 1층";
		c.distance = 61.7;
		System.out.println(c.name);
		System.out.println(c.Location);
		System.out.println(c.distance);
 	}
}












































