// Candy has a Company : 제조사 (v) /사탕이 회사를 가짐
// Company has a Candy : 제품 /회사가 가진 제품
public class Candy {
	String name;
	String taste;
	Company brand;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	
	public Candy(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	
	public void printInfo() {
		System.out.printf("제품명 : %s\n",name);
		System.out.printf("맛 : %s\n", taste);
	}
	
}
