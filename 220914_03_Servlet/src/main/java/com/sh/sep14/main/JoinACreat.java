package com.sh.sep14.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinACreat")
public class JoinACreat extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		String location = request.getParameter("location");
		String[] hobby = request.getParameterValues("hobby");
		String introduce = request.getParameter("introduce");
		
		out.print("<html>");
		out.print("<head><title>회원가입</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.printf("<h2>성별 : %s</h2><br>", gender);
		out.printf("<h2>지역 : %s</h2><br>", location);
		if (hobby != null) {
			out.print("<h2>취미 : ");
			for (String s : hobby) {
				out.print(s + " ");
			}
			out.print("</h2>");
		}
		out.printf("<h2>자기 소개 : %s</h2><br>", introduce);
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR");
		request.setCharacterEncoding("EUC-KR");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		out.print("<html>");
		out.print("<head><title>회원가입</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.printf("ID : %s", id);
		out.printf("pw : %s", pw);
		out.print("</body>");
		out.print("</html>");
	}

}















