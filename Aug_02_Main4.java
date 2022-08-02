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
		System.out.print("È¦¼ö ÀÏ±î¿ä Â¦¼ö ÀÏ±î¿ä");
		return new Scanner(System.in).next();
	}

	public static String judge(int random) {
		String j = (random % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";
		return j;
//		return (random % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";
	}

	public static String result(String a, String b) {
		String result = (a.equals("Â¦¼ö") && b.equals("Â¦")) 
				|| (a.equals("Â¦¼ö") && b.equals("Â¦¼ö"))
				|| (a.equals("È¦¼ö") && b.equals("È¦"))
				|| (a.equals("È¦¼ö") && b.equals("È¦¼ö"))
				? "¸ÂÃß¼Ì½À´Ï´Ù!" : "Æ²¸®¼Ì±º¿ä!";
		return result;
//		return (a.equals("Â¦¼ö") && b.equals("Â¦")) 
//		|| (a.equals("Â¦¼ö") && b.equals("Â¦¼ö"))
//		|| (a.equals("È¦¼ö") && b.equals("È¦"))
//		|| (a.equals("È¦¼ö") && b.equals("È¦¼ö"))
//		? "¸ÂÃß¼Ì½À´Ï´Ù!" : "Æ²¸®¼Ì±º¿ä!";		
	}

	public static void main(String[] args) {
		System.out.println("======È¦Â¦ °ÔÀÓ======");
		int r = randomizer();
		String j = judge(r);
		String yours = answer();
		System.out.printf("¼ýÀÚ´Â %d !\n%s ÀÔ´Ï´Ù!\n", r, j);
		String result = result(j, yours);
		System.out.println(result);
	}

}
