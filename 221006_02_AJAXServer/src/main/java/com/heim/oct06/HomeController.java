package com.heim.oct06;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heim.oct06.fruit.FruitDAO;

@Controller
public class HomeController {

		@Autowired
		private FruitDAO fDAO;
		
		@RequestMapping(value="/", method=RequestMethod.GET)
		public String printFruit(HttpServletRequest req) {
			fDAO.getAllFruit(req);
			return"index";
		}
}
