package com.MyFiles;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Jado extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			String name=req.getParameter("userName");
			String password=req.getParameter("userPassword");
			String email=req.getParameter("userEmail");
			String gender=req.getParameter("userGender");
			String course=req.getParameter("userCourse");
			String condition=req.getParameter("checkBox");
			
			
			RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
			RequestDispatcher rd2= req.getRequestDispatcher("Success");
	
			
			
			if(condition==null)
			{
				writer.println("<h1>Please Check the terms and conditons</h1>");
				rd.include(req, resp);
			}
			else 
			{
				rd2.include(req, resp);
				
				writer.println("<h2> Name:"+name+"</h2>");
				writer.println("<h2> Password:"+password+"</h2>");
				writer.println("<h2> Email:"+email+"</h2>");
				writer.println("<h2> Gender:"+gender+"</h2>");
				writer.println("<h2> Course:"+course+"</h2>");
				
				
				}
	}

	
	
	
	
	

}
