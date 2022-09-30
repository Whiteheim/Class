package com.sh.sep30.calc;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 새 패키지를 만들때는 top-level-package 뒤에 추가
// com.sh.sep30.calc 
// com.sh.calc X

@Controller
public class CalcController {
	
	// 1. JSP 스타일 - 파일업로드, 날짜, ...
	// 요청파라미터 : String -> 형변환 후 사용
	
//	@RequestMapping(value = "/calculate.do", method = RequestMethod.GET)
//	public String calcXY(HttpServletRequest req) {
//		int x = Integer.parseInt(req.getParameter("x"));
//		int y = Integer.parseInt(req.getParameter("y"));
//		System.out.println(x);
//		System.out.println(y);
//		return "index";
//	}
	
	// GET방식 요청파라미터(주소)에 한글 처리
	//		Tomcat 설정 (server.xml)
	//		자동으로 인코딩 할 때, 어떤 방식을 사용할 지 server.xml 63번줄에
	//		URIEncoding="UTF-8" 작성
	
	// POST방식 요청파라미터에(서버 내부) 한글처리
	//		프로젝트 내에서 설정
	//		JSP : 파라미터값 읽기 전에 req.setCaraterEncoding("UTF-8");
	// Spring : web.xml에서 설정
	
	// 2. Spring 스타일
//	
//	@RequestMapping(value="/calculate.do", method = RequestMethod.POST)
//	public String calcXY(
//		@RequestParam(value="n") String n,
//		@RequestParam(value="x") int x,
//		@RequestParam(value="y") int y) {
//		System.out.println(n);
//		System.out.println(x);
//		System.out.println(y);
//		return "index";
//	}
	
	// Spring 스타일 2
	
	@Autowired
	private CalcDAO cDAO; // servlet-context.xml에 등록된
						  // CalcDAO객체와 자동으로 연결
	
	@RequestMapping(value="/calculate.do", method = RequestMethod.POST)
	public String calcXY(CalcResult cr, HttpServletRequest req) {
//		CalcDAO cDAO = new CalcDAO();
//		cDAO.calculate(cr, req);
		
		cDAO.calculate(cr, req);
		return "index";
	}
	
	
	
	
	
	
	
	
	
}





























































































