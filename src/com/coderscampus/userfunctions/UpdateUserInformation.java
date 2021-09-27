package com.coderscampus.userfunctions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.coderscampus.personcomparable.Person;
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

	public static void getupdateduserRecord(String updatedUsername, String updatedPassword, String updatedName)
			throws IOException {
		UserPrivileges.getnormaluserPrivilege();
		updatedUsername = UserLogin.getloginasanyUser(1); // holds updated username
		UserPrivileges.getnormaluserPrivilege();
		updatedPassword = UserLogin.getloginasanyUser(2); // holds updated user passwrd
		UserPrivileges.getnormaluserPrivilege();
		updatedName = UserLogin.getloginasanyUser(3); // holds updated user name
		System.out.println("The current user has been updated successfully");
		System.out.println("New Userame is: " + updatedUsername);
		System.out.println("New Password is: " + updatedPassword);
		System.out.println("New Name is: " + updatedName);
	}
	
	public static void getwriteintoFile() {
		User user = new User();
		User mina = 
		User karam = new User("Mina Page", 70);
		Person fahmy = new Person("Mina Page", 70);
		try (FileOutputStream fileoutput = new FileOutputStream("UserData.txt");
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileoutput);) {
			objectOutput.writeObject(mina);
			objectOutput.writeObject(karam);
			objectOutput.writeObject(fahmy);
		}
	}
}
