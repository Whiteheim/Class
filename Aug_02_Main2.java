import java.util.Random;

public class Aug_02_Main2 {
	public static void print_random() { // ������ random���� '���' �ϴ� �Լ�
		Random r = new Random(); // ������ random���� ���� �غ�
		int r_num = r.nextInt();
		System.out.println(r_num);
	}
	
	public static int creat_random() { // ������ random���� '����'(���ϴ�) �Լ� => ������ '����'�ϴ� ���� ��ǥ
		Random r = new Random();
		int r_num = r.nextInt();
		return r_num; // r_num�� �ִ� ���� ��
					  // �� �� �Լ��� ����
				
	} 
	public static void print_c(int a) {
		char result = (a % 2 == 0) ? '¦' : 'Ȧ';
		System.out.printf("%d��(��) %c\n", a, result);
	}
	
	public static String bigger_i(int a, int b) {
		String front_behind = (b >= a) ? "��" : "��";
		return front_behind;
	}
		
	//JVM -> main�Լ��� �ڵ����� ȣ���� ���� ��Ŵ
	public static void main(String[] args) {
		print_random();
		int r_num = creat_random();
		int r_num2 = creat_random();
		System.out.println(r_num);
		print_c(r_num);
		print_c(r_num2);
		String front_behind = bigger_i(r_num , r_num2);
		System.out.println(front_behind);
		String menu = (front_behind.equals("��")) ? "�ʹ�" : "¥���";
		// String menu = (r_num > r_num2) ? "�ʹ�" : "¥���";
		System.out.println(menu);
			
		
		
		
	
	}
}