package com.day18.p1;

public class Student {
	private String name;
	private int age;
	
	Student(){
		this("Arif", 11);
		System.out.println("Default COnstructor Executed");
	}
	Student(String name,int age){
		super();
		this.name = name;
		this.age = age;
		
		System.out.println("Parameterized Constructor");
		System.out.println("Name : " + this.name);
		System.out.println("Age : "+this.age);
	}
	Student(int age,String name)
	{
		this.name = name;
		this.age = age;
		
		System.out.println("Second parameterized Constructor");
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
