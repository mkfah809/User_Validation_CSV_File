package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;

public class UpdateUserInformation {

//	static User getupdateUsername() throws IOException {
//		User updatedUsername = UpdateUserInformation.getupdateUsername();
//		System.out.println("Please enter a new username");
//		updatedUsername.setUsername(UserLogin.login.nextLine());
//		System.out.println("updatedUsername is " + updatedUsername.getUsername());
//		return updatedUsername;
//	}
//
//	static User getupdatePassword() throws IOException {
//		System.out.println("Please enter a new password");
//		UserLogin getloginasanyuserList = new UserLogin();
//		User updatedPassword = getloginasanyuserList.getloginasanyUser();
//		System.out.println("updatedPassword is " + updatedPassword);
//		return updatedPassword;
//	}
//
//	static User getupdateName() throws IOException {
//		UserLogin getloginasanyuserList = new UserLogin();
//		User updatedName = getloginasanyuserList.getloginasanyUser();
//		System.out.println("updatedName is " + updatedName);
//		return updatedName;
//	}

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
			System.out.println("Your new username is" + updatedUsername.getUsername());
			return updatedUsername;

		} else if (userOption == 2) {
			User updatedPassword = user;
			System.out.println("Please enter a new password");
			user.setUsername(UserLogin.login.nextLine());
			System.out.println("Your new password is " + updatedPassword.getPassword());
			return updatedPassword;
			
		} else if (userOption == 3) {
			User updatedName = user;
			System.out.println("Please enter a new name");
			user.setUsername(UserLogin.login.nextLine());
			System.out.println("Your new name is " + updatedName.getName());
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
