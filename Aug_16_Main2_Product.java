// A is a B : 상속관계
// 쇼핑몰 - 상품에 대한 정보를 게시하고 싶음
public class Aug_16_Main2_Product {
	public static void main(String[] args) {
		//신발 (이름, 가격, 사이즈)
		//출력
		Shoes s = new Shoes("운동화", 53000, 265);
		s.printInfo();
		System.out.println("-------------------------------------");
		
		//컴퓨터 (이름, 가격, cpu, ram, hdd)
		//출력
		Computer c = new Computer("xx컴퓨터", 1810000, "i9-1160ti", 64, 1000);
		c.printInfo();
		System.out.println("-------------------------------------");
		
		//노트북 (이름, 가격, cpu, ram, hdd, 무게, 배터리 지속시간)
		//출력
		Laptop l = new Laptop("xx게이밍노트북", 1000000, "i3-1080", 16, 512, 3010, 7);
		l.printInfo();
		System.out.println("-------------------------------------");
		
	}
}
