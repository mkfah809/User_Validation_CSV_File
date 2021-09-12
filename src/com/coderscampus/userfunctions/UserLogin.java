package com.coderscampus.userfunctions;

import java.util.Scanner;

public class UserLogin {
//	@SuppressWarnings("unused")
//	private static String userUsername;
//	@SuppressWarnings("unused")
//	private static String userpassword;
//
//	private static String getUserLogin(String promptMsg) {
//		@SuppressWarnings("resource")
//		Scanner login = new Scanner(System.in);
//		System.out.println(promptMsg);
//		String userLogin = login.nextLine();
//		return userLogin;
//	}
//
//	public static void getpromptUser() {
//		userUsername = getUserLogin("Enter your username: ");
//		userpassword = getUserLogin("Enter your password: ");
//	}
	@SuppressWarnings("resource")
	public static String userInput() {

		Scanner userisvalidInput = new Scanner(System.in);
		String userLogin = userisvalidInput.nextLine();
		return userLogin;
	}
	
	
}
