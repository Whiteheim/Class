package com.heim.oct04.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct04.student.StudentDAO;

@Controller
public class TestController {
	
	@Autowired
	private StudentDAO sDAO;
	
	@Autowired
	private TestDAO tDAO;
	
	@RequestMapping(value="/test.reg", method=RequestMethod.GET) 
	public String regTest(Test t, HttpServletRequest req) {
		tDAO.regTest(t, req);
		tDAO.getAllTest(req);
		sDAO.getAllStudent(req);
		return "index";
	}
	
	
}
