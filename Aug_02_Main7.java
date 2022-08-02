import java.util.Scanner;

public class Aug_02_Main7 {
	//등차수열
	/* 정수를 하나 넣으면
	 * 1 + 2 + 3 + .... + 마지막 숫자
	 * 다 더한 값을 구해주는 함수
	 */
	 public static int add(int x) {
		 int answer = (x == 1) ? 1 : (x + add(x-1));
		 return answer;
		// return x * (x + 1) / 2;
	 }
	 
	 public static int fac(int x) {
		 int fac = (x == 1) ? 1 : (x * fac(x-1));
		 return fac;
	 }
		 
	 public static int fb (int x) {
		 int fb = (x < 3) ? 1 : (fb(x - 1) + fb(x - 2));
		 return fb;
	 }
	
	public static void main(String[] args) {
		 int a = add(5);
		 System.out.println(a);
		 
		 int b = fac(6);
		 System.out.println(b);
		 
		 int c = fb(1);
		 System.out.println(c);
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 /* 재귀적 호출 (recursive call)
	  * 	: 함수 속에서 자기 자신(함수)을 또 호출 -> 반복
	  * 
	  * add(1) = 1
	  * add(2) = 3 -> 2 + add(1); -> 2 + 1
	  */
}
