package com.day18.p10;

class Company
{
	Company(String companyName)
	{
		super();
		System.out.println("Company Constructor");
		System.out.println("Company : "+companyName);
	}
}
class Department extends Company
{
	Department()
	{
		super("TCS");
		System.out.println("Department Cponstructor");
	}
}
class Employee extends Department
{
	Employee()
	{
		System.out.println("Employee Constructor");
	}
}
public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		System.out.println();
		
		System.out.println("Hashcode = "+employee.hashCode());
	}

}
