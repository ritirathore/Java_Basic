package com.wiley.springcore;

public class Address {
	
	private int houseNo;
	private String societyName;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getSocietyName() {
		return societyName;
	}
	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}
	public Address(int houseNo, String societyName) {
		super();
		this.houseNo = houseNo;
		this.societyName = societyName;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", societyName=" + societyName + "]";
	}
	
	

}
