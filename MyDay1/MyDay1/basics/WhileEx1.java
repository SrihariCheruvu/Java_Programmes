package basics;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter any number"); int i=sc.nextInt();//i=567 int
		 * count=0;
		 * 
		 * i=56
		 * 
		 * while(i>0) {
		 * 
		 * i=i/10; count++; }
		 * 
		 * System.out.println(count);
		 * 
		 * 
		 */
		
		/*
		 * In do while jvm will do the task first and then check the
		 * condition
		 */
		int x=10;
		do {
			System.out.println("Hello");
		} while (x < 5);
	}

}
