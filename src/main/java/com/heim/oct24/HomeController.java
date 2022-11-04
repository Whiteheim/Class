package com.heim.oct24;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct24.site.SiteDAO;
import com.heim.oct24.site.SiteMember;

@Controller
public class HomeController {
	
	@Autowired
	private SiteDAO sDAO;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String indexPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "home.jsp");
		return "index";
	}


}
