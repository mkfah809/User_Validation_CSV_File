package com.coderscampus.userfunctions;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserLogin {
	static Scanner login = new Scanner(System.in);
	static String welcomeUser=null;
	public static String getpromptUser(String promptMsg) {
		System.out.println(promptMsg);
		String userLogin = login.nextLine();
		return userLogin;
	}

	public static void getUserLogin() {
		UserLogin.getpromptUser("Enter your username: ");
		UserLogin.getpromptUser("Enter your password: ");
	}
	
	public static String getloginasanyUser(/*int userOption*/) throws IOException {
		// everytime reads welcomeUser with Null
			int userOption = login.nextInt();
			if (userOption == 0) {
				User[] users = new User[20];
				users = getFile.getuserfromFile();
				String userUsername = getpromptUser("Enter a valid username you want to login with: ");
				for (User user : users) {
					if (userUsername.equals(user.getUsername())) {
						welcomeUser = user.getName();
						UserMessageOutput.validloginMessage(1, welcomeUser);
						System.out.println("--------------------------------------\n\r");
						return userUsername;
					}
				}
			} else if (userOption == 1) {
				UpdateUserInformation.getupdateUsername();
				return welcomeUser;
			}
			 return "null";
		}
	}

