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
		String course = ("-----------------Course--------------------\n");
		course += String.format("|%1$-20s|%2$-20s|\n", "Title", getTitle());
		course += String.format("|%1$-20s|%2$-20s|\n", "Data", getDate());
		course += ("------------------------------------------\n");
		return course;

	}
}
