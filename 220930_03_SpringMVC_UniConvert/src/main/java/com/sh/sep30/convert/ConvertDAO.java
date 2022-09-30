package com.sh.sep30.convert;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class ConvertDAO {
	private HashMap<String, String> unit;

	public void setUnit(HashMap<String, String> unit) {
		this.unit = unit;
	}
 
	public void convert(ConvertResult cr, HttpServletRequest req) {
		double n1 = cr.getN1();
		String what = req.getParameter("what");
		double n2 = n1 * 1.609;
		if (what.equals("l")) {
			n2 = n1 * 0.39370;
		} else if (what.equals("v")) {
			n2 = n1 * 3.30579;
		} else if (what.equals("t")) {
			n2 = (n1 *  9 / 5) + 32;
		}
		
		// 단위들은 어떻게 받아올것인가?
		// xml파일에서 심어둔 unit 사용
		System.out.println(unit);
		System.out.println(unit.get(what));
		
		String[] u = unit.get(what).split(",");
		
		cr.setN2(n2);
		cr.setU1(u[0]);
		cr.setU2(u[1]);
		
		req.setAttribute("cr", cr);
		
	}
	
}

























