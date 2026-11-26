package com.kw.p3;

public class CompileTime2 {

	public static void main(String[] args) {
		final String a = "Hello";
		final String b = "World";
		 
		String s1 = a+b;
		String s2 = "HelloWorld";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//compile time 
		
		String c = "Hello";
		String d = "World";
		
		String s3 = c+d;
		String s4 = "HelloWorld";
		
		System.out.println(s3);
		System.out.println(s3 == s4);
		System.out.println(s4.equals(s3));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		String name = "Arif";
		
		String n1 = name + " A";
		String n2 = "Arif A";
		
		System.out.println(n1);
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
		
		
	}

}
