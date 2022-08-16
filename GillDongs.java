
public class GillDongs {
	String name;
	int age;
	String affiliation;

	public GillDongs() {
		// TODO Auto-generated constructor stub
	}

	public GillDongs(String name, int age, String affiliation) {
		super();
		this.name = name;
		this.age = age;
		this.affiliation = affiliation;
	}

	public void printInfo() {
		System.out.printf("이름	: %s\n", name);
		System.out.printf("나이	: %d\n", age);
		System.out.printf("소속	: %s\n", affiliation);
	}
}
