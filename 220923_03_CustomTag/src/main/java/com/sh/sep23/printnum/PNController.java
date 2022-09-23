package com.sh.sep23.printnum;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sh.sep23.jstl.JSTLCDataMaker;

@WebServlet("/PNController")
public class PNController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("contentPage", "News.jsp");
		} else {
			JSTLCDataMaker.make(request);
			request.setAttribute("contentPage", "PrintNum.jsp");
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

}
