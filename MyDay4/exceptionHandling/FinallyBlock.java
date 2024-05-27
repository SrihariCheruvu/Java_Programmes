package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * finally block is used to write those codes which important to be executed whether
 * the exeception is handled or not.
 * Usually used to write closing statements.
 * 
 * syntax:-
 * Here the exception is handled by catch and then finally will execute.
 * try{}
 * catch(){}
 * finally{}
 * 
 * Here exception is not handled but still finally will execute
 * try{}
 * finally{}
 */
public class FinallyBlock {

	public static void main(String[] args) {
		
		Scanner sc=null;
		FileInputStream fis=null;
		try {
			sc=new Scanner(System.in);
			fis=new FileInputStream("Demo.txt");
			int div=2/0; //new ArithmeticException();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			sc.close();
			System.out.println("Closing the stream..");
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
