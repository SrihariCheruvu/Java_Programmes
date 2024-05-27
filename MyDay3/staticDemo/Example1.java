package staticDemo;

/*
 * static variables can be accessed with class or interface name.
 * same copy of static variable and method is available to all objects.
 * static can be used with variable, methods, blocks and inner classes.
 */

class Student{
	
	int roll;
	String name;
	static String college="Wilson college";
	
	public Student(int roll, String name) {
		
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Roll=" + roll + "\nName=" + name + "\nCollege= "+college;
	}
	
	static class LibraryMembership{
		
	}
	
	static void show() {
		
		System.out.println("This is static method...");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		
		
		  Student s1=new Student(101, "Saketh"); Student s2=new Student(102,
		  "Guruprasad");
		  
		  System.out.println("Details of s1..."); System.out.println(s1);
		  System.out.println("Details of s2..."); System.out.println(s2);
		  
		  s1.college="Bhavan's college";
		  
		  System.out.println("\nAfter changing...");
		  System.out.println("Details of s1..."); System.out.println(s1);
		  System.out.println("Details of s2..."); System.out.println(s2);
		 
		
		Student.show();
	}

}
