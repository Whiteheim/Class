import java.util.Scanner;

public class Aug_03_Main9 {

	public static void start() {
		System.out.println("==BMI �˻縦 �����մϴ�.==");
	}

	public static String name() {
		Scanner enter = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = enter.next();
		return name;
	}

	public static double height() {
		Scanner enter = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		double height = enter.nextDouble();
		return height / 100;
	}

	public static double weight() {
		Scanner enter = new Scanner(System.in);
		System.out.print("ü���� �Է��ϼ��� : ");
		double weight = enter.nextDouble();
		return weight;
	}

	public static double BMI(double weight, double height) {
		double result = weight / (height * height);
		return result;
	}

	public static void result(String name, double height, double weight, double BMI) {
		System.out.println("===========���===========");
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %.1fm\n", height);
		System.out.printf("ü�� : %.1fkg\n", weight);
		System.out.printf("BMI������ : %.1f\n", BMI);
	}

	public static String end() throws InterruptedException {
		Scanner enter = new Scanner(System.in);
		System.out.println("���Ḧ ���Ͻø� Y ��ư�� �Է����ּ���.");
		String yn = enter.next();
		switch (yn) {
		case "Y":
		case "y":
			Thread.sleep(1000);
			break;
		}
		return yn;

	}

	public static void main(String[] args) throws InterruptedException {
		start();
		String name = name();
		double height = height();
		double weight = weight();
		double BMI = BMI(weight, height);
		result(name, height, weight, BMI);

		if (BMI > 40) {
			System.out.println("����� �� �� �Դϴ�.");
		} else if (BMI >= 30) {
			System.out.println("����� �浵 ���Դϴ�.");
		} else if (BMI >= 35) {
			System.out.println("����� ������ ���Դϴ�.");
		} else if (BMI >= 25) {
			System.out.println("����� ��ü�� �Դϴ�.");
		} else if (BMI >= 18.5) {
			System.out.println("����� ���� �Դϴ�.");
		}

		else {
			System.out.println("����� ��ü�� �Դϴ�.");
		}
		end();
	}
}
