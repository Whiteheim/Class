package com.heim.oct07;

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

import com.heim.oct07.error.ErrorDAO;

@Controller
public class HomeController {
	
	@Autowired
	ErrorDAO eDAO;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAllError(HttpServletRequest req) {
		eDAO.getAllError(req);
		return "index2";
	}
}
