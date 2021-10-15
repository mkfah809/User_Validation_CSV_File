package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Arrays;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserRoleRunnableApplication {

	public static void main(String[] args) throws IOException {
		String userUsername = "";
		String userPassword = "";
		String userRole = "";
		String welcomeUser = "";
		User[] users = new User[20];
		users = GetandWriteFile.getuserfromFile();
		userUsername = UserLogin.getpromptUser("Enter your username: ");
		userPassword = UserLogin.getpromptUser("Enter your password: ");
		for (User user : users) {
			if (userUsername.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
				userRole = user.getRole();
				welcomeUser = user.getName();
				UserMessageOutput.validloginMessage(1, welcomeUser);
				if (userRole.equals(user.getRole())) {
					System.out.println("------------------------");
					UpdateUserInformation updateUser = new UpdateUserInformation();
					updateUser.getupdateUser(users);
					Arrays.sort(users);
					printUser(users);
					// test users to see if changes are there.
//					GetandWriteFile sorttheFile = new GetandWriteFile();
//					sorttheFile.sortatextFile();
					System.out.println("Back to main safely! ^_^");
					break;
				} else {
					System.out.println("I am not super user");
					System.out.println("I am a normal user");
				}
			}
		}
	}
	 static void printUser(User[] users) {
		for(User user : users) {
			System.out.println(user);
		}
	}

}
