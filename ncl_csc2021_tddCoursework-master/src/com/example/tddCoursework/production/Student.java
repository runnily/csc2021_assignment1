package com.example.tddCoursework.production;

public class Student implements Person {
	private Name name;
	private int id = hashCode();
	final int MAX_MODULES = 8;
	private ModuleMark modules[] = new ModuleMark[MAX_MODULES];
	private PostalAddress postalAddress;
	private Email email;
	private CourseTitle courseTitle;

	public Student(Name name) {
		this.name = name;

	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Email getEmail() {
		return email;
	}

	public void setCourseTitle(CourseTitle courseTitle) {
		this.courseTitle = courseTitle;
	}

	public CourseTitle getCourseTitle() {
		return courseTitle;
	}

	public void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}

	public PostalAddress getPostalAddress() {
		return postalAddress;
	}

	public ModuleMark[] getModules() {
		return modules;
	}

	public boolean AddModule(ModuleMark module) {
		int i = 0;
		while (getModules()[i] != null && i < MAX_MODULES) { // keep looping until modules[i] has a value
			getModules()[i] = module;
			i++;
		}
		if (modules[i] == module) {
			return true;
		}
		return false;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public int getID() {
		return id;
	}

	public String toString() {
		String student = "";
		student += getName().toString();
		student += getCourseTitle().toString();
		student += getModules().toString();
		student += getPostalAddress().toString();
		student += String.format("Email: %10s|", getEmail());
		student += getEmail();
		return student;

	}

}
