package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {
	
	public User getUser(int id) {
		
		try {
		User user = new User();
		user.id = id;
		String query = "select account_holder_name from accounts where id="+id;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_app","root","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		user.account_holder_name = name;
		return user;
		}catch(Exception e) {
			System.out.print("Invalid");
		}
		return null;
		
	}
	
	public User addUser(User u) {
		
		try {
		String query = "insert into  banking_app.accounts values (?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_app","root","");
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, u.id);
		st.setString(2, u.account_holder_name);
		st.setInt(3, u.balance);
		st.executeUpdate();
		}catch(Exception e) {
			System.out.print("Invalid");
		}
		return null;
		
	}


	
}
