
public class HongAndKim extends GillDongs {
	int grade;
	
	public HongAndKim() {
		// TODO Auto-generated constructor stub
	}

	public HongAndKim(String name, int age, String affiliation, int grade) {
		super(name, age, affiliation);
		this.grade = grade;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.printf("�г�	: %d�г�\n", grade);
	}
}
