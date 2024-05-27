package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * Compiletime exceptions are those where the compiler will force the coder to 
 * handle the exception.
 * The code will not be compiled until and unless we handle the exception.
 * These are also know as checked exceptions.
 * Example: SQLException, FileNotFoundException, ClassNotFoundException etc...
 */
public class CompileTimeDemo {

	public static void main(String[] args) {
		
		
			FileOutputStream fio;
			try {
				fio = new FileOutputStream("Demo.txt", true);
				
				String s="\nSaptarishi wants to work from home...";
				byte b[]=s.getBytes();
				
				fio.write(b);
				
				System.out.println("Data has been written in the file...");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		
		

	}

}
