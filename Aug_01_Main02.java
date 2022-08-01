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
		
		System.out.println("홀이게 짝이게?");
		String player = game.next();
		System.out.printf("당신의 답은 %s!\n", player);
		
		int n = r.nextInt(10) + 1;
		String answer = n % 2 == 1 ? "홀" : "짝";
		String result = answer.equals(player) ? "정답" : "!정답"; 

		System.out.printf("동전은 %d개, %s\n", n, result);
				

				
	
	
		
	
	
	}
}
