package com.heim.oct24;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContentsController {
	
	@RequestMapping(value="/search.page", method=RequestMethod.GET)
	public String searchPage(HttpServletRequest req) {
		req.setAttribute("cp", "search.jsp");
		return "index";
	}

	@RequestMapping(value="/board.page", method=RequestMethod.GET)
	public String boardPage(HttpServletRequest req) {
		req.setAttribute("cp", "board.jsp");
		return "index";
	}
	
	
}
