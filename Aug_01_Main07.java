import java.util.Scanner;

public class Aug_01_Main07 {
	//			  (↓return 할 값이 없어서 void 사용)
	public static void make_errand() {
		System.out.println("Mom : 라면, 참치캔, 잔돈");
		System.out.println("Mom : 저기 지갑에서 꺼내가.");
	}
	public static int mymoney(){
		System.out.print("필요한 금액을 입력하세요. : ");
		Scanner money = new Scanner(System.in);
		int gold = money.nextInt();
		System.out.printf("엄마가 준 %dG을(를) 손에 넣었다!\n", gold);
		return gold;
		//정수(int)에 대한 값을 main함수에 return(반환) 할것이기때문에
		//return type을 int 로 선택
	}
	
	public static void cost(int gold){
			int a = 3200;
			int b = 2170;
			int c = 1500;
			// 계산하는 함수
			//  계산을 위해 '받아온 돈이 필요'
			// 	그 돈은 patameter로 받아옴.
			System.out.printf("라면, 참치캔, 과자을(를) 사면 %dG이(가) 남네\n", gold - (a + b + c));
			
	}
	public static int givemoney(int cost) {
		int a = 3200;
		int b = 2170;
		int c = 1500;
		int d = 3000; //삥땅칠거
		
		int rest = cost - (a + b + c + d);
		return rest;
	}
	
	
	
	public static void main(String[] args) {
		make_errand();
		int gold = mymoney(); 
		// System.out.println(gold);
		cost(gold);
		int rest = givemoney(gold);
		System.out.println(rest);
		
	}
	
	
	// 함수 사용 이유
	/*
	 * 가독성
	 * 오류 발견 용이
	 * 역할 나눔
	 * 다른 main에서 함수 재사용 가능
	 */
		
	// main 함수에 코드를 최대한 짧게 구성하기 위해
	// 기능들을 묶어 '함수' 로 사용
	// 기능을 나누어 효율적으로 사용
	
	
	
	
	
	
	
	
	
		
	}




