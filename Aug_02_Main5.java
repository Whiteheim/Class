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
		System.out.println("������ �� �� �ϱ��?\n1 ~ 10 ���̷� ����ּ���!");
		int player = p.nextInt();
		return player;
	} 
	
	public static String compare(int a, int b) {
		String compare = (a == b) ? "������ϴ�" : "Ʋ�Ƚ��ϴ�";
		return compare;
	}	
	
	public static void printResult(int coin, int player, String result) {
		System.out.printf("����� ������ %d��,\n"
						+ "���� ������ %d��!\n"
						+ "����� %s!\n",
						player, coin, result);
		
	}
	
	public static void main(String[] args) {
		int coin = howManyCoin();
		int player = players();
		String result = compare(coin, player);
		printResult(coin, player, result);
	}
	
	
	
}
