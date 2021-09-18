package com.coderscampus.userfunctions;

import java.io.*;
import java.util.Scanner;

import com.coderscampus.user.NormalUser;
import com.coderscampus.user.User;
import com.coderscampus.user.UserMessageOutput;
import com.coderscampus.user.UserServices;

public class UserFromFile {
	

	public static void getUserPrivilege() {
		User user = new User();
		String userRole = user.getRole();
		System.out.println("You have the privilege to update " + "(You are " + userRole + ")");
		System.out.println("Please choose from the following options: ");
		UserMessageOutput.loginasanotheruserMessage(3);
		
		System.out.println("[4] Exit");
		System.out.println("Enter you option here: ");
	}
}
//				UserServices.getUserPrivilege();
//				Scanner userinputList = new Scanner(System.in);
//				Integer inputList = userinputList.nextInt();
//				if (inputList == 0) {
//					UserLogin.getloginasanyUser(0);				
//				} else if (inputList == 1) {
//					
//				} else if (inputList == 2) {
//					
//				} else if (inputList == 3) {
//					
//				} else if (inputList == 4) {
//					System.exit(0);
//				}
//					
//			} else {
//				System.out.println("You have the privilege to update: ");
//				NormalUser normaluser = (NormalUser) new User();
//				normaluser.getnormaluserMsg();
//				System.out.println("Enter you option here: ");
//				Scanner userinputList = new Scanner(System.in);
//				Integer inputList = userinputList.nextInt();
//			}
//		
//		
////			while ((line = fileReader.readLine()) != null) {
////				User person = new User();
////				users[countLine] = person;
////				userPerson = users;
////				person.setUsername(userinfoArray[0]);
////				person.setPassword(userinfoArray[1]);
////				person.setName(userinfoArray[2]);
////				person.setRole(userinfoArray[3]);
////				int lineCounting = 0;
////				lineCounting++;
////				if (lineCounting == 20) {
////					break;
////				}
////			}
//			userPerson = users;
//			for (User persons : userPerson) {
//				
//				welcomenormaluserfromSuper = persons.getUsername();
//				if (welcomenormaluserfromSuper.equals(persons.getUsername()))
//				// && userRole.equals("normal_user"))
//				{
//					userFound = true;
//					UserMessageOutput.validloginMessage(1, persons.getName());
//					System.out.println("Why does it read only the first user? " + "The concet is working but for only the first line.");
//					break;
//				} else {
//					userFound = false;
//					System.out.println("It works but it catches the else statment\n because userRole is " + userRole);
//					break;
//				}
//			
//			}

//	static void getpromptUser() {
//
//		System.out.println("Enter your Username here: ");
//		userUsername = UserLogin.userInput();
//		System.out.println("Enter your Password here: ");
//		userPassword = UserLogin.userInput();
//	}
//
