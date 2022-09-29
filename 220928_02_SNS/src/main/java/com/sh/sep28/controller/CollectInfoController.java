package com.sh.sep28.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sh.sep28.Model.DateManager;
import com.sh.sep28.Model.MemberDAO;

@WebServlet("/CollectInfoController")
public class CollectInfoController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO.loginCheck(request);
		DateManager.getCurYear(request);
		request.setAttribute("cp", "collectInfo.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO.collectInfo(request);
		MemberDAO.loginCheck(request);
		request.setAttribute("cp", "afterLogin.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
