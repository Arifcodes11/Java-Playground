package com.day20.pp;

public class Account {
	public static void main(String[] args) {
		Payment uPay1 = new Payment("REF101",13400,"PAID","SUCCESS");
		Payment uPay2 = new Payment("REF102",4567,"PAID","FAILED");
		Payment uPay3 = new Payment("REF103",5000,"PAID","SUCCESS");
		Payment.showLivePayment();
	}
}
