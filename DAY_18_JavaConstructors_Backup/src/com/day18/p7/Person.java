package com.day18.p7;

public class Person {
	private String name;
	private int age;
	
	Person(){
		this("Unkown",18);
		System.out.println("Defaul Constrcutor Executed");
	}
	Person(String name,int age)
	{
		super();
		this.name = name;
		this.age = age;
		
		System.out.println("Persnn Constructor");
		System.out.println("Name  : "+this.name);
		System.out.println("Age : "+this.age);
	}
	Person(int age,String name)
	{
		this.name = name;
		this.age = age;
		
		System.out.println("Second Parameterized Constrcutor");
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
