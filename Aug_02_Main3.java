import java.util.Scanner;

// �񸸵� �˻� ���α׷� (�Լ� .ver)
// ǥ��ü���� ���ϴ� ������ *0.9 -> *0.8�� �ٲ���� �� , ����(����/����)�� ������
// ctrl + shift + / (numpad) : �Լ� ���� �ݱ�
// ctrl + shift + * (numpad) : �Լ� ���� ����
// Alt + Shift + R : ���� �ܾ� ���ÿ� ���� (���� �Լ� ���� �����ϴ´ܾ)

public class Aug_02_Main3 {
	public static double height() {
		Scanner bodysize = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = bodysize.nextDouble();
		return height;
	}
	
//  �޸� ���� �� vs ��������
//	public static double height() {
//		System.out.print("Ű : ");
//		return new Scanner(System.in).nextDouble();
//	}

	public static double weight() {
		Scanner bodysize = new Scanner(System.in);
		System.out.print("ü�� : ");
		double weight = bodysize.nextDouble();
		return weight;
	}

	public static double aweight(double height) {
		double aweight = (height - 100) * 0.9;
		return aweight;
	}

	public static double BMI(double weight, double aweight) {
		double bmi = (weight / aweight) * 100;
		return bmi;
	}

	public static String resultbmi(double bmi) {
		String result = bmi > 120 ? "��" : "!��";
		return result;
	}

	public static void rresult (double a, double b, double c, double d, String e){
		System.out.printf("����� Ű�� %.1fcm\n", a);
		System.out.printf("����� ü���� %.1fkg\n", b);
		System.out.printf("����� ǥ��ü���� %.1fkg\n", c);
		System.out.printf("����� �񸸵��� %.1f\n", d);
		System.out.printf("���� ����� %s�Դϴ�.\n", e);
	}
		
	public static void main(String[] args) {
		double height = height();
		double weight = weight();
		double aweight = aweight(height);
		double bmi = BMI(weight, aweight);
		String result = resultbmi(bmi);
		rresult(height, weight, aweight, bmi, result);
	}
}

