package com.day20.p5;

public class Student {
	static String college = "ABC college";
	
	String name;
	
	public Student(String _name)
	{
		this.name = _name;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("College : "+college);
		System.out.println();
	}
}
