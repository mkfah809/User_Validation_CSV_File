package com.coderscampus.user;

import java.io.IOException;

import com.coderscampus.fileinformation.FileServiceImpl;


public class UserRoleRunnableApplication {

	public static void main(String[] args) throws IOException {
		
		FileServiceImpl fileservice = new FileServiceImpl();
		fileservice.getUserInformationFromFile("UserData.txt");
		
		User superuser = new SuperUser();
		 
	
	}

}
