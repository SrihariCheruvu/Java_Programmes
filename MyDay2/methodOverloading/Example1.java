package methodOverloading;
/*
 * Changes in parameter:-
 * 1) Increase the number of parameter
 * 2) Change the datatype
 * 3) Change the sequence of parameter
 */
class Area{
	
	public void calculateArea(int r) {
		
		System.out.println("Area:- "+(3.14*r*r));
	}
	
	public void calculateArea(int r, int a) {
		
		System.out.println("Area:- "+(r*a));
	}
	
	public void calculateArea(double r) {
		
		System.out.println("Area:- "+(3.14*r*r));
	}
	
	public void calculateArea(double r, int a) {
		
		System.out.println("Area:- "+(r*a));
	}
	
	public void calculateArea(int a, double r ) {
		
		System.out.println("Area:- "+(r*a));
	}
}
public class Example1 {

	public static void main(String[] args) {
		

	}

}
