package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
public Addition(double a, double b) {//injection containers call the constructor in the sequence in which they are written
	//but String is the default value , so first it will be called then in the sequence in which constructor defined
	//this is known as ambiguity problem and resolved by type in xml file
		
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor double,double used");
	}

	public Addition(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println("constructor int,int used");
	}
	
	public Addition(String a,String b)
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor String,String used");
	}

	
public void dosum()
{
	System.out.println("sum is = " + (this.a+this.b));
}

@Override
public String toString() {
	return "Addition [a=" + a + ", b=" + b + "]";
}

}
