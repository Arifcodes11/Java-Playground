package com.day18.p9;

public class Product {
	private String productName;
	private int price;
	
	Product()
	{
		this("Keyword",1500);
		System.out.println("Default Product Constructor");
	}
	Product(String productName, int price)
	{
		super();
		
		this.productName = productName;
		this.price = price;
		
		System.out.println("Product constructor");
		System.out.println("Product : "+this.productName);
		System.out.println("Price : "+this.price);
	}
	Product(int price,String productName)
	{
		this.productName = productName;
		this.price = price;
		
		System.out.println("second Product Construcctor");
		System.out.println("Product : "+this.productName);
		System.out.println("price : "+this.price);
	}
}
