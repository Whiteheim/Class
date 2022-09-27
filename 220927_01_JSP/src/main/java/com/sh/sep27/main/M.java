package com.sh.sep27.main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// ��
//		FirstC -> firstV ��û �Ҽ�
//			parameter(a, b)
//			attribute(cc)
//		��û�� ������ �� ��� ����
//		���ο� ��û�� �Ͼ�� ��Ȳ������ �� ��� �Ұ�
//		Third���� ���� ������ ä �̵� �� ����� �ʿ� (���� Third�����δ� ���� ��û�� ���� �Ұ�)
//			:session ��� 

//		- parameter 
//			GET		: �ּҿ� �ԷµǾ� ���� (��Ʈ�ѷ�?�Ķ���͸�=��&�Ķ���͸�=��&...)
//			POST	: Tomcat���η� ���� (�ּҿ� ��Ʈ�ѷ�?�Ķ���͸�=�� ǥ�� x)

//			V���� ���� �� (input���� �Է� �� ����)
//			String or String[] (�ڷ���)
//			request �Ҽ� (��û�� ����)

//			�� �б�
//				Java : request.getParameter("�Ķ���͸�");
//				JSP(EL) : ${param.�Ķ���͸� }

//		- request �Ҽ� attribute
//			Model���� ���� ��
//			Object (�ڷ���)
//			request �Ҽ� 

//			�� �б�
//				Java : request.getAttribute("��Ʈ����Ʈ��");
//				JSP(EL) : ${��Ʈ����Ʈ�� }
//--------------------------------------------------------------
// HTTP ��������
//		Ư�� / ����
//			1. Connectionless
//				����ڰ� ��û�� ��, ������ �޾��� �� ������ ����
//			2. Stateless
//				HTTP����� ������ ��� ���¸� �������

//	������ �����ϱ� ���� Cookie / Session ���

//	Cookie
//		������� ���������� ��ǻ�Ϳ� ����, ���� �ʿ�� ����
//		����ڰ� ���� ��û���� �ʾƵ� �������� ��û�� �ϸ� �ڵ����� ������ ����
//		�� �� ���� �ð��� ���صθ� �������� ���� ���ο� ������� ��Ű ���� ����
//			=> ID / PW �����ϱ�, ���θ� ��ٱ���, �˾�â (���� �Ϸ� �����ʱ�)

//		Model ���� ���� ��
//		String (�ڷ���)
//		�⺻ ���� �ð� - 24�ð�
//		�����Ǹ� ������� ��ǻ�Ϳ� ����
//		�ֱٿ� ��ȣȭ �Ͽ� ���� -> ������ ���ȿ� ����ϱ⶧���� ����Ǹ� ������ ������ ��Ű�� ����x

//		�� �б�
//			Java : ���� ����� ��ǻ�Ϳ� ������� �ִ� ��Ű�� -> �� �߿� �� ������Ʈ�� ��Ű�� ã�� �б�
//			JSP : ${cookie.�̸�.value }

// Session (����ڿ� ������ �����ϴ� Stream�� ����)
//		��Ű�� ������� �۵������� ������� ������ Server���� ����
//		���� �ð� ���� ����, ���� �ð����� ������ ������ ���� ����
//		��Ű���ٴ� ������ ���� ����, �޸� ��뷮�� ŭ
//		������ ���� ������ ���� ������ -> ���� ����

//		session �Ҽ� attribute
//		Model���� ���� ��
//		Object (�ڷ���)
//		���Ḹ �Ǿ� ������ ��𼭵��� ����� ����
//		�����ð� : �⺻ 30��, �ð� ���� ����
//			���� �ð� ���� �ƹ� ��û ������ �ڵ����� �������

//		Cookie	: ���س��� �ð��� ����ǰų�, ��Ű�� �����ϱ� �������� ����
//		Session	: ����Ǵ� �ð��� ���� ����, �������� ����Ǹ� �ٷ� ����


public class M {
	public static void makeSecondData(HttpServletRequest req, HttpServletResponse res) {
		int c = 3000;
		req.setAttribute("cc", c);
		
		int d = 40000;
		HttpSession hs = req.getSession(); 	// ����ڿ� �������� ���� ���� (Stream)
		hs.setMaxInactiveInterval(15);		// session�� �����ð��� 15�ʷ� ����
		hs.setAttribute("d", d);			// session�Ҽ��� attribute
		
		String e = "500000";
		Cookie ck = new Cookie("e", e);		
		ck.setMaxAge(15);					// 15�ʰ� ������� ��ǻ�Ϳ� ���Ϸ� ����
		res.addCookie(ck);					// ���� ��ü�� ��Ű�� �߰�
		
	}
	
	public static void printSecondDataNew(HttpServletRequest req) {
		try {
			HttpSession hs = req.getSession();
			int d = (Integer)hs.getAttribute("d"); // Object�� ����ȯ
			System.out.println(d);
		} catch (Exception e) {
		}
		// �ش� ������Ʈ, ���̹�, ����, ��Ʃ�� , etc
		// ���� ����� ��ǻ���� ��Ű���� �ҷ���
		Cookie[] cks = req.getCookies();			// ����Ǿ� �ִ� ��Ű�� => '�迭'
		for (Cookie ck : cks) {
			if (ck.getName().equals("e")) {			// ��Ű �̸��� e�� ����
				System.out.println(ck.getValue()); 	// ���
			}
			
		}
	}
	
	public static void printSecondData(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int c = (Integer) req.getAttribute("cc");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}











































































