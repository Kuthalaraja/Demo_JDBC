package com.JDBC;

import java.sql.*;

public class JDBC {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/banking_app";
		String u_name = "root";
		String password = "Pichu@36";
		
		String query = "insert into  banking_app.accounts values (4,'mahesh',1300);";//"select * from accounts";//"select account_holder_name from accounts where id=2";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,u_name,password);
		Statement st = con.createStatement();
		//DQL
//		ResultSet rs = st.executeQuery(query);
//		while(rs.next()) {
//		String name = rs.getInt(1)+ " : "+rs.getString(2)+" : "+ rs.getInt(3);
//		System.out.println(name);
//		}
		//DML
		
		int rs = st.executeUpdate(query);
		st.close();
		con.close();
		
	}

}
