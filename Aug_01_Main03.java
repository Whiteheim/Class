import java.util.Scanner;

//�Լ� (Function)
//		���� �ִ� ���(�۾�)���� ���� �ʿ�� ���.

// �ʱ� OS ���� ��������� ���� OS(�ü��) ������ ���� ���� (windows<=>windows)
// Java ���� ���� JVM���� �ٸ� OS���� ������� �����ϴ� ��� ����
// JDK (�ڹ� ���� ŰƮ) > JRE (�ڹ� ���� ȯ��)
// ���α׷� ���� �� JRE�� OS�� ���� JVM(�ڹ� ���� �ӽ�) ����
//		-> WORA (Write Once Read Anywhere) - Java�� ���� �� �ϳ� 
// 		OS������ ���α׷��� ������ �ʾƵ� �Ǵ� ��� ����

//����
/* public static '���� Ÿ�� �Լ� ��'(�Ķ����, �Ķ����, ...) {
 * 	����
 * 	return
 * }
 */
// ���� Ÿ�� : ��ȯ �� ���� �ڷ���
//		�Լ� ������ ���� �ϼ��� �ǰ�, main���� ��ȯ �� ������� ���� �ڷ���
// 		return �� ����ؼ� ��ȯ

// �Լ��� : �Լ��� �̸�
/* 		1. ���� -> ���� �߻�
 * 		2. Ư������ , ���� -> ���� �߻�
 * 		3. Java���� (�����) -> ���� �߻�
 * 			=> '_' ����ؼ� ������ ����
 * 		4. �Լ����� ���� � ������� �� �� �ֵ��� �۸�
 * 		5. �ҹ��ڷ� ����
 * 		6. �������� ���� ��ü / ��Ÿü ���
 * 		7. �ѱ� ��� x 
 * 	
 * ������� �Լ����� �۸� ����
 *  ������ : ���
 *  �Լ��� : ����
 */

// �Ķ���� (����, parameter) : �Լ��� �����ϴµ� �ʿ��� ���
// �ʿ��� ������ŭ ����ϵ�, �ڷ����� ���� ���

public class Aug_01_Main03 {
	// ���� �� JVM�� main�� �ڵ����� ȣ��

	//           (�鸮��Ÿ��)
	public static void mythink() {
		System.out.println("????????????");

	}

	public static void myinformation() {
		System.out.println("�̸� : ������");
		System.out.println("��°� : ����");
		System.out.println("H.P : 01054776046");

	}
//						    (parameter)
	public static void calculation(int x, int y) {
			
		int sum = x + y;
		int minus = x - y;
		int multiply = x * y;
		double devide = x / (double) y;
		
		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(devide);
		
	}
	
	public static void main(String[] args) {

		mythink();
		myinformation();
		calculation(10, 5);
		calculation(8, 3);
	}

}














