package com.codeo.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcbasic {


	

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			//1. Register JDBC Driver
			//mysql connector 5.7.1==>com.mysql.jdbc.Driver
			//mysql connector 8+==> com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	        //2. Establish the connection between database and application
			Connection con=null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
			//3. Write  the query
			String query="select * from employee";
	         //4. Create the statement 
			Statement statement=null;
			statement=con.createStatement();
			//5. Retrieve the data from particular table
			ResultSet resultset=null;
			resultset=statement.executeQuery(query);
			//resultset==true
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+" "+resultset.getString(4)+" "+resultset.getString(5)+" "+resultset.getString(6));
			}
			//6. close the JDBC stream objects.
			resultset.close();
			statement.close();
			con.close();
		}// end of main method

	
}

