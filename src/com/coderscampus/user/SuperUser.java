package com.coderscampus.user;

public class SuperUser extends User {

	private static final long serialVersionUID = 1L;

	public SuperUser(String username, String password, String name, String role) {
		// call the the constructor on User class.
		// JavaRule -> super keyword use first in the constructor.
		super(username, password, name, "super_user");
		this.username = "true";
	}

}
