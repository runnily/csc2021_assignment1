package com.example.tddCoursework.production;

import java.util.HashMap;
import java.util.Map;

public class RecordManager<P extends Person> implements Manager<P> {

	private Map<Integer, Student> students;

	public RecordManager(HashMap<Integer, Student> students) {
		this.students = students;
	}

	public RecordManager() {
		students = new HashMap<Integer, Student>();
	}

	public boolean AddStudent(Student student) {
		if (getPersons().containsKey(student.getID())) { // when map contains key
			return false;
		}
		getPersons().put(student.getID(), student); // else return true
		return true;
	}

	public Map<Integer, Person> getPersons() {
		return null;
	}

	public String toString() {
		String collection = "";
		for (Student student : students.values()) {
			collection += student.toString();
		}
		return collection;

	}

	public String search(Name name) {
		String collection = "";
		for (Student student : students.values()) {
			if (name.toString().equals(student.getName().toString())) { // if names are equal
				collection += student.toString();
			}
		}
		return collection;
	}

}
