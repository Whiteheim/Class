import java.util.Random;

public class Computer {
	User u = new User();
	Random num = new Random();

	int coin = 20;

	public int shakeCoin(User u) {
		int answer = u.answer();
		return num.nextInt(answer) + 1;
	}

	public String askHJ(User u) {
		System.out.println("Ȧ? ¦? : ");
		String answer = u.answer2();
		return answer;
	}
	
	public void computerNum() {
		
	}

}
