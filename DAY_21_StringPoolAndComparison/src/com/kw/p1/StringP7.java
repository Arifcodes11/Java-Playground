package com.kw.p1;

public class StringP7 {

	public static void main(String[] args) {
		String temp = "Bangalore";
		
		String s1 = new String(temp);
		
		System.out.println(s1.hashCode()+" and "+ temp.hashCode());
		System.out.println(s1.equals(temp));
		System.out.println(s1 == temp);
		
		String s2 = new String("Bangalore");
		
		String s3 = "Bangalore";
		
		System.out.println(temp == s1);
		System.out.println(temp == s2);
		System.out.println(temp == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		s3.concat("India");
		
		System.out.println(s3);
		
		s1 = s1.concat("India");
		
		System.out.println(s1);
		
	}

}
