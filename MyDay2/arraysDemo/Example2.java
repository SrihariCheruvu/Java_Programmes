package arraysDemo;

public class Example2 {

	public static void main(String[] args) {
		
		String [] names= {"Shah rukh", "Amir", "Salman"};
		System.out.println("Long way....");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println("\nlength of names array: "+names.length);
		
		System.out.println("\nUsing for loop");
		for(int a=0; a<names.length; a++) {
			
			System.out.println(names[a]);
		}
		
		/*
		 * for each loop also known as enhanced for loop.
		 */
		for(String member :names) {
			System.out.println(member);
		}
		
		char [] grades= {'a', 'b', 'c'};
		
		for(char ch: grades) {
			System.out.println(ch);
		}
	}

}
