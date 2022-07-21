package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class second {
	public static void main(String[]args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String name="root";
			String password="root";
			Connection con=DriverManager.getConnection(url, name, password);
		
			String a="insert into student(sname,scity) values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(a);
			pstmt.setString(1, "Devesh");
			pstmt.setString(2,"Lucknow");
			pstmt.executeUpdate();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		}


