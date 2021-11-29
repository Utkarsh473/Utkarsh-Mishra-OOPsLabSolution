package com.greatlearning.model;

public class Employee {
	String firstName, lastName, departmentName;

	public Employee(String firstName, String lastName, String departmentName) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
