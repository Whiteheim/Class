import java.util.Random;
import java.util.Scanner;

// UP & DOWN game 
// ��ǻ�� : 1~100������ ����
// ������ �� �Է�
//		1try : 50-> down
//		2try : 20-> UP
//		...
//		10try : ���� ! �� ����
public class Aug_10_ex {

	public static int com() {
		Random r = new Random();
		int com = r.nextInt(100) + 1;
		return com;
	}
	
	public static int user() {
		Scanner k = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("1~100������ ���ڸ� ��� �ּ���.");
		System.out.println("===============================");
		int user = k.nextInt();
		if (user < 1) {
			System.out.println("1 �̻��� ���� �Է��� �ּ���.");
		} else if (user > 100) {
				System.out.println("100 ������ ���� �Է��� �ּ���.");
		}
		return user >= 1 && user <= 100 ? user : user();
	}
	// ���� ���� Ȯ�� & �ݺ��� ���� �������� �Լ�
//	public static boolean checkAnswer(int com, int user) {
//		if (com == user) {
//			System.out.println("����");
//			//return true;			// ������ �� true���� �����ϸ� ����
//		} else if (com > user) {
//			System.out.println("up");
//			//return false;			// ������ �ƴ� �� false ���� ���� �ϸ� ������ ����
//		} else {
//			System.out.println("down");
//			//return false;
//		}
//		return (com == user); // ������ ������ true���� ����, �ٸ��� false���� ����
//	}
//	// �ݺ��ϴ� �Լ�
//	public static void printResult(int com, int user) {
//		int turn = 0;
//		while (true) {
//			turn++;
//			user = user();
//			if (checkAnswer(com, user)) { // ()���� ���� true�� �� if ���� ���
//				System.out.printf("%d�� ���� ����!\n", turn);
//				break;
//			}
//		}
//	}
//	
	
	
	
	
	public static void play(int com) {
		for (int i = 1; true ; i++) {
			int user = user();
			System.out.printf("���� �� ���� : %d\n", user);
			if (com > user) {
				System.out.printf("%d��° �õ� : UP \n", i);
			} else if (com < user) {
				System.out.printf("%d��° �õ� : Down\n", i);
			} else {
				System.out.printf("%d��° �õ� : Correct!\n", i);
				System.out.printf("��ǻ�Ͱ� �� ���ڴ� %d �̾����ϴ�.\n", com);
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
