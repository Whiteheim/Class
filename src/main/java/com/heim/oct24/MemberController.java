package com.heim.oct24;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct24.site.DateManager;
import com.heim.oct24.site.SiteDAO;
import com.heim.oct24.site.SiteMember;

@Controller
public class MemberController {
	
	@Autowired
	private SiteDAO sDAO;
	
	// 로그인 화면으로
	@RequestMapping(value="/login.page", method=RequestMethod.POST)
	public String loginPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "login.jsp");
		return "index";
	}
	
	// 약관동의 화면
	@RequestMapping(value="/TOS.page", method=RequestMethod.GET)
	public String toSPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "tos.jsp");
		return "index";
	}
	
	// 회원 가입 화면
	@RequestMapping(value="/signUp.page", method=RequestMethod.GET)
	public String signUpPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		DateManager.getCurYear(req);
		req.setAttribute("cp", "signup.jsp");
		return "index";
	}
	
	// 회원 가입 완료 후 로그인 화면
	@RequestMapping(value="/signUpComplite.page", method=RequestMethod.POST)
	public String signUpComplite(SiteMember sm, HttpServletRequest req) {
		sDAO.signUpMember(sm, req);
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "login.jsp");
		return "index";
	}
	
	// 로그인 성공 후 홈페이지 화면
	@RequestMapping(value="/loginComplite.page", method=RequestMethod.POST)
	public String loginComplite(SiteMember sm, HttpServletRequest req, HttpServletResponse res) {
		sDAO.loginMember(sm, req, res);
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "home.jsp");
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
