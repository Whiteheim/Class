package com.heim.oct04;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct04.student.StudentDAO;
import com.heim.oct04.test.TestDAO;

@Controller
public class HomeController {
	
	@Autowired
	private StudentDAO sDAO;
	
	@Autowired
	private TestDAO tDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		sDAO.getAllStudent(req);
		tDAO.getAllTest(req);
		return "index";
	}
	
}
