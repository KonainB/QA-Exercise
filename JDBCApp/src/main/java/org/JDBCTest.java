package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/qa-sample";
		String userName="root";
		String password="1234";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,userName,password);
		    System.out.println("Connection successful");
		    String query="select * from student";//java statement
		    Statement stmt=con.createStatement();//SQL statement
		    ResultSet rs=stmt.executeQuery(query);//execute the statement and store the result
		    while(rs.next())//iterate through the result
		    {
		    	int id=rs.getInt(1);
		    	String name=rs.getString(2);
		    	String address=rs.getString(3);
		    	long phone=rs.getLong(4);
		    	System.out.println(id+"--"+name+"--"+address+"--"+phone);
		    }
		    
		} catch (SQLException e) {
			System.out.println();
			e.printStackTrace();
		}finally
		{
			try {
				con.close();
				System.out.println("Database connection closed, bye bye");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
