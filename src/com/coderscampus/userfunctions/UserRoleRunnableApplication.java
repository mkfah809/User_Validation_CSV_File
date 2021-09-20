package com.coderscampus.userfunctions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.coderscampus.user.UserServices;
public class UserRoleRunnableApplication {
	
	
	static BufferedReader fileReader = null;
	public static void main(String[] args) throws IOException {
		UserServices.getuserfromFile(0);
		UserServices.getUser(0);
	
	}
}
