package com.MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		PrintWriter writer = arg1.getWriter();
//		getting cookies array
		
		Cookie[] cookies = arg0.getCookies(); 
		String name;
		Boolean isPresent=false;
		
		if(cookies==null)
		{
			writer.println("<h1>You are new user</h1>");
		}
		else
		{
			for(Cookie c:cookies)
			{
				String checkString=c.getName();
				if(checkString.equals("userName"))
				{
					name=c.getValue();
					isPresent=true;
					
					writer.println("<h1>");
					writer.println("Your name in servlet2 is ="+name);
					writer.println("</h1>");
				}
			}
		}
		
		
		
		
		
	}
	
	
	
       
   

}
