import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) throws InterruptedException {
		Scanner person = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = person.next();
		boolean hkd = (name == "ȫ�浿");
		
		//System.out.printf("����� ȫ�浿 �Դϱ�? : %b\n", hkd);
		
		
//		RAM�� Heap ������ �ԷµǴ�(String) "ȫ�浿"����
//		Stack �������� �Ű� ���鼭 ��ġ���� ���� ���� ������
//  	"ȫ�浿" �� ��ġ���� ���ϰԵǾ� ����� false�� ����
	
//		String ��
/* 		����� ���ϱ� ���� .equals(); ���
 * 		�⺻���� ==�� ��, ���ڿ��� equals�� ��
 */

		boolean kdh = name.equals("ȫ�浿");
		System.out.printf("����� ȫ�浿 �Դϱ�? : %b\n", kdh);
		
		// Shift ������ : ���� ���� ������ ���� �� �� ��� (���� �� ������ ó���� CPU�� �δ��� ���� ���� ���)
		/*		Shift : �ű�� / �̵��ϴ�
		 * 		���� : (10���� << ����)
		 * 		' << ' : 10������ 2������ �ٲٰ� ������ŭ �������� �а�
		 * 				 ������ �� ������ ������ 0 ���� ä�� ��, 2������ 10������ �ǵ��� ����
		 * ex)'Cafe' 
		 * 		24h : 1 << 0 = 1 (�̵�x)
		 * 		wi-fi : 1 << 1 = 2 
		 * 		����: 1 << 2 = 4 
		 * 		������ : 1 << 3 = 8          ���� �˻��� �Ʒ����� ���� ���
		 *  A cafe : 2 = wi-fi
		 *  B cafe : 8 = ������
		 *  C cafe : 13 = 24h ���� ������
		 *  D cafe : 6 = wi-fi ����
		 */

	// int c = (150 << 6);
	//	System.out.println(c);  
		
		// ������
		/*		���� ������ : a++, a--. !a, ...
		 * 		���� ������ : a + b, a > b, ... 
		 * 		���� ������ (������ ���� ���� ���� �� �� ���/ if������ ��ü ����������, ������ �����)
		 *			: ���ǽ� '?' ������ ������ �� ��� �� �� : ������ �������� �ʾ��� �� ����� ��
		 */
	
		Thread.sleep(1000);
		System.out.print("����� ���̴� ? : ");
		int age = person.nextInt();
		
		System.out.printf("���̴� %d�� �̽ó׿�.\n", age);
		String result = (age >= 20) ? "�ȳ��ϼ���" : "NAGA!";
		Thread.sleep(1000);
		System.out.println(result);
		Thread.sleep(500);
		System.out.println("=================================================================");
		
		
		// ȫ�浿 �� : 1������
		// ���̰� ¦�� : 1������
		// ������ : 2������
		Thread.sleep(500);
		System.out.print("����� �̸���? : ");
		String namee = person.next();
		System.out.print("���̴�? : ");
		int agee = person.nextInt();
		Thread.sleep(500);
		System.out.printf("�̸��� %s���̽ð�, ���̴� %d�� �̽ó׿�.\n", namee, agee);
		String resultt = (agee % 2 == 0) || (namee.equals("ȫ�浿")) ? "1 ������" : "2 ������";	
		Thread.sleep(500);
		System.out.printf(("�׷� ") + resultt + ("���� ���ø� �˴ϴ�.\n"));
		
		System.out.println("=================================================================");
		Thread.sleep(500);
		System.out.print("���� �� �� �Դϱ�? : ");
		int ball = person.nextInt();
		
		int box = (ball % 6 == 0 ? ball / 6 : ball / 6 + 1);  
		
		
		System.out.printf("���ڿ� 6���� ���� ��� ���Ƿ�,\n�ʿ��� ���ڴ� %d�� �Դϴ�. ", box);
		   
		
		
		
		
		
		
		
		
	}
}




















