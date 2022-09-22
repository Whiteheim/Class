package com.sh.sep22.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Java + JSP + CSS + Servlet
// ���� ���� �� ������ �����
// ������ ����
// WAS ������ �� ���� ������ ���̰� => �� �� ���ึ�� ������ ���̵���

// GET��� ��û�� �� ���� �ٸ������� �����ϱ⶧���� �׿��� �� ���ڰ� ������ ���ϴ� ��Ȳ �߻�
//	�ذ�å : Singleton Pattern�� ����� �ذ�

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("RSP.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Computer.com(request);
		request.getRequestDispatcher("RSP.jsp").forward(request, response);
		
	}

}
