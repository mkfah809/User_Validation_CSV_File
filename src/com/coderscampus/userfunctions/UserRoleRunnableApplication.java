package com.coderscampus.userfunctions;

import java.io.IOException;

import com.coderscampus.user.UserServices;
public class UserRoleRunnableApplication {
	
	
	public static void main(String[] args) throws IOException {
		UserServices.getuserfromFile(0);
		UserServices.getUser(1);

//		UserFromFile.getuserreadInfo();		
//		UserFromFile.getValidation();
	}
}
