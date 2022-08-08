// 면접 단골 문제
// ***Call By Value, Call By Reference
// Call by Value : 변수의 '값'을 복사해서 함수의 파라미터 값으로 사용하는 것
// Call by Reference : 변수를 참조하는 주소값(번지값)을 파라미터로 전달하는 것 (Java에서는 없음)

public class Aug_08_Main3 {
	public static void test(int a, int[] b, int[] c) {
		System.out.println(b); // 번지값
		System.out.println(c); // 번지값
		System.out.println(a); // 10
		System.out.println(b[0]); // 10
		System.out.println(c[0]); // 10
		System.out.println("--------------");
		a = 100;
		b[0] = 100; // main쪽에 영향을 줌 (참조형)
					// ->기본형과 참조형의 차이 //주소값이 아닌 요소를 바꾸는 것 (추가는 안되고 수정은 가능)
		c = new int[] { 100, 200 }; // 새로운 수 제작
									// new int[] 가 있어야 새로운 배열 생성 -> 약식을 못씀
									// 이후 new int[] 가 정규식이 되어 사용 가능
		System.out.println(b); // 번지값
		System.out.println(c); // 번지값 main의 c 와 다른 새로운 번지값
		System.out.println(a); // 100
		System.out.println(b[0]); // 10 -> 100
		System.out.println(c[0]); // 100
	}

	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };
		int[] c = { 10, 20 };
		System.out.println(b); // 번지값
		System.out.println(c); // 번지값
		System.out.println("--------------");
		test(a, b, c);
		System.out.println("--------------");
		System.out.println(a); // 10
		System.out.println(b[0]); // 10 -> 100 // *** 값 변경에 영향을 받음
		System.out.println(c[0]); // 10 // *** 값 변경에 영향을 받지 않음
									// test 함수의 변경된 c와는 다름
	}
}
