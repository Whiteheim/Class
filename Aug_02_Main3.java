import java.util.Scanner;

// 비만도 검사 프로그램 (함수 .ver)
// 표준체중을 구하는 공식이 *0.9 -> *0.8로 바뀌었을 때 , 수정(유지/보수)이 용이함
// ctrl + shift + / (numpad) : 함수 내용 닫기
// ctrl + shift + * (numpad) : 함수 내용 열기
// Alt + Shift + R : 같은 단어 동시에 수정 (같은 함수 내에 존재하는단어만)

public class Aug_02_Main3 {
	public static double height() {
		Scanner bodysize = new Scanner(System.in);
		System.out.print("키 : ");
		double height = bodysize.nextDouble();
		return height;
	}
	
//  메모리 절약 ↓ vs 가독성↑
//	public static double height() {
//		System.out.print("키 : ");
//		return new Scanner(System.in).nextDouble();
//	}

	public static double weight() {
		Scanner bodysize = new Scanner(System.in);
		System.out.print("체중 : ");
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
		String result = bmi > 120 ? "비만" : "!비만";
		return result;
	}

	public static void rresult (double a, double b, double c, double d, String e){
		System.out.printf("당신의 키는 %.1fcm\n", a);
		System.out.printf("당신의 체중은 %.1fkg\n", b);
		System.out.printf("당신의 표준체중은 %.1fkg\n", c);
		System.out.printf("당신의 비만도는 %.1f\n", d);
		System.out.printf("따라서 당신은 %s입니다.\n", e);
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

