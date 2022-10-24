package com.heim.oct24;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContentsController {
	
	@RequestMapping(value="/search.page", method=RequestMethod.GET)
	public String searchPage() {
		return "index";
	}

	@RequestMapping(value="/board.page", method=RequestMethod.GET)
	public String boardPage() {
		return "index";
	}
}
