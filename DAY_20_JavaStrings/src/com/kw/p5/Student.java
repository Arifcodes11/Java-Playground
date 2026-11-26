package com.kw.p5;

public class Student {
	static String college = "ABC College";
	
	String name;
	
	public Student(String _name)
	{
		this.name = _name;
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("College : "+college);
		System.out.println();
	}
}
