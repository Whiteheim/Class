
public class whatIsValue {
	// 기본형 - 정수
	int intfield;
	byte bytefield;
	short shortfield;
	long longfield;
	// 참조형 - 문자열, 배열
	String stringfield;
	char charfield;
	int[] arryfield;
	//기본형 - 실수
	double doublefield;
	float floatfield;
	
	
	boolean booleanfield;
	
	public void print() {
		System.out.println("int : " + this.intfield);
		System.out.println("double : " + doublefield);
		System.out.println(stringfield);
		System.out.println(booleanfield);
		System.out.println(charfield); // 기본값은 띄어쓰기
									   // (유니코드 \u0000)
		System.out.println(bytefield);
		System.out.println(floatfield);
		System.out.println(arryfield);
		System.out.println(longfield);
	}
}
