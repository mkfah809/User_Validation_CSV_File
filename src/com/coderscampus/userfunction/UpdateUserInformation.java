package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;
import com.coderscampus.user.User;

public class UpdateUserInformation {
	private static Scanner updateInput = new Scanner(System.in);

	static String getupdateUsername() throws IOException {
		System.out.println("Please enter a new username");
		String updatedUsername = updateInput.nextLine();
		return updatedUsername;
	}

	static String getupdatePassword() throws IOException {
		System.out.println("Please enter a new password");
		String updatedPassword = updateInput.nextLine();
		return updatedPassword;
	}

	static String getupdateName() throws IOException {
		System.out.println("Please enter a new name");
		String updatedName = updateInput.nextLine();
		return updatedName;
	}

	public User getupdateduserRecord() throws IOException {
		String updatedUsername = null;
		String updatedPassword = null;
		String updatedName = null;
		User updatedUser = new User();
		UserPrivileges.getnormaluserPrivilege();
		updatedUsername = UserLogin.getloginasanyUser(1); // holds updated username
		UserPrivileges.getnormaluserPrivilege();
		updatedPassword = UserLogin.getloginasanyUser(2); // holds updated user passwrd
		UserPrivileges.getnormaluserPrivilege();
		updatedName = UserLogin.getloginasanyUser(3); // holds updated user name
		if (updatedUsername != null && updatedPassword != null && updatedName != null) {
			for (int ifuserlineisEmpty = 0; ifuserlineisEmpty < 4; ifuserlineisEmpty++) {
				updatedUser.setUsername(updatedUsername);
				updatedUser.setPassword(updatedPassword);
				updatedUser.setName(updatedName);
				updatedUser.setRole("normal_user");
			}
		}
		return updatedUser;

	}
}
