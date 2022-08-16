
public class Bistro {
	String name;
	String location;
	String phone;
	Person owner;
	
	public Bistro() {
		// TODO Auto-generated constructor stub
	}

	public Bistro(String name, String location, String phone, Person owner) {
		super();
		this.name = name;
		this.location = location;
		this.phone = phone;
		this.owner = owner;
		
	}
	
	
	public void printInfo() {
		System.out.printf("��ȣ��	: %s\n", name);
		System.out.printf("��ġ	: %s\n", location);
		System.out.printf("��ȭ��ȣ	: %s\n", phone);
		owner.printInfo();
	}
}
