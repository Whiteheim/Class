// 생성자 (Java)
//		1. 클래스에 생성자가 존재하지 않으면
//			자바 컴파일러가 생성자를 만들어줌
//		2. 하위클래스 객체를 만들면(Pen)
//			상위클래스 기본생성자를(Product)
//			자동호출
public class Pen extends Product2 {
	String color;

	public Pen() {
	}

	public Pen(String color) {
		super();			// 2. 을 명시해둠 (없어도 무방)
		this.color = color;
	}

	public Pen(String name, int age, String color) {
		super(name, age); // 2.이 실행이 안된 상태
						  // Product2(이름, 가격)
						  // super(parameter)를 가진 생성자를 생성할 땐
						  // 기본생성자가 생기지 않기 때문에 기본생성자를 사용할 수 없다.
		this.color = color;
	}

}
