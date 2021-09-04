package com.coderscampus.userfunctions;

import java.util.Scanner;

public class  UserLogin  {

	
	public String getUserLogin(String username, String password) {
		@SuppressWarnings("resource")
		Scanner login = new Scanner(System.in);
		String userLogin = login.nextLine();
		return userLogin;
		
	}
}
