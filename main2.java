import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		
		
		System.out.print("국어 : ");
		int Korean = test.nextInt();
		
		System.out.print("영어 : ");
		int English = test.nextInt();
		
		System.out.print("수학 : ");
		int math = test.nextInt();
		
		System.out.print("사회 : ");
		int society = test.nextInt();
		
		System.out.print("과학 : ");
		int science = test.nextInt();
		
		
		System.out.println("\t시험 결과\t");
		System.out.printf("국어 : %d점\n", Korean);
		System.out.printf("영어 : %d점\n", English);
		System.out.printf("수학 : %d점\n", math);
		System.out.printf("사회 : %d점\n", society);
		System.out.printf("과학 : %d점\n", science);
		System.out.printf("총점 : %d점\n", Korean + English + math + society + science);
		System.out.printf("평균 : %.1f점\n", (double) (Korean + English + math + society + science) / 5);
		// 형태변환으로 괄호 안에 자료형을 집어넣음.
	}
}
