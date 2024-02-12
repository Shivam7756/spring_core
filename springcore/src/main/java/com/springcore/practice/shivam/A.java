package com.springcore.practice.shivam;

public class A {
	private int a;
	private B ob;
	private B cb;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public B getCb() {
		return cb;
	}
	public void setCb(B cb) {
		this.cb = cb;
	}
	@Override
	public String toString() {
		return "A [a=" + a + ", ob=" + ob + ", cb=" + cb + "]";
	}
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
