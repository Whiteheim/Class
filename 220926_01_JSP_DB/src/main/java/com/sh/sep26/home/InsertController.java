package com.sh.sep26.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����Ϸ� form �������� ����
		request.setAttribute("contentPage", "AppleInsert.jsp");
		request.getRequestDispatcher("main.jsp").forward(request, response);
		

	}
	// ����ϱ�
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//DB�� ���
		AppleDAO.getAppledao().insertApple(request);
		
		// �Խ��ǿ� ���� ������ ������
		//AppleDAO.getAppledao().getAllApples(request);
		AppleDAO.getAppledao().getApples(1, request);
		
		// ��� �Ŀ� ������ ������ �̵�
		request.setAttribute("contentPage", "AppleInsert.jsp");
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
