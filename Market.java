
public class Market {
	String name;
	String loca;
	Dish d;
	
	public Market() {
		// TODO Auto-generated constructor stub
	}

	
	public Market(String name, String loca, Dish d) {
		super();
		this.name = name;
		this.loca = loca;
		this.d = d;
	}


	public void printInfo() {
		System.out.printf("상호명 : %s\n", name);
		System.out.printf("위치 : %s\n", loca);
	}
}
