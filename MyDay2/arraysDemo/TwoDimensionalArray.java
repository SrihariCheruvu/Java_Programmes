package arraysDemo;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String [] c= {
				"Magenta",//0
				"Violet",//1
				"Fuscia"//2
		};
		
		String [][]colors= {
				
				{"Red", "Blue", "Green"},//0
				{"Black", "White"},//1
				{"Pink", "Yellow", "Brown", "Purple"}//2
		};

			System.out.println(colors[2][1]);
	}

}
