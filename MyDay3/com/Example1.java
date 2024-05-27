package com.accenture.lkm.stringEx;

public class Example1 {

	public static void main(String[] args) {
		
		/*
		 * String is a predefined class used to store sequence of characters.
		 * String class has constructor overloading in it, hence we can create
		 * String object by calling different types of constructor according to our
		 * requirement.
		 */
		
		String s1=new String();//this will create empty string
		System.out.println("s1= "+s1);
		
		String s2=new String("Cohort 6");
		System.out.println("s2= "+s2);
		
		String s3=new String(s2);
		System.out.println("s3= "+s3);
		
		char [] arr= {'T', 'h', 'u', 'r', 's', 'd', 'a', 'y'};
		String s4=new String(arr);
		System.out.println("s4= "+s4);

	}

}
