package com.day20.p3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1 = new Payment("REF101",1000);
		Payment p2 = new Payment("REF102",2000);
		Payment p3 = new Payment("REF103",3000);
		
		Payment.displayTotalPayments();
	}

}
