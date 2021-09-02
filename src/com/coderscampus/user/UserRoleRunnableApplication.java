package com.coderscampus.user;

import java.io.IOException;

<<<<<<< Updated upstream
import com.coderscampus.userfunctions.UserFromFile;
=======
import com.coderscampus.fileinformation.FileServiceImpl;

>>>>>>> Stashed changes

public class UserRoleRunnableApplication {

	public static void main(String[] args) throws IOException {
<<<<<<< Updated upstream

		UserFromFile userfromFile = new UserFromFile();
		System.out.println(userfromFile.getUserInformationFromFile("UserData.txt"));
=======
		
		FileServiceImpl fileservice = new FileServiceImpl();
		fileservice.getUserInformationFromFile("UserData.txt");
		
		User superuser = new SuperUser();
		 
>>>>>>> Stashed changes
	
	}

}
