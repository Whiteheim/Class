package com.sh.sep26.home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Menu2Controller")
public class Menu2Controller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 전체 사과 개수
		//AppleDAO.getAppledao().getAllApples(request);
		// 보여줄 사과 페이지 (1page 부터)
		AppleDAO.getAppledao().getApples(1, request);
		request.setAttribute("contentPage", "menu2.jsp");
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

}
