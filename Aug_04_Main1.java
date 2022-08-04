import java.util.Scanner;

public class Aug_04_Main1 {
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = enter.nextInt();
		
		String grade = "";
		switch (score / 10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;

		default:
			grade = "F";
			break;
		}
		System.out.println(grade);
				
	}
}
