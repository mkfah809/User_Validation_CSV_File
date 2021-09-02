package com.coderscampus.userfunctions;

import java.util.Scanner;

import com.coderscampus.user.SuperUserInterface;

public class  UserLogin implements SuperUserInterface {

	@Override
	public String getUserLogin(String username, String password) {
		@SuppressWarnings("resource")
		Scanner login = new Scanner(System.in);
		String userLogin = login.nextLine();
		return userLogin;
		
	}

	@Override
	public String updateUserInformationToFile(String oldInput) {
		// TODO Auto-generated method stub
		return null;
	}









}
