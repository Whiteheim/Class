package com.heim.oct24;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping(value="/home.page", method=RequestMethod.GET)
	public String homePage() {
		return "index";
	}


}
