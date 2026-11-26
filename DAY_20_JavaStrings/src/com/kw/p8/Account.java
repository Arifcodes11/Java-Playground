package com.kw.p8;

public class Account {

	public static void main(String[] args) {
		Payment p1 = new Payment("REF101",13000,"PAID","SUCESS");
		Payment p2 = new Payment("REF102",4567,"PAID","FAILED");
		Payment p3 = new Payment(7657,"PAID","SUCESS");
		Payment p4 = new Payment(3456,"PAID","FAILURE");
		Payment.showLivePayments();
	}

}
