
public class PMain1 {
	public static void main(String[] args) {
		// syso : 출력 기능
		// syso + 자동완성(ctrl + space bar)
		System.out.println();

		// Print 의 형태
		/*
		 * println : console창에 글자를 출력하고, 줄 바꿈 (가장 많이 사용, 자동완성도 얘 밖에 없음) 
		 * => 괄호 안에 값을 넣지않으면 : 줄을 바꿔주는 역할 
		 * print : Console 창에 글자를 출력하고, 줄 바꿈 X 
		 * printf : Console 창에 형식을 지정 하여 글자를 출력 (ex: 소수점 자리수,...etc.) 사용 빈도 println > print 
		 * EUC-KR : 에서는 외계어를 인코딩 할 수 없음
		 */

		System.out.println("이건 Println으로 출력함");
		System.out.print("이건 Print로 출력함");
		System.out.println();
		System.out.printf("이건 printf");
		
		// print 뒤 ()안에 ""입력 후 내용 채우기,
		
		// ; : 문장의 끝맺음 용도
		
		System.out.println();
		System.out.println(1 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 8);
		System.out.println(10 / 2);

		// "" 사이에 내용을 넣으면 문자자체로 인식 되어짐. ex) "1+2" =출력=> 1+2
		// 내용들이 너무 붙어있는 경우 가독성 ↓ => ctrl + shift + f 사용 (단순히 가독성을 위해 사용함.)
		/* 한 글자 당 2byte의 용량 차지함
		 * 파일압축 :  띄어쓰기 or 줄바꿈 or 들여쓰기를 없애서 압축시킴
		 */
		
		// 가독성 vs 자원 절약
		/* 최근 컴퓨터의 사양이 좋아져서 자원 절약은 거의 무쓸모
		 * 코드 짠 후 정렬 단축키 애용하면 마음이 편해짐
		 */
		
	}
}
