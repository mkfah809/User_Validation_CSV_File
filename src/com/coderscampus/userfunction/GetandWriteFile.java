package com.coderscampus.userfunction;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import com.coderscampus.user.User;
import java.io.ObjectOutputStream;

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

//	public void sortatextFile() throws IOException {
//		FileWriter fileWriter = new FileWriter("UserData.txt", true);
//		// USER UPDATE //
////////////////////////////////////////////////////////////////////
//	
//		String newUsername = updatedUser.getUsername();
//		String newPassword = updatedUser.getPassword();
//		String newName = updatedUser.getName();
//		String newRole = updatedUser.getRole();
///////////////////////////////////////////////////////////////////
//		// OLD USER NOT UPDATED YET //
//		User[] users = getuserfromFile();
//		String oldUsername = "";
//		String oldPassword = "";
//		String oldName = "";
//		String oldRole = "";
////////////////////////////////////////////////////////////////////			
//		String actualnewUser = "\n" + newUsername + "," + newPassword + "," + newName + "," + newRole;
//		for (User user : users) {
//			oldUsername = user.getUsername();
//			oldPassword = user.getPassword();
//			oldName = user.getName();
//			oldRole = user.getRole();
//			String actualoldUser = oldUsername + "," + oldPassword + "," + oldName + "," + oldRole;
//		
//			String replaceUser = "";
//			if (oldUsername.equals(newUsername) || oldPassword.equals(newPassword) || oldName.equals(newName)) {
//				System.out.println("Old User: " + actualoldUser);
//				// HERE I NEED TO DELETE THE OLD RECORD
//				actualnewUser.replaceAll(actualoldUser, actualnewUser);
//				System.out.println("New User: " + actualnewUser);
//				System.out.println("Replacement: "+replaceUser);
//				fileWriter.write(replaceUser); 
//				System.out.println("Replaced");
//			}
//		}
//		Arrays.sort(users);
//
//		BufferedReader fileReader = new BufferedReader(new FileReader("UserData.txt"));
//		System.out.println("Out of loop");
//		fileReader.close();
//		fileWriter.close();
//	}

}

//while ((line = fileReader.readLine()) != null) {
//	User user = new User();
//	userinfoArray = line.split(",");
//	System.out.println(line);
//	if(updatedUser.getUsername() ||
//			updatedUser.getPassword() ||
//			updatedUser.getName())
//		user.setUsername(userinfoArray[0]);
//	user.setPassword(userinfoArray[1]);
//	user.setName(userinfoArray[2]);
//	user.setRole(userinfoArray[3]);
//	users[countLine] = user;
//	countLine++;
//	if (countLine == 20) {
//		break;
//	}
//}
///////////////////////////////////////////////
//for(int i=0; i<users.length; i++) {
//	User user = users[i];
//	if(user.getUsername().equals())
//}