package arraysDemo;

import java.util.Arrays;
/*
 * 1) Array is an object to store a group of objects of the same 
 * type.
 * 2) Size is fixed. We cannot change size at run time.
 * 3) Members of the array are given indexes starting from 0 to length-1
 * 
 */
public class Example1 {

	public static void main(String[] args) {
		
		int roll=30;
		
		int [] rollNums=new int[5];
		rollNums[1]=100;
		rollNums[4]=5;
		rollNums[0]=50;
		
		/*
		 * Arrays is a predefined class.
		 * We have called the static method toString from it to 
		 * see the values of our array rollNums.
		 */
		System.out.println(Arrays.toString(rollNums));
		
		
		

	}

}
