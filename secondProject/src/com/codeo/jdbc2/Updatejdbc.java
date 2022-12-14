package com.codeo.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Updatejdbc {
	
	public static void main(String[] args) {
		Connection con=null;
		Statement statement=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp_id");
		int emp_id=sc.nextInt();
		System.out.println("Enter emp_name");
		String emp_name=sc.next();
		System.out.println("Enter emp_age: ");
		int emp_age=sc.nextInt();
		System.out.println("Id whose record should be updated:");
		int record_no=sc.nextInt();
		
		 try {
				//Register JDBC Driver for mysql database
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
			//create Statement object
			
			if(con!=null) {
				statement=con.createStatement();
			}
			//prepare the query
			String query="update employee set emp_id="+emp_id+", emp_name='"+emp_name+"',emp_age='"+emp_age+"'where emp_id="+record_no;
			System.out.println(query);
			int result=0;
			//send and execute the query 
			if(statement!=null) {
				result=statement.executeUpdate(query);
			}
			//process the result
			if(result==0) {
				System.out.println("Data is not Updated");
			}
			else {
				System.out.println("Data updated successfully");
			}
			statement.close();
			con.close();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		

	}

}



