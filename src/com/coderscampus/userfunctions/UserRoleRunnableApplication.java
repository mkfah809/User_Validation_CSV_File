package com.coderscampus.userfunctions;

import java.io.IOException;
import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;

public class UserRoleRunnableApplication {

	public static void main(String[] args) throws IOException {
		String userUsername = "";
		String userPassword = "";
		String userRole = "";
		String welcomeUser = "";
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
					String updateUsername = UpdateUserInformation.getupdateUsername();
					System.out.println("The updated username is: " + updateUsername);
				} else {
					UserPrivileges.getnormaluserPrivilege();
				}
			} else {
				continue;
			}
		}

	}


	private static void getuserprivilege() throws IOException {
		UserPrivileges.getsuperuserPrivilege();
		UserPrivileges.getnormaluserPrivilege();
		
		
	}

}
