package com.accenture.lkm.stringEx;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		/*
		 * toCharArray returns an array of characters in which each member is
		 * the character of our original string.
		 */
		String s="Manoj is sleepy";
		char [] arr=s.toCharArray();
		
		System.out.println("s= "+s);
		System.out.println("arr= "+Arrays.toString(arr));
		
		String t=s.toUpperCase();
		String u=s.toLowerCase();
		
		System.out.println("t= "+t);
		System.out.println("u= "+u);

	}

}
