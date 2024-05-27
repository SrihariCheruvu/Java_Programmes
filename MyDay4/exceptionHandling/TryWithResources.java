package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		/*
		 * Below we are seeing try with resources.
		 * We can use it to make objects that require to open streams.
		 * This will make sure that the streams are closed at the end, hence we don't
		 * need to write finally again just to close our streams.
		 */
		
		try(
				Scanner sc=new Scanner(System.in);
				FileInputStream fis=new FileInputStream("Demo.txt");
				) {
			
			int div=2/0; //new ArithmeticException();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		


	}

}
