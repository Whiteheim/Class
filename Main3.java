import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

		// ���� 
		/* ' = ' : ���� ������
		 * �ڷ��� ������ = ��;
		 * A = B : ����(B)�� �ִ� ���� ����(A)�� �־��
		 * ������ ���� ���� �� ���
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
		
		
		//��Ģ���� : ���������
		/* int / int = int (Java ����)
		 * double / int = double
		 * int / double = double
		 * double / double = double
		 */

		// ������ �� ������ ���� ���� �� ����ϴ� ����
		int remainder = o % w;
		System.out.printf("...%.1f\n", (double) remainder);
		
		
		
		System.out.printf("o �� %d\n", o);//
		System.out.printf("w �� %d\n", w);//
		o = w;
		System.out.printf("o �� %d\n", o);//k
		System.out.printf("w �� %d\n", w);//		
		
		// w���� o���� ���� �ǹǷ� w�� ���� ������ �ȴ�.
		
		// ���� ������
		/* �뷮�� 1bit�� �� ���̱� ���� ���
		 * [+=, -=, *=, /=, %=]
		 *  
		 * (x += 1); =>> (x = x + 1);
		 * (x -= 1); =>> (x = x - 1);
		 * (x *= 1); =>> (x = x * 1);
		 * (x /= 1); =>> (x = x / 1);
		 * (x %= 1); =>> (x = x % 1);
		 * 
		 * 
		 * �� ���̱�		
		 * (x++); = (x += 1); = (x = x + 1);
		 * (x--); = (x -= 1); = (x = x - 1);
		 * 
		 * [**, //, %% �� �����ڷ� ��� �Ұ�]
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}
}
