package com.coderscampus.userfunctions;

import java.util.Scanner;

public class UserLogin {

	static Integer[] listofOption = new Integer[5];	
	private static String getUserLogin(String promptMsg) {
		@SuppressWarnings("resource")
		Scanner login = new Scanner(System.in);
		System.out.println(promptMsg);
		String userLogin = login.nextLine();
		return userLogin;
	}

	public static void getpromptUser(Integer listoptinID/* , String userUsername, String userPassword */) {
		listofOption[1] = 1;
		if(listoptinID ==1) { 
			String userUsername = getUserLogin("Enter your username: ");
			String userPassword = getUserLogin("Enter your password: ");
		}
	}

	public static String getloginasanyUser(Integer listoptinID) {
		listofOption[0] = 0;
		if (listoptinID == 0) {
			System.out.println("list of option is equal to 0");
			Scanner userinputUsername = new Scanner(System.in);
			System.out.println("Which user would you like to login as? (Type in a valid username)");
			System.out.println("Please login as normal user");
			String welcomenormaluserfromSuper = userinputUsername.nextLine();
			return welcomenormaluserfromSuper;
		} else if (listoptinID ==1) {
			System.out.println("list of option is equal to 1");
		} else if (listoptinID ==2) {
			System.out.println("list of option is equal to 2");
		} else if (listoptinID ==3) {
			System.out.println("list of option is equal to 3");
		} else {
			System.out.println("list of option is equal to 4");
			System.exit(0);
		}
		return "coudln't get any welcome normal user from super";
	}

}
