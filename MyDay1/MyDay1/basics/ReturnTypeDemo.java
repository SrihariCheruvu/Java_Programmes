package basics;

import java.util.Scanner;

/*
 * Return type:- type of the value that the method will return at the end.
 * void: when your method does not return anything we use void
 * primitive datatype
 * non-primitive datatye
 * 
 */
public class ReturnTypeDemo {

	public void display() {
		
		System.out.println("Cohort6");
	}
	
	public int add() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		return a+b;
	}
	
	public String askName() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name=sc.next();
		
		return "Sujina";
		
	}
	public static void main(String[] args) {
		

	}

}
