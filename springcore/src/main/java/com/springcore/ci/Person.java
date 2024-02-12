package com.springcore.ci;

public class Person {
    private String pName;
    private int personId;
    private Certi certi;
    
	public Person(String name, int personId,Certi certi) {
		super();
		this.pName = name;
		this.personId = personId;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return this.pName+ ": pName , personId : "+this.personId + ", Object: "+this.certi;
	}
    
    
	
}
