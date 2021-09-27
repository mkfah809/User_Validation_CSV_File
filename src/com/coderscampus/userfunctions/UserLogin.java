package com.coderscampus.userfunctions;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserLogin {
	static Scanner login = new Scanner(System.in);
	static String welcomeUser = null;

	public static String getpromptUser(String promptMsg) {
		System.out.println(promptMsg);
		return login.nextLine();
		// return userLogin;
	}

	public static void getUserLogin() {
		UserLogin.getpromptUser("Enter your username: ");
		UserLogin.getpromptUser("Enter your password: ");
	}

	public static String getloginasanyUser(int userOption) throws IOException {
		// everytime reads welcomeUser with Null
		userOption = login.nextInt();
		String anotheruserUsername = null;
		if (userOption == 0) {
			User[] users = new User[20];
			users = getFile.getuserfromFile();
			anotheruserUsername = getpromptUser("Enter a username you want to login with: ");
			anotheruserUsername = login.nextLine();
			for (User user : users) {
				if (anotheruserUsername.equals(user.getUsername())) {
					welcomeUser = user.getName();
					UserMessageOutput.validloginMessage(1, welcomeUser);
					System.out.println("--------------------------------------\n\r");
				}
				return anotheruserUsername;
			}
		} else if(userOption ==1) {
			String updatedUsername = UpdateUserInformation.getupdateUsername();
			System.out.println("updated username is - "+updatedUsername);
			return updatedUsername;
			
			}
		return "My fart is silence, but killing!";
	}
}
