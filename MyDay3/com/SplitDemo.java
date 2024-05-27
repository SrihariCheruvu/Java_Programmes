package com.accenture.lkm.stringEx;

public class SplitDemo {

	public static void main(String[] args) {
		
		String s="Hello how are you?";
		String [] arr=s.split("o");
		
		System.out.println("s= "+s);
		
		System.out.println("\nMembers of array arr...");
		for(String x:arr) {
			System.out.println(x);
		}

	}

}
