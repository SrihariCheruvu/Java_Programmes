package abstraction;

/*
 * 1) abstract methods do not have method body.
 * 2) abstract methods are always present in an abstract class.
 * 3) we cannot make object of abstract class.
 * 4) abstract classes can have constructor.
 * 5) abstract and final keywords cannot be used together
 * 6) if a child class do not want to give implementation to an abstract class
 * then we will have to declare the child class also abstract.
 */

abstract class Person{
	
	public void eat() {
		
		System.out.println("Person is eating...");
	}
	
	abstract public void interest();
	
	public Person(){
		
		System.out.println("Person class constructor....");
	}
}

class Abhishek extends Person{
	@Override
	public void interest() {
		
		System.out.println("Abhishek is interested in coding.....");
	}
	
}

class Rohan extends Person{
	@Override
	public void interest() {
		
		System.out.println("Rohan is interested in reading...");
	}
}

abstract class DepressedPerson extends Person{
	
	
}
public class Example1 {

	public static void main(String[] args) {
		
		Abhishek a=new Abhishek();
		
	}

}
