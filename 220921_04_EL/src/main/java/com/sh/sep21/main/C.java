package com.sh.sep21.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/C")
public class C extends HttpServlet {
	// 사이트에 첫 접속 : GET방식
	// V1.html에서 GET방식을 사용한다면?
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청 파라미터명 없을 때 : 사이트 첫 접속을 GET방식으로 요청
		if (!request.getParameterNames().hasMoreElements()) {
			// 파라미터의 요소가 없다면 
			request.getRequestDispatcher("V1.html").forward(request, response);
		} else {
			// 요청 파라미터명이 있을 때 : 사이트의 기능 활용을 GET방식으로 사용
			M.multiply(request);
			request.getRequestDispatcher("V2.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
