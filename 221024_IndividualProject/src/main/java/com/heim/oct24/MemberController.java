package com.heim.oct24;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@RequestMapping(value="/login.page", method=RequestMethod.POST)
	public String loginPage() {
		return "index";
	}
	
	@RequestMapping(value="/TOS.page", method=RequestMethod.POST)
	public String toSPage() {
		return "index";
	}
	
	@RequestMapping(value="/signUp.page", method=RequestMethod.POST)
	public String signUpPage() {
		return "index";
	}
}
