import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		Scanner today = new Scanner(System.in);
					
		System.out.print("오늘의 기분은? : ");
		String feeling = today.next();
		
		System.out.print("오늘의 컨디션 점수는? : ");
		int condition = today.nextInt();
		
		System.out.print("등교시 대중교통 이용 횟수 : ");
		int bus = today.nextInt();
		
		System.out.print("밤에 잘 주무셨나요? : ");
		boolean goodnight = today.nextBoolean();
		
		System.out.print("몇시간 주무셨나요? : ");
		double time = today.nextDouble();
		
		System.out.println("=================================================");
		
		System.out.printf("오늘의 기분은? : %s\n", feeling);
		System.out.printf("오늘의 컨디션 점수는? : %d 점\n", condition);
		System.out.printf("등교시 대중교통 이용 횟수 : %d번 탔어요.\n", bus);
		System.out.printf("밤에 잘 주무셨나요? : %b\n", goodnight);
		System.out.printf("몇 시간 주무셨나요? : %.0f시간\n", time);
		System.out.println();
		
		today.close();
		
		Thread.sleep(1000);
		System.out.println("오늘 하루 잘 보내세요!");
		System.out.println("\\\0\0\0\0/\\\0\0\0기다려");
		System.out.println("\0)\0\0(\0\')");
		System.out.println("(\0\0/\0\0)\0\0\0\0▒▒▒▒");
		System.out.println("\0\\(__)|\0\0\0┗━━━━┛");
		System.out.println();
		System.out.println();

		
		
		
		
		Thread.sleep(5000);
		
		
		
		
		

		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
}
