import java.util.Iterator;
import java.util.Random;

// �ݺ���
/*  for (int i = 0; i < args.length; i++) {
 *     [���� �ʱ�ȭ; /  ���ǽ�; /  ���� ����] 
 *     ����
 *     }
 *     �۵� ����
 *     1. ���� �ʱ�ȭ Ȯ��
 *     2. ���ǽ��� '��'�� �� ���� ���
 *     3. ���� ���� Ȯ��
 *     4. ���� �ٽ� ���� �� �� '��' �� �� ���� ���
 *     5. 3������ �ݺ�
 *     6. ���� �ݺ� �� �� '����' �� �� �ݺ��� ����
 *     
 *     �ɷ�
 *     1. � �۾��� ���� �� ��ŭ �ݺ� �� �� ���� (Ƚ��)
 *     2. �۾��� �Ⱓ�� ���� �ݺ��� �� ����        (����)
 *     
 *     '��'�� 3�� ��� �� �� 
 *  	for (int i = 0; i < 3; i++)
 * 			[�ʱⰪ / �ݺ��� Ƚ�� / �ݺ��� i �� 1�� ����]     
 *     
 */

public class Aug_04_Main4 {

	
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ��\n", i);
			}
		System.out.println("=========================");
		for (int j = 5; j > 0 ; j--) {
			System.out.println(j);
		}
		System.out.println("=========================");
		for (int k = 1; k <= 21; k+=2) {
			System.out.println(k);
		}
		System.out.println("=========================");
		Random r = new Random();
		int k = r.nextInt(10) + 1; 
		int k2 = 0;
		for (int l = 0; l < 5; l++) {
			k2 = r.nextInt(10) + 1; 
			System.out.println(k2);
//			for (int l = 0; l < 5; l++) {
//			int k = r.nextInt(10) + 1; 
//			�ݺ��� �ӿ��� ������ ����� �ݺ����� �ѹ� �� �� ���� �޸𸮸� ���� ������ ����õ��
//			�ݺ��� �ۿ��� ������ ������ ���°� �� ȿ����
		}
		System.out.println("=========================");
		int sum = 0; 
		for (int i = 1; i <= 10; i++) {
			sum += i; // += : ������ �� ��ŭ ���س����� sum = sum + i
		}	
		System.out.println(sum);
		System.out.println("=========================");
		
		int factorial = 1;
		for (int i = 1; i <= 7; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
		System.out.println("=========================");
		
		int mul = 0;
		for (int i = 0; i <= 50; i ++) {
			if (i % 3 == 0 || i % 5 == 0 ) {
				mul += i;
		}
	System.out.println(mul);
		}
		}
}



















