import java.util.Scanner;

public class Aug_03_Main3 {
	public static int _Korean() {
		Scanner p = new Scanner(System.in);
		System.out.print("국어 : ");
		int score = p.nextInt();
		return (score >= 0 && score <= 100) ? score : _Korean();

	}
// 조건문 : 작성한 코드를 조건에 따라 코드의 실행흐름을 
//   		다르게 동작하도록 제어하는 문법
/* 	if 문 : 조건식의 결과가 true / false로 실행문을 결정
 * 		형태 : if (조건 A){
 * 			   조건 A가 만족(참) 했을 때, 괄호안의 문장 실행
 * 			}
 * 	 	       else if (조건 B){
 * 			   조건 A가 만족 x(거짓), 조건 B 만족 o(참) 일 때 조건 B의 괄호안의 문장 실행
 * 			}
 * 			   else if (조건 C){
 * 	
 * 			   조건 A/B가 만족 x(거짓), 조건 C 만족 o(참) 일 때 조건 C의 괄호안의 문장 실행
 * 			}
 * 			   else{
 * 			   만족하는 조건이 하나도 없으면 else 괄호안의 문장 실행
 * 			}
 * 			else if / else 는 필수 요소 x 
 * 			else if 는 개수에 제한 없이 사용 가능, else는 마지막에 한번만 사용 가능
 * 
 */

	public static void main(String[] args) {
		int score1 = _Korean();
		if (score1 >= 90 ) {
			System.out.println("수");
		} else if (score1 >= 80) {
			System.out.println("우");
		} else if (score1 >= 70) {
			System.out.println("미");
		} else if (score1 >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		System.out.println("==========================");
		
		if (score1 < 30) {
			System.out.println("퇴학");
		} else if (score1 < 50) {
			System.out.println("욕");
		} else if (score1 < 60) {
			System.out.println("아쉬운");
		} else {
			System.out.println("칭찬");
		}
		/* if 문에 if 문을 붙혀도 가능
		 * if (score1 < 50) { 
		 * 		System.out.println("욕"); 
		 * 		if (score1 < 30) {
		 * 			System.out.println("퇴학"); 
		 *  	}
		 *  }
		 */
		
		/* else 문에 if 문을 붙혀도 가능
		 * else { 
		 * 		System.out.println("칭찬"); 
		 *   }	if (score1 < 60) {
		 *		 System.out.println("아쉬운"); 
		 *	 } 
		 *	}
		 *	 이런 경우는 효율 괜찮음
		 */	
		
		/* (if - if문) 과 (if - else 문의 차이)
		 *  	if - if : 각각 다른 조건문으로 해석이 되어서 수행하게 됨	=> 효율x
		 *  		개별의 if 문장을 여러개 만든 문장
		 *  	if - else : 하나의 조건이 만족되면 나머지 부분은 수행하지 않음 => 효율 o
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
