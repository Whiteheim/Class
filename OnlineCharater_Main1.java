// 클라이언트가 캐릭터 생성 기능을 만들어 달라고 요구 -> 만드는데 성공함
// 		건네주는 방법은 ?
// 결론 : .java 파일 말고 .jar파일로 건네주어라.
//		.java : 소스까지 공개
//		.jar : 소스를 공개하지 않고 기능만을 전달함.
//  JAR(Java Archive, 자바 아카이브) 파일
// 		: 기계어 상태로 바꿔서 압축을 해놓은 형태 (Java에서 실행만 가능)

// 한국어 -번역(개발)-> .java로 저장
// (저장할 때) .java파일 -변역(compile)-> .class파일 (기계어 / 바이트코드)를 자동으로 생성해줌
// .class파일 -실행-> 

// 우리가 만든 코드는 .java파일로 저장되고,
// 이 때 compile 과정을 통해 .class파일, 즉 기계어로 변환되어 자동으로 생성
// 실행될때는 .class의 형태로 JVM에서 가동되는 형태

// .java파일 : 사람이 보려고 만든 파일
// .class파일 : 실제로 Java에서 구동하는 파일

// 기계어 / 바이트코드로 변환하는 이유
// 		1. 바이트코드를 사용하면 실행이 빠름
// 		2. 소스를 노출하게 되면 이 파일이 어떤 프로그램인지 알 수 있기 때문 -> '보안'상의 이유
//  -> 다른 이에게 기능을 넘겨줄 때 소스를 알려주지 말고, 그 기능만을 사용하게 해줘야함.
// 		(.java파일이 아닌 .jar파일로)

// JavaDoc
// JavaDoc의 역할 : 제품 설명서
//  	우리가 만든 프로그램을 보기 쉽게 HTML형식, 우리가 알고있는 WEB의 형식으로 
// 		만들어서 보기 편하게 문서화 시킨것

//JavaDoc의 특징 : 
// 주석의 형태 : /** (내용) */
// 주석의 안쪽은 크게 2가지로 나뉨

//		1. 설명문
//			주석의 시작에서 첫번째 태그 섹션까지의 부분
//			설명문은 HTML로 설명되기 때문에 단순히 주석 작성시에
//			엔터를 이용해 줄을 바꿔 입력했다 하더라도
//			그대로 이어져서 출력이 됨.
//			줄 바꿈 처리를 하고 싶다면 <p>를 작성해주면 됨.

//		2. 태그섹션
//			첫번째 문자가 '@'로 시작함
//				@author : 이 프로그램의 작성자, 기본값으로 Windows 계정 ID
//				@version : 프로그램의 버전
//				@param : parameter에 대한 설명시 사용
//				@throws : 예외처리에 대한 설명
//				@return : method가 void가 아닌 반환값이 있을 때, 그 반환값에 대한 설명

// JavaDoc 생성
// 프로그램 실행 후 -> Project -> Generate JavaDoc -> 저장 장소 선택 후 Finish

/**
 * 
 * @author white_heim
 * @version 1.1.14.1
 * <p>
 * 게임 캐릭터의 정보를 가지고 있는 클래스
 */
public class OnlineCharater_Main1 {
	String nickname;
	int level;
	String job;
	String weapon;
	
	/**
	 * 게임 캐릭터를 생성합니다.
	 * <p> 기본 무기는 몽둥이, 기본 직업은 초보자 입니다.
	 * @param nickname 캐릭터의 이름; 길이는 3자이상 10자 이하이어야 합니다.
	 * @throws IllegalArgumentException 캐릭터의 nickname 길이가 정해진 범위를 벗어나면,
	 * 즉 
	 * ({@code} nickname < 3 || nickname > 10}) 이면 발생합니다.
	 */
	public OnlineCharater_Main1(String nickname) {
		this.level = 1;
		this.job = "초보자";
		this.weapon = "몽둥이";
		if (nickname.length() < 3 || nickname.length() > 10) {
			throw new IllegalArgumentException("캐릭터의 이름은 3자 이상 10자 이하 입니다."); //에러 메세지
		}
		this.nickname = nickname;
	}
	
	/**
	 * 캐릭터의 레벨을 올려주는 메소드입니다.
	 */
	public void levelUp() {
		this.level++;
		
	}
	
	/**
	 * 캐릭터의 직업을 변경합니다.
	 * @param job 캐릭터의 변경할 직업
	 * @throws IllegalArgumentException 캐릭터의 레벨이 10을 넘지 않았다면 발생합니다.
	 */
	public void setJob(String job) {
		if (this.level < 10) {
			throw new IllegalArgumentException("캐릭터의 레벨이 10을 넘지 않습니다.");
		}
		this.job = job;
	}
	
	/**
	 * 생성된 캐릭터의 status값을 보여주는 메소드입니다.
	 */
	public void printInfo() {
		System.out.printf("닉네임 : %s\n", this.nickname);
		System.out.printf("레벨 : %d\n", level);
		System.out.printf("직업 : %s\n", job);
		System.out.printf("무기 : %s\n", weapon);
	}
}
