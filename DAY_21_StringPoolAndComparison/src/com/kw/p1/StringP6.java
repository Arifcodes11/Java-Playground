package com.kw.p1;

public class StringP6 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello").intern();
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
