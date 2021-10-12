package com.coderscampus.user;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable {
	public String username;
	public String password;
	public String name;
	public String role;
	private static final long serialVersionUID = 1L;


	/**
	 * @return the username
	 */

	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int compareTo(User that) {
		if(this.role.compareTo(that.role) == 0) {
			return that.name.compareTo(this.name);
		} else {
			return that.role.compareTo(this.role);
		}
	}

}
