package com.day18.p4;

class Vehicle
{
	Vehicle(String fuel){
		super();
		
		System.out.println("Vehicle Constrcutor");
		System.out.println("Fuel : "+fuel);
	}
}
class Car extends Vehicle{
	Car() {
		super("petrol");
		System.out.println("Car constructor");
	}
}
class SportsCar extends Car
{
	SportsCar()
	{
		System.out.println("SportsCar Constrcutor");
	}
}
public class Driver {
	public static void main(String[] args)
	{
		SportsCar car = new SportsCar();
		System.out.println();
		System.out.println(car.hashCode());
	}
}
