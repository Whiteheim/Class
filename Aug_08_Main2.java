import java.util.Iterator;

public class Aug_08_Main2 {
	public static void main(String[] args) {
		String[] ss = {"ㅋㅋ", "ㅎㅎ", "ㅇㅇ", "^_^"};
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		System.out.println("======================");
		String s = null;
		for (int i = 0; i < ss.length; i++) {
			s = ss[i];
			System.out.println(s);
		}
		System.out.println("======================");
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		System.out.println(ss[3]);
		System.out.println("======================");
		/* for-each (신형 for 문)
		 *  	배열의 요소를 변경할때 사용 X
		 *  		: 원본을 쓰는게 아닌 임시로 복사해 사용하는 개념
		 *  		  원본에는 영향이 없음
		 *  	순서 조절 불가능
		 *  		: i(인덱스)가 없어 원하는 값만을 사용할 수 없음
		 *  		  -> 활용도가 낮음 (배열의 전체를 확인하는데 사용)
		 *  for (자료형 변수명 : 배열) {
		 *  	내용
		 *  }
		 *  
		 */
		for (String sss : ss) { // 배열 ss의 요소를 sss에 담음
			System.out.println(sss); // 배열의 요소 순서대로 출력
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
