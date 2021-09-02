package com.coderscampus.user;
public class SuperUser extends User  {

	public SuperUserInterface buildUser(User[] users) {
		
		NormalUser normalUser = null;
		SuperUser superUser = null;

		for (User user : users) {
			if (user instanceof NormalUser) {
				normalUser = (NormalUser) user;
			} else if (user instanceof SuperUser) {
				superUser = (SuperUser) user;
			}
		}
		if(normalUser != null) {
			User user = new User();
			
		}
		return null;
		
	}

	

}
