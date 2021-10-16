package com.coderscampus.userfunction;

import com.coderscampus.user.UserMessageOutput;

public class UserPrivileges {

	public static void getsuperuserPrivilege() {
		System.out.println("\nPlease choose from the following options: ");
		UserMessageOutput.loginasanotheruserMessage(3);
		UserMessageOutput.updateusernameMessage(4);
		UserMessageOutput.updatepasswordMessage(5);
		UserMessageOutput.updatenameMessage(6);
		System.out.println("[4] Exit");
		System.out.println("Enter you option here: ");
	}

	public static void getnormaluserPrivilege() {
		System.out.println("\nPlease choose from the following options: ");
		UserMessageOutput.updateusernameMessage(4);
		UserMessageOutput.updatepasswordMessage(5);
		UserMessageOutput.updatenameMessage(6);
		System.out.println("[4] Exit");
		System.out.println("Enter you option here: ");

	}
}
