package com.coderscampus.userfunction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import com.coderscampus.user.User;
import com.coderscampus.user.UserRoleComparator;

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

	public User gettoWriteintoafile() throws IOException {
		User updatedUser = new User();
		UpdateUserInformation updateUserInformation = new UpdateUserInformation();
		updatedUser = (User) updateUserInformation.getupdateduserRecord();
		FileWriter fileWriter = new FileWriter("UserData.txt", true);
		try {
			// SORT THEN WRITE PLEASE! I THINK TO BE CONTINUE
			fileWriter.write("\n" + updatedUser.getUsername() + "," + updatedUser.getPassword() + ","
					+ updatedUser.getName() + "," + updatedUser.getRole());
		} catch (Exception e) {
			System.err.println("Error while writing to file: " + e.getMessage());
		} finally {
			fileWriter.close();
		}

		return updatedUser;
	}

	public void sortatextFile() throws IOException {
		System.out.println("sort a text from file");
		User[] people = new User[21];
		GetandWriteFile writeintoFile = new GetandWriteFile();
		User updatedUser = writeintoFile.gettoWriteintoafile();
//		BufferedReader reader = new BufferedReader(new FileReader("UserData.txt"));
		System.out.println(updatedUser);
//		ArrayList<String> userList = new ArrayList<>();
//		Collections.sort(userList);
//		String line = "";
//		while ((line = reader.readLine()) != null) {
//			userList.add(line);
//		}
//		FileWriter writer = new FileWriter("UserData.txt");
//		System.out.println("----------");
//		for (String outputLine : userList) {
//			System.out.println();
//			writer.write("\n" + outputLine);
//		}
//		writer.close();
		Arrays.sort(people, new UserRoleComparator());
		for (User person : people) {
			System.out.println(person.getName() + " is " + person.getName() + " inches tall. ");
		}
	}
}
