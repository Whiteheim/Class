
public class Doctor {

	String name;
	int age;
	Customer c = new Customer();

	public void printDoctor() {
		System.out.println("<<<<������>>>>");
		System.out.println(this.name);
		System.out.println(age);
		System.out.println("-------------------");

	}

	public void callCustomer(Customer c) {
		System.out.printf("%s�� �����ʽÿ�\n", c.name);
	}

	public double questionH(Customer c) {
		System.out.println("������ �󸶳� �ǽó���? : ");
		double h = c.height();
		if (h > 1 && h < 300) {
		} else {
			System.out.println("---------------");
			System.out.println("�峭ġ�� ������");
			System.out.println("---------------");
		}
		return (h > 1 && h < 300) ? h / 100 : questionH(c);
	}

	public double questionW(Customer c) {
		System.out.println("ü���� �󸶳� �ǽó���? : ");
		double w = c.weight();
		if (w > 1) {
		} else {
			System.out.println("---------------");
			System.out.println("�峭ġ�� ������");
			System.out.println("---------------");
		}
		return (w > 1) ? w : questionW(c);	
		
	}
	
	public double calcBMI(Customer c) {
		return c.weight / (c.height * c.height); 
	}

	public String bmiresult(Customer c) {
		if (c.bmi >= 40) {
			return "���� �Դϴ�.\n";
		} else if (c.bmi >= 35) {
			return "�������� �Դϴ�.\n";
		} else if (c.bmi >= 30) {
			return "�浵�� �Դϴ�.\n";
		} else if (c.bmi >= 25) {
			return "��ü�� �Դϴ�.\n";
		} else if (c.bmi <= 18.5) {
			return "���� �Դϴ�.\n";
		} else {
			return "��ü�� �Դϴ�.\n";
		}
		
	}
	
	public void tellResult(Customer c) {
		System.out.printf("Ű�� %.1fcm, ü���� %.1fkg �Դϴ�.\n", c.height * 100, c.weight);
		System.out.printf("BMI = %.1f\n", c.bmi);
		System.out.printf("�׷��� %s", c.bmiresultf);
	}

	public void start(Customer c) {
		callCustomer(c);
		c.height = questionH(c);
		c.weight = questionW(c);
		c.bmi = calcBMI(c);
		c.bmiresultf = bmiresult(c);
		tellResult(c);
	}

}
