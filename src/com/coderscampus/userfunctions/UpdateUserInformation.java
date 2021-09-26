package com.coderscampus.userfunctions;

import java.io.IOException;
import java.util.Scanner;

public class UpdateUserInformation {
	static Scanner updateInput = new Scanner(System.in);
	
	static String getupdateUsername() throws IOException {
		String oldUsername = UserLogin.getloginasanyUser();
		System.out.println("Please type a new username:");
		return updateInput.nextLine();
	}

	static String getupdatePassword() throws IOException {
		String oldPassword = UserLogin.getloginasanyUser();
		System.out.println("the old username in UUI is " + oldPassword);
		System.out.println("Please type a new password:");
		return updateInput.nextLine();
		
	}

}
