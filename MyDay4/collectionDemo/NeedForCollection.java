package collectionDemo;

import java.util.ArrayList;

/*
 * Collection is used to store a group of objects.
 * Collection is a framework having interfaces and classes for storing objects.
 * 
 * byte------> Byte
 * short-----> Short
 * int------->Integer
 * long------> Long
 * 
 * double----> Double
 * float----> Float
 * 
 * boolean----> Boolean
 * char-------> Character
 */
public class NeedForCollection {

	public static void main(String[] args) {
		
		//Non-generic or heterogenous collection
		ArrayList slist=new ArrayList();
		slist.add("Sunita");
		slist.add(100);
		slist.add(true);
		slist.add(4.98);
		
		//Generic or homogenous collection
		ArrayList<Integer> rolls=new ArrayList<Integer>();
		rolls.add(100);

	}

}
