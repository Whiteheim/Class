
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
		System.out.printf("상호명	: %s\n", name);
		System.out.printf("위치	: %s\n", location);
		System.out.printf("전화번호	: %s\n", phone);
		owner.printInfo();
	}
}
