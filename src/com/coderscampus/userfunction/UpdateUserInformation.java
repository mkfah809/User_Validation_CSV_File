package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;

public class UpdateUserInformation {

	void getupdateUser(User[] users) throws IOException {
		getuserprivilege();
		User oldUser = UserLogin.getloginasanyUser();
		UserPrivileges.getnormaluserPrivilege();
		@SuppressWarnings("resource")
		Scanner useroptionList = new Scanner(System.in);
		int userOption = useroptionList.nextInt();

		if (userOption == 1) {

			User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
			System.out.println("Please enter a new username");
			newUser.setUsername(UserLogin.login.nextLine());
			updateUser(oldUser, newUser, users);

		} else if (userOption == 2) {
			User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
			System.out.println("Please enter a new Password");
			newUser.setPassword(UserLogin.login.nextLine());
			updateUser(oldUser, newUser, users);

		} else if (userOption == 3) {
			User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
			System.out.println("Please enter a new Name");
			newUser.setName(UserLogin.login.nextLine());
			updateUser(oldUser, newUser, users);

		} else if (userOption == 4) {
			System.exit(0);
		}
	}

	private static void getuserprivilege() throws IOException {
		System.out.println("\nPlease choose from the following options: ");
		UserPrivileges.getsuperuserPrivilege();
		UserPrivileges.getnormaluserPrivilege();
	}

	void updateUser(User oldUser, User newUser, User[] users) {
		for(int i=0; i<users.length; i++) {
			User user = users[i];
			if (oldUser.getUsername().equals(user.getUsername())) {
				user.setUsername(newUser.getUsername());
				user.setPassword(newUser.getPassword());
				user.setName(newUser.getName());
				user.setRole(newUser.getRole());
			}
			
		}
	}
}
