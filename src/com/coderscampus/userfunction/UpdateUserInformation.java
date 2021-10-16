package com.coderscampus.userfunction;

import java.io.IOException;
import java.util.Scanner;

import com.coderscampus.user.User;
import com.coderscampus.user.UserRecordUpdate;

public class UpdateUserInformation {

	void getusertoUpdate(User[] users, User oldUser) throws IOException {
		Scanner useroptionList = new Scanner(System.in);
		UserRecordUpdate updateRecord = new UserRecordUpdate();
		Integer userOption = useroptionList.nextInt();
		if (userOption == 0) {
			oldUser = UserLogin.getloginasanyUser();
		} else if (userOption == 1) {
			updateRecord.updatingUsername(users, oldUser);
		} else if (userOption == 2) {
			updateRecord.updatingPassword(users, oldUser);
		} else if (userOption == 3) {
			updateRecord.updatingName(users, oldUser);
		} else if (userOption == 4) {
			System.out.println("Thank you for using me, Bye!");
			System.exit(0);
		} else {
			System.out.println("Invalid Entry!");
			useroptionList.close();		}
	}



	public static void getuserprivilege() throws IOException {
		UserPrivileges.getsuperuserPrivilege();
		UserPrivileges.getnormaluserPrivilege();
	}

	public void updateUser(User oldUser, User newUser, User[] users) {
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
