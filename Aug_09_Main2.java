import java.util.Scanner;

// 1을 입력하면 학생 수 값을 입력 받을 수 있도록
// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있도록 (점수범위 고려 x)
// 3을 입력하면 학생들의 점수 리스트 출력할 수 있게(1번 학생의 점수는 xx점)
// 4를 입력하면 최고점과 평균점수를 분석해서 출력 할 수 있게
// 5를 입력하면 프로그램 종료
// 5를 누르기 전 까지 반복되도록
public class Aug_09_Main2 {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int num = 0;
		int student = 0;
		int[] score = null;
		a : while (true) {
			System.out.println("번호를 입력하세요 : ");
			num = enter.nextInt();
			if (num == 1) {
				System.out.println("--------------------------");
				System.out.print("학생 수 : ");
				student = enter.nextInt();
				score = new int[student];
				System.out.println("--------------------------");
			} else if (num == 2) {
				System.out.println("--------------------------");
				for (int i = 0; i < score.length; i++) {
					System.out.print("학생의 점수 :");
					score[i] = enter.nextInt();
				}
				System.out.println("--------------------------");
			} else if (num == 3) {
				System.out.println("--------------------------");
				int index = 1;
				for (int i : score) {
					System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
				}
				System.out.println("--------------------------");
			} else if (num == 4) {
				System.out.println("--------------------------");
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i : score) {
					sum += i;
					max = (max < i) ? i : max;
				}
				avg = (double) sum / score.length;
				System.out.printf("최고점 : %d\n", max);
				System.out.printf("총점 : %d\n", sum);
				System.out.printf("평균 : %.1f\n", avg);
				System.out.println("--------------------------");
			} else if (num == 5) {
				break a;
			}
		}
	}
}
