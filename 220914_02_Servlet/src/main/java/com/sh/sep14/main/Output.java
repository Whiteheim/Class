package com.sh.sep14.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")

public class Output extends HttpServlet {

	// 사용자가 입력한 데이터가 주소에 들어가는 경우
	// 인터넷 주소에는 한글 사용 x 
	//		ㅋ -> %2B%AC (URL인코딩)
	
	// 사용자가 입력한 ㅋ(EUC-KR) -URLEncoding-> %2B%AC
	// 사용자로부터 받아온 %2B%AC -URLDecoding-> ㅋ
	
	// GET방식 요청파라미터 한글처리 
	//		EUC-KR로 맞추기
	//			-> Tomcat server.xml (63번줄 설정)
	//			-> 요청에 대해 설정할 필요 x
	//			-> 데이터를 받아올 때는 encoding 방식 설정 해야함
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR"); // 데이터를 받아올 때 인코딩 방식 설정
		String a = request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Hi</title><meta charset='EUC-KR'></head>"); // HTML쪽의 인코딩 방식 설정
		out.print("<body>");
		out.print("<h2>Output Get</h2>");
		out.printf("<h2>%s</h2>", a);
		out.print("</body>");
		out.print("</html>");
		
	}

	// GET방식 요청 vs POST방식 요청
	// GET : 요청파라미터가 주소에 존재
	//		대부분은 GET방식 사용
	// POST : 요청파라미터가 주소에 없음 -> Tomcat에 심어둔 인코딩이 적용되지 않음
	//		프로그램 내부적으로 전달 해야함
	//		보안성이 높음 - 로그인, 회원가입에 주로 사용
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR"); 	// 설정하지 않으면 한글 텍스트 깨짐
		response.setCharacterEncoding("EUC-KR"); 
		String a = request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Hi</title><meta charset='EUC-KR'></head>"); 
		out.print("<body>");
		out.print("<h2>Output POST</h2>");
		out.printf("<h2>%s</h2>", a);
		out.print("</body>");
		out.print("</html>");
		
	}

}

















