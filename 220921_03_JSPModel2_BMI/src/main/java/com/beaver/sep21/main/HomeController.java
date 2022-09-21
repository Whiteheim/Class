package com.beaver.sep21.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. Servlet(Controller) ����� forward ������� HTML ������ ����ڿ��� ���
//		-> ����ڰ� HTML���� �����͸� �Է� 
//			-> �Է¹��� ���� POST������� Controller�� ��û
//				* HTML���ϰ� JSP������ ��� ����ص� ����

// 2. Controller���� Doctor��ü(Model)�� Method�� ȣ���� ��û�� ���� �Է�
//		-> Doctor ��ü���� ��û�� ������ ������ ���
//			-> ���� �����͸� Guest��ü�� ��� Request�� ���

// 3. Controller���� Request�� ��ϵ� ���� JSP�� forward������� �Է��� ��� 

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("BMIInput.html").forward(request, response);
		// ù ����� �Է¹޴� ȭ�� ���
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// BMI ��� ��� ���� (�ǻ�� �մ� ��ü ����)
		Doctor.calculate(request); 
		// ��� �� �ǻ� ��ü�� ȣ���� html���� �Է¹��� �����͸� ���
		request.getRequestDispatcher("BMIOutput.jsp").forward(request, response);
		// html���� post������� ���� �����͸� jsp ���Ϸ� ���� ���
	}

}
