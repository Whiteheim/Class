import java.util.Scanner;

// 논리 연산자
/*  	결과가 boolean (true / false)로 나옴
 * 		[  >,   >=,   ==,  !=,    <,   <=]  
 * 		초과, 이상, 같음, 다름, 미만, 이하
 */

public class Main5 {
	public static void main(String[] args) {
		// 놀이공원에서 기구 이용시 유아의 키와 나이 구분 프로그램 만들기
		
		Scanner body = new Scanner(System.in);
		System.out.print("키 : ");
		double height = body.nextDouble();
		System.out.print("나이 : ");
		int age = body.nextInt();
		
		System.out.printf("키는 %.1fcm이고, 나이는 %d살 입니다.\n", height, age);
		
		//나이제한 10살인 놀이기구
		boolean ride1 = (age > 10);
		System.out.printf("다람쥐통 탑승 가능? : %b\n", ride1);
		
		// 나이제한 4살까지
		boolean ride2 = (age < 5);
		System.out.printf("개구리점프 탑승 가능? : %b\n", ride2);
		
		// 20살만 가능
		boolean ride3 = (age == 20);
		System.out.printf("신입생 OT 참여 가능? : %b\n", ride3);
		
		// 1살만 아니면 가능
		boolean ride4 = (age != 1);
		System.out.printf("2살부터 가능합니다. : %b\n", ride4);
		
		// 나이가 홀수인 사람만 가능
		boolean ride5 = (age % 2 == 1);
		System.out.printf("나이가 홀수인가요? : %b\n", ride5);
		
		// 그리고(and)	: && (확률이 낮은 조건을 앞으로 배치)
		// 이거나(or)	: || (확률이 높은 조건을 앞으로 배치)
		// XOR			: ^ (eXclusive OR) => 두 입력이 서로 다를 때, 결과값으로 '1'을 출력함.			
		// NOT			: ! => 결과를 뒤집는 연산자 (boolean에서 사용 시 값이 반대로 나옴)
		
		//논리 연산자를 이용해 코드를 짤 때 효율을 생각해야함.
		
		// 나이 3살 이상, 키 2미터 이상
		//      95%            5%           >>> 95%의 확률로 2번 검사
		// 키 2미터 이상, 나이 3살 이상
		//      5%             95%    		>>> 5%의 확률로 1번 검사 > 효율이 더 좋음
			
		// 나이 > 3살 and 키 > 2m
		boolean ride6 = ((height/100) > 2 && age > 3);
		System.out.printf("3살 초과, 키 2미터 이상인가요? : %b\n", ride6);
		
		// 키 > 1.9m or 나이 < 50
		// or 에서는 A 와 B 중 하나만 만족하면 되므로 확률이 높은 조건을 앞으로 배치 
		// 키 > 1.9m or 나이 < 50
		boolean ride7 = (age < 50 || (height/100) > 1.9  );
		System.out.printf("50살보다 어리거나 1.9m 이상인가요? : %b\n", ride7);
		
		
		// 10 < 나이 < 40
		boolean ride8 = (age < 40 && age > 10);
		System.out.printf("10 < %b < 40\n", ride8);
		
		// 기준이 되는 변수는 좌항에 입력 (10 < age (x))
		
		// 나이 >= 10 or 키 >= 1.5m 하나만 
		boolean ride9 = (age >= 10) ^ ((height/100) >= 1.5);
		System.out.printf("나이 >= 10 이거나 키 >= 1.5m? : %b\n", ride9);
		
		// ride9 를 탈 수 있는 사람은 못타고,
		// ride9 를 탈 수 없는 사람만 탈 수 있는 식
		boolean ride10 = !ride9;
		System.out.printf("ride9 못타면 가능 : %b\n", ride10);					
	}
}
