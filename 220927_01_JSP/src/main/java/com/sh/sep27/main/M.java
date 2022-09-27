package com.sh.sep27.main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 값
//		FirstC -> firstV 요청 소속
//			parameter(a, b)
//			attribute(cc)
//		요청에 닿으면 값 사용 가능
//		새로운 요청이 일어나는 상황에서는 값 사용 불가
//		Third까지 값을 유지한 채 이동 할 방법이 필요 (현재 Third쪽으로는 위의 요청이 유지 불가)
//			:session 사용 

//		- parameter 
//			GET		: 주소에 입력되어 전달 (컨트롤러?파라미터명=값&파라미터명=값&...)
//			POST	: Tomcat내부로 전달 (주소에 컨트롤러?파라미터명=값 표기 x)

//			V에서 만든 값 (input으로 입력 후 전달)
//			String or String[] (자료형)
//			request 소속 (요청시 생성)

//			값 읽기
//				Java : request.getParameter("파라미터명");
//				JSP(EL) : ${param.파라미터명 }

//		- request 소속 attribute
//			Model에서 만든 값
//			Object (자료형)
//			request 소속 

//			값 읽기
//				Java : request.getAttribute("어트리뷰트명");
//				JSP(EL) : ${어트리뷰트명 }
//--------------------------------------------------------------
// HTTP 프로토콜
//		특성 / 약점
//			1. Connectionless
//				사용자가 요청한 후, 응답을 받았을 때 연결이 끊김
//			2. Stateless
//				HTTP통신이 끝나면 모든 상태를 끊어버림

//	약점을 보완하기 위해 Cookie / Session 사용

//	Cookie
//		사용자의 상태정보를 컴퓨터에 저장, 이후 필요시 참조
//		사용자가 따로 요청하지 않아도 브라우저가 요청을 하면 자동으로 서버에 전송
//		한 번 유지 시간을 정해두면 브라우저의 종료 여부와 상관없이 쿠키 유지 가능
//			=> ID / PW 저장하기, 쇼핑몰 장바구니, 팝업창 (오늘 하루 보지않기)

//		Model 에서 만든 값
//		String (자료형)
//		기본 유지 시간 - 24시간
//		생성되면 사용자의 컴퓨터에 저장
//		최근엔 암호화 하여 저장 -> 하지만 보안에 취약하기때문에 노출되면 위험한 정보는 쿠키에 저장x

//		값 읽기
//			Java : 현재 사용자 컴퓨터에 만들어져 있는 쿠키들 -> 그 중에 이 프로젝트의 쿠키를 찾아 읽기
//			JSP : ${cookie.이름.value }

// Session (사용자와 서버를 연결하는 Stream의 느낌)
//		쿠키를 기반으로 작동하지만 사용자의 정보를 Server에서 관리
//		접속 시간 설정 가능, 일정 시간동안 응답이 없으면 정보 삭제
//		쿠키보다는 보안이 비교적 좋음, 메모리 사용량이 큼
//		동접자 수가 많으면 서버 과부하 -> 성능 저하

//		session 소속 attribute
//		Model에서 만든 값
//		Object (자료형)
//		연결만 되어 있으면 어디서든지 사용이 가능
//		유지시간 : 기본 30분, 시간 설정 가능
//			설정 시간 동안 아무 요청 없으면 자동으로 연결끊김

//		Cookie	: 정해놓은 시간이 만료되거나, 쿠키를 삭제하기 전까지는 유지
//		Session	: 만료되는 시간을 지정 가능, 브라우저가 종료되면 바로 삭제


public class M {
	public static void makeSecondData(HttpServletRequest req, HttpServletResponse res) {
		int c = 3000;
		req.setAttribute("cc", c);
		
		int d = 40000;
		HttpSession hs = req.getSession(); 	// 사용자와 서버간의 연결 상태 (Stream)
		hs.setMaxInactiveInterval(15);		// session의 유지시간을 15초로 설정
		hs.setAttribute("d", d);			// session소속의 attribute
		
		String e = "500000";
		Cookie ck = new Cookie("e", e);		
		ck.setMaxAge(15);					// 15초간 사용자의 컴퓨터에 파일로 저장
		res.addCookie(ck);					// 응답 객체에 쿠키를 추가
		
	}
	
	public static void printSecondDataNew(HttpServletRequest req) {
		try {
			HttpSession hs = req.getSession();
			int d = (Integer)hs.getAttribute("d"); // Object를 형변환
			System.out.println(d);
		} catch (Exception e) {
		}
		// 해당 프로젝트, 네이버, 다음, 유튜브 , etc
		// 현재 사용자 컴퓨터의 쿠키들을 불러옴
		Cookie[] cks = req.getCookies();			// 저장되어 있는 쿠키들 => '배열'
		for (Cookie ck : cks) {
			if (ck.getName().equals("e")) {			// 쿠키 이름이 e인 값을
				System.out.println(ck.getValue()); 	// 출력
			}
			
		}
	}
	
	public static void printSecondData(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int c = (Integer) req.getAttribute("cc");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}











































































