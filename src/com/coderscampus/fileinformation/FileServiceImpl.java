package com.coderscampus.fileinformation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.coderscampus.user.User;

public class FileServiceImpl implements FileServiceInterface {
	private static String line = null;
	public static String[] userinfoArray;
	private static User[] users = new User[20];
	private static Integer count = 0;
	private BufferedReader reader = null;

	@SuppressWarnings("null")
	@Override
	public String getUserInformationFromFile(String file) throws IOException {
		try {

			reader = new BufferedReader(new FileReader(file));
			getUser();
			
		} finally {
			if (reader == null) {
				reader.close();
			}
		}
		return reader.readLine();

	}

	@Override
	public void UpdateUserInformationToFile(File file, String line) throws IOException {

	}

	private void getUser() throws IOException {
		while ((line = reader.readLine()) != null) {
			
			User user = new User();
			
			System.out.println(line);
			userinfoArray = line.split(",");
			user.setUsername(userinfoArray[0]);
			user.setPassword(userinfoArray[1]);
			user.setName(userinfoArray[2]);
			user.setRole(userinfoArray[3]);
			users[count] = user;
			count++;
			
			}
		
	}
}
