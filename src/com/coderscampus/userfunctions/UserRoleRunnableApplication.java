package com.coderscampus.userfunctions;

import java.io.FileWriter;
import java.io.IOException;

import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserRoleRunnableApplication {

	@SuppressWarnings("finally")
	public static void main(String[] args) throws IOException {
		String userUsername = "";
		String userPassword = "";
		String userRole = "";
		String welcomeUser = "";
		String updatedUsername = "";
		String updatedPassword = "";
		String updatedName = "";
		User[] users = new User[20];
		users = getFile.getuserfromFile();
		userUsername = UserLogin.getpromptUser("Enter your username: ");
		userPassword = UserLogin.getpromptUser("Enter your password: ");
		for (User user : users) {
			if (userUsername.equals(user.getUsername()) && userPassword.equals(user.getPassword())) {
				userRole = user.getRole();
				welcomeUser = user.getName();
				UserMessageOutput.validloginMessage(1, welcomeUser);
				if (userRole.equals("super_user")) {
					System.out.println("------------------------");
					System.out.println("\nPlease choose from the following options: ");
					getuserprivilege();
					String loginwithanotherUsername = UserLogin.getloginasanyUser(0); // holds the another account
					System.out.println("Succesfully logged in as another user!");
					System.out.println("Welcome: " + loginwithanotherUsername);
					UpdateUserInformation.getupdateduserRecord(updatedUsername, updatedPassword, updatedName);
					FileWriter storeUser = new FileWriter("UserData.txt");
					try {
						
					} finally {
						continue;
					}
				} else {
					
					System.out.println("I am a normal user");
					
//					System.out.println("\nPlease choose from the following options: ");
//					NormalUser.getnormaluserMsg();
//					String updatednormaluserUsername = UserLogin.getloginasanyUser(1);
//					NormalUser.getnormaluserMsg();
//					String updatednormaluserPassword = UserLogin.getloginasanyUser(2);
//					NormalUser.getnormaluserMsg();
//					String updatednormaluserName = UserLogin.getloginasanyUser(3);
//					System.out.println(updatednormaluserUsername + "- " + updatednormaluserPassword + "- "
//							+ updatednormaluserName);
//					UpdateUserInformation.getupdateduserRecord(updatedUsername, updatedPassword, updatedName);
				}
			}
		}

	}

	private static void getuserprivilege() throws IOException {
		UserPrivileges.getsuperuserPrivilege();
		UserPrivileges.getnormaluserPrivilege();
	}

}
