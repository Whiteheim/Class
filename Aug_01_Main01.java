import java.util.Scanner;

public class Aug_01_Main01 {
	public static void main(String[] args) throws InterruptedException {
		Scanner A = new Scanner(System.in);
		
	System.out.print("���� : ");
	double height = A.nextDouble();
	System.out.print("ü�� : ");
	double weight = A.nextDouble();
	
	double aweight = (height - 100) * 0.9;
	System.out.printf("ǥ��ü�� = %.2f\n", aweight);
	
	Thread.sleep(300);
	String BMI = (weight / aweight) * 100 > 120 ? "��\n" : "!��\n";
	System.out.printf(BMI);
	
	System.out.println("�ƹ� Ű�� �Է��Ͻø� ���� �մϴ�.");
	String anykey = A.next();
	A.close();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
