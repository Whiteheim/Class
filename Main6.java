import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) throws InterruptedException {
		Scanner person = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요 : ");
		String name = person.next();
		boolean hkd = (name == "홍길동");
		
		//System.out.printf("당신은 홍길동 입니까? : %b\n", hkd);
		
		
//		RAM의 Heap 영역에 입력되는(String) "홍길동"값은
//		Stack 영역으로 옮겨 오면서 위치값을 가져 오기 때문에
//  	"홍길동" 과 위치값을 비교하게되어 결과가 false로 나옴
	
//		String 비교
/* 		대상값을 비교하기 위해 .equals(); 사용
 * 		기본값은 ==로 비교, 문자열은 equals로 비교
 */

		boolean kdh = name.equals("홍길동");
		System.out.printf("당신은 홍길동 입니까? : %b\n", kdh);
		
		// Shift 연산자 : 다중 조건 선택이 가능 할 때 사용 (곱셈 및 나눗셈 처리시 CPU에 부담을 덜기 위해 사용)
		/*		Shift : 옮기다 / 이동하다
		 * 		형태 : (10진수 << 정수)
		 * 		' << ' : 10진수를 2진수로 바꾸고 정수만큼 왼쪽으로 밀고
		 * 				 공백이 된 오른쪽 공간은 0 으로 채운 뒤, 2진수를 10진수로 되돌려 놓음
		 * ex)'Cafe' 
		 * 		24h : 1 << 0 = 1 (이동x)
		 * 		wi-fi : 1 << 1 = 2 
		 * 		흡연실: 1 << 2 = 4 
		 * 		주차장 : 1 << 3 = 8          조건 검색시 아래에서 위로 계산
		 *  A cafe : 2 = wi-fi
		 *  B cafe : 8 = 주차장
		 *  C cafe : 13 = 24h 흡연실 주차장
		 *  D cafe : 6 = wi-fi 흡연실
		 */

	// int c = (150 << 6);
	//	System.out.println(c);  
		
		// 연산자
		/*		단항 연산자 : a++, a--. !a, ...
		 * 		이항 연산자 : a + b, a > b, ... 
		 * 		삼항 연산자 (조건을 따져 값을 대입 할 때 사용/ if문으로 대체 가능하지만, 문법이 길어짐)
		 *			: 조건식 '?' 조건을 만족할 때 사용 할 값 : 조건이 성립하지 않았을 때 사용할 값
		 */
	
		Thread.sleep(1000);
		System.out.print("당신의 나이는 ? : ");
		int age = person.nextInt();
		
		System.out.printf("나이는 %d살 이시네요.\n", age);
		String result = (age >= 20) ? "안녕하세요" : "NAGA!";
		Thread.sleep(1000);
		System.out.println(result);
		Thread.sleep(500);
		System.out.println("=================================================================");
		
		
		// 홍길동 씨 : 1강의장
		// 나이가 짝수 : 1강의장
		// 나머지 : 2강의장
		Thread.sleep(500);
		System.out.print("당신의 이름은? : ");
		String namee = person.next();
		System.out.print("나이는? : ");
		int agee = person.nextInt();
		Thread.sleep(500);
		System.out.printf("이름은 %s님이시고, 나이는 %d살 이시네요.\n", namee, agee);
		String resultt = (agee % 2 == 0) || (namee.equals("홍길동")) ? "1 강의장" : "2 강의장";	
		Thread.sleep(500);
		System.out.printf(("그럼 ") + resultt + ("으로 가시면 됩니다.\n"));
		
		System.out.println("=================================================================");
		Thread.sleep(500);
		System.out.print("공은 몇 개 입니까? : ");
		int ball = person.nextInt();
		
		int box = (ball % 6 == 0 ? ball / 6 : ball / 6 + 1);  
		
		
		System.out.printf("상자에 6개의 공이 들어 가므로,\n필요한 상자는 %d개 입니다. ", box);
		   
		
		
		
		
		
		
		
		
	}
}




















