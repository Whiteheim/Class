import java.util.Random;
import java.util.Scanner;

public class Aug_02_Main4 {
	public static int randomizer() {
		Random r = new Random();
		int random = r.nextInt(10) + 1;
		return random;
//		return new Random().nextInt(10) + 1 
//		r.nextInt(11); = 0~10
//		r.nextInt(10) + 1; = 1~10
	}

	public static String answer() {
		/*
		 * Scanner answer = new Scanner(System.in); 
		 * String youranswer = answer.next();
		 * return youranswer;
		 */
		System.out.print("Ȧ�� �ϱ�� ¦�� �ϱ��");
		return new Scanner(System.in).next();
	}

	public static String judge(int random) {
		String j = (random % 2 == 0) ? "¦��" : "Ȧ��";
		return j;
//		return (random % 2 == 0) ? "¦��" : "Ȧ��";
	}

	public static String result(String a, String b) {
		String result = (a.equals("¦��") && b.equals("¦")) 
				|| (a.equals("¦��") && b.equals("¦��"))
				|| (a.equals("Ȧ��") && b.equals("Ȧ"))
				|| (a.equals("Ȧ��") && b.equals("Ȧ��"))
				? "���߼̽��ϴ�!" : "Ʋ���̱���!";
		return result;
//		return (a.equals("¦��") && b.equals("¦")) 
//		|| (a.equals("¦��") && b.equals("¦��"))
//		|| (a.equals("Ȧ��") && b.equals("Ȧ"))
//		|| (a.equals("Ȧ��") && b.equals("Ȧ��"))
//		? "���߼̽��ϴ�!" : "Ʋ���̱���!";		
	}

	public static void main(String[] args) {
		System.out.println("======Ȧ¦ ����======");
		int r = randomizer();
		String j = judge(r);
		String yours = answer();
		System.out.printf("���ڴ� %d !\n%s �Դϴ�!\n", r, j);
		String result = result(j, yours);
		System.out.println(result);
	}

}
