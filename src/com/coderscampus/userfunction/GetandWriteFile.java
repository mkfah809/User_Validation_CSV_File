package com.coderscampus.userfunction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
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

	public void sortatextFile() throws IOException {
		User updatedUser = new User();
		UpdateUserInformation updateUserInformation = new UpdateUserInformation();
		updatedUser = (User) updateUserInformation.getupdateduserRecord();
		FileWriter fileWriter = new FileWriter("UserData.txt", true);
		String[] userinfoArray = null;
		Integer countLine = 0;
		User[] people = new User[20];
		String line = "";
		BufferedReader fileReader = new BufferedReader(new FileReader("UserData.txt"));
		try {
			while ((line = fileReader.readLine()) != null) {
				User user = new User();
				userinfoArray = line.split(",");
				user.setUsername(userinfoArray[0]);
				user.setPassword(userinfoArray[1]);
				user.setName(userinfoArray[2]);
				user.setRole(userinfoArray[3]);
				people[countLine] = user;
				countLine++;
				if (countLine == 20) {
					break;
				}
			}
		} finally {
			if(fileReader != null)
				fileReader.close();
		}
		//User[] user = getuserfromFile();
		fileWriter.write("\n" + updatedUser.getUsername() + "," + updatedUser.getPassword() + ","
				+ updatedUser.getName() + "," + updatedUser.getRole());
		for (User person : people) {
			PrintWriter makethefileEmpty= new PrintWriter("UserData.txt");
			makethefileEmpty.print("");
			fileWriter.write("\n" + person.getName()+","+person.getRole());
			System.out.println("----------------------------------------------");
			System.out.println(person.getName() + " - " + person.getRole());
		}
		try {
			Arrays.sort(people);
			fileReader.readLine();
		} catch (Exception e) {
			System.err.println("Error while writing to file: " + e.getMessage());
		} finally {
			fileWriter.close();
		}
	}
}
