package com.codeo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet
{
	String firstname=null;
	String Secondname=null;
	String Lastname=null;
	 int age=0;
	
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
		PrintWriter pw=null;
	    pw=response.getWriter();
	    response.setContentType("text/html");
	    System.out.println("PrintWriter object will be: ");
	    
	    firstname=request.getParameter("firstname");
	    Secondname=request.getParameter("Secondname");
	    Lastname=request.getParameter("Lastname");
	   
	    age=Integer.parseInt(request.getParameter("age"));
	    Date date=new Date();
	    pw.println("<h1> your name is: "+firstname);
	    pw.println("<h1 style='color:blue'>Date and time"+date);
	    pw.println("<h1> your Secondname is: "+Secondname);
	    pw.println("<h1 style='color:red'>Date and time"+date);
	    pw.println("<h1> your Lastname is: "+Lastname);
	    pw.println("<h1 style='color:green'>Date and time"+date);
	    
	    
	    System.out.println(date);
	    
	    pw.close();
   }
}
	   
		