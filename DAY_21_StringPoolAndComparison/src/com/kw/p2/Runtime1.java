package com.kw.p2;

public class Runtime1 {

	public static void main(String[] args) {
		String s1 = "Kode";
		String s2 = "wala";
		
		String s3 = s1+s2;
		String s4 = "Kodewala";
		
		System.out.println(s3);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
