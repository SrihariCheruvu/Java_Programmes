package com.accenture.lkm.stringEx;
/*
 * String is immutable.
 * If we try to change an String object then the original object is not changed.
 * A new object with the changed value is created and if we want we can assign our
 * variable to new object.
 */
public class Example3 {

	public static void main(String[] args) {
		
		String a="Rohan";
		String b="Rohan";
		
		System.out.println("Before....");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		a=a.concat(" Kadam");
		
		System.out.println("\nAfter....");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		

	}

}
