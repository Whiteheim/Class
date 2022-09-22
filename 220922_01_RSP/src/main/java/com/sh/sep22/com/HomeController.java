package com.sh.sep22.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Java + JSP + CSS + Servlet
// 가위 바위 보 페이지 만들기
// 디자인 자유
// WAS 종료할 때 까지 전적은 쌓이게 => 매 판 진행마다 전적이 보이도록

// GET방식 요청할 때 마다 다른엔진을 생성하기때문에 쌓여야 할 숫자가 쌓이지 못하는 상황 발생
//	해결책 : Singleton Pattern을 사용해 해결

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
