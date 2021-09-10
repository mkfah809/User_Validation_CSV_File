package com.coderscampus.userfunctions;

import java.util.Scanner;

public class UserLogin {
	@SuppressWarnings("resource")
	public static String userInput() {

		Scanner userisvalidInput = new Scanner(System.in);
		String userLogin = userisvalidInput.nextLine();
		return userLogin;
	}
	
	
}
