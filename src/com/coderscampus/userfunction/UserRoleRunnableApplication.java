package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Arrays;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserRoleRunnableApplication {
	private static final String NORMAL_USER = "normal_user";
	private static final String SUPER_USER = "super_user";

	public static void main(String[] args) throws IOException {
		String userUsername = "";
		String userPassword = "";
		String userRole = "";
		User[] users = new User[20];
		users = GetandWriteFile.getuserfromFile();
		userUsername = UserLogin.getpromptUser("Enter your username: ");
		userPassword = UserLogin.getpromptUser("Enter your password: ");
		User oldUser = getoldUser(userUsername, userPassword, userRole, users);

		if (oldUser.getRole().equals(SUPER_USER)) {

			UpdateUserInformation UUI = new UpdateUserInformation();
			UserPrivileges.getsuperuserPrivilege();
			UUI.getusertoUpdate(users, oldUser);

		} else if (oldUser.getRole().equals(NORMAL_USER)) {
			UpdateUserInformation UUI = new UpdateUserInformation();
			UserPrivileges.getnormaluserPrivilege();
			UUI.getusertoUpdate(users, oldUser);
		}
		System.out.println("Updated Successfuly");
		Arrays.sort(users);
		GetandWriteFile extracted = new GetandWriteFile();
		extracted.getwriteintoFile(users);
	}


	private static User getoldUser(String userUsername, String userPassword, String userRole, User[] users) {
		String welcomeUser = "";
		for (User user : users) {
			if (userUsername.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
				welcomeUser = user.getName();
				UserMessageOutput.validloginMessage(1, welcomeUser);
				return user;
			}
		}
		return null;
	}

}