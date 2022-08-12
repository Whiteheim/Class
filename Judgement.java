import java.util.Random;
import java.util.Scanner;

public class Judgement {
//	String name;
//	Me m = new Me();
//	Friend f = new Friend();
//
//	Random r = new Random();
//	Scanner enter = new Scanner(System.in);
//
//	public void start() {
//		System.out.println("김괄식과 박봉팔의 세기의 대결!");
//		System.out.println("홀 짝 경기를 시작하겠습니다!");
//	}
//
//	public int pal(Friend f) {
//		int palsNum = f.num();
//		System.out.println("박봉팔씨는 번호를 고르셨습니다.");
//		return palsNum;
//	}
//
//	public int sik(Me m) {
//		System.out.println("김괄식씨는 번호를 골라주세요!");
//		int myNum = m.num();
//		return myNum;
//	}
//
//	public void compare(int pal, int sik) {
//		for (int i = 0; true; i++) {
//			System.out.printf("%d번째 시도!", i);
//			for (int j = 0; j <= i; j++) {
//				if (pal > sik) {
//					System.out.println("UP");
//
//				} else if (sik < pal) {
//					System.out.println("DOWN");
//				} else if (sik == pal) {
//					System.out.println("CORRECT");
//					System.out.println("축하드립니다!");
//					break;
//				}
//
//			}
//		}
//	}
	// 등장
	public Me callMe() {
		System.out.println("심판 : 홍코너 김팔봉!");
		System.out.println("심판 : 청코너 곽두식!");
		return new Me();

	}

	// 친구에게 답 요구
	public int askFriAns(Friend f) { // 여기서 클래스불러옴
		int FriAns = f.writeFriAns(); // 클래스 안에 있는 메소드 불러오기
		return FriAns; // 리턴
	}

	// 심판이 나에게 답을 요구
	public int askMyAns(Me m) {
		int myAns = m.tellMyAns();
		if (myAns < 1 || myAns > 100) {
			System.out.println("다시 입력해");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMyAns(m);
	}

	// 판정(맞출때 까지)
	public boolean judge(int answer, int myAns) {
		if (answer == myAns) {
			System.out.println("...!");
		} else if (answer > myAns) {
			System.out.println("UP");
		} else if (answer < myAns) {
			System.out.println("DOWN");
		}
		return (answer == myAns);
	} 
	// 시도횟수
	public void countTry(int turn) {
		System.out.println("===================");
		System.out.printf("%d번째 시도끝에 정답\n", turn);
		System.out.println("===================");
	}
	
	public void start(Friend f) {
		Me m = callMe(); // 나를 불러옴
		int answer = askFriAns(f); // 친구의 답
		int myAns = 0; // 내 답의 기본값
		boolean endGame = false; // 판정의 기본값
		for (int turn = 1; true; turn++) {
			myAns = askMyAns(m); // 내 답 입력
			endGame = judge(answer, myAns); // 판정이 True일때 까지
			if (endGame) {
				countTry(turn);//판정이 True가 되면 turn 값과 함께 중단
				break;
			}
		}
	}
	
	
	
	
	
	


}
