
public class Ko extends GillDongs {
	String grade;
	
	public Ko() {
		// TODO Auto-generated constructor stub
	}

	public Ko(String name, int age, String affiliation, String grade) {
		super(name, age, affiliation);
		this.grade = grade;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.printf("°è±Þ	: %s\n", grade);
	}
}
