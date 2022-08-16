
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
		System.out.printf("회사명 : %s\n", name);
		System.out.printf("위치 : %s\n", loca);
		System.out.printf("사원 수 : %d명\n", people);
	}
}
