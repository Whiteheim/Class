package com.sh.sep21.main;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class M {
	public static void multiply(HttpServletRequest request) {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x * y;
		request.setAttribute("z", z);
		
		Example e = new Example("¿¹Á¦", 30, 177.3, 81.8);
		request.setAttribute("e", e);
		
		ArrayList<Example> exam = new ArrayList<Example>();
		exam.add(e);
		exam.add(new Example("¾êÀ÷", 2, 121.1, 61.2));
		exam.add(new Example("¾ÖÀ÷", 5, 421.1, 96.2));
		exam.add(new Example("¾ßÁö", 67, 884.1, 13.2));
		request.setAttribute("exam", exam);
	}
}
