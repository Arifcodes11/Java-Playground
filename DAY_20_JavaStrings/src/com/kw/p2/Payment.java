package com.kw.p2;

public class Payment {
	private String paymentRefId;
	private int amount;
	private String status;
	private String response;
	
	public Payment(String _paymentRefId, int _amount,String _status,String _response) {
		this.paymentRefId = _paymentRefId;
		this.amount = _amount;
		this.status = _status;
		this.response = _response; 
	}
	public Payment(int _amount,String _status,String _response)
	{
		this.amount = _amount;
		this.status = _status;
		this.response = _response;
	}
	public void displayPayment() {
		System.out.println("Reference : " + paymentRefId);
		System.out.println("Amount : "+amount);
		System.out.println("Status : "+status);
		System.out.println("Response : "+response);
		System.out.println();
	}
}
