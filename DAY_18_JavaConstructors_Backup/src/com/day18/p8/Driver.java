package com.day18.p8;

class Computer
{
	Computer(String processor)
	{
		super();
		System.out.println("Computer Constrcutor");
		System.out.println("Processor : "+ processor);
	}
}
class Laptop extends Computer
{
	Laptop()
	{
		super("Intel i7");
		
		System.out.println("Laptop constructor");
	}
}
class GamingLaptop extends Laptop
{
	GamingLaptop(){
		System.out.println("Gaminglaptop Constructor");
	}
}

public class Driver {
	public static void main(String[] args)
	{
		GamingLaptop laptop = new GamingLaptop();
		System.out.println();
		System.out.println("Hashcode = "+laptop.hashCode());
		
	}
}
