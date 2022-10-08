package com.codeo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResisterServlet  extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
//don't make mistake in url pattern directly copy paste it
	 {
		 response.setContentType("text/html");
		 PrintWriter pw=response.getWriter();
		 pw.println("<h2>welcome to register Servlet</h2>");
		 String name=request.getParameter("user_name");
		 String password=request.getParameter("user_password");
		 String email=request.getParameter("user_email");
		 String course=request.getParameter("user_course");
		 String gender=request.getParameter("user_gender");
		 String cond=request.getParameter("condition");
		 
		 if(cond.equals("checked"))
		 {
			 pw.println("<h2>name:"+ name+"<h2>");
			 pw.println("<h2>password:"+ password+"<h2>");
			 pw.println("<h2>email:"+ email+"<h2>");
			 pw.println("<h2>gender:"+ gender+"<h2>");
			 pw.println("<h2>course:"+ course+"<h2>");
			 pw.println("<h2>cond:"+cond+"<h2>");
		 }
		 else
		 {
			 pw.println("<h2> you have not accepted terms and conditions</h2>");
		 }
		 }
		 
	 
}


