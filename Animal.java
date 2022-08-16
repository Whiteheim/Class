
public class Animal {
	String sort;
	int age;
	
	//생성자 초기화
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//생성자 오버로딩
	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}
	// 정보 출력 method
	public void printInfo() {
		System.out.printf("종류	: %s\n", sort);
		System.out.printf("나이	: %d\n", age);
	}
}
