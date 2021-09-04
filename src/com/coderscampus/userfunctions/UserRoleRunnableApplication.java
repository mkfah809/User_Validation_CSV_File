package com.coderscampus.userfunctions;

import java.io.BufferedReader;
import java.io.IOException;

public class UserRoleRunnableApplication {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {

		UserFromFile fileservice = new UserFromFile();
		fileservice.getUserInformationFromFile("UserData.txt");

//		String line;
//		BufferedReader reader = null;
//		while ((line = reader.readLine()) != null) {
//			UserFromFile userfromfile = new UserFromFile();
//			userfromfile.getUserInformationFromFile(line);
//			UserLogin userlogin = new UserLogin();
//			userlogin.getUserLogin("Enter your username: ", line);
//			userlogin.getUserLogin("Enter your password: ", line);
	}
}
