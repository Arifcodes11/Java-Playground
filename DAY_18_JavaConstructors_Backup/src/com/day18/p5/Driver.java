package com.day18.p5;

class Hospital
{
	Hospital(String hospitalName){
		super();
		
		System.out.println("Hospital Constrcutor");
		System.out.println("Hospital : "+hospitalName);
	}
}
class Doctor extends Hospital
{
	Doctor()
	{
		super("Apollo");
		System.out.println("Doctor Constructor");
		
	}
}
class Surgeon extends Doctor
{
	Surgeon()
	{
		System.out.println("Surgeon Construtor");
	}
}
public class Driver {
	public static void main(String[] args)
	{
		Surgeon s1 = new Surgeon();
		System.out.println();
		System.out.println(s1.hashCode());
	}
}
