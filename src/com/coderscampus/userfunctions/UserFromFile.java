package com.coderscampus.userfunctions;

import java.io.*;
import java.util.Scanner;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserFromFile {

	private static String userUsername = "";
	private static String userPassword = "";
	private static String[] userinfoArray;
	private static String line = null;
	private static int countLine = 0;
	public static int invalidLogin = 0;
	static User[] users = new User[20]; // parent-each user
	private static Boolean userFound = false;
	private static String welcomeUser = "";
	private static String userRole;

	/*@SuppressWarnings({ "static-access" })
	static void getValidation() {
		if (invalidLogin == 4 && userFound.FALSE) {
			UserMessageOutput.lockoutMessage(2);
			System.exit(0);
		}
		if (userFound.FALSE) {

			invalidLogin++;
			UserMessageOutput.invalidloginMessage(0);
		} else if (userFound.TRUE) {
			UserMessageOutput.validloginMessage(1, welcomeUser);
			System.exit(0);
		}
	}*/

	@SuppressWarnings({ "resource", "unlikely-arg-type" })
	static void getUser() throws IOException {

		for (User user : users) {
			if (userUsername.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
				userFound = true;
				welcomeUser = user.getName();
				userRole = user.getRole();
			}
				try {
					//FileWriter fileWriter = new FileWriter("UserData.txt");
						if(userRole.equals(user.getRole())) {
							System.out.println("Please choose from the following options: ");
							System.out.println("[0] Log in as another user");
							System.out.println("[1] Update username");
							System.out.println("[2] Update password");
							System.out.println("[3] Update name");
							System.out.println("[4] Exit");
							
							Scanner userinputList = new Scanner(System.in);
							userinputList.nextLine();
							if(userinputList.equals(0)) {
								System.out.println("Which user would you like to login as? (Type in a valid username)");
								if(userUsername.equals(user.getUsername())) {
									UserMessageOutput.validloginMessage(1,welcomeUser);
								}
							}
						}
					}
				 finally {	
				 }
		}
			
			
	}

	@SuppressWarnings("null")
	static void getuserreadInfo() throws IOException {
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("UserData.txt"));
			while ((line = fileReader.readLine()) != null) {
				// System.out.println(line);
				User user = new User();
				userinfoArray = line.split(",");
				user.setUsername(userinfoArray[0]);
				user.setPassword(userinfoArray[1]);
				user.setName(userinfoArray[2]);
				user.setRole(userinfoArray[3]);
				users[countLine] = user;
				countLine++;
				if (countLine == 20) {
					break;
				}
			}
		} finally {
			if (fileReader == null)
				fileReader.close();
		}

	}

	static void getpromptUser() {

		System.out.println("Enter your Username here: ");
		userUsername = UserLogin.userInput();
		System.out.println("Enter your Password here: ");
		userPassword = UserLogin.userInput();
	}

	static void getnormaluserUpdate() {

	}
}
