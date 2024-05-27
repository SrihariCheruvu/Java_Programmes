package basics;
/*
 * Constructor is special method with no returnType and is used to create
 * object of a class.
 */

class Student{
	
	int rollNum=20;
	String name;
	String stream;
	
	public void display() {
		System.out.println("Hello");
	}
	
	public Student() {
		
		System.out.println("Non parameterized constructor of Student..");
	}
	
}//student class ends here


public class ConstructorDemo1 {

	public static void main(String[] args) {
		/*
		 * s1 is the reference variable

			Object is created with new keyword and constructor call.

			In below given line of code right hand side---> new Student() creates object
			Left hand side---> Student s1 is the variable that will refer to the object.
		 */
		Student s1=new Student();
		System.out.println(s1.rollNum);
		s1.display();
		
		
	}

}
