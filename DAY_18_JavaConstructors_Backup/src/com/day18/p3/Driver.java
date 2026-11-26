package com.day18.p3;

class Animal{
	Animal()
	{
		super();
		System.out.println("Animal Constructor");
	}
}
class Dog extends Animal{
	Dog()
	{
		super();
		System.out.println("Dog Constructor");
	}
}
class Puppy extends Dog {
	Puppy()
	{
		System.out.println("Puppy constructor");
	}
}
public class Driver {
	public static void main(String[] args)
	{
		Puppy p1 = new Puppy();
		System.out.println();
		System.out.println("Hashcode = "+p1.hashCode());
	}
}
