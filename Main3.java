import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

		// 변수 
		/* ' = ' : 대입 연산자
		 * 자료형 변수명 = 값;
		 * A = B : 우항(B)에 있는 것을 좌항(A)에 넣어라
		 * 변수에 값을 넣을 때 사용
		 */
		
		Scanner calc = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = calc.nextInt();
		System.out.print("y = ");
		int y = calc.nextInt();
		System.out.printf("x + y = %d\n", x + y);
		
		
		System.out.print("a = ");
		int a = calc.nextInt();
		System.out.print("b = ");
		int b = calc.nextInt();
		System.out.printf("a - b = %d\n", a - b );
		
		System.out.print("c = ");
		int c = calc.nextInt();
		System.out.print("d = ");
		int d = calc.nextInt();
		System.out.printf("c * d = %d\n", c * d);

		System.out.print("e = ");
		int e = calc.nextInt();
		System.out.print("f = ");
		int f = calc.nextInt();
		System.out.printf("e / f = %.1f\n", (double) e / f);
		
		System.out.println("=====================================================");
		
		System.out.print("o = ");
		int o = calc.nextInt();
		System.out.print("w = ");
		int w = calc.nextInt();
		
		
		int plus = o + w;
		int minus = o - w;
		int multiply = o * w;
		int divide = o / w;
		
		System.out.printf("%d + %d = %d\n", o, w, plus);
		System.out.printf("%d - %d = %d\n", o, w, minus);
		System.out.printf("%d * %d = %d\n", o, w, multiply);
		System.out.printf("%d / %d = %.1f\n", o, w, (double) divide);
		
		
		//사칙연산 : 산술연산자
		/* int / int = int (Java 한정)
		 * double / int = double
		 * int / double = double
		 * double / double = double
		 */

		// 나누기 후 나머지 값을 구할 때 사용하는 형태
		int remainder = o % w;
		System.out.printf("...%.1f\n", (double) remainder);
		
		
		
		System.out.printf("o 는 %d\n", o);//
		System.out.printf("w 는 %d\n", w);//
		o = w;
		System.out.printf("o 는 %d\n", o);//k
		System.out.printf("w 는 %d\n", w);//		
		
		// w값이 o값에 대입 되므로 w의 값이 나오게 된다.
		
		// 대입 연산자
		/* 용량을 1bit라도 더 줄이기 위해 사용
		 * [+=, -=, *=, /=, %=]
		 *  
		 * (x += 1); =>> (x = x + 1);
		 * (x -= 1); =>> (x = x - 1);
		 * (x *= 1); =>> (x = x * 1);
		 * (x /= 1); =>> (x = x / 1);
		 * (x %= 1); =>> (x = x % 1);
		 * 
		 * 
		 * 더 줄이기		
		 * (x++); = (x += 1); = (x = x + 1);
		 * (x--); = (x -= 1); = (x = x - 1);
		 * 
		 * [**, //, %% 는 연산자로 사용 불가]
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}
}
