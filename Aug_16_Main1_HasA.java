// OOP
// static - 고급스킬
// 생성자 - 객체 간의 관계 
// 		A has a B : 사람 has a 핸드폰 : 포함관계
// 		A is a B : 개 is a 동물 : 상속관계
public class Aug_16_Main1_HasA {
	public static void main(String[] args) {
		// 이름이 청포도, 맛이 청포도맛인 사탕
		// 정보 출력 
		Candy c = new Candy("청포도", "청포도맛");
		c.printInfo();
		System.out.println("--------------------");
		
		//이름 롯데 / 위치가 잠실 / 직원수가 100명
		Company co = new Company ("롯데", "잠실", 100);
		co.printInfo();
	
		// 청포도 사탕을 롯데에서 만들었다
		System.out.println("--------------------");
		c.brand = co;
		
		// 청포도 사탕의 제조사의 정보를 출력
		c.brand.printInfo();
		
		System.out.println("--------------------");
		// 삼성 / 수원 / 300명 출력
		// 컴퓨터 cpu i7-1234 / ram 32gb / hdd500gb 삼성 컴퓨터
		// 컴퓨터와 회사의 정보 출력
		
		Samsung s = new Samsung("삼성", "수원", 500); // Company Class 중복 사용 가능
//		Company c2 = new Company("삼성", "수원", 500);
		s.printCompany();
		System.out.println("--------------------");
		Computer com = new Computer("i7-1234", 32, 500, s);
		com.printCom();
		
		
		
	}
	}
