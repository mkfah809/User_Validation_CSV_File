package com.coderscampus.userfunctions;

import java.io.*;
import java.util.Scanner;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserFromFile {

	private static String userUsername = "";
	private static String userPassword = "";
	private static String welcomeUser = "";
	private static String userRole = "";
	private static String line = null;
	private static Integer countLine = 0;
	public static Integer invalidLogin = 0;
	private static String[] userinfoArray; // For the file fetch
	static User[] users = new User[20]; // For the first for each
	static User[] userPerson = new User[20]; // // For the second for each
	// private static Integer count;
	private static Boolean userFound = false;
	private static String welcomenormaluserfromSuper = null;
	static BufferedReader fileReader = null;
	/*
	 * @SuppressWarnings({ "static-access" }) static void getValidation() { if
	 * (invalidLogin == 4 && userFound.FALSE) { UserMessageOutput.lockoutMessage(2);
	 * System.exit(0); } if (userFound.FALSE) {
	 * 
	 * invalidLogin++; UserMessageOutput.invalidloginMessage(0); } else if
	 * (userFound.TRUE) { UserMessageOutput.validloginMessage(1, welcomeUser);
	 * System.exit(0); } }
	 */

	@SuppressWarnings({ "resource" })
	static void getUser() throws IOException {
		for (User user : users) {
			userFound = true;
			welcomeUser = user.getName();
			
			if (userUsername.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
				userRole = user.getRole();
				UserMessageOutput.validloginMessage(1, welcomeUser);
			}
		}
			if (userRole.equals("super_user")) {
				System.out.println("You have the privilege to update " + "(You are " + userRole + ")");
				System.out.println("Please choose from the following options: ");
				UserMessageOutput.loginasanotheruserMessage(3);
				UserMessageOutput.updateusernameMessage(4);
				UserMessageOutput.updatepasswordMessage(5);
				UserMessageOutput.updatenameMessage(6);
				System.out.println("[4] Exit");
				System.out.println("Enter you option here: ");
				Scanner userinputList = new Scanner(System.in);
				Integer inputList = userinputList.nextInt();
				if (inputList == 0) {
					Scanner userinputUsername = new Scanner(System.in);
					System.out.println("Which user would you like to login as? (Type in a valid username)");
					System.out.println("Please login as normal user");
					welcomenormaluserfromSuper = userinputUsername.nextLine();					
				} else if (inputList == 1) {
					
				} else if (inputList == 2) {
					
				} else if (inputList == 3) {
					
				} else if (inputList == 4) {
					System.exit(0);
				}
					
			} else {
				System.out.println("You have the privilege to update: ");
				UserMessageOutput.updateusernameMessage(4);
				UserMessageOutput.updatepasswordMessage(5);
				UserMessageOutput.updatenameMessage(6);
				System.out.println("Enter you option here: ");
				Scanner userinputList = new Scanner(System.in);
				Integer inputList = userinputList.nextInt();
			}
		
		
//			while ((line = fileReader.readLine()) != null) {
//				User person = new User();
//				users[countLine] = person;
//				userPerson = users;
//				person.setUsername(userinfoArray[0]);
//				person.setPassword(userinfoArray[1]);
//				person.setName(userinfoArray[2]);
//				person.setRole(userinfoArray[3]);
//				int lineCounting = 0;
//				lineCounting++;
//				if (lineCounting == 20) {
//					break;
//				}
//			}
			userPerson = users;
			for (User persons : userPerson) {
				
				welcomenormaluserfromSuper = persons.getUsername();
				if (welcomenormaluserfromSuper.equals(persons.getUsername()))
				// && userRole.equals("normal_user"))
				{
					userFound = true;
					UserMessageOutput.validloginMessage(1, persons.getName());
					System.out.println("Why does it read only the first user? " + "The concet is working but for only the first line.");
					break;
				} else {
					userFound = false;
					System.out.println("It works but it catches the else statment\n because userRole is " + userRole);
					break;
				}
			
			}


	}

	static void getuserreadInfo() throws IOException {

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
