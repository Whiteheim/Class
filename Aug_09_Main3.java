import java.util.Scanner;

public class Aug_09_Main3 {
	/*
	 * static Scanner enter = new Scanner(System.in);
	 * 
	 * public static int choose() { 
	 * 		System.out.println("번호를 입력하세요");
	 * 		System.out.println("1 ~ 5"); 
	 * 		int choose = enter.nextInt(); 
	 * 		return choose; 
	 * 	}
	 * 
	 * public static int student() { 
	 * 		System.out.println("학생은 몇명입니까?"); 
	 * 		int student = enter.nextInt(); 
	 * 		return student; 
	 * 	}
	 * 
	 * public static int[] score(int a) { 
	 * 		int[] score = null;
	 * 		System.out.println("점수를 입력하세요 : "); 
	 * 		score[a] = enter.nextInt(); 
	 * 		for (int i = 0; i < a; i++) { 
	 * 		System.out.printf("%d학생의 점수는 %d점 입니다.", i + 1, score); 
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
	 * 		result = "최대점수 : " max", 총 계 : d%, 평균 : %d"; return result;
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
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수 리스트| 4. 분석 | 5. 종료");
		System.out.println("==========================================");
	}

	public static int getSelectNo() {
		Scanner enter = new Scanner(System.in);
		System.out.print("선택 >");
		int select = enter.nextInt();
		return select;
	}

	public static int getStudentNum() {
		Scanner enter = new Scanner(System.in);
		System.out.print("학생수 : ");
		int studentNum = enter.nextInt();
		return studentNum;
	}

	public static int getScore() {
		Scanner enter = new Scanner(System.in);
		int score = enter.nextInt();
		if (score > 100) {
			System.out.println("점수는 100점을 넘을 수 없습니다.");
			System.out.println("다시 입력 : ");
		} else if (score < 0) {
			System.out.println("점수는 00점보다 낮을 수 없습니다.");
			System.out.println("다시 입력 : ");

		}
		return (score >= 0 && score <= 100) ? score : getScore();

	}

	public static int[] getScore(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생 점수 입력 : ", i + 1);
			scores[i] = getScore();
		}
		return scores;
	}

	// 점수 출력
	public static void printScore(int[] scores) {
		int index = 1;
		for (int i : scores) {
			System.out.printf("%d번 학생 점수 : %d점 \n", index++, i);
		}
	}

	// 최대값 평균값
	public static void printStats(int[] scores) {
		int sum = 0;
		int max = 0;
		double avg = 0;
		for (int i : scores) {
			sum += i;
			max = (max < i) ? i : max;
			avg = (double) sum / scores.length;
		}
		System.out.printf("최고 점수 : %d점\n", max);
		System.out.printf("평균 점수 : %.1f점\n", avg);
	}

	// 종료 메시지
	public static void end() {
		System.out.println("종료합니다");
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
				scores = new int[studentNo]; // 학생의 수 만큼 배열의 크기를 정함
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
				System.out.println("입력이 잘못되었습니다.");
				System.out.println("다시 입력 해주세요.");
			}
		}
	}

	public static void main(String[] args) {
		activate();
	}

}
