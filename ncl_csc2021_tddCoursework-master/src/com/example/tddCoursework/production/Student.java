package com.example.tddCoursework.production;

public class Student {
	private String name;
	private int id = hashCode();
	final int MAX_MODULES = 8;
	private ModuleMark modules[] = new ModuleMark[MAX_MODULES];
	private PostalAddress postalAddress;
	private CourseTitle courseTitle;

	public Student(String name) {
		this.name = name;

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

	public PostalAddress getPostalAdress() {
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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}

}
