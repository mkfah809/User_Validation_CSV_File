package com.coderscampus.user;

import java.io.IOException;

import com.coderscampus.userfunction.UpdateUserInformation;

public class SuperUser extends User {

	private static final long serialVersionUID = 1L;

	public SuperUser(String username, String password, String name, String role) {
		// call the the constructor on User class.
		// JavaRule -> super keyword use first in the constructor.
		super(username, password, name, "super_user");
		this.username = "true";
	}

	public void userisSuperUser(User[] users) throws IOException {
		System.out.println("");
		UpdateUserInformation.getuserprivilege();
		UpdateUserInformation updateUser = new UpdateUserInformation();
		updateUser.getupdateUser(users);
		
	}

}
