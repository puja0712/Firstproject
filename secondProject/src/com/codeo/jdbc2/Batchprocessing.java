package com.codeo.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Batchprocessing {
	
	//empId is primary key not null and autoincreemnt
		public static void main(String[] args) {
			String insert_query="insert into employee(emp_name,emp_age) values('Nagina','9898989898') where emp_id=115";
			String delete_query="delete from employee where emp_id=114";
			String update_query="update employee set emp_name='sid' where emp_id=118";
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			Connection con=null;
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
			//set Autocomit mode
			 //con.setAutoCommit(false);
			 //create statement Object
			 Statement statement=null;
			 statement=con.createStatement();
			 //add queries to Batch
			 if(statement!=null) {
			 statement.addBatch(insert_query);
			 statement.addBatch(delete_query);
	         statement.addBatch(update_query);	
			 }
	         //execute the batch
	         int result[]=statement.executeBatch();
	         //process the result
	         int sum=0;
	         for(int i=0;i<result.length;++i) {
	        	 sum=sum+result[i];
	         }
	         System.out.println("The records affected database will be: "+sum);
			}
			catch(Exception e) {
				
			}
		}

	}



