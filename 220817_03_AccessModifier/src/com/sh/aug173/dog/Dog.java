package com.sh.aug173.dog;
// 접근제어자 (Access Modifier)
//		멤버변수 또는 클래스에서 사용
// 		외부에서 (멤버변수 or 클래스)에 접근하지 못하도록 제한하는 역할

public class Dog {
							//접근 범위
	public int a;			// 접근 제한 없음
	protected int b;		// 같은 패키지 내에서 사용
							// 다른 패키지라면 그 하위클래스에서 사용 가능 (실제론 사용 불가)
	/* default */ int c;	// (default : 아무것도 쓰지않은것 / 생략해서 사용)
							// 같은 패키지 내에서 사용
	private int d;			// 클래스 내부에서만 사용 가능
	
	// 주로 사용하게 될 것은 public 과 private
}
