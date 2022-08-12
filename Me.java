import java.util.Scanner;

public class Me {
//	Scanner enter = new Scanner(System.in);
//	int myNum;	
//	public int num() {
//		return enter.nextInt();
//	}
	//정답 입으로 말함
	Scanner mouth = new Scanner(System.in);
	
	public int tellMyAns() {
		System.out.println("정답은 : ");
		int myAns = mouth.nextInt();
		return myAns;
	}
	
}
