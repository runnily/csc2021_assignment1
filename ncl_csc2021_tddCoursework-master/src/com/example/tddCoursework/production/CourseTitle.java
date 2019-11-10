package com.example.tddCoursework.production;

/*	Author: Adanna Obibuaku*
 *	Date: 08/11/19
 *	Purpose: The is to create a course title type
 */
import java.time.LocalDate;

public class CourseTitle implements Data {
	final private String title;
	final private LocalDate date;

	CourseTitle(String title, LocalDate date) {
		this.title = title;
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return String.format("Course Title: %10s| Date: %10d", getTitle(), getDate());
	}
}
