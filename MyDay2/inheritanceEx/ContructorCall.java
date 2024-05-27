package inheritanceEx;
/*
 * Whenever we make child object the first call always goes to
 * non parameterized constructor of parent only after that the child
 * class constructor is called.
 */
class Person{
	
	public Person() {
		
		System.out.println("Person constructor");
	}
}

class Developer extends Person{
	
	public Developer() {
		
		System.out.println("Developer constructor...");
	}
}
public class ContructorCall {

	public static void main(String[] args) {
		
		
		Developer d=new Developer();

	}

}
