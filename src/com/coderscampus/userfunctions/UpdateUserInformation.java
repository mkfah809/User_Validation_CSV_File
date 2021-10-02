package com.coderscampus.userfunctions;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.NormalUser;
import com.coderscampus.user.User;

public class UpdateUserInformation {
	static Scanner updateInput = new Scanner(System.in);

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

	public static String[] getupdateduserRecord(String updatedUsername,String updatedPassword,String updatedName) throws IOException {

		String[] updatedthisRecord = new String[4];
		String line = "";
		UserPrivileges.getnormaluserPrivilege();
		updatedUsername = UserLogin.getloginasanyUser(1); // holds updated username
		UserPrivileges.getnormaluserPrivilege();
		updatedPassword = UserLogin.getloginasanyUser(2); // holds updated user passwrd
		UserPrivileges.getnormaluserPrivilege();
		updatedName = UserLogin.getloginasanyUser(3); // holds updated user name
		System.out.println("The current user has been updated successfully");
		// updatedthisRecord = line.split(",");
		
		System.out.println(updatedUsername + "," + updatedPassword + "," + updatedName + "," + "normal_user");
		return updatedthisRecord;
	}

}
