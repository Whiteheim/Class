import java.util.Random;
import java.util.Scanner;

public class Aug_01_Main02 {
	public static void main(String[] args) {
		
		//int i = r.nextInt();
		//int i2 = r.nextInt(5);
		//int i3 = r.nextInt(5)+1;
		
		//System.out.println(i);
		//System.out.println(i2);
		//System.out.println(i3);
		
		
		Scanner game = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Ȧ�̰� ¦�̰�?");
		String player = game.next();
		System.out.printf("����� ���� %s!\n", player);
		
		int n = r.nextInt(10) + 1;
		String answer = n % 2 == 1 ? "Ȧ" : "¦";
		String result = answer.equals(player) ? "����" : "!����"; 

		System.out.printf("������ %d��, %s\n", n, result);
				

				
	
	
		
	
	
	}
}
