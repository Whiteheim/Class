
public class Menu {
	String name;
	int price;
	Bistro b;
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	
	public Menu(String name, int price, Bistro b) {
		super();
		this.name = name;
		this.price = price;
		this.b = b;
	}


	public void printInfo() {
		System.out.println("�Ǳ������� �޴�");
		System.out.printf("�޴���	: %s\n", name);
		System.out.printf("����	: %d��\n", price);
		b.printInfo();
	}
}
