
public class Company {
	
	String name;
	String loca;
	int people;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, String loca, int people) {
		super();
		this.name = name;
		this.loca = loca;
		this.people = people;
	}
	
	public void printInfo() {
		System.out.printf("ȸ��� : %s\n", name);
		System.out.printf("��ġ : %s\n", loca);
		System.out.printf("��� �� : %d��\n", people);
	}
}
