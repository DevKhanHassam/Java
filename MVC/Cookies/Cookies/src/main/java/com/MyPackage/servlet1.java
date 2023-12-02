package com.MyPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		
		String userName=arg0.getParameter("userName");
		Cookie c = new Cookie("userName", userName);
		arg1.addCookie(c);
		
		PrintWriter writer = arg1.getWriter();
		
		writer.println("<h1>");
		writer.println("Your name is ="+userName);
		writer.println("</h1>");
		writer.println("<br>");
		writer.println("<a href=\"servlet2\">click to open servlet2</a>");
	}
	
	

}
