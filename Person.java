
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
		System.out.printf("�̸�	: %s\n", name);
		System.out.printf("����	: %s\n", sex);
		System.out.printf("�޴��� ��ȣ	: %s\n", cellphone);
	}
}
