package com.coderscampus.user;

import com.coderscampus.userfunction.UpdateUserInformation;
import com.coderscampus.userfunction.UserLogin;

public class UserRecordUpdate {
	UpdateUserInformation UUI = new UpdateUserInformation();
	public void updatingName(User[] users, User oldUser) {
		User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
		System.out.println("Please enter a new Name");
		newUser.setName(UserLogin.login.nextLine());
		UUI.updateUser(oldUser, newUser, users);
	}

	public void updatingPassword(User[] users, User oldUser) {
		User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
		System.out.println("Please enter a new Password");
		newUser.setPassword(UserLogin.login.nextLine());
		UUI.updateUser(oldUser, newUser, users);
	}

	public void updatingUsername(User[] users, User oldUser) {
		User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
		System.out.println("Please enter a new username");
		newUser.setUsername(UserLogin.login.nextLine());
		UUI.updateUser(oldUser, newUser, users);
	}

}
