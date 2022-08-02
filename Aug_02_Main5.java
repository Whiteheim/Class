import java.util.Random;
import java.util.Scanner;

public class Aug_02_Main5 {
	public static int howManyCoin() {
		Random c = new Random();
		int coin = c.nextInt(10) + 1;
		return coin;
	}
	
	public static int players() {
		Scanner p = new Scanner(System.in);
		System.out.println("동전은 몇 개 일까요?\n1 ~ 10 사이로 골라주세요!");
		int player = p.nextInt();
		return player;
	} 
	
	public static String compare(int a, int b) {
		String compare = (a == b) ? "맞췄습니다" : "틀렸습니다";
		return compare;
	}	
	
	public static void printResult(int coin, int player, String result) {
		System.out.printf("당신의 선택은 %d개,\n"
						+ "나온 동전은 %d개!\n"
						+ "당신은 %s!\n",
						player, coin, result);
		
	}
	
	public static void main(String[] args) {
		int coin = howManyCoin();
		int player = players();
		String result = compare(coin, player);
		printResult(coin, player, result);
	}
	
	
	
}
