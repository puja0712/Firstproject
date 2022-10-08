package com.codeo.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Deletejdbc {
	public static void main(String[] args) {
		//Register the JDBC Driver
			//Register JDBC Driver
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter record to be deleted: ");
			int record=sc.nextInt();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//establish the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
			   //create statement object
				Statement statement=null;
				if(con!=null) {
					statement=con.createStatement();	
				}
				//Write the query
				String delete_query="delete from employee where emp_id="+record;
				int result=0;
				//send and execute the query 
				if(statement!=null) {
					result=statement.executeUpdate(delete_query);
				}
				//process the result
				if(result==0) {
					System.out.println("Data is not deleted");
				}
				else {
					System.out.println("Data is deleted");
				}
				statement.close();
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}

		

		}

	}



