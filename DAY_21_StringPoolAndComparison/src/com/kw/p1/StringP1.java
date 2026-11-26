package com.kw.p1;

public class StringP1 {

	public static void main(String[] args) {
		String s1 = "Amazon";
		String s2 = "Amazon";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Amazon");
		String s4 = new String("Amazon");
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		
		String temp = "Bangalore";
		
		String s5 = new String(temp);
		
		System.out.println(s5 == temp);
		System.out.println(s5.equals(temp));
	}

}
