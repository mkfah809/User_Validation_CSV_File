package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;

public class UpdateUserInformation {

	public void getupdateUser(User[] users) throws IOException {
		User oldUser = UserLogin.getloginasanyUser();
		UserPrivileges.getnormaluserPrivilege();
		Scanner useroptionList = new Scanner(System.in);
		int userOption = useroptionList.nextInt();
		getnormaluseroptionList(users, oldUser, userOption);
		useroptionList.close();
	}

	public void getnormaluseroptionList(User[] users, User oldUser, int userOption) {
		if (userOption == 1) {
			updatingUsername(users, oldUser);
		} else if (userOption == 2) {
			updatingPassword(users, oldUser);
		} else if (userOption == 3) {
			extracted(users, oldUser);
		} else if (userOption == 4) {
			System.out.println("Thank you for using me, Bye!");
			System.exit(0);
		} else {
			System.out.println("Invalid Entry!");
		}
	}

	private void extracted(User[] users, User oldUser) {
		User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
		System.out.println("Please enter a new Name");
		newUser.setName(UserLogin.login.nextLine());
		updateUser(oldUser, newUser, users);
	}

	private void updatingPassword(User[] users, User oldUser) {
		User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
		System.out.println("Please enter a new Password");
		newUser.setPassword(UserLogin.login.nextLine());
		updateUser(oldUser, newUser, users);
	}

	private void updatingUsername(User[] users, User oldUser) {
		User newUser = new User(oldUser.getUsername(), oldUser.getPassword(), oldUser.getName(), oldUser.getRole());
		System.out.println("Please enter a new username");
		newUser.setUsername(UserLogin.login.nextLine());
		updateUser(oldUser, newUser, users);
	}

	public static void getuserprivilege() throws IOException {
		System.out.println("\nPlease choose from the following options: ");
		UserPrivileges.getsuperuserPrivilege();
		UserPrivileges.getnormaluserPrivilege();
	}

	void updateUser(User oldUser, User newUser, User[] users) {
		for (int i = 0; i < users.length; i++) {
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
