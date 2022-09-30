package com.sh.sep30;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// JSP Model 2 ---------------------
// http://IP:port/프로젝트명/컨트롤러파일명
//	C : Servlet
//		순간마다 상황판단 -> 흐름 제어
//		doGet(), doPost()를 활용
//		주소에 컨트롤러파일명, 컨트롤러 하나당 GET하나, POST하나 
//			-> 컨트롤러의 수 증가

// Spring MVC -----------------------
// http://IP:Port/top-level-pakage의 마지막자리/임의대로 지정한 값
//	C : 일반 Java Class
//		일반 Method 사용
//		컨트롤러 하나에 여러개의 요청 처리가 가능
//		필요하던 컨트롤러의 수가 대폭 감소
//		주소값 임의지정 가능

@Controller
public class HomeController {
	
	// hehehe.test라는 주소로 GET 요청이 들어오면 
	// index.jsp로 forwarding 해주는 method
	@RequestMapping(value = "/hehehe.test", method = RequestMethod.GET)
	public String testHehehe() {
		
		return "index";
	}
	
	// lalala.test라는 주소로 GET방식의 요청이 들어오면 '라라라' 라는 내용이 
	// 콘솔에 출력되는 method
	@RequestMapping(value = "/lalala.test", method = RequestMethod.GET)
	public void testLalala() {
		System.out.println("라라라");
	}
	
	
	
	
	// 사이트 첫 접속시 method : GET
	// value는 공백 상태
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome() { // String 자료형이 기본
		
			
		return "index"; // 이동할 파일 이름 설정
						// index.jsp로 forwarding
	}
	
}
