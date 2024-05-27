package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
 	Below we are seeing the example of nested try catch.
 */
public class NestedTryCatch {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis=new FileInputStream("Demo.txt");
			
			try {
				String s=null;
				s.charAt(0);
			}
			catch(NullPointerException n) {
				
				System.out.println("Calling method on null");
			}
			System.out.println("Today is Friday...");
			 
			try {
			int div=20/0;
			}
			catch(ArithmeticException a) {
				
				a.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you.....");
	

}}
