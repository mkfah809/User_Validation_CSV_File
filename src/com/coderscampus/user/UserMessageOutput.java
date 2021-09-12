package com.coderscampus.user;

public class UserMessageOutput {
	private static String[] OutputMessage = new String[30];

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
	public static void loginasanotheruserMessage(int loginasanotherusermesssageid) {
		OutputMessage[3] = "[0] Log in as another user";
		if (loginasanotherusermesssageid == 3) {
			System.out.println(OutputMessage[3]);
		}
		
	}
	public static void updateusernameMessage(int updateusernamemesssageid) {
		OutputMessage[4] = "[1] Update username";
		if (updateusernamemesssageid == 4) {
			System.out.println(OutputMessage[4]);
		}
	}
	public static void updatepasswordMessage(int updatepasswordmesssageid) {
		OutputMessage[5] = "[2] Update password";
		if (updatepasswordmesssageid == 5) {
			System.out.println(OutputMessage[5]);
		}
	}
	public static void updatenameMessage(int updatenamemesssageid) {
		OutputMessage[6] = "[3] Update name";
		if (updatenamemesssageid == 6) {
			System.out.println(OutputMessage[6]);
		}
	}
	
}
