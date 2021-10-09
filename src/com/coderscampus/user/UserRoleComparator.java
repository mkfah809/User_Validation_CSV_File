package com.coderscampus.user;

import java.util.Comparator;

public class UserRoleComparator implements Comparator<User> {

	@Override
	public int compare(User oldUser, User newUser) {
		
		return oldUser.getRole().compareTo(newUser.getRole());
	}

}
