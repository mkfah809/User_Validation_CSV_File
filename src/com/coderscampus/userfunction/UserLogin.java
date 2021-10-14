package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserLogin {
	static Scanner login = new Scanner(System.in);

	public static String getpromptUser(String promptMsg) {
		System.out.println(promptMsg);
		return login.nextLine();
	}

	public static void getUserLogin() {
		UserLogin.getpromptUser("Enter your username: ");
		UserLogin.getpromptUser("Enter your password: ");
	}

	public static User getloginasanyUser() throws IOException {
		int userOption;
		userOption = login.nextInt();
		String anotheruserUsername = null;
		String welcomeUser = null;
		if (userOption == 0) {
			User[] users = new User[20];
			users = GetandWriteFile.getuserfromFile();
			anotheruserUsername = getpromptUser("Enter a username you want to login with: ");
			anotheruserUsername = login.nextLine();
			for (User user : users) {
				if (anotheruserUsername.equals(user.getUsername())) {
					welcomeUser = user.getName();
					UserMessageOutput.validloginMessage(1, welcomeUser);
					System.out.println("Succesfully logged in as another user!\n--------");
					return user;
				}
			}
		}
		return null;

	}
}
