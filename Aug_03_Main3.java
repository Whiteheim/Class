import java.util.Scanner;

public class Aug_03_Main3 {
	public static int _Korean() {
		Scanner p = new Scanner(System.in);
		System.out.print("���� : ");
		int score = p.nextInt();
		return (score >= 0 && score <= 100) ? score : _Korean();

	}
// ���ǹ� : �ۼ��� �ڵ带 ���ǿ� ���� �ڵ��� �����帧�� 
//   		�ٸ��� �����ϵ��� �����ϴ� ����
/* 	if �� : ���ǽ��� ����� true / false�� ���๮�� ����
 * 		���� : if (���� A){
 * 			   ���� A�� ����(��) ���� ��, ��ȣ���� ���� ����
 * 			}
 * 	 	       else if (���� B){
 * 			   ���� A�� ���� x(����), ���� B ���� o(��) �� �� ���� B�� ��ȣ���� ���� ����
 * 			}
 * 			   else if (���� C){
 * 	
 * 			   ���� A/B�� ���� x(����), ���� C ���� o(��) �� �� ���� C�� ��ȣ���� ���� ����
 * 			}
 * 			   else{
 * 			   �����ϴ� ������ �ϳ��� ������ else ��ȣ���� ���� ����
 * 			}
 * 			else if / else �� �ʼ� ��� x 
 * 			else if �� ������ ���� ���� ��� ����, else�� �������� �ѹ��� ��� ����
 * 
 */

	public static void main(String[] args) {
		int score1 = _Korean();
		if (score1 >= 90 ) {
			System.out.println("��");
		} else if (score1 >= 80) {
			System.out.println("��");
		} else if (score1 >= 70) {
			System.out.println("��");
		} else if (score1 >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		System.out.println("==========================");
		
		if (score1 < 30) {
			System.out.println("����");
		} else if (score1 < 50) {
			System.out.println("��");
		} else if (score1 < 60) {
			System.out.println("�ƽ���");
		} else {
			System.out.println("Ī��");
		}
		/* if ���� if ���� ������ ����
		 * if (score1 < 50) { 
		 * 		System.out.println("��"); 
		 * 		if (score1 < 30) {
		 * 			System.out.println("����"); 
		 *  	}
		 *  }
		 */
		
		/* else ���� if ���� ������ ����
		 * else { 
		 * 		System.out.println("Ī��"); 
		 *   }	if (score1 < 60) {
		 *		 System.out.println("�ƽ���"); 
		 *	 } 
		 *	}
		 *	 �̷� ���� ȿ�� ������
		 */	
		
		/* (if - if��) �� (if - else ���� ����)
		 *  	if - if : ���� �ٸ� ���ǹ����� �ؼ��� �Ǿ �����ϰ� ��	=> ȿ��x
		 *  		������ if ������ ������ ���� ����
		 *  	if - else : �ϳ��� ������ �����Ǹ� ������ �κ��� �������� ���� => ȿ�� o
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
