package com.sh.sep14.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ���� class�� main�� ����
//	main�� tomcat�� ���ο� ����

// Servlet (Server + Application)

// @XXX : Annotation
//	->���� �����ؾ� �ϴ� ��� �͵��� �ڵ����� ó������

@WebServlet("/LearnServlet") // LearnServlet�� Tomcat�� ��� (*** ����� ���α׷��� ������)
public class LearnServlet extends HttpServlet {
	// HttpServlet Ŭ������ �ִ� ����� ��ӹ��� (��û ������ ���� �ϱ�)
	//	+ ����� �߰�
	
	// �۾��ϸ鼭 ������ ǥ���ϱ� ���� ������� (������ ����)
	private static final long serialVersionUID = 1L;
      
	// ������ - �� LeanServlet ��ü�� tomcat�� ������
	// ��� �� ���� (������ ����)
    public LearnServlet() {
        super();
    }

    // event-driven-programming (�̺�Ʈ ����� ���α׷���)
    // Tomcat�� ������ -> LeanServlet�� ���� 
    //		-> tomcat�� LearnServlet�̶�� ��ü�� ���� tomcat�� ���� �� ������ �ݺ�����
    //		-> �̺�Ʈ�� �߻��ϸ� �װ��� ó���ϰ� ������ ������
    
    
    // ** �ٽɺκ� ��
    // ������ ���ٰ� Ŭ���̾�Ʈ�� Servlet���� GET����� ��û�� �ϸ� 
    // Tomcat�� doGet�޼ҵ带 �ڵ����� ȣ��
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// ������ ���ٰ� Ŭ���̾�Ʈ�� Servlet���� GET����� ��û�� �ϸ� 
	// Tomcat�� doPost�޼ҵ带 �ڵ����� ȣ��
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



































