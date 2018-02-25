package com.nadideozturk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String userName = request.getParameter("userName");
		request.setAttribute("userName", userName);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
}
