// ???
//		???
// Stack
// 		변수를 만들 때 마다 아래에서부터 차곡차곡 쌓임
//		프로그램이 종료되면 이 영역은 알아서 다 정리가 됨
// Heap
//		컴퓨터가 적당하다고 판단한 위치에 만듬
//		자동으로 정리 X (핸드폰 메모리 정리 어플이 있었던 이유)
// **Garbage Collection : Heap영역 자동정리 시스템 (**면접질문)
// 		작동 시기 - 그 번지에 더이상 접근 할 방법이 없어질 때 작동함

public class Aug_10_Main5 {
	// 마스크
	// 이름
	// 구매처
	// 가격
	// 정보 출력

	public static void main(String[] args) {
		Mask m1 = new Mask();
		m1.maskName = "KF94 황사방역마스크";
		m1.store = "쿠팡";
		m1.cost = 1100;
		System.out.println(m1);
		m1.printMaskInfo();
		System.out.println("======================");
		Mask m2 = m1; // Mask m1은 m2라는 별명이 하나 더 생김
		m1 = null;
		System.out.println(m1); // 위치값을 가리키지 않음***
		System.out.println(m2);
		m2 = null; // 이 줄 다음 부터 메모리 정리가 됨
		// Mask의 정보가 사라지는 시점. Garbage Collection 작동
		System.out.println(m2);
		m2.printMaskInfo(); // m2 의 정보를 출력하는게 불가능
		// 작동이 안되면 프로그램이 다 끝나서야 정리가 됨

	}
}


// 프로그램이 종료 되면 Stack 영역이 날아가고
// 		=> Heap 영역에  접근을 못하게 되어 Garbage Collection 작동
























