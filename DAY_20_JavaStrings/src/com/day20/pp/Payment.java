package com.day20.pp;

public class Payment {
	private static int livePayments = 0;
	
	private String paymentRefId;
	private int amount;
	private String status;
	private String response;
	
	{
		livePayments++;
		System.out.println("IIB Executed");
	}
	
	public Payment(String _paymentRefId,int _amount,String _status,String _response)
	{
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
		this.status = _status;
		this.response = _response;
		
		System.out.println("Full Constructor");
	}
	public Payment(int _amount,String _status,String _response) {
		this.amount = _amount;
		this.status = _status;
		this.response = _response;
		
		System.out.println("Short constrcutor");
	}
	public static void showLivePayment() {
		System.out.println("Live Payment = " +livePayments);
	}
}

