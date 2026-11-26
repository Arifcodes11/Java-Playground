package com.kw.p1;

class Employee{
	
}
public class StringP3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e1) == true);
		//if upper result is true then,e1.hashCode() == e2.hashCode()
		// must be true
	}

}
