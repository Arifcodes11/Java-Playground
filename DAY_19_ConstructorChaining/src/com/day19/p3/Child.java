package com.day19.p3;

public class Child extends Parent{
	
	static {
		System.out.println("Child SIB 1");
	}
	
	static {
		System.out.println("Child SIB 2");
	}
	
	{
		System.out.println("child IIB 1");
	}
	{
		System.out.println("Child IIB 2");
	}
	
	public Child() {
		this("Guest");
		System.out.println("Child Constructor 1");
	}
	public Child(String name) {
		super();
		System.out.println("Child Constructor 2");
	}
	public void printSomething() {
		System.out.println("Child.printSomething()");
	}
}
