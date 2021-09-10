package com.coderscampus.user;

public class UserMessageOutput {
	private static String[] OutputMessage = new String[10];

	public static void invalidloginMessage(int invalidloginmesssageid) {
		
		OutputMessage[0] = "Invalid login, please try again";

		if (invalidloginmesssageid == 0) {

			System.out.println(OutputMessage[0]);
			int invalidLogin = 0;
			invalidLogin = invalidLogin + 1;

		}
	}

	public static void validloginMessage(int validloginmesssageid, String userName) {

		OutputMessage[1] = "Welcome: ";
		if (validloginmesssageid == 1) {
			System.out.println(OutputMessage[1] + userName);
		}
	}

	public static void lockoutMessage(int lockoutloginmesssageid) {
		OutputMessage[2] = "Too many failed login attempts, you are now locked out";
		if (lockoutloginmesssageid == 2) {
			System.out.println(OutputMessage[2]);
		}
	}

}
