import java.util.Random;
import java.util.Scanner;

public class Aug_05_Main2 {

	
	public static void main(String[] args) {
		Random r = new Random();
		int c = r.nextInt(100) + 1;

		Scanner enter = new Scanner(System.in);
		for (int i = 1; true ; i++) { // �ݺ� Ƚ���� ���������� ������ ���� ���� x or true �Է�
			System.out.println("���ڸ� �Է��ϼ���");
			int p = enter.nextInt();
			if (c > p) {
					System.out.println("UP");
				} else if (c < p) {
					System.out.println("Down");
				} else {
					System.out.println("Correct");
					System.out.printf("%d�� �õ� \n",i);
					break;
				}
	
		}		
		
		
		
	}
	
}
