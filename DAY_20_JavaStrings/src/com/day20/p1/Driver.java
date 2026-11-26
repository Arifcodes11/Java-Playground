package com.day20.p1;

public class Driver {

	public static void main(String[] args) {
		Payment p1 = new Payment("REF12345",13400,"PAID","SUCCESS");
		Payment p2 = new Payment("REF54321",7234,"PAID","FAILED");
		
		p1.displayPayment();
		System.out.println(" ");
		p2.displayPayment();
	}

}
