import java.util.Random;

public class Friend {
//	int fNum;
	Random brain = new Random();
//	public int num() {
//		return r.nextInt(100) + 1;
//	}
//	
	public int writeFriAns() {
		int think = brain.nextInt(100) + 1;
		// 친구가 머리속으로 숫자하나를 생각함
		// 숫자를 종이에 적어 답을 제출 한 상황
		System.out.println("팔봉이가 답을 제출했습니다.");
		return think;
	}
}
