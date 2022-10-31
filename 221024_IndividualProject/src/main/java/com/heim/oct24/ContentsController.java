package com.heim.oct24;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct24.contents.Content;
import com.heim.oct24.contents.ContentDAO;
import com.heim.oct24.site.SiteDAO;
import com.heim.oct24.site.SiteMember;

@Controller
public class ContentsController {
	
	@Autowired
	SiteDAO sDAO;
	
	@Autowired
	ContentDAO cDAO;
	
	// 검색 페이지로
	@RequestMapping(value="/search.page", method=RequestMethod.GET)
	public String searchPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "search.jsp");
		return "index";
	}

	// 게시판 페이지로
	@RequestMapping(value="/board.page", method=RequestMethod.GET)
	public String boardPage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "board.jsp");
		return "index";
	}
	
	// 게시글 작성 페이지
	@RequestMapping(value="/write.page", method=RequestMethod.GET)
	public String writePage(SiteMember sm, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		req.setAttribute("cp", "writePage.jsp");
		return "index";
	}
	
	// 게시글 등록
	@RequestMapping(value="/writeComplite.page", method=RequestMethod.POST)
	public String regText(SiteMember sm, Content c, HttpServletRequest req) {
		sDAO.loginCheck(sm, req);
		cDAO.writeText(c, req);
		req.setAttribute("cp", "board.jsp");
		return "index";
				
	}
}
















































































