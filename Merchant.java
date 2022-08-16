
public class Merchant {
	String name;
	Market m;
	public Merchant() {
		// TODO Auto-generated constructor stub
	}

	
	public Merchant(String name, Market m) {
		super();
		this.name = name;
		this.m = m;
	}


	public void printInfo() {
		System.out.printf("이름	: %s\n", name);
		System.out.println("가락시장에 인생을 담은 상인");
	}
}
