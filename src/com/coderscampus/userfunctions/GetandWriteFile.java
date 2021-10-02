package com.coderscampus.userfunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.coderscampus.user.User;

public class GetandWriteFile {

	@SuppressWarnings("null")
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

	public static String[] gettoWriteintoafile() throws IOException {
		String[] thisUser = new String[4];
		String updatedUsername = "";
		String updatedPassword = "";
		String updatedName = "";
		thisUser = UpdateUserInformation.getupdateduserRecord(updatedUsername, updatedPassword, updatedName);
		FileWriter fstream = new FileWriter("UserData.txt", true);
		BufferedWriter out = new BufferedWriter(fstream);
		try {
			out.write("\n" + thisUser);
			out.close();
		} catch (Exception e) {
			System.err.println("Error while writing to file: " + e.getMessage());
		} finally {
			out.close();
		}
		System.out.println(thisUser);

		return thisUser;
	}
}
