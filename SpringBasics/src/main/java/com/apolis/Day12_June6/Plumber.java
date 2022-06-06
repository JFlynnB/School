package com.apolis.Day12_June6;

import java.util.List;

public class Plumber implements Worker{

	private String firstName, lastName;
	private List<String> toolList;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<String> getToolList() {
		return toolList;
	}
	public void setToolList(List<String> toolList) {
		this.toolList = toolList;
	}
	public void printTools() {
		System.out.println(toolList);
	}
}
