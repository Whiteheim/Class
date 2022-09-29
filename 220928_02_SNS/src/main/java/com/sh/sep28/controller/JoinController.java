package com.sh.sep28.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sh.sep28.Model.DateManager;
import com.sh.sep28.Model.MemberDAO;

@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO.loginCheck(request);
		DateManager.getCurYear(request);
		request.setAttribute("cp", "join.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO.join(request);
		MemberDAO.loginCheck(request);
		request.setAttribute("cp", "home.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}



























