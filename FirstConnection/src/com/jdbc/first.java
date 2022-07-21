package com.jdbc;
import java.sql.*;

public class first {
public static void main(String[]args) {
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbc";
	String name="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, name, password);
	String q="create table student(sid int(20) primary key auto_increment,sname varchar(40) not null,scity varchar(100)) ";
	Statement st=con.createStatement();
	st.executeUpdate(q);
	System.out.println("table created");
	String a="insert into student(sname,scity) values(Devesh,Lucknow)";
	PreparedStatement pstmt=con.prepareStatement(a);
	pstmt.executeUpdate();
	con.close();
}catch(Exception e) {
	System.out.println(e);
}
}
}
