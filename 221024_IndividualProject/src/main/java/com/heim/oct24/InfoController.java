package com.heim.oct24;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct24.site.SiteDAO;
import com.heim.oct24.site.SiteMember;

@Controller
public class InfoController {
	
	@Autowired
	SiteDAO sDAO;
	
	// 정보조회 페이지
	@RequestMapping(value="/Info.page", method=RequestMethod.GET)
	public String viewInfo(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "privateInfo.jsp");
		return "index";
	}
	
	// 정보 수정 페이지
	@RequestMapping(value="/correctInfo.page", method=RequestMethod.GET)
	public String correctInfo(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "correctInfo.jsp");
		return "index";
	}
	
	// 정보 수정 완료 후 페이지
	@RequestMapping(value="/compliteCorrectInfo.page", method=RequestMethod.POST)
	public String compliteCorrectInfo(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		sDAO.correctInfo(sm, req);
		req.setAttribute("cp", "privateInfo.jsp");
		return "index";
	}
	
	// 로그아웃 페이지
	@RequestMapping(value="/logOut.page", method=RequestMethod.GET)
	public String logOutPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		sDAO.logOutMember(req);
		req.setAttribute("cp", "home.jsp");
		return "index";
	}
	
	
	// 탈퇴 후 페이지
	@RequestMapping(value="/quit.page", method=RequestMethod.GET)
	public String deleteMemberInfoPage(SiteMember sm, HttpServletRequest req) {
		sDAO.deleteMemberInfo(sm, req);
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "home.jsp");
		return "index";
	}
	
	
}









































