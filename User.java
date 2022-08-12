import java.util.Scanner;

public class User {
	int answer;
	String answer2;
	Scanner enter = new Scanner(System.in);

	public int answer() {
		return enter.nextInt();
	}

	public String answer2() {
		return enter.next();
	}

}
