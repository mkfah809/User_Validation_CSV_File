package com.coderscampus.user;

public interface SuperUserInterface {
	
	String getUserLogin(String username, String password);
	String updateUserInformationToFile(String oldInput);

}
