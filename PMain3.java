
public class PMain3 {
	public static void main(String[] args) {
		// print
		// System.out.print("줄바꿈 없는 프린트");
		
		// printf
		// 형태 : System.out.printf("%?", 값);
		
		// 정수 (decimal)
		/* %d : 정수데이터가 들어 올 자리 (10진수) -> 모든 언어 공통
		 * %xd : x자리의 숫자를 만들고 빈칸은 공백으로 둠
		 * %0xd : 빈자리를 0으로 채워 x자리의 숫자로 만들어 줌
		 */
		
		System.out.printf("%d\n", 15);
		System.out.printf("%5d\n", 15);
		System.out.printf("%05d\n", 15);
		System.out.println("-----------------");
		// 실수 (float)
		// %f : 실수 데이터가 들어올 자리 
		// %.xf : 소수점 이하의 자리수 (잘리는 부분은 반올림) 
		//			빈자리는 0으로 채워짐
		
		System.out.printf("%f\n", 3.141592);
		System.out.printf("%.10f\n", 3.141592168795);
		System.out.printf("%.8f\n", 3.14159);
		System.out.printf("%010f\n", 3.14159);
		System.out.println("-----------------");
		
		// 문자열 (string)
		// %s : 문자 데이터가 들어 올 자리
		// 숫자 : 그냥 입력 하면 됨.
		// 문자 : 그냥 입력 하게 되면 Java의 문법으로 해석 하게 됨 => 오류 발생
		//	=> "내용" 으로 입력해야 오류 x 
		
		System.out.printf("%d년\n", 2022);
		System.out.printf("%02d월\n", 07);
		System.out.printf("%d일\n", 27);
		System.out.printf("%s\n", "날짜 : 2022-07-27");
		System.out.printf("날짜 : %4d-%02d-%02d\n", 2022,7,27);
		System.out.printf("%s\n", "날씨 : 더움");
		System.out.printf("날씨 : %s\n", "더움");
		System.out.printf("%s\n", "기온 : 32도");
		System.out.printf("기온 : %02d도\n", 32);
		System.out.printf("%s\n", "습도 : 30.71%");
		System.out.printf("습도 : %02.2f%%\n", 30.71);
		// %%: %를 글자로 표현하고 싶을 때 (printf 에서만)
		// printf의 f = Format 의미
		
		
		
			}
}
