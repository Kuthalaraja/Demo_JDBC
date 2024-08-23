package com.DAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAO dao = new UserDAO();
//		User u1 = dao.getUser(3);
//		System.out.println(u1.account_holder_name);
		
		User u1 = new User();
		u1.id=5;
		u1.account_holder_name="Sita";
		u1.balance=1400;
		dao.addUser(u1);
	}

}
