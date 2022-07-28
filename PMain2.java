
public class PMain2 {
	public static void main(String[] args) {
		// Escape Sequence(이스케이프 문자)
		// 		 : 특수한 문자나 기능을 표현할 때 \를 이용해 표현.
		// \t : Tab키 (들여쓰기 용도)
		// \n : New Line (새로 줄을 만드는 용도)
		// \r : Carriage Return (커서를 맨 앞으로)
		// \r\n : Enter 키 기능
		// \b : Back space 기능(1byte만 지움) => Java에서는 사용 x 
		//			C언어 - 한 글자 : 1byte
		//			Java - 한 글자 : 2byte
		//			=> 1byte의 문자로 2byte의 문자를 지우려니 오류가 남.
		// \0 : 공백 (space키 처럼 사용 가능)
		
		System.out.println("이건 t 사용\t할거임");
		System.out.println("이건 n 사용\n할거임");
		System.out.println("이건 r 사용\r할거임");
		System.out.println("이건 rn 사용\r\n할거임");
		System.out.println("이건 b 사용\b할거임");
		System.out.println("이건 0 사용\0할거임");
		
		// Eclips : 가볍게 확인용도로 사용하는 콘솔창이기 때문에 \r or \n 둘 중 하나만 있어도 enter키 처리가 가능. 
		// 파일처리 or 통신 : \n or \r 하나만 쓰게 되면 다 뒤집어 질 수 있다. (주의)
		// Eclips 안에서는 \r 과 \n 은 구분 불가능
		// \n 으로 Enter 처리 하고, 이후 파일 처리에서 \r,\n을 확인할 것
		
		System.out.println("\\(^_^)/");
		// \\ : \를 글자로 인식 (경로를 문자로 표현 할 때 사용)
		System.out.println("(\".\")");
		// \" : \ + 특수문자 => 글자로 인식
		
	}
}
