package com.kw.p1;

public class Payment {
	private String paymentRefId;
	private int amount;
	private String status;
	private String response;
	
	public Payment(String _paymentRefId,int _amount,String _Status,String _response)
	{
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
		this.status = _Status;
		this.response = _response;
	}
	public void displayPayment()
	{
		System.out.println("Payment reference : "+paymentRefId);
		System.out.println("Amount : " +amount);
		System.out.println("Status : "+status);
		System.out.println("Response : "+response);
		System.out.println();
	}
}
