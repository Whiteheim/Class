import java.util.Random;
import java.util.Scanner;

// UP & DOWN game 
// 컴퓨터 : 1~100사이의 숫자
// 유저가 답 입력
//		1try : 50-> down
//		2try : 20-> UP
//		...
//		10try : 정답 ! 후 종료
public class Aug_10_ex {

	public static int com() {
		Random r = new Random();
		int com = r.nextInt(100) + 1;
		return com;
	}
	
	public static int user() {
		Scanner k = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("1~100사이의 숫자를 골라 주세요.");
		System.out.println("===============================");
		int user = k.nextInt();
		if (user < 1) {
			System.out.println("1 이상의 수를 입력해 주세요.");
		} else if (user > 100) {
				System.out.println("100 이하의 수를 입력해 주세요.");
		}
		return user >= 1 && user <= 100 ? user : user();
	}
	// 정답 유무 확인 & 반복문 유지 유무설정 함수
//	public static boolean checkAnswer(int com, int user) {
//		if (com == user) {
//			System.out.println("정답");
//			//return true;			// 정답일 때 true값을 리턴하며 종료
//		} else if (com > user) {
//			System.out.println("up");
//			//return false;			// 정답이 아닐 대 false 값을 리턴 하며 게임을 진행
//		} else {
//			System.out.println("down");
//			//return false;
//		}
//		return (com == user); // 조건이 맞으면 true값을 리턴, 다르면 false값을 리턴
//	}
//	// 반복하는 함수
//	public static void printResult(int com, int user) {
//		int turn = 0;
//		while (true) {
//			turn++;
//			user = user();
//			if (checkAnswer(com, user)) { // ()안의 수가 true일 때 if 문이 재상
//				System.out.printf("%d번 만에 정답!\n", turn);
//				break;
//			}
//		}
//	}
//	
	
	
	
	
	public static void play(int com) {
		for (int i = 1; true ; i++) {
			int user = user();
			System.out.printf("내가 고른 숫자 : %d\n", user);
			if (com > user) {
				System.out.printf("%d번째 시도 : UP \n", i);
			} else if (com < user) {
				System.out.printf("%d번째 시도 : Down\n", i);
			} else {
				System.out.printf("%d번째 시도 : Correct!\n", i);
				System.out.printf("컴퓨터가 고른 숫자는 %d 이었습니다.\n", com);
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		int com = com();
		play(com);
		
//		int user = 0;
//		printResult(com, user);
	}
	
}
