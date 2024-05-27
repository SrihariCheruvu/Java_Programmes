package exceptionHandling;

import java.util.Scanner;

class AgeInvalidException extends Exception{
	
	@Override
	public String toString() {
		
		return "exceptionHandling.AgeInvalidException: Have to be above 18 years of age to drive..";
	}
	
	public AgeInvalidException() {
		
		System.err.println("You cannot vote currently!!!");
	}
}


public class CustomException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		
		if(age<18) {
			try {
				throw new AgeInvalidException();
			}
			catch(AgeInvalidException e) {
				
				e.printStackTrace();
			}
		}
		else {
			
			System.out.println("Thanks for voting......");
		}
	}

}
