
public class Laptop extends Computer{
	double weight;
	double batteryTime;
	
	public Laptop() {
	}

	public Laptop(String name, int price, String cpu, int ram, int hdd, double weight, double batteryTime) {
		super(name, price, cpu, ram, hdd);
		this.weight = weight;
		this.batteryTime = batteryTime;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
	System.out.printf("무게	: %.2fg\n", weight);
	System.out.printf("배터리 지속 시간	: %.1fh\n", batteryTime);
	}
}
