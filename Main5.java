
public class Main5 {
	public static void main(String[] args) {
		String menu1 = "������� ������ġ";
		String menu2 = "�߰�����";
		String menu3 = "���� ����ݸ�";
		String menu4 = "������ ����";
		int price = 4000;
		int kcalories1 = 500;
		int kcalories2 = 600;
		double point = 8.0;
		double total = 10.0;
		boolean re_eaten = true;
		
		System.out.printf("���ɽĻ� �޴� : %s, %s, %s, %s\n", menu1, menu2, menu3, menu4);
		System.out.printf("���� : %d�� ����?\n", price);
		System.out.printf("Į�θ� : %d ~ %d kcal\n", kcalories1, kcalories2);
		System.out.printf("���� : %.1f / %.1f\n", point, total);
		System.out.printf("�ٽ� ���� ���ΰ�? : %b", re_eaten);
				
	}
}
