
public class Dish {
	String name;
	int price;
	Menu m;
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}

	
	public Dish(String name, int price, Menu m) {
		super();
		this.name = name;
		this.price = price;
		this.m = m;
	}


	public void printInfo() {
		System.out.printf("��ǰ��	: %s\n", name);
		System.out.printf("����	: %d\n", price);
	}
}
