package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Arrays;

import com.coderscampus.user.SuperUser;
import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserRoleRunnableApplication {
	private static final String NORMAL_USER = "normal_user";
	private static final String SUPER_USER = "super_user";

	public static void main(String[] args) throws IOException {
		String userUsername = "";
		String userPassword = "";
		String userName = "";
		String userRole = "";
		User[] users = new User[20];
		users = GetandWriteFile.getuserfromFile();
		userUsername = UserLogin.getpromptUser("Enter your username: ");
		userPassword = UserLogin.getpromptUser("Enter your password: ");
		userRole = getuserRole(userUsername, userPassword, userRole, users);

		if (userRole.equals(SUPER_USER)) {
			SuperUser superUser = new SuperUser(userUsername, userPassword, userName, userRole);
			superUser.userisSuperUser(users);

		} else if (userRole.equals(NORMAL_USER)) {
			System.out.println("I am not super-user");
			UpdateUserInformation UUI = new UpdateUserInformation();
			UUI.getupdateUser(users);
		}
		Arrays.sort(users);
		GetandWriteFile extracted = new GetandWriteFile();
		extracted.getwriteintoFile(users);
	}

	private static String getuserRole(String userUsername, String userPassword, String userRole, User[] users) {
		String welcomeUser = "";
		for (User user : users) {
			if (userUsername.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
				userRole = user.getRole();
				welcomeUser = user.getName();
				UserMessageOutput.validloginMessage(1, welcomeUser);
			}
		}
		return userRole;
	}

}