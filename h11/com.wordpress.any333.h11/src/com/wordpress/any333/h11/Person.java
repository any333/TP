package com.wordpress.any333.h11;

import java.util.*;

public class Person {
	String[] Names = { "Thomas", "Jessica", "Adam", "Jennie", "Billy" };
	String[] Genders = { "Female", "Male" };

	private int RandomVar = new Random().nextInt(6);
	{
		if (RandomVar < 3) {
			setGender("Male");
		} else {
			setGender("Female");
		}
	}
	private String Name = Names[RandomVar];
	private String Gender;

	public void setName(String name) {
		this.Name = name;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public String getGender() {
		return Gender;
	}

	public String getName() {
		return Name;
	}
}
