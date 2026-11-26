package com.kw.p4;

public class Payment {
	private static int totalPayment = 0;
	
	private String paymentRefId;
	private int amount;
	private String status;
	
	{
		totalPayment++;
		System.out.println("IIB executed");
	}
	
	public Payment(String _paymentRedId,int _amount,String _status) {
		this.paymentRefId = paymentRefId;
		this.amount = _amount;
		this.status = _status;
		
		System.out.println("Constructor 1 Executed");
	}
	public Payment(int _amount,String _status)
	{
		this.amount = _amount;
		this.status = _status;
		
		System.out.println("Constructor 2 Executed");
	}
	public static void showCount() {
		System.out.println("total payments = "+totalPayment);
	}
}
