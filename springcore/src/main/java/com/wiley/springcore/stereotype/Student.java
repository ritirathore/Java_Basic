package com.wiley.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Riti")
	private String studentName;
	@Value("Kasganj")
	private String city;
	@Value("#{mycities}")
	private List<String> cities;
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", cities=" + cities + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
