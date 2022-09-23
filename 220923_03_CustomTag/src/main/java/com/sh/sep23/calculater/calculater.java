package com.sh.sep23.calculater;

import javax.servlet.http.HttpServletRequest;

public class calculater {
	public static void calculate(HttpServletRequest request) {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		String plus = a + "+" + b + "=" + c;
		String minus = a + "-" + b + "=" + d;
		String multiply = a + "x" + b + "=" + e;
		String divide = a + "¡À" + b + "=" + f;
		
		request.setAttribute("plus", c);
		request.setAttribute("minus", minus);
		request.setAttribute("multiply", multiply);
		request.setAttribute("divide", divide);
	}
}
