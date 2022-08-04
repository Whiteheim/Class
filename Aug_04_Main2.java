import java.util.Scanner;

// 평일 스케쥴 출력 프로그램
// 시간 입력 -> 해당시간에 속하는 내용 출력
// 		=> 입력한 시간이 시간 내의 범위가 아니면 다시 입력

public class Aug_04_Main2 {

	public static int time() {
		Scanner enter = new Scanner(System.in);
		System.out.println("시간을 입력하세요.(24h) : ");
		int time = enter.nextInt();
		return (time <= 24 && time >= 0) ? time : time();
	}

	public static String schedule(int a) {
		String s = "";
		if (a >= 9 && a <= 18) {
			if (a == 9 || a == 14 || a == 18) {
				return s = "QR 찍기";
			} else if (a >= 12 && a <= 13) {
				return s = "점심";
			}
			return s = "학원에서 공부";
		} else if (a >= 18 && a <= 24) {
			if (a <= 24) {
				if (a <= 20) {
					return s = "귀가";
				}
				return s = "여가";
			}
		} else if (a >= 0 && a < 9) {
			if (a <= 6) {
				return s = "취침";
			} else {
				return s = "기상 + 씻기 + 학원출발";
			}

		}
		return s;

	}

	public static void main(String[] args) {
		int schedule = time();
		String day = schedule(schedule);
		System.out.printf("%d시 에는 %s 시간입니다.", schedule , day);

	}

}
