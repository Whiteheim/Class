// 객체간의 관계
//		A has a B : Human has a cell phone
//		A ins a B : Dog is a animal
public class Aug_16_Main1_HasA2 {
	public static void main(String[] args) {
		//이름이 Kim Andrew, 남자, 폰번호 010-1234-5678출력
		Person p = new Person("Kim Andrew", "남자", "010-1234-5678");
		p.printInfo();
		System.out.println("------------------------------------");
		// 판교포차, 삼평동, 032-1222-3444, Kim Andrew 의 식당
		// 식당 주인 정보까지 출력
		
		
		Bistro b = new Bistro("판교포차", "삼평동", "032-1222-3444", p);
		b.printInfo();
		System.out.println("------------------------------------");
//		 계란말이 , 22000, 판교포차에서 파는 메뉴
		Menu egg = new Menu("계란말이", 22000, b);
		egg.printInfo();
		System.out.println("------------------------------------");
		// 석쇠불고기, 25000
		Menu cow = new Menu("석쇠 불고기", 25000, b);
		cow.printInfo();
		System.out.println("------------------------------------");
		// 석쇠, 5000원, 석쇠불고기를 담은 접시
		Dish grill = new Dish("석쇠", 5000, cow);
		grill.printInfo();
		System.out.println("------------------------------------");
		// 가락시장, 송파구, 석쇠구매장소
		Market ma = new Market("가락시장", "송파구", grill);
		ma.printInfo();
		System.out.println("------------------------------------");
		// 곽두팔, 가락시장을 좋아하는 상인
		Merchant mer = new Merchant("곽두팔", ma);
		mer.printInfo();
		System.out.println("------------------------------------");
		//상인의 이름 출력
		System.out.println(mer.name);
		//상인이 좋아하는 시장 정보를 전체 출력
		System.out.println("------------------------------------");
		mer.m.printInfo();
		System.out.println("------------------------------------");
		// 상인이 좋아하는 시장에서 산 접시 정보
		mer.m.d.printInfo();
		System.out.println("------------------------------------");
		// 상인이 좋아하는 시장에서 산 접시의 가격
		System.out.println(mer.m.d.price);
		System.out.println("------------------------------------");
		// 상인이 좋아하는 시장에서 산 접시에 담긴 메뉴의 정보
		mer.m.d.m.printInfo();
		System.out.println("------------------------------------");
		// 상인이 좋아하는 시장에서 산 접시에 담긴 메뉴 가격
		System.out.println(mer.m.d.price);
		System.out.println("------------------------------------");
		//상인이 좋아하는 시장에서 산 접시에 담긴 메뉴를 파는 식당 연락처
		System.out.println(mer.m.d.m.b.phone);
		System.out.println("------------------------------------");
		//상인이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 주인 연락처
		System.out.println(mer.m.d.m.b.owner.cellphone);
		System.out.println("------------------------------------");
		//계란말이를 파는 사람 연락처
		System.out.println(egg.b.owner.cellphone);
	}
}


