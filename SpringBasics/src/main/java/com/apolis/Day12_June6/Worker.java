package com.apolis.Day12_June6;

import java.util.List;

public interface Worker {

	public String getFirstName();
	public void setFirstName(String firstName);
	public String getLastName();
	public void setLastName(String lastName);
	public List<String> getToolList();
	public void setToolList(List<String> toolList);
	public void printTools();
}
