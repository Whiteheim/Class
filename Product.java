//상속을 받는곳이 없으면 extends Object (자바의 객체)
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
		System.out.printf("제품명	: %s\n",name);
		System.out.printf("가격	: %d원\n",price);
	}
}
