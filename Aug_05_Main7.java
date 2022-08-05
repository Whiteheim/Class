import java.util.Scanner;

// Java Part1 : 절차지향 프로그래밍 (순서대로 잘 써서 결과를 잘 내자)
//		Part2 : 객체지향 프로그래밍
// 		Part3 : 기타 등등..(외부 라이브러리)

// '정보올림피아드 문제'

public class Aug_05_Main7 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		String job = null;
		 a : while (true) { // 반복문에 이름 붙이기 -> 반복문 앞에 [name :]
			 System.out.print("매니저 / 강사 / 학생 :  ");
			 job = enter.next();
			 System.out.println(job);
			switch (job) {
			case "매니저":
				System.out.println("시스템 관리");
			case "강사":
				System.out.println("학생관리");
			case "학생":
				System.out.println("수업 관련 업무");
				break;	// 무조건 가까운 문단 (이 경우는 switch)종료 
			case "끝":
				break a; // break + 반복문의 이름을 붙이면 반복문이 종료가 됨.
								
 
			}
		}
		
		bb : for (int i = 0; i < 3; i++) {
			aa : for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					System.out.printf("%d %d %d\n", i, j, j2);
					if (i == 1) {
						System.out.println("중단");
						break; //j3 반복문이 멈추고 if는 작용이 됨 100 ->110 ->120 ->200 ->201
						//break aa; //100 후 중단이 표기되고 바로 200으로 넘어감
						//break bb; //100 후 중단 표기 후 끝남
					}
				}
			}
		} 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
