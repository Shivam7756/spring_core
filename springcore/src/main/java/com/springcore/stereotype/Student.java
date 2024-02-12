package com.springcore.stereotype;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")//denote to create object of this class as runtime
@Scope("prototype")// used to determine whether new object created each time when bean is invoked
// or same object is being used again and again
// prototype-: different object created each time bean invoked
// singleton:- same object used again and again for bean invocation (Default setting for spring container)

public class Student {
	@Value("Allan")
     private String studentName;
	@Value("New jersey")
     private String city;
	
	@Value("#{temp}")//for using collection without creating bean tags and using spring expression language
	private List<String> address;
	
	@Value("#{ff}")//for using collection without creating bean tags and using spring expression language
	private Map<String,String> courses;

	public Map<String, String> getCourses(){
		return courses;
	}


	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}


	public List<String> getAddress() {
		return address;
	}


	public void setAddress(List<String> address) {
		this.address = address;
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
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
}
