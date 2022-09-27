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
		if (AppleDAO.getAppledao().getAppleDetail(request)) { // ������ ��⿡ ���� ���� ��
			request.setAttribute("contentPage", "appleDetail.jsp"); // contentPage�ڸ��� appleDetail ������ ����
		} else {
			AppleDAO.getAppledao().getApples(1, request);	  // ����� 1 page
			request.setAttribute("contentPage", "menu2.jsp"); // �������� �� ������ ������ ����
		}
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//update
		if (AppleDAO.getAppledao().update(request)) { // ���� ���� ������
			AppleDAO.getAppledao().getApples(1, request);
			request.setAttribute("contentPage", "menu2.jsp");
		} else {
			AppleDAO.getAppledao().getApples(1, request);
			request.setAttribute("contentPage", "menu2.jsp");
		}
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
