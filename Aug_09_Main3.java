import java.util.Scanner;

public class Aug_09_Main3 {
	/*
	 * static Scanner enter = new Scanner(System.in);
	 * 
	 * public static int choose() { 
	 * 		System.out.println("��ȣ�� �Է��ϼ���");
	 * 		System.out.println("1 ~ 5"); 
	 * 		int choose = enter.nextInt(); 
	 * 		return choose; 
	 * 	}
	 * 
	 * public static int student() { 
	 * 		System.out.println("�л��� ����Դϱ�?"); 
	 * 		int student = enter.nextInt(); 
	 * 		return student; 
	 * 	}
	 * 
	 * public static int[] score(int a) { 
	 * 		int[] score = null;
	 * 		System.out.println("������ �Է��ϼ��� : "); 
	 * 		score[a] = enter.nextInt(); 
	 * 		for (int i = 0; i < a; i++) { 
	 * 		System.out.printf("%d�л��� ������ %d�� �Դϴ�.", i + 1, score); 
	 * 		}
	 * 		return score; 
	 * 	}
	 * 
	 * public static String result(int[] a) { 
	 * 		String result = ""; 
	 * 		int max = 0; 
	 * 		int	avg = 0; 
	 * 		int sum = 0; 
	 * 		for (int i = 0; i < a.length; i++) { 
	 * 			if (max < a[i]) {
	 * 				 max = a[i]; 
	 * 				 sum += a[i]; 
	 * 				 avg = sum / a.length; 
	 * 			}
	 * 		} 
	 * 		result = "�ִ����� : " max", �� �� : d%, ��� : %d"; return result;
	 *  }
	 * 
	 * 
	 * public static void main(String[] args) { 
	 * 		int choose = choose(); 
	 * 		int student = student(); 
	 * 		int[] score = score(student()); 
	 * 		while (true) { 
	 * 			switch (choose) {
	 * 				case 1:
	 * 				 choose(); 
	 * 					break; 
	 * 				case 2: 
	 * 				 student(); 
	 * 					break; 
	 * 				case 3:
	 * 				 System.out.println(score); 
	 * 				 break; 
	 * 				case 4: 
	 * 				 result(score(student));
	 	  			 break;
	 * 				case 5: 
	 * 				 break; 
	 * 			} 
	 * 		}
	 * 	 }
	 */

	public static void start() {
		System.out.println("==========================================");
		System.out.println("1. �л��� | 2. �����Է� | 3. ���� ����Ʈ| 4. �м� | 5. ����");
		System.out.println("==========================================");
	}

	public static int getSelectNo() {
		Scanner enter = new Scanner(System.in);
		System.out.print("���� >");
		int select = enter.nextInt();
		return select;
	}

	public static int getStudentNum() {
		Scanner enter = new Scanner(System.in);
		System.out.print("�л��� : ");
		int studentNum = enter.nextInt();
		return studentNum;
	}

	public static int getScore() {
		Scanner enter = new Scanner(System.in);
		int score = enter.nextInt();
		if (score > 100) {
			System.out.println("������ 100���� ���� �� �����ϴ�.");
			System.out.println("�ٽ� �Է� : ");
		} else if (score < 0) {
			System.out.println("������ 00������ ���� �� �����ϴ�.");
			System.out.println("�ٽ� �Է� : ");

		}
		return (score >= 0 && score <= 100) ? score : getScore();

	}

	public static int[] getScore(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d�� �л� ���� �Է� : ", i + 1);
			scores[i] = getScore();
		}
		return scores;
	}

	// ���� ���
	public static void printScore(int[] scores) {
		int index = 1;
		for (int i : scores) {
			System.out.printf("%d�� �л� ���� : %d�� \n", index++, i);
		}
	}

	// �ִ밪 ��հ�
	public static void printStats(int[] scores) {
		int sum = 0;
		int max = 0;
		double avg = 0;
		for (int i : scores) {
			sum += i;
			max = (max < i) ? i : max;
			avg = (double) sum / scores.length;
		}
		System.out.printf("�ְ� ���� : %d��\n", max);
		System.out.printf("��� ���� : %.1f��\n", avg);
	}

	// ���� �޽���
	public static void end() {
		System.out.println("�����մϴ�");
		System.out.println("==========================================");
	}

	public static void activate() {
		int selecNo = 0;
		int studentNo = 0;
		int[] scores = null;
		while (true) {
			start();
			selecNo = getSelectNo();
			if (selecNo == 1) {
				studentNo = getStudentNum();
				scores = new int[studentNo]; // �л��� �� ��ŭ �迭�� ũ�⸦ ����
			} else if (selecNo == 2) {
				getScore(scores);
			} else if (selecNo == 3) {
				printScore(scores);
			} else if (selecNo == 4) {
				printStats(scores);
			} else if (selecNo == 5) {
				end();
				break;
			} else {
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
				System.out.println("�ٽ� �Է� ���ּ���.");
			}
		}
	}

	public static void main(String[] args) {
		activate();
	}

}
