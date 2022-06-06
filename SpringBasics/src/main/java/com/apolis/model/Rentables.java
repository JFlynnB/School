package com.apolis.model;

import java.util.List;
import java.util.Map;

public interface Rentables {

	public List<String> getToolList();

	public void setToolList(List<String> toolList);
	
	public String getComplexName();
	
	public Map<Integer, String> getOccupationList();

	public void setOccupationList(Map<Integer, String> occupationList);
	
	public List<Unit> getUnitList();

	public void setUnitList(List<Unit> unitList);
}
