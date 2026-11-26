package com.day20.p3;

public class Payment {
	private static int totalPayments = 0;
	
	private String paymentRefId;
	private int amount;
	
	{
		totalPayments++;
		System.out.println("IIB executed");
	}
	public Payment(String _paymentRefId,int _amount) {
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
	}
	public static void displayTotalPayments()
	{
		System.out.println("Total payments = "+totalPayments);
	}
}
