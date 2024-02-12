package com.springcore.collections;

import java.util.*;

public class Emp {
      private String empName;
      private List<String> phoneNo;
      private Set<String> address;
      private Map<String,String> courses;
      private Properties props;
      
      public String getEmpName() {
		return empName;
	}
      
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public Set<String> getAddress() {
		return address;
	}
	
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	
	public Map<String, String> getCourses() {
		return courses;
	}
	
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public Properties getProps() {
		return props;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public Emp(String empName, List<String> phoneNo, Set<String> address, Map<String, String> courses,
			Properties props) {
		super();
		this.empName = empName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
