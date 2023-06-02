package com.wiley.springcore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;

//bean class
public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private List<Integer> courseIds;
	private HashSet<String> subjects;
	private HashMap<String, Integer> map;
	private Properties props;
	private Address ar;
	
	public Student(int studentId, String studentName, String studentAddress, List<Integer> courseIds,
			HashSet<String> subjects, HashMap<String, Integer> map, Properties props, Address ar) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.courseIds = courseIds;
		this.subjects = subjects;
		this.map = map;
		this.props = props;
		this.ar = ar;
	}
	public Address getAr() {
		return ar;
	}
	public void setAr(Address ar) {
		this.ar = ar;
	}
	public Student(int studentId, String studentName, String studentAddress, List<Integer> courseIds,
			HashSet<String> subjects, HashMap<String, Integer> map, Properties props) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.courseIds = courseIds;
		this.subjects = subjects;
		this.map = map;
		this.props = props;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Student(int studentId, String studentName, String studentAddress, List<Integer> courseIds,
			HashSet<String> subjects, HashMap<String, Integer> map) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.courseIds = courseIds;
		this.subjects = subjects;
		this.map = map;
	}
	public List<Integer> getCourseIds() {
		return courseIds;
	}
	public void setCourseIds(List<Integer> courseIds) {
		this.courseIds = courseIds;
	}
	public HashSet<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(HashSet<String> subjects) {
		this.subjects = subjects;
	}
	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", courseIds=" + courseIds + ", subjects=" + subjects + ", map=" + map + ", props=" + props + ", ar="
				+ ar + "]";
	}
	
	

}
