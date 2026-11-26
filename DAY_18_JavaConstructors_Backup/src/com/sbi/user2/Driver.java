package com.sbi.user2;

class PaymentSystems extends Object
{
	public PaymentSystems(String status)
	{
		super();
		
		System.out.println("-----------------------------");
		System.out.println("Inside PaymentSystems Constructor");
		System.out.println("Status : "+status);
		System.out.println("------------------------------");
	}
}
class Payment extends PaymentSystems {
	public Payment() {
		super("Active");
		System.out.println("Inside Payment Constructor");
	}
}
class UPIPayment extends Payment{
	public UPIPayment() {
		System.out.println("Inside UPIPayment Constructor");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		System.out.println();
		
		UPIPayment p1 = new UPIPayment();
		
		System.out.println();
		
		System.out.println("Hashcode = "+p1.hashCode());
		
		System.out.println("Object = "+p1);
		
		System.out.println("Program Finished");

	}

}
