
public class Doctor {

	String name;
	int age;
	Customer c = new Customer();

	public void printDoctor() {
		System.out.println("<<<<전문의>>>>");
		System.out.println(this.name);
		System.out.println(age);
		System.out.println("-------------------");

	}

	public void callCustomer(Customer c) {
		System.out.printf("%s씨 들어오십시오\n", c.name);
	}

	public double questionH(Customer c) {
		System.out.println("신장이 얼마나 되시나요? : ");
		double h = c.height();
		if (h > 1 && h < 300) {
		} else {
			System.out.println("---------------");
			System.out.println("장난치지 마세요");
			System.out.println("---------------");
		}
		return (h > 1 && h < 300) ? h / 100 : questionH(c);
	}

	public double questionW(Customer c) {
		System.out.println("체중이 얼마나 되시나요? : ");
		double w = c.weight();
		if (w > 1) {
		} else {
			System.out.println("---------------");
			System.out.println("장난치지 마세요");
			System.out.println("---------------");
		}
		return (w > 1) ? w : questionW(c);	
		
	}
	
	public double calcBMI(Customer c) {
		return c.weight / (c.height * c.height); 
	}

	public String bmiresult(Customer c) {
		if (c.bmi >= 40) {
			return "고도비만 입니다.\n";
		} else if (c.bmi >= 35) {
			return "중증도비만 입니다.\n";
		} else if (c.bmi >= 30) {
			return "경도비만 입니다.\n";
		} else if (c.bmi >= 25) {
			return "과체중 입니다.\n";
		} else if (c.bmi <= 18.5) {
			return "정상 입니다.\n";
		} else {
			return "저체중 입니다.\n";
		}
		
	}
	
	public void tellResult(Customer c) {
		System.out.printf("키는 %.1fcm, 체중은 %.1fkg 입니다.\n", c.height * 100, c.weight);
		System.out.printf("BMI = %.1f\n", c.bmi);
		System.out.printf("그래서 %s", c.bmiresultf);
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
