package com.coderscampus.userfunctions;

import java.io.*;
import com.coderscampus.user.User;

public class UserFromFile {

	private BufferedReader reader = null;
	private static String line = null;
	private static String[] userinfoArray;

	public String getUserInformationFromFile(String fileName) throws IOException {
		try {
			reader = new BufferedReader(new FileReader(fileName));
			getuserInformation();

		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		return null;
	}

	private String getuserInformation() throws IOException {

		while ((line = reader.readLine()) != null) {
			//System.out.println(line);
			User user = new User();
			userinfoArray = line.split(",");
			user.setUsername(userinfoArray[0]);
			user.setPassword(userinfoArray[1]);
			user.setName(userinfoArray[2]);
			user.setRole(userinfoArray[3]);
			UserLogin userlogin = new UserLogin();
			userlogin.getUserLogin("Enter your username: ", user.getName());
			userlogin.getUserLogin("Enter your password: ", user.getPassword());

		}
		return line;

	}

}
