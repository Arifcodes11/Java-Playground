package com.kw.p3;

public class Payment {
	private static int totalPayment = 0;
	
	private String paymentRefId;
	private int amount;
	
	{
		totalPayment++;
		System.out.println("IIB Executed");
	}
	public Payment(String _paymentRefId,int _amount) {
		this.paymentRefId = _paymentRefId;
		this.amount =_amount;
	}
	public static void displayTotalPayments() {
		System.out.println("Total payment = "+totalPayment);
	}
}
