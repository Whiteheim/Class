import java.util.Scanner;

// �� ������
/*  	����� boolean (true / false)�� ����
 * 		[  >,   >=,   ==,  !=,    <,   <=]  
 * 		�ʰ�, �̻�, ����, �ٸ�, �̸�, ����
 */

public class Main5 {
	public static void main(String[] args) {
		// ���̰������� �ⱸ �̿�� ������ Ű�� ���� ���� ���α׷� �����
		
		Scanner body = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = body.nextDouble();
		System.out.print("���� : ");
		int age = body.nextInt();
		
		System.out.printf("Ű�� %.1fcm�̰�, ���̴� %d�� �Դϴ�.\n", height, age);
		
		//�������� 10���� ���̱ⱸ
		boolean ride1 = (age > 10);
		System.out.printf("�ٶ����� ž�� ����? : %b\n", ride1);
		
		// �������� 4�����
		boolean ride2 = (age < 5);
		System.out.printf("���������� ž�� ����? : %b\n", ride2);
		
		// 20�츸 ����
		boolean ride3 = (age == 20);
		System.out.printf("���Ի� OT ���� ����? : %b\n", ride3);
		
		// 1�츸 �ƴϸ� ����
		boolean ride4 = (age != 1);
		System.out.printf("2����� �����մϴ�. : %b\n", ride4);
		
		// ���̰� Ȧ���� ����� ����
		boolean ride5 = (age % 2 == 1);
		System.out.printf("���̰� Ȧ���ΰ���? : %b\n", ride5);
		
		// �׸���(and)	: && (Ȯ���� ���� ������ ������ ��ġ)
		// �̰ų�(or)	: || (Ȯ���� ���� ������ ������ ��ġ)
		// XOR			: ^ (eXclusive OR) => �� �Է��� ���� �ٸ� ��, ��������� '1'�� �����.			
		// NOT			: ! => ����� ������ ������ (boolean���� ��� �� ���� �ݴ�� ����)
		
		//�� �����ڸ� �̿��� �ڵ带 © �� ȿ���� �����ؾ���.
		
		// ���� 3�� �̻�, Ű 2���� �̻�
		//      95%            5%           >>> 95%�� Ȯ���� 2�� �˻�
		// Ű 2���� �̻�, ���� 3�� �̻�
		//      5%             95%    		>>> 5%�� Ȯ���� 1�� �˻� > ȿ���� �� ����
			
		// ���� > 3�� and Ű > 2m
		boolean ride6 = ((height/100) > 2 && age > 3);
		System.out.printf("3�� �ʰ�, Ű 2���� �̻��ΰ���? : %b\n", ride6);
		
		// Ű > 1.9m or ���� < 50
		// or ������ A �� B �� �ϳ��� �����ϸ� �ǹǷ� Ȯ���� ���� ������ ������ ��ġ 
		// Ű > 1.9m or ���� < 50
		boolean ride7 = (age < 50 || (height/100) > 1.9  );
		System.out.printf("50�캸�� ��ų� 1.9m �̻��ΰ���? : %b\n", ride7);
		
		
		// 10 < ���� < 40
		boolean ride8 = (age < 40 && age > 10);
		System.out.printf("10 < %b < 40\n", ride8);
		
		// ������ �Ǵ� ������ ���׿� �Է� (10 < age (x))
		
		// ���� >= 10 or Ű >= 1.5m �ϳ��� 
		boolean ride9 = (age >= 10) ^ ((height/100) >= 1.5);
		System.out.printf("���� >= 10 �̰ų� Ű >= 1.5m? : %b\n", ride9);
		
		// ride9 �� Ż �� �ִ� ����� ��Ÿ��,
		// ride9 �� Ż �� ���� ����� Ż �� �ִ� ��
		boolean ride10 = !ride9;
		System.out.printf("ride9 ��Ÿ�� ���� : %b\n", ride10);					
	}
}
