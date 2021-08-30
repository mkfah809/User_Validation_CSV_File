package com.coderscampus.userfunctions;

import java.util.Scanner;

public class UserLogin {
	@SuppressWarnings("resource")
	public static String userInput(String username, String password) {
		Scanner login  = new Scanner(System.in);
		String userLogin = login.nextLine();
		return userLogin;
	}

}
