package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Arrays;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserRoleRunnableApplication {
	private static final String NORMAL_USER = "normal_user";
	private static final String SUPER_USER = "super_user";
	static Boolean userFound = false;
	static Integer invalidLogin = 0;

	public static void main(String[] args) throws IOException {
		String userRole = "";
		String userUsername = "";
		String userPassword = "";
		User[] users = new User[20];
		users = GetandWriteFile.getuserfromFile();
		UserRoleRunnableApplication getUserCredential = new UserRoleRunnableApplication();

		User oldUser = getUserCredential.getUserCredential(userUsername, userPassword, userRole, users);
		if (oldUser.getRole().equals(SUPER_USER)) {
			UpdateUserInformation UUI = new UpdateUserInformation();
			UserPrivileges.getsuperuserPrivilege();
			UUI.getusertoUpdate(users, oldUser);

		} else if (oldUser.getRole().equals(NORMAL_USER)) {
			UpdateUserInformation UUI = new UpdateUserInformation();
			UserPrivileges.getnormaluserPrivilege();
			UUI.getusertoUpdate(users, oldUser);
		}

		Arrays.sort(users);
		GetandWriteFile extracted = new GetandWriteFile();
		extracted.getwriteintoFile(users);
	}

	private User getUserCredential(String userUsername, String userPassword, String userRole, User[] users) {
		userUsername = UserLogin.getpromptUser("Enter your username: ");
		userPassword = UserLogin.getpromptUser("Enter your password: ");
		User oldUser = getoldUser(userUsername, userPassword, userRole, users);
		return oldUser;
	}

	private User getoldUser(String userUsername, String userPassword, String userRole, User[] users) {
		String welcomeUser = "";
		do {
			for (User user : users) {
				if (userUsername.equalsIgnoreCase(user.getUsername()) && userPassword.equals(user.getPassword())) {
					welcomeUser = user.getName();
					userFound = true;
					UserMessageOutput.validloginMessage(1, welcomeUser);
					return user;
				}
			}
			userValidation(userUsername, userPassword, userRole, users);

		} while (invalidLogin != 4);

		return null;
	}

	public void userValidation(String userUsername, String userPassword, String userRole, User[] users) {
		if (userFound == false) {
			if (invalidLogin == 4) {
				UserMessageOutput.lockOutMessage(2);
				System.exit(0);
			}
			invalidLogin++;
			UserMessageOutput.invalidLoginMessage(7);
			getUserCredential(userUsername, userPassword, userRole, users);
		}
	}
}