package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;
import com.coderscampus.user.UserRecordUpdate;

public class UpdateUserInformation {
	Scanner useroptionList = new Scanner(System.in);

	User getusertoUpdate(User[] users, User oldUser) throws IOException {
		UserRecordUpdate updateRecord = new UserRecordUpdate();
		Integer userOption = null;
		do {
			userOption = useroptionList.nextInt();
			if (userOption == 4) {
				System.out.println("Thank you for using me, Bye!");
				break;
			}
			oldUser = userOptions(users, oldUser, updateRecord, userOption);
			getUserMenuBasedOnRole(oldUser);
		} while (userOption != 4);
		useroptionList.close();
		return oldUser;
	}

	private String getUserMenuBasedOnRole(User oldUser) {
		String userRole = oldUser.getRole();
		if (userRole.equalsIgnoreCase(UserPrivileges.NORMAL_USER)) {
			UserPrivileges.getnormaluserPrivilege();
		} else if (userRole.equalsIgnoreCase(UserPrivileges.SUPER_USER)) {
			UserPrivileges.getsuperuserPrivilege();
		}
		return userRole;
	}

	private User userOptions(User[] users, User oldUser, UserRecordUpdate updateRecord, Integer userOption)
			throws IOException {
		if (userOption == 0) {
			oldUser = UserLogin.getloginasanyUser();
		} else if (userOption == 1) {
			updateRecord.updatingUsername(users, oldUser);

		} else if (userOption == 2) {
			updateRecord.updatingPassword(users, oldUser);

		} else if (userOption == 3) {
			updateRecord.updatingName(users, oldUser);
		}
		return oldUser;
	}

	public static void getuserprivilege() throws IOException {
		UserPrivileges.getsuperuserPrivilege();
		UserPrivileges.getnormaluserPrivilege();
	}

	public void updateUser(User oldUser, User newUser, User[] users) {
		// updating the user & the userArray
		for (int i = 0; i < users.length; i++) {
			User user = users[i];
			saveUserToList(oldUser, newUser, user);

		}
	}

	private void saveUserToList(User oldUser, User newUser, User user) {
		if (oldUser.getUsername().equals(user.getUsername()) || oldUser.getPassword().equals(user.getPassword())
				|| oldUser.getName().equals(user.getName())) {
			updateUserToInsertIntoFile(oldUser, newUser);
			updateUserToInsertIntoFile(user, newUser);
		}
	}

	private void updateUserToInsertIntoFile(User oldUser, User newUser) {
		oldUser.setUsername(newUser.getUsername());
		oldUser.setPassword(newUser.getPassword());
		oldUser.setName(newUser.getName());
		oldUser.setRole(newUser.getRole());
	}
}
