package finalDemo;
/*
 * final is the keyword which will not allow any changes to be made.
 * 
 * 1) final variable's value cannot be changed.
 * 2) final method cannot be overriden.
 * 3) final class cannot be extended.
 * 
 * constructors cannot be final.
 */
final class Student{
	final int id=100;
	String name="Naveen";
	
	Student(){}
	
	final public void display() {
		System.out.println("Display method of Student....");
	}
	/*
	 * final method can be overloaded, because in overloading we are not changing
	 * the behaviour of original method.
	 * We are simply making one more method of same name with different parameter.
	 */
	public void display(String s) {
		
		System.out.println("Overloaded method of display...");
	}
	
	public void changeValue() {
		
		//id=200;
		name="Srihari";
	}
}
/*
 * class Demo extends Student{
 * 
 * @Override public void changeValue() { System.out.println(); }
 * 
 * @Override public void display() {
 * System.out.println("Display method of Student...."); } }
 */



public class Example1 {

	public static void main(String[] args) {
		

	}

}
