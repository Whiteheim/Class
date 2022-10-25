package com.heim.oct24;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct24.site.SiteDAO;
import com.heim.oct24.site.SiteMember;

@Controller
public class MemberController {
	@Autowired
	private SiteDAO sDAO;
	
	
	@RequestMapping(value="/login.page", method=RequestMethod.POST)
	public String loginPage(SiteMember sm, HttpServletRequest req, HttpServletResponse res) {
		sDAO.loginCheck(sm, req);
		sDAO.loginMember(sm, req, res);
		req.setAttribute("cp", "login.jsp");
		return "index";
	}
	
	@RequestMapping(value="/TOS.page", method=RequestMethod.GET)
	public String toSPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "tos.jsp");
		return "index";
	}
	
	@RequestMapping(value="/signUp.page", method=RequestMethod.POST)
	public String signUpPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "signup.jsp");
		return "index";
	}
}
