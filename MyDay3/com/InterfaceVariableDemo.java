package com.accenture.lkm.stringEx;

import abstraction.InterfaceDemo2;

public class InterfaceVariableDemo {

	public static void main(String[] args) {
		//InterfaceDemo2.i=200;
		/*
		 * Below we are able to access the variable of an interface from another
		 * package hence proving that it is implicitly public.
		 * Since we are accessing it with interface name proving it is static
		 * We cannot change it hence proving it is final.
		 */
		System.out.println(InterfaceDemo2.i);

	}

}
