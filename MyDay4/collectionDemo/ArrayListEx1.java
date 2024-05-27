package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		/*
		 * 1) null values are allowed
		 * 2) insertion order is maintained
		 * 3) duplicates are allowed.
		 * 4) members are not sorted.
		 * 5) members are indexed from 0 to size()-1
		 */
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("White");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Black");
		
		System.out.println(colors);
		
		System.out.println("\nUsing normal for loop....");
		for(int i=0; i<colors.size(); i++) {
			
			System.out.println(colors.get(i));
		}
		
		System.out.println("\nUsing enhanced for loop....");
		for(String c: colors) {
			
			System.out.println(c);
		}
		
		System.out.println("\nUsing iterator....");
		Iterator<String> it=colors.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
