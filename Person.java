
public class Person {
	
	String name;
	String sex;
	String cellphone;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex, String cellphone) {
		super();
		this.name = name;
		this.sex = sex;
		this.cellphone = cellphone;
	}
	
	public void printInfo() {
		System.out.printf("이름	: %s\n", name);
		System.out.printf("성별	: %s\n", sex);
		System.out.printf("휴대폰 번호	: %s\n", cellphone);
	}
}
