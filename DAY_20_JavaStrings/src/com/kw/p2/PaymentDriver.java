package com.kw.p2;

public class PaymentDriver {

	public static void main(String[] args) {
		Payment p1 = new Payment("REF100",5000,"PAID","SUCCESS");
		Payment p2 = new Payment(1000,"PAID","SUCCESS");
		
		p1.displayPayment();
		p2.displayPayment();
		
	}

}
