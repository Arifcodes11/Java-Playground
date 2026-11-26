package com.day20.p6;

public class StringLiteralDemo {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		String s3 = "JAVA";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		//case sensitivity
		
		String s4 = "bangalore";
		String s5 = "Bangalore";
		
		System.out.println(s1==s2);
		
		
		String address = "BTM";
		
		address.concat(" Bangalore");
		
		System.out.println(address);
		
		System.out.println(address.hashCode());
		
		address = address.concat(" Bangalore");
		
		System.out.println(address.hashCode());

		
		address = address.concat(" Karnataka");
		
		System.out.println(address.hashCode());

		String s11 = new String("JAVA");
		String s12 = new String("JAVA");
		
		System.out.println(s11 == s12);
		System.out.println(s11.equals(s12));
		
	}

}
