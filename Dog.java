// A is a B : 상속관계
// 개는 동물 '이다.'
public class Dog extends Animal { // Animal Class의 기능을 받아옴
	// Animal Class 안에 Dog Class가 '상속'되어 있는 상태
	// 상속 : inheritance 
	// 확장 : extend -> 의 개념이 더 맞음
	
	String inhabit;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	
	public Dog(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}


	// @xx : Annotation -> 어떠한 기능을 자동으로 연결해준다
	@Override //*****   -> 상속 받아온 method의 기능을 바꿔주는 것
		public void printInfo() {
			// override를 사용하려면 
			// 		상속받은 Class에서의 method명과 같아야함.
		super.printInfo(); // 상위 클래스.printInfo(); 
//								animal
		System.out.printf("거주지	: %s\n", inhabit);
		}
	// VS
	// ***Overloading (Override와의 차이)
	//			method를 만들 때 같은 기능이라면 method명을 같게 함
	//			parameter의 자료형이 다르거나, 갯수가 달라야 사용가능
	
	
	
}
