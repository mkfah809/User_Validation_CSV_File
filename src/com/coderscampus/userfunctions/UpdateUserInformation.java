package com.coderscampus.userfunctions;

import java.io.IOException;
import java.util.Scanner;


public class UpdateUserInformation {
	static Scanner updateInput = new Scanner(System.in);
	
	static String getupdateUsername() throws IOException {
//		updateInput.hasNextInt();
		String updatedUsername = UserLogin.getpromptUser("Please Enter Your New Username: ");
		return updatedUsername;
	}

	static String getupdatePassword() throws IOException {
		String oldPassword = UserLogin.getloginasanyUser(2);
		System.out.println("the old username in UUI is " + oldPassword);
		System.out.println("Please type a new password:");
		return updateInput.nextLine();
		
	}

}
