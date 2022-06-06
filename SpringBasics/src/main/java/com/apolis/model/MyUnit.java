package com.apolis.model;

public class MyUnit implements Unit {

	private int buildingNo;
	private int apartmentNo;
	public MyUnit(int buildingNo, int apartmentNo) {
		super();
		this.buildingNo = buildingNo;
		this.apartmentNo = apartmentNo;
	}
	public int getBuildingNo() {
		return buildingNo;
	}
	public int getApartmentNo() {
		return apartmentNo;
	}
	@Override
	public String toString() {
		return "MyUnit [buildingNo=" + buildingNo + ", apartmentNo=" + apartmentNo + "]";
	}
	
	
}
