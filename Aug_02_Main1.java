
public class Aug_02_Main1 {

	public static void print_bigger(int a , int b) { //���(���)�� ����� �Լ� 
		int big_num = (a > b) ? a : b; 
		System.out.println(big_num);
	}
		
	public static double get_bigger(double a, double b) { //������� �����ϴ�(���ϴ�) �Լ� -> ���� �������� ���� ����ϴ� ���
		double big_num = (a > b) ? a : b;
		big_num *= 1000;
		return big_num;
			
	}
		
	public static void main(String[] args) throws InterruptedException {
		print_bigger(10, 20);
		double big_num = get_bigger(10, 20);	
		System.out.println(big_num);
		Thread.sleep((int) big_num);
	}
}
