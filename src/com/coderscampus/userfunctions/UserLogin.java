package com.coderscampus.userfunctions;

import java.util.Scanner;

import com.coderscampus.user.SuperUserInterface;

<<<<<<< Updated upstream
public class UserLogin implements SuperUserInterface {

	@Override
	public String getUserLogin(String username, String password) {
=======
public class  UserLogin implements SuperUserInterface {

	@Override
	public String getUserLogin(String username, String password) {
		@SuppressWarnings("resource")
>>>>>>> Stashed changes
		Scanner login = new Scanner(System.in);
		String userLogin = login.nextLine();
		return userLogin;
		
	}

	@Override
<<<<<<< Updated upstream
	public String updateUserInformationToFile(String oldInput) {
		// TODO Auto-generated method stub
		return null;
=======
	public void updateUserInformationToFile() {
		// TODO Auto-generated method stub
		
>>>>>>> Stashed changes
	}





<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
}
