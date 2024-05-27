package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		/*
		 * Collections is a predefined class used to manipulate the members of
		 * List implemented classes.
		 */
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("White");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Black");
		
		System.out.println("Before: "+colors);
		
		Collections.sort(colors);

		System.out.println("\nAfter: "+colors);
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(7);
		nums.add(1);
		nums.add(9);
		nums.add(2);
		
		System.out.println("Before: "+nums);
		
		//Collections.sort(nums);
		//Collections.shuffle(nums);
		Collections.reverse(nums);
		
		System.out.println("\nAfter: "+nums);
	}

}
