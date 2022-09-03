package com.codeo.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		// established connection with database
		Connection con=null;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
		//create query
        String query=" Insert into employee(emp_name, emp_designation, emp_age, emp_salary) values('xyz','hr',25,'34000')";
		// create statement object
        Statement stmt=null;
        stmt=con.createStatement();
		// execute the query
        stmt.executeUpdate(query);
        
		//close the connection.
        stmt.close();
        con.close();
	}
	


	}


