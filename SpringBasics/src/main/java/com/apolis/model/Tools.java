package com.apolis.model;

import java.util.List;

public class Tools implements ToolsList{

	private String storagePlace;
	private List<String> toolsList;
	public String getStoragePlace() {
		return storagePlace;
	}
	public void setStoragePlace(String storagePlace) {
		this.storagePlace = storagePlace;
	}
	public List<String> getToolsList() {
		return toolsList;
	}
	public void setToolsList(List<String> toolsList) {
		this.toolsList = toolsList;
	}
	
	
}
