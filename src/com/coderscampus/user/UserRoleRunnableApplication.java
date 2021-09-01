package com.coderscampus.user;

import java.io.IOException;

import com.coderscampus.userfunctions.UserFromFile;

public class UserRoleRunnableApplication {

	public static void main(String[] args) throws IOException {

		UserFromFile userfromFile = new UserFromFile();
		System.out.println(userfromFile.getUserInformationFromFile("UserData.txt"));
	
	}

}
