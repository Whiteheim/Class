package com.sh.sep21.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/C")
public class C extends HttpServlet {
	// ����Ʈ�� ù ���� : GET���
	// V1.html���� GET����� ����Ѵٸ�?
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��û �Ķ���͸� ���� �� : ����Ʈ ù ������ GET������� ��û
		if (!request.getParameterNames().hasMoreElements()) {
			// �Ķ������ ��Ұ� ���ٸ� 
			request.getRequestDispatcher("V1.html").forward(request, response);
		} else {
			// ��û �Ķ���͸��� ���� �� : ����Ʈ�� ��� Ȱ���� GET������� ���
			M.multiply(request);
			request.getRequestDispatcher("V2.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
