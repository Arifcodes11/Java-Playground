package com.kw.p4;

public class PaymentDriver {

	public static void main(String[] args) {
		Payment p1 = new Payment("REF101",1000,"PAID");
		
		Payment p2 = new Payment("REF102",3000,"PAID");
		
		Payment p3 = new Payment(2000,"FAILED");
		
		Payment.showCount();
	}

}
