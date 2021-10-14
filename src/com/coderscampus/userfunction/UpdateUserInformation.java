package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;

public class UpdateUserInformation {

	User getupdateUser() throws IOException {
		getuserprivilege();
		User user = UserLogin.getloginasanyUser();
		UserPrivileges.getnormaluserPrivilege();
		@SuppressWarnings("resource")
		Scanner useroptionList = new Scanner(System.in);
		int userOption = useroptionList.nextInt();

		if (userOption == 1) {
			User updatedUsername = user;
			System.out.println("Please enter a new username");
			user.setUsername(UserLogin.login.nextLine());
			return updatedUsername;

		} else if (userOption == 2) {
			User updatedPassword = user;
			System.out.println("Please enter a new password");
			user.setPassword(UserLogin.login.nextLine());
			return updatedPassword;

		} else if (userOption == 3) {
			User updatedName = user;
			System.out.println("Please enter a new name");
			user.setName(UserLogin.login.nextLine());
			return updatedName;

		} else if (userOption == 4) {
			System.exit(0);
		}
		return null;
	}

	private static void getuserprivilege() throws IOException {
		UserPrivileges.getsuperuserPrivilege();
		UserPrivileges.getnormaluserPrivilege();
	}
}
