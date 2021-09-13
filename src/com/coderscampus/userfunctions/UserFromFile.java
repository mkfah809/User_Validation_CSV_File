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
	static User[] userPerson; // // For the second for each
	// private static Integer count;
	private static Boolean userFound = false;
	private static String lineReader;
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
				if (userRole.equals(user.getRole())) {
					System.out.println("You have the privilege to update " + "(You are " + userRole + ")");
					break;
				} else {
					System.out.println("You are normal user ...  you only can upload you information");
				}
			}
		}
		if (userFound == false) {
			System.out.println("The username is ... should be " + userUsername);
		} else {
			System.out.println("Please choose from the following options: ");
			UserMessageOutput.loginasanotheruserMessage(3);
			UserMessageOutput.updateusernameMessage(4);
			UserMessageOutput.updatepasswordMessage(5);
			UserMessageOutput.updatenameMessage(6);
			System.out.println("[4] Exit");
			System.out.println("Enter you option here: ");
		}
		Scanner userinputList = new Scanner(System.in);
		Integer inputList = userinputList.nextInt();
		System.out.println("What are the users that shown in the file here: \n -------------");
		System.out.println(line);
		if (inputList == 0) {
			Scanner userinputUsername = new Scanner(System.in);
			System.out.println("Which user would you like to login as? (Type in a valid username)");
			System.out.println("Please login as normal user");
			String welcomenormaluserfromSuper = userinputUsername.nextLine();

//			An Array needs to hold the person-user to fetch all the new user in it.
			userPerson = users;
			User person = new User();
			// while ((lineReader = fileReader.readLine()) != null) {
			// userinfoArray = lineReader.split(",");

			// }
			UserMessageOutput.validloginMessage(1, person.getName());
			person.setUsername(userinfoArray[0]);
			person.setPassword(userinfoArray[1]);
			person.setName(userinfoArray[2]);
			person.setRole(userinfoArray[3]);
			for (User persons : userPerson) {
				userFound = true;
				welcomenormaluserfromSuper = persons.getUsername();
				System.out.println("userUsername NOW = " + userUsername);
				
				
				if (userUsername.equals(welcomenormaluserfromSuper))
				// && userRole.equals(persons.getRole()))
				{
					// userFound = true;
					// welcomeUser = persons.getName();
					userRole = persons.getRole();
					UserMessageOutput.validloginMessage(1, welcomenormaluserfromSuper);
					break;
				} else {
					userFound = false;
					System.out.println("Does " + userUsername + " = " + welcomenormaluserfromSuper + "?");
					break;
				}
			}

		} else if (inputList == 1) {

		} else if (inputList == 2) {

		} else if (inputList == 3) {

		} else if (inputList == 4) {
			System.exit(0);
		}

	}

	@SuppressWarnings("null")
	static void getuserreadInfo() throws IOException {

		try {
			fileReader = new BufferedReader(new FileReader("UserData.txt"));
			while ((line = fileReader.readLine()) != null) {
				// System.out.println(line);
				User user = new User();
				// User person = new User();
				userinfoArray = line.split(",");
				user.setUsername(userinfoArray[0]);
				user.setPassword(userinfoArray[1]);
				user.setName(userinfoArray[2]);
				user.setRole(userinfoArray[3]);
				users[countLine] = user;
				// users[count] = person;
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
