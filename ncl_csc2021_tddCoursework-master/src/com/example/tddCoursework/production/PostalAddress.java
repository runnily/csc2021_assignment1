package com.example.tddCoursework.production;

/*	Author: Adanna Obibuaku*
 *	Date: 08/11/19
 *	Purpose: This purpose is to create an post address type
 */
public class PostalAddress implements Data {
	private String lineOne;
	private String lineTwo;
	private String city;
	private String postCode;
	private String country;

	public PostalAddress(String lineOne, String lineTwo, String city, String postCode, String country) {
		this.lineOne = lineOne;
		this.lineTwo = lineTwo;
		this.city = city;
		this.postCode = postCode;
		this.country = country;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;

	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;

	}

	public void setCity(String city) {
		this.city = city;

	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;

	}

	public void setCountry(String country) {
		this.country = country;

	}

	public String getLineOne() {
		return lineOne;

	}

	public String getLineTwo() {
		return lineTwo;

	}

	public String getCity() {
		return city;

	}

	public String getPostCode() {
		return postCode;

	}

	public String getCountry() {
		return country;

	}

}
