import java.util.Random;

public class Aug_02_Main2 {
	public static void print_random() { // 정수를 random으로 '출력' 하는 함수
		Random r = new Random(); // 정수를 random으로 뽑을 준비
		int r_num = r.nextInt();
		System.out.println(r_num);
	}
	
	public static int creat_random() { // 정수를 random으로 '생성'(구하는) 함수 => 정수를 '생성'하는 것이 목표
		Random r = new Random();
		int r_num = r.nextInt();
		return r_num; // r_num에 있는 값을 뱉어냄
					  // 뱉어낸 후 함수는 종료
				
	} 
	public static void print_c(int a) {
		char result = (a % 2 == 0) ? '짝' : '홀';
		System.out.printf("%d은(는) %c\n", a, result);
	}
	
	public static String bigger_i(int a, int b) {
		String front_behind = (b >= a) ? "뒤" : "앞";
		return front_behind;
	}
		
	//JVM -> main함수를 자동으로 호출해 실행 시킴
	public static void main(String[] args) {
		print_random();
		int r_num = creat_random();
		int r_num2 = creat_random();
		System.out.println(r_num);
		print_c(r_num);
		print_c(r_num2);
		String front_behind = bigger_i(r_num , r_num2);
		System.out.println(front_behind);
		String menu = (front_behind.equals("앞")) ? "초밥" : "짜장면";
		// String menu = (r_num > r_num2) ? "초밥" : "짜장면";
		System.out.println(menu);
			
		
		
		
	
	}
}