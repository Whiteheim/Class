import java.util.Scanner;

public class Aug_01_Main07 {
	//			  (��return �� ���� ��� void ���)
	public static void make_errand() {
		System.out.println("Mom : ���, ��ġĵ, �ܵ�");
		System.out.println("Mom : ���� �������� ������.");
	}
	public static int mymoney(){
		System.out.print("�ʿ��� �ݾ��� �Է��ϼ���. : ");
		Scanner money = new Scanner(System.in);
		int gold = money.nextInt();
		System.out.printf("������ �� %dG��(��) �տ� �־���!\n", gold);
		return gold;
		//����(int)�� ���� ���� main�Լ��� return(��ȯ) �Ұ��̱⶧����
		//return type�� int �� ����
	}
	
	public static void cost(int gold){
			int a = 3200;
			int b = 2170;
			int c = 1500;
			// ����ϴ� �Լ�
			//  ����� ���� '�޾ƿ� ���� �ʿ�'
			// 	�� ���� patameter�� �޾ƿ�.
			System.out.printf("���, ��ġĵ, ������(��) ��� %dG��(��) ����\n", gold - (a + b + c));
			
	}
	public static int givemoney(int cost) {
		int a = 3200;
		int b = 2170;
		int c = 1500;
		int d = 3000; //�涥ĥ��
		
		int rest = cost - (a + b + c + d);
		return rest;
	}
	
	
	
	public static void main(String[] args) {
		make_errand();
		int gold = mymoney(); 
		// System.out.println(gold);
		cost(gold);
		int rest = givemoney(gold);
		System.out.println(rest);
		
	}
	
	
	// �Լ� ��� ����
	/*
	 * ������
	 * ���� �߰� ����
	 * ���� ����
	 * �ٸ� main���� �Լ� ���� ����
	 */
		
	// main �Լ��� �ڵ带 �ִ��� ª�� �����ϱ� ����
	// ��ɵ��� ���� '�Լ�' �� ���
	// ����� ������ ȿ�������� ���
	
	
	
	
	
	
	
	
	
		
	}




