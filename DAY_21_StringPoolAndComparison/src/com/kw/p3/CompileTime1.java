package com.kw.p3;

public class CompileTime1 {

	public static void main(String[] args) {
		String s1 = "Hello"+"World";
		String s2 = "HelloWorld";
		
		System.out.println(s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}//compile time constant

}
