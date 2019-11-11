package com.example.tddCoursework.production;

public class Email {
	private String email;

	public Email(String email) {
		this.email = email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return String.format("|%1$-20s|%2$-20s|\n", "Email", getEmail());
	}
}
