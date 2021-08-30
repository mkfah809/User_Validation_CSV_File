package com.coderscampus.user;

public interface SuperUserInterface {
	
	String getUserLogin(String username, String password);
	void updateUserInformationToFile();

}
