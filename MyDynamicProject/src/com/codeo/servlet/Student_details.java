package com.codeo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Student_markshit")
public class Student_details  extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.println("<h2>welcome to Student Details</h2>");
	String name1=request.getParameter("firstname");
	String name2=request.getParameter("Middlename");
	String name3=request.getParameter("lastname");
	String Gender=request.getParameter("user_gender");
	String age=request.getParameter("age");
	String Student_marks1=request.getParameter("math");
	String Student_marks2=request.getParameter("physics");
	String Student_marks3=request.getParameter("chemistry");
	String Total_marks=request.getParameter("total_marks");
	String Average_marks=request.getParameter("Avg_marks");
	String Percentage=request.getParameter("percentile");
	String result=request.getParameter("Result");
	double d=Double.valueOf(result);
	if(d>=35)
	{
		pw.println(" you are pass");
	}
	else
		pw.println("try next time");
	
	}
}
