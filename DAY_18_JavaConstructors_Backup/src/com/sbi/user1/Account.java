package com.sbi.user1;

public class Account {
	private String name;
	private int balance;
	
	Account(){
		this("Arif",1000);
		System.out.println("Default constructor executed");
	}
	Account(String _name,int _balance)
	{
		super();
		this.name = _name;
		this.balance = _balance;
		
		System.out.println("Name = " + name);
		System.out.println("Balance = "+ balance);
	}
	Account(int _balance, String _name)
	{
		this.name = _name;
		this.balance = _balance;
		
		System.out.println("second parameterized Constrcutor");
		System.out.println("Name = " + name);
		System.out.println("Balance = " + balance);
	}
}
