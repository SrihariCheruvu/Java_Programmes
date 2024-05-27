package exceptionHandling;
/*
 *  Exception is an abrupt interruption in our program where jvm terminates our program
 	without reaching the last line of code.
 	
 	As a developer we need to handle this exception and make sure that even the last
 	line of code is executed.
 	
 	We handle exception using try catch block.
 	try block:- used to write the code where exception may occur.
 	catch block: used to catch the exception class object thrown by JVM.
 	
 	In Java there are many predefined Exception classes.
 	Exception is also a class.
 */
public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to our website.....");
		System.out.println("Kindly login.....");
		
		try {
			int div=10/0; //new ArithmeticException();
		}
		catch(Exception e) {
			
			e.printStackTrace();
			System.err.println("An exception has occurred........");
		}
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Product: "+i);
		}
		
		System.out.println("Thank you....");

	}

}
