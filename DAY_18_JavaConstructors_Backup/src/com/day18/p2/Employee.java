package com.day18.p2;

public class Employee {
	
	private String empName;
	private double salary;
	
	Employee(){
		this("Unkown",25000);
		System.out.println("Default Constructor");
	}
	
	Employee(String empName,double salary)
	{
		super();
		this.empName = empName;
		this.salary = salary;
		
		System.out.println("Parameterized Constructor");
		System.out.println(empName);
		System.out.println(salary);
	}
	Employee(double salary,String empName)
	{
		this.empName = empName;
		this.salary = salary;
		
		System.out.println("Second parameterized Constructor");
		System.out.println(empName);
		System.out.println(salary);
	}
	
}
