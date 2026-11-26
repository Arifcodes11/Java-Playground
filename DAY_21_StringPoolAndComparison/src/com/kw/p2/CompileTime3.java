package com.kw.p2;

public class CompileTime3 {

	public static void main(String[] args) {
		String s1 = "Java" + "Programming";
		String s2 = "JavaProgramming";
		String s3 = "Java" + "Programming";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
		System.out.println(s1.equals(s3));
	}

}
