package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOperation {
	String url="jdbc:mysql://localhost:3306/qa-sample";
	String userName="root";
	String password="1234";	
	Connection con=null;
	public void readData()
	{
		try {
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection successful");
			String query="select * from student";//java statement
			Statement stmt=con.createStatement();//SQL statement
			ResultSet rs=stmt.executeQuery(query);//execute the statement and store the result
			while(rs.next()) //iterate through the result
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				long phone=rs.getLong(4);
				System.out.println(id+"--"+name+"--"+address+"--"+phone);
			}
			
		} catch (SQLException e) {
			System.out.println("something went wrong");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally 
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void addData()
	{
		try {
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connection successful");
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter id");
			int id=scn.nextInt();
			System.out.println("Enter name");
			String name=scn.next();
			System.out.println("Enter address");
			String address=scn.next();
			System.out.println("Enter phone");
			long phone=scn.nextLong();	
			//String query="insert into student values(112,'Richard','Rome',85799565)";
			String query="insert into student values("+id+",'"+name+"','"+address+"',"+phone+")";//java statement
			Statement stmt=con.createStatement();//SQL statement
			stmt.executeUpdate(query);
			System.out.println("one record inserted");
		} catch (SQLException e) {
			System.out.println("something went wrong");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally 
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
			public static void UpdateData()
			{
				String url="jdbc:mysql://localhost:3306/qa-sample";
				String userName="root";
				String password="1234";
				Connection con=null;
				
				try {
					con=DriverManager.getConnection(url,userName, password);
					System.out.println("Connection successful");
					
					//read, update, delete operations occur here in the try block
					
					//below is how to update a record
								
					System.out.println("Enter an ID number: ");
					Scanner scanner=new Scanner(System.in);
					int idnum=scanner.nextInt(); 
					
					System.out.println("Which column do you want to UPDATE for record "+idnum);
					System.out.println("Press 1 to update NAME");
					System.out.println("Press 2 to update ADDRESS");
					System.out.println("Press 3 to update PHONE");
					
					
					
					int choice = scanner.nextInt();
					String changeCol;
					
					switch (choice) {
					case 1:
						System.out.println("NAME");
						
						System.out.println("Enter new Name: ");
						String newName=scanner.next(); 
						
						changeCol="name";
						
						
						String query = "update student set "+changeCol+"='"+newName+"' where id="+idnum;
						
						Statement stmt=con.createStatement(); //sql statement
						stmt.executeUpdate(query); //execute the statement and store result
						System.out.println("Record number "+idnum+" updated");
						
						
						break;
					case 2:
						System.out.println("ADDRESS");
						
						System.out.println("Enter new address: ");
						String newAddress=scanner.next(); 
						
						changeCol="address";
						
						
						query = "update student set "+changeCol+"='"+newAddress+"' where id="+idnum;
						
						stmt=con.createStatement(); //sql statement
						stmt.executeUpdate(query); //execute the statement and store result
						System.out.println("Record number "+idnum+" updated");
						
						break;
					case 3:
						System.out.println("PHONE");
						
						System.out.println("Enter new phone number: ");
						String newPhone=scanner.next(); 
						
						changeCol="phone";
						
						
						query = "update student set "+changeCol+"='"+newPhone+"' where id="+idnum;
						
						stmt=con.createStatement(); //sql statement
						stmt.executeUpdate(query); //execute the statement and store result
						System.out.println("Record number "+idnum+" updated");
						
						break;	
					default:
						System.out.println("Enter correct choice");
					}
					
					
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}finally //used to close the connection to the database
				{
					try {
						con.close(); // connection closed.
						System.out.println("Database connection closed");
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				
				
				
			}
				
			
			}
		}

