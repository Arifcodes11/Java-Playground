package com.kw.p2;

public class CompileTime2 {

	public static void main(String[] args) {
		String s1 = "Hello" + "World";
		String s2 = "HelloWorld";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
