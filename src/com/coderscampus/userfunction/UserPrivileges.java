package com.coderscampus.userfunction;

import com.coderscampus.user.UserMessageOutput;

public class UserPrivileges {

	public static void getsuperuserPrivilege() {
		UserMessageOutput.loginasanotheruserMessage(3);
	}

	public static void getnormaluserPrivilege() {
		UserMessageOutput.updateusernameMessage(4);
		UserMessageOutput.updatepasswordMessage(5);
		UserMessageOutput.updatenameMessage(6);
		System.out.println("[4] Exit");
		System.out.println("Enter you option here: ");

	}
}
