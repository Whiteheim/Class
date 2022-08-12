import java.util.Scanner;

public class Customer {
	Scanner enter = new Scanner(System.in);

	String name;
	int age;
	double height;
	double weight;
	double bmi;
	String bmiresultf;
	
	
	
	public void printCustomer() {
		System.out.println("####È¯ÀÚ####");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("-------------------");
	}

	public double height() {
		return enter.nextDouble();
	}
	
	public double weight() {
		return enter.nextDouble();
	}

}
