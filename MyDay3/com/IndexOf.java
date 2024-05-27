package com.accenture.lkm.stringEx;

public class IndexOf {

	public static void main(String[] args) {
		
		String s="Yellow Umbrella";
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)=='l')
				System.out.println(i);
		}
		
		System.out.println("index of letter l: "+s.indexOf('l'));
		System.out.println("index of Umbrella: "+s.indexOf("Umbrella"));
	}

}
