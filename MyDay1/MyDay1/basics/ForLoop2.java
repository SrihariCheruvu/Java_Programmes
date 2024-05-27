package basics;

public class ForLoop2 {

	public static void main(String[] args) {
		/*
		 * Outer loop is responsible to run the inner loop 5 times
		 */
		for(int y=1; y<=5; y++) {
			/*
			 * Inner loop is printing 1 to 5 in a single line.
			 * But since we want same to be done 5 times
			 * We add this loop inside another loop.
			 */
			for(int i=1; i<=5; i++) {
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}

}
