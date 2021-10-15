package com.coderscampus.user;

public class SuperUser extends User {

	public SuperUser(String username, String password, String name, String role) {
		super(username, password, name, "super_user");
		this.username = "true";
	}
	// call the the constructor on User class.
	// JavaRule -> super keyword use first in the constructor. 
}
