package com.coderscampus.userfunction;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserRoleRunnableApplication {

	static Boolean userFound = false;
	static Integer invalidLogin = 0;

	public static void main(String[] args) throws IOException {
		applicationLaunch();
	}

	private static void applicationLaunch() throws IOException, FileNotFoundException {
		String userRole = "";
		String userUsername = "";
		String userPassword = "";
		User[] users = new User[20];
		users = GetandWriteFile.getuserfromFile();
		UserRoleRunnableApplication getUserCredential = new UserRoleRunnableApplication();
		User currentUser = null;
		currentUser = isUserValid(userRole, userUsername, userPassword, users, getUserCredential);
		getUserRole(users, currentUser);
		Arrays.sort(users);
		GetandWriteFile extracted = new GetandWriteFile();
		extracted.getwriteintoFile(users);
	}

	private static User isUserValid(String userRole, String userUsername, String userPassword, User[] users,
			UserRoleRunnableApplication getUserCredential) {
		User currentUser;
		do {
			currentUser = getUserCredential.getUserCredential(userUsername, userPassword, userRole, users);
			getUserCredential.userAttemptController(userPassword, userPassword, userPassword, users, currentUser);
			if (userFound == true) {
				break;
			}
		} while (invalidLogin <= 4);
		return currentUser;
	}

	private static void getUserRole(User[] users, User currentUser) throws IOException {

		if (currentUser.getRole().equals(UserPrivileges.SUPER_USER)) {
			UpdateUserInformation UUI = new UpdateUserInformation();
			UserPrivileges.getsuperuserPrivilege();
			UUI.getusertoUpdate(users, currentUser);

		} else if (currentUser.getRole().equals(UserPrivileges.NORMAL_USER)) {
			UpdateUserInformation UUI = new UpdateUserInformation();
			UserPrivileges.getnormaluserPrivilege();
			UUI.getusertoUpdate(users, currentUser);
		}
	}

	private User getUserCredential(String userUsername, String userPassword, String userRole, User[] users) {
		userUsername = UserLogin.getpromptUser("Enter your username: ");
		userPassword = UserLogin.getpromptUser("Enter your password: ");
		User currentUser = getCurrentUser(userUsername, userPassword, userRole, users);
		return currentUser;
	}

	private User getCurrentUser(String userUsername, String userPassword, String userRole, User[] users) {
		String welcomeUser = "";

		for (User user : users) {
			if (userUsername.equalsIgnoreCase(user.getUsername()) && userPassword.equals(user.getPassword())) {
				welcomeUser = user.getName();
				userFound = true;
				UserMessageOutput.validloginMessage(1, welcomeUser);
				return user;
			}
		}

		return null;
	}

	public void userAttemptController(String userUsername, String userPassword, String userRole, User[] users,User currentUser) {
		if (userFound == false) {
			UserMessageOutput.invalidLoginMessage(7);
			invalidLogin++;
			if (invalidLogin == 5) {
				UserMessageOutput.lockOutMessage(2);
				System.exit(0);
			}
		}
	}
}