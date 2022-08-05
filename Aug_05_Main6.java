import java.util.Scanner;

public class Aug_05_Main6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
			System.out.println("안녕하세요1");
		
		}
		System.out.println("==============");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("wow");
			} else {
				//continue; -> 강제반복 (턴 종료) -> 홀 수 일때는 무시하고 다음으로
				break;    //-> (공식적) 반복문이 끝남  
				//return;   -> (비공식적) 반복문이 끝남 // 함수를 만들 때 함수를 멈추는 기능 
				// 				반복문에서도 사용 가능
			}
		}
		System.out.println("==============");
		Scanner enter = new Scanner(System.in);
	
		String a = null;
		while (true) {
			System.out.print("내용을 입력하세요 : ");
			a = enter.next();
			System.out.println(a);
			if (a.equals("ㅎㅇ")) {
				break;
			}
		}
	
	
	
	
	
	}
}
