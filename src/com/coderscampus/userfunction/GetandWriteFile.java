package com.coderscampus.userfunction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.coderscampus.user.User;

public class GetandWriteFile {

	public static User[] getuserfromFile() throws IOException {
		String[] userinfoArray;
		User[] users = new User[20];
		Integer countLine = 0;
		String line = null;
		BufferedReader fileReader = null;
		String oldUsername = null;
		String oldPassword = null;
		String oldName = null;
		String userRole = null;
		try {
			fileReader = new BufferedReader(new FileReader("UserData.txt"));
			while ((line = fileReader.readLine()) != null) {
				User user = new User(oldUsername, oldPassword, oldName, userRole);
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
			if (fileReader != null)
				fileReader.close();
		}
		return users;
	}

	void getwriteintoFile(User[] users) throws IOException, FileNotFoundException {
		String sb = "";
		for (User user : users) {
			sb = sb + user;
		}
		FileWriter fileWriter = new FileWriter("UserData.txt", false);
		fileWriter.write(sb.toString());
		fileWriter.close();
	}

}