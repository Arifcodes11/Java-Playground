package com.day19.p3;

public class Parent {
	static {
		System.out.println("Parent SIB 1");
	}
	static {
		System.out.println("Parent SIB 2");
	}
	{
		System.out.println("Parent IIB 1");
	}
	
	{
		System.out.println("parent IIB 2");
	}
	public Parent() {
		super();
		System.out.println("Parent Constructor");
	}
}
