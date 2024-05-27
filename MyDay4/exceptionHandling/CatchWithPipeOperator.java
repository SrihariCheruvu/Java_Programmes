package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchWithPipeOperator {

	public static void main(String[] args) {
		/*
		 * With the help of pipe operator we can handle more than one exception
		 * in single catch block as seen below.
		 * 
		 * Remember: We cannot include parent and child exception classes in same 
		 * catch block.
		 */
		try {
			FileInputStream fis=new FileInputStream("Demo.txt");
			
			String s=null;
			s.charAt(0);
			
			int div=10/0;
			
		} catch (FileNotFoundException | NullPointerException  e) {
			
			e.printStackTrace();
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}

	}

}
