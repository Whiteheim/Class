
public class Samsung {
	String name;
	String loca;
	int people;
	
	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	public Samsung(String name, String loca, int people) {
		super();
		this.name = name;
		this.loca = loca;
		this.people = people;
	}
	
	public void printCompany() {
		System.out.printf("ȸ��� : %s\n", name);
		System.out.printf("��ġ : %s\n", loca);
		System.out.printf("��� �� : %d��\n", people);
	}
}
