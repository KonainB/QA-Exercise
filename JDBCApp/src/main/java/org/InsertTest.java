package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,userName,password);
		    System.out.println("Connection successful");
		    String query="insert into student values(111,'Tom','NYC',85799565)";//java statement
		    Statement stmt=con.createStatement();//SQL statement
		    stmt.executeUpdate(query);
		    System.out.println("one record inserted");    
		    
		} catch (SQLException e) {
			System.out.println();
			e.printStackTrace();
		}finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}



