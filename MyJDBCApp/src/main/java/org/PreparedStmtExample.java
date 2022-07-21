package org;

	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;

	public class PreparedStmtExample {
		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/qa-sample";
			String userName="root";
			String password="1234";
			Connection con=null;
			try {
				con=DriverManager.getConnection(url,userName,password);
			    System.out.println("Connection successful");
			    PreparedStatement pstmt = con.prepareStatement("select * from student where id=? or name=? or address=?"); 
                pstmt.setInt(1,107);
                pstmt.setString(2,"Upasana");
                pstmt.setString(3,"London");
                ResultSet rs=pstmt.executeQuery();//execute the statement and store the result
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
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}





