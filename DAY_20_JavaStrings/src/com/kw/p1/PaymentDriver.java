package com.kw.p1;

public class PaymentDriver {
	public static void main(String[] args)
	{
		Payment p1 = new Payment("REF12345",13400,"PAID","SUCCESS");
		Payment p2 = new Payment("REF54321",7654,"PAID","FAILED");
		
		p1.displayPayment();
		p2.displayPayment();
	}
}
