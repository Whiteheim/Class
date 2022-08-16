
public class Aug_16_Main3_GilDongs {
	public static void main(String[] args) {
		// 홍길동, 17살, 판교고등학교, 1학년
		HongAndKim h = new HongAndKim("홍길동", 17, "판교고등학교", 1);
		h.printInfo(); // 홍 / 김 나눌 필요가 없었다
		System.out.println("---------------------------");
		// 김길동, 21살, 성균관대학교, 2학년
		HongAndKim k = new HongAndKim("김길동", 21, "성균관대학교", 2);
		k.printInfo();
		System.out.println("---------------------------");
		// 고길동, 22살, 육군, 상병
		Ko ko = new Ko("고길동", 22, "육군", "상병");
		ko.printInfo();
		System.out.println("---------------------------");
	
	
	
	}
}
