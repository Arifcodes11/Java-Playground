package com.day20.p4;

public class Payment {
	private static int totalPayments = 0;
	
	private String paymentRefId;
	private int amount;
	private String status;
	
	{
		totalPayments++;
		System.out.println("IIB executed");
	}
	
	public Payment(String _paymentRefId,int _amount,String _status) {
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
		this.status = _status;
		
		System.out.println("Constructor 1 executed");
	}
	public Payment(int _amount,String _status)
	{
		this.amount = _amount;
		this.status = _status;
		
		System.out.println("Constructor 2 executed");
	}
	
	public static void showCount()
	{
		System.out.println("total payments  = "+totalPayments);
	}
	
}
