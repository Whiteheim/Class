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
		// 등록하려 form 페이지로 오기
		request.setAttribute("contentPage", "AppleInsert.jsp");
		request.getRequestDispatcher("main.jsp").forward(request, response);
		

	}
	// 등록하기
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//DB에 등록
		AppleDAO.getAppledao().insertApple(request);
		
		// 게시판에 나올 데이터 가지고
		//AppleDAO.getAppledao().getAllApples(request);
		AppleDAO.getAppledao().getApples(1, request);
		
		// 등록 후에 보여줄 페이지 이동
		request.setAttribute("contentPage", "AppleInsert.jsp");
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
