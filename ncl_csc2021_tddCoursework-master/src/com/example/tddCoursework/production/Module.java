package com.example.tddCoursework.production;

/*	Author: Adanna Obibuaku*
 *	Date: 08/11/19
 *	Purpose: The is creates a module type
 */
public class Module {
	final private String code;
	final private int credit;

	public Module(String code, int credit) {
		this.code = code;
		this.credit = credit;
	}

	String getCode() {
		return code;
	}

	int getCredit() {
		return credit;
	}
}
