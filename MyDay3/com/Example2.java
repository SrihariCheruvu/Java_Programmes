package com.accenture.lkm.stringEx;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * We usually create String objects by using literals.
		 * In this way the object is created directly in SCP memory and memory is 
		 * managed in a better way by avoiding duplicate objects.
		 */
		
		String s1=new String("Java");
		String s2=new String("Java");

		String t1="Python";
		String t2="Python";
		
		System.out.println("Are s1 and s2 in same location? "+(s1==s2));
		System.out.println("Are t1 and t2 in same location? "+(t1==t2));
		
		System.out.println("Do s1 and s2 have same values? "+s1.equals(s2));
		System.out.println("Do t1 and t2 have same values? "+t1.equals(t2));
	}

}
