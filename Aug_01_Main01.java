import java.util.Scanner;

public class Aug_01_Main01 {
	public static void main(String[] args) throws InterruptedException {
		Scanner A = new Scanner(System.in);
		
	System.out.print("신장 : ");
	double height = A.nextDouble();
	System.out.print("체중 : ");
	double weight = A.nextDouble();
	
	double aweight = (height - 100) * 0.9;
	System.out.printf("표준체중 = %.2f\n", aweight);
	
	Thread.sleep(300);
	String BMI = (weight / aweight) * 100 > 120 ? "비만\n" : "!비만\n";
	System.out.printf(BMI);
	
	System.out.println("아무 키나 입력하시면 종료 합니다.");
	String anykey = A.next();
	A.close();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
