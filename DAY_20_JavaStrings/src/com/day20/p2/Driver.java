package com.day20.p2;

public class Driver {

	public static void main(String[] args) {
		Payment p1 = new Payment("REF100",500,"PAID","SUCCESS");
		Payment p2 = new Payment(7000,"PAID","SUCCESS");
		
		p1.displaySomething();
		p2.displaySomething();
	}

}
