package com.kw.p1;

public class StringP5 {

	public static void main(String[] args) {
		String s1 = "Amazon";
		String s2 = "Amazon";
		
		String s3 = new String("Amazon");
		String s4 = new String("Amazon");
		
		String s5 = "Amazon";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s2 == s5);

        System.out.println(s1.equals(s4));
	}

}
