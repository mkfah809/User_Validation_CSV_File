package com.coderscampus.user;

import com.coderscampus.fileinformation.GenericFactory;

public class UserRoleRunnableApplication {

	public static void user(User[] users) {
		
		GenericFactory user = new User();
		Body body = new Body();
		Frame frame = new Frame();
		Electronics electronics = new Electronics();
		
		Part[] parts = new Part[3];
		parts[0] = body;
		parts[1] = frame;
		parts[2] = electronics;
		
		Product car = 	carFactory.build(parts);
		System.out.println("We've built a new car " + car);

	}

}
