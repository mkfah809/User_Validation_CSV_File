package com.coderscampus.user;

public class NormalUser extends User{

	public static void getnormaluserMsg() {
		UserMessageOutput.updateusernameMessage(4);
		UserMessageOutput.updatepasswordMessage(5);
		UserMessageOutput.updatenameMessage(6);
	}

}
