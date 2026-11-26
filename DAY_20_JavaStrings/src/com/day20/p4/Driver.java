package com.day20.p4;

public class Driver {

	public static void main(String[] args) {
		Payment p1 = new Payment("REF101",10000,"PAID");
		Payment p2 = new Payment(1000,"PAID");
		
		
		Payment.showCount();

	}
}
