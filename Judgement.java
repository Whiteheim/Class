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
//		System.out.println("����İ� �ں����� ������ ���!");
//		System.out.println("Ȧ ¦ ��⸦ �����ϰڽ��ϴ�!");
//	}
//
//	public int pal(Friend f) {
//		int palsNum = f.num();
//		System.out.println("�ں��Ⱦ��� ��ȣ�� ���̽��ϴ�.");
//		return palsNum;
//	}
//
//	public int sik(Me m) {
//		System.out.println("����ľ��� ��ȣ�� ����ּ���!");
//		int myNum = m.num();
//		return myNum;
//	}
//
//	public void compare(int pal, int sik) {
//		for (int i = 0; true; i++) {
//			System.out.printf("%d��° �õ�!", i);
//			for (int j = 0; j <= i; j++) {
//				if (pal > sik) {
//					System.out.println("UP");
//
//				} else if (sik < pal) {
//					System.out.println("DOWN");
//				} else if (sik == pal) {
//					System.out.println("CORRECT");
//					System.out.println("���ϵ帳�ϴ�!");
//					break;
//				}
//
//			}
//		}
//	}
	// ����
	public Me callMe() {
		System.out.println("���� : ȫ�ڳ� ���Ⱥ�!");
		System.out.println("���� : û�ڳ� ���ν�!");
		return new Me();

	}

	// ģ������ �� �䱸
	public int askFriAns(Friend f) { // ���⼭ Ŭ�����ҷ���
		int FriAns = f.writeFriAns(); // Ŭ���� �ȿ� �ִ� �޼ҵ� �ҷ�����
		return FriAns; // ����
	}

	// ������ ������ ���� �䱸
	public int askMyAns(Me m) {
		int myAns = m.tellMyAns();
		if (myAns < 1 || myAns > 100) {
			System.out.println("�ٽ� �Է���");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMyAns(m);
	}

	// ����(���⶧ ����)
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
	// �õ�Ƚ��
	public void countTry(int turn) {
		System.out.println("===================");
		System.out.printf("%d��° �õ����� ����\n", turn);
		System.out.println("===================");
	}
	
	public void start(Friend f) {
		Me m = callMe(); // ���� �ҷ���
		int answer = askFriAns(f); // ģ���� ��
		int myAns = 0; // �� ���� �⺻��
		boolean endGame = false; // ������ �⺻��
		for (int turn = 1; true; turn++) {
			myAns = askMyAns(m); // �� �� �Է�
			endGame = judge(answer, myAns); // ������ True�϶� ����
			if (endGame) {
				countTry(turn);//������ True�� �Ǹ� turn ���� �Բ� �ߴ�
				break;
			}
		}
	}
	
	
	
	
	
	


}
