package com.sh.sep26.home;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppleDetailController")
public class AppleDetailController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (AppleDAO.getAppledao().getAppleDetail(request)) { // 상세정보 얻기에 성공 했을 때
			request.setAttribute("contentPage", "appleDetail.jsp"); // contentPage자리에 appleDetail 페이지 삽입
		} else {
			AppleDAO.getAppledao().getApples(1, request);	  // 목록의 1 page
			request.setAttribute("contentPage", "menu2.jsp"); // 실패했을 시 보여줄 페이지 설정
		}
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//update
		if (AppleDAO.getAppledao().update(request)) { // 정보 수정 성공시
			AppleDAO.getAppledao().getApples(1, request);
			request.setAttribute("contentPage", "menu2.jsp");
		} else {
			AppleDAO.getAppledao().getApples(1, request);
			request.setAttribute("contentPage", "menu2.jsp");
		}
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
