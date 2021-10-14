package com.coderscampus.userfunction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import com.coderscampus.user.User;

public class GetandWriteFile {

	public static User[] getuserfromFile() throws IOException {
		User[] users = new User[20];
		String[] userinfoArray;
		Integer countLine = 0;
		String line = null;
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("UserData.txt"));
			while ((line = fileReader.readLine()) != null) {
				User user = new User();
				userinfoArray = line.split(",");
				user.setUsername(userinfoArray[0]);
				user.setPassword(userinfoArray[1]);
				user.setName(userinfoArray[2]);
				user.setRole(userinfoArray[3]);
				users[countLine] = user;
				countLine++;
				if (countLine == 20) {
					break;
				}
			}
		} finally {
			if (fileReader == null)
				fileReader.close();
		}
		return users;
	}

	public void sortatextFile() throws IOException {
		UpdateUserInformation updateUser = new UpdateUserInformation();
		User updatedUser = updateUser.getupdateUser();
		FileWriter fileWriter = new FileWriter("UserData.txt", true);
		User[] people = getuserfromFile();
		for (User person : people) {
			
		}
		System.out.println("Out of loop");

	}

}
