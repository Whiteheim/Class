import java.util.Scanner;

public class Aug_03_Main9 {

	public static void start() {
		System.out.println("==BMI 검사를 시작합니다.==");
	}

	public static String name() {
		Scanner enter = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = enter.next();
		return name;
	}

	public static double height() {
		Scanner enter = new Scanner(System.in);
		System.out.print("신장을 입력하세요 : ");
		double height = enter.nextDouble();
		return height / 100;
	}

	public static double weight() {
		Scanner enter = new Scanner(System.in);
		System.out.print("체중을 입력하세요 : ");
		double weight = enter.nextDouble();
		return weight;
	}

	public static double BMI(double weight, double height) {
		double result = weight / (height * height);
		return result;
	}

	public static void result(String name, double height, double weight, double BMI) {
		System.out.println("===========결과===========");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("신장 : %.1fm\n", height);
		System.out.printf("체중 : %.1fkg\n", weight);
		System.out.printf("BMI지수는 : %.1f\n", BMI);
	}

	public static String end() throws InterruptedException {
		Scanner enter = new Scanner(System.in);
		System.out.println("종료를 원하시면 Y 버튼을 입력해주세요.");
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
			System.out.println("당신은 고도 비만 입니다.");
		} else if (BMI >= 30) {
			System.out.println("당신은 경도 비만입니다.");
		} else if (BMI >= 35) {
			System.out.println("당신은 중증도 비만입니다.");
		} else if (BMI >= 25) {
			System.out.println("당신은 과체중 입니다.");
		} else if (BMI >= 18.5) {
			System.out.println("당신은 정상 입니다.");
		}

		else {
			System.out.println("당신은 저체중 입니다.");
		}
		end();
	}
}
