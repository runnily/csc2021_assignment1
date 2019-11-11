package com.example.tddCoursework.production;

public class test {

	public static void main(String[] args) {
		RecordManager<Student> n = new RecordManager<>();
		Student random = new Student(new Name("Lisa"));
		n.AddStudent(random);

	}

}
