//����� �޴°��� ������ extends Object (�ڹ��� ��ü)
// Product is a Object 
public class Product {
	String name;
	int price;

	public Product() {
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.printf("��ǰ��	: %s\n",name);
		System.out.printf("����	: %d��\n",price);
	}
}
