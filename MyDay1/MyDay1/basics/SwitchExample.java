package basics;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any color present in rainbow:- ");
		String color=sc.next();
		
		switch(color) {
		
		case "violet": System.out.println("Royal color");
		break;
		
		case "indigo": System.out.println("Ashok chakra");
		break;
		
		case "blue": System.out.println("Clear sky");
		break;
		
		case "green": System.out.println("Leaves");
		break;
		
		case "yellow": System.out.println("Sun");
		break;
		
		case "red": System.out.println("Rose");
		break;
		
		default:System.out.println("Please enter color seen in rainbow");
		
		}

	}

}
