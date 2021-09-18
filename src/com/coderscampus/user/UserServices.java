package com.coderscampus.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.coderscampus.userfunctions.UserLogin;

public class UserServices {
	private static Integer[] userfunctionsArray = new Integer[3];
	static User[] users = new User[20]; // For the first for each
	private static String userUsername = "";
	private static String userPassword = "";
	private static String welcomeUser = "";
	private static String userRole = "";
	static User[] userPerson = new User[20]; // // For the second for each

// ******************** 0 ***********************
	@SuppressWarnings("null")
	public static User[] getuserfromFile(int userfileID) throws IOException {
		userfunctionsArray[0] = userfileID;

		String line = null;
		Integer countLine = 0;
		String[] userinfoArray;
		BufferedReader fileReader = null;
		if (userfileID == 0) {
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
		return users;
	}

	public static void getUser(int userfunctionsarrayID) throws IOException {
		UserLogin.getpromptUser(1);
		User person = new User();
		userfunctionsArray[1] = 1;
		userUsername = person.getUsername();
		userPassword = person.getPassword();
		if (userfunctionsarrayID == 1) {
			for (User user : users) {
				// userFound = true;
				welcomeUser = user.getName();
				if (userUsername.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
					userRole = user.getRole();
					UserMessageOutput.validloginMessage(1, welcomeUser);
				}
			}
		}
	}
}
