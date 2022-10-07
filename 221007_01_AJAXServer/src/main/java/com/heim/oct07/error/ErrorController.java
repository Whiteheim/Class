package com.heim.oct07.error;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {

	@Autowired
	private ErrorDAO eDAO;
	
	@RequestMapping(value="/error.getJSON", method=RequestMethod.GET,
			produces="application/json; charset=UTF-8")
	public @ResponseBody Errors getErrorJSON(HttpServletRequest req, HttpServletResponse res) {
		// 사이트 외부에서 AJAX가 가능케 하기 위해
		// 응답파라미터 추가 (HttpServletResponse), 
		// 코드에 헤더 추가
		res.addHeader("Access-Control-Allow-Origin", "*");
		return eDAO.getJSON(req);
	}
	
	@RequestMapping(value="/error.getSearchJSON", method=RequestMethod.GET,
			produces="application/json; charset=UTF-8")
	public @ResponseBody Errors getSearchErrorJSON(Error e , HttpServletRequest req) {
		return eDAO.getSearchErrorJSON(e, req);
	}
	
}
