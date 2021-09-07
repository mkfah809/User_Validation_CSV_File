package com.coderscampus.userfunctions;

import java.io.*;

import com.coderscampus.user.User;

public class UserFromFile {

	private static String line = null;
	private static String[] userinfoArray;
	private static String userUsername = "";
	private static String userpassword = "";
	static User[] users = new User[20];
	private static int count = 0;
	public static int test = 0;
	@SuppressWarnings("unused")
	private static boolean userFound = false;

	public static String getuserInformation() throws IOException {
		getuserreadInfo();
		do {
			getpromptUser();
			getuser();
		} while (test == 4);
		return line;
	}

	private static void getuser() {
		String welcomeUser = "";
		//HERE IS THE BUG!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		for (User user : users) {
			if (userUsername.equals(user.getUsername()) && userpassword.equals(user.getPassword())) {
				userFound = true;
				welcomeUser = user.getName();
				System.out.println("welcome: " + welcomeUser);
			} else {
				System.out.println("Wrong Entry");
				System.exit(0);
			}
		}
	}

	@SuppressWarnings("resource")
	public static void getuserreadInfo() throws IOException {
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("UserData.txt"));
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
				User user = new User();
				userinfoArray = line.split(",");
				user.setUsername(userinfoArray[0]);
				user.setPassword(userinfoArray[1]);
				user.setName(userinfoArray[2]);
				user.setRole(userinfoArray[3]);
				users[count] = user;
				count++;
				if (count == 20) {
					break;
				}
			}
		} finally {
//			if (fileReader != null) {
			// fileReader.close();
		}
	}

	

	@SuppressWarnings("unused")
	private static void getpromptUser() {

		System.out.println("Enter your Username here: ");
		userUsername = UserLogin.userInput();
		System.out.println("Enter your Password here: ");
		userpassword = UserLogin.userInput();
	}
}
