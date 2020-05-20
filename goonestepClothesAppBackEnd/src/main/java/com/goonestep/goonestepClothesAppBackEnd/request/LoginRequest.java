package com.goonestep.goonestepClothesAppBackEnd.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {

	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswprd(String password) {
		this.password = password;
	}

	
}
