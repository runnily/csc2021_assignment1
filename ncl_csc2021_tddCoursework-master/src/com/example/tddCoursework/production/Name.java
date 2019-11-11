package com.example.tddCoursework.production;

public class Name implements Data {
	String name = "";

	public Name(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		String sname = String.format("#############################%s#############################\n", getName());
		return sname;
	}

}
