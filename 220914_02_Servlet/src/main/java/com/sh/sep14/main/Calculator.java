package com.sh.sep14.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title></title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h1>결과</h1>");
		out.print("<table border='1'>");
		out.printf("<tr><td>%d + %d = %d</td></tr>", x, y, x + y);
		out.printf("<tr><td>%d - %d = %d</td></tr>", x, y, x - y);
		out.printf("<tr><td>%d x %d = %d</td></tr>", x, y, x * y);
		out.printf("<tr><td>%d ÷ %d = %.2f</td></tr>", x, y, (double)x / y);
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
