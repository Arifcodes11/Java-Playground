package com.kw.p6;

public class StringLiteral {
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "Java";
		
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s1 == s2);
		
		String s4 = "Bengaluru";
		String s5 = "bengaluru";
		
		System.out.println(s4 == s5);  
		
		//String immutability....
		
		String address = "BTM";
		
		address.concat(" Bengaluru");
		
		System.out.println(address);
		
		address = address.concat(" Bengaluru");
		address = address.concat(" Karnataka");
		
		System.out.println(address);
		
		String s6 = new String("Java");
		String s7 = new String("Java");
		
		System.out.println(s6==s7);
		System.out.println(s6.equals(s7));
		
	}
}
