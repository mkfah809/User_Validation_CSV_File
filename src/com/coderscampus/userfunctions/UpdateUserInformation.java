package com.coderscampus.userfunctions;

import java.io.IOException;
import java.util.Scanner;


public class UpdateUserInformation {
	private static Scanner updateInput = new Scanner(System.in);

	private static String getupdateUsername() throws IOException {
		System.out.println("Please enter a new username");
		String updatedUsername = updateInput.nextLine();
		return updatedUsername;
	}

	private static String getupdatePassword() throws IOException {
		System.out.println("Please enter a new password");
		String updatedPassword = updateInput.nextLine();
		return updatedPassword;
	}

	private static String getupdateName() throws IOException {
		System.out.println("Please enter a new name");
		String updatedName = updateInput.nextLine();
		return updatedName;
	}

//	public static String getupdateduserRecord(String updatedUsername, String updatedPassword, String updatedName)
//			throws IOException {
//
//		String[] updatedthisRecord = new String[6];
//		String line = "";
//		UserPrivileges.getnormaluserPrivilege();
//		updatedUsername = UserLogin.getloginasanyUser(1); // holds updated username
//		UserPrivileges.getnormaluserPrivilege();
//		updatedPassword = UserLogin.getloginasanyUser(2); // holds updated user passwrd
//		UserPrivileges.getnormaluserPrivilege();
//		updatedName = UserLogin.getloginasanyUser(3); // holds updated user name
//		System.out.println("The current user has been updated successfully");
////		updatedthisRecord[0] = updatedUsername;
////		updatedthisRecord[1] = updatedPassword;
////		updatedthisRecord[2] = updatedName;
////		updatedthisRecord[3] = "normal_user";
////		System.out.println(updatedthisRecord);
//		String outputintoaFile = updatedUsername + "," + updatedPassword + "," + updatedName + "," + "normal_user";
//		return outputintoaFile;
//	}

	private User getupdateRecord() throws IOException {
		String updatedUsername;
		String updatedPassword;
		String updatedName;
		User updatedUser = null;
		UserPrivileges.getnormaluserPrivilege();
		updatedUsername = UserLogin.getloginasanyUser(1); // holds updated username
		UserPrivileges.getnormaluserPrivilege();
		updatedPassword = UserLogin.getloginasanyUser(2); // holds updated user passwrd
		UserPrivileges.getnormaluserPrivilege();
		updatedName = UserLogin.getloginasanyUser(3); // holds updated user name
		updatedUser.setUsername(updatedUsername);
		updatedUser.setPassword(updatedPassword);
		updatedUser.setName(updatedName);
		updatedUser.setRole(updatedName);
		System.out.println("I am an Updated Record  with a User Type!\n-------------------------");
		System.out.println(updatedUser);
		//String updatedUserString = updatedUsername + "," + updatedPassword + "," + updatedName + "," + "normal_user";
		return updatedUser;
	}

}
