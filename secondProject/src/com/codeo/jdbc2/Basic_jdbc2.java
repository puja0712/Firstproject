package com.codeo.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Basic_jdbc2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp_Name");
		String emp_name=sc.next();
		System.out.println("Enter emp_age");
		int emp_age=sc.nextInt();
		System.out.println("Enter emp_Designation");
		String emp_designation=sc.next();
		System.out.println(" Enter emp_salary =");
		String emp_salary=sc.next();
		
	
		//don't add space while value insertion in between
		 try {
				//Register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			//establish the connection
			Connection con=null;
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
			System.out.println(con);
			
			
			//create Statement object
			Statement statement=null;
			if(con!=null) {
				statement=con.createStatement();
			}
			
			//prepare the query
			String query="insert into employee(emp_name, emp_designation, emp_age, emp_salary) values('"+emp_name+"','"+emp_designation+"',"+emp_age+",'"+emp_salary+"')";
			System.out.println(query);
			int result=0;
			
			//send and execute the query 
			if(statement!=null) {
				result=statement.executeUpdate(query);
			 System.out.println("Value of result will be: "+result);
			 
			 //process the result
				if(result==1) {
					System.out.println("Data inserted successfully");
				}
				else {
					System.out.println("Data is not inserted");
				}
				statement.close();
				con.close();
				 }
		 }
				 catch(ClassNotFoundException e) {
					 e.printStackTrace();
				 }
				 catch(SQLException e) {
					 e.printStackTrace();
				 }
				 catch(Exception e) {
					 e.printStackTrace();
				 }
		 }
		 

	}
