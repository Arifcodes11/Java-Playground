package com.kw.p2;

public class Runtime2 {

	public static void main(String[] args) {
		String first = "Hello";
		String last = "World";
		
		String s1 = first + last;
		String s2 = "HelloWorld";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
