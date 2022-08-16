
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
		System.out.println("판교포차의 메뉴");
		System.out.printf("메뉴명	: %s\n", name);
		System.out.printf("가격	: %d원\n", price);
		b.printInfo();
	}
}
