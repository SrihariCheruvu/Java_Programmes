package contructors;
/*
 * Point to remember:-
 * 1) Constructors are special methods used to create object.
 * 2) It does not have return type.
 * 3) Contructor name is always same as the class name.
 * 4) If we donot create a contructor then during compilation a default
 * constructor is added to our class. This constructor is empty.
 * 5) A class can have more than one constructor.
 * 
 * this keyword represent the current class object.
 * In below given example we are using this keyword to distinguish 
 * between local variable and instance variable.
 */

class Employee{
	
	int empId;
	String empName;
	double salary;
	
	public Employee() {
		
		System.out.println("Non parameterized constructor..");
		System.out.println("Id: "+empId+"\nName: "+empName+"\nSalary: "+salary);
	}
	
	public Employee(int empId, String empName, double salary) {
		
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	
	public void display() {
		
		System.out.println("Id: "+empId+"\nName: "+empName+"\nSalary: "+salary);
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		
		
		/*
		 * Employee e1=new Employee(); e1.empId=101;//setting value of empId in e1
		 * object e1.empName="Rahul";//setting value of empName in e1 object
		 * e1.salary=10000.0;//setting value of salary in e1 object
		 * 
		 * System.out.println("\n\nAfter setting all values..."); e1.display();
		 */
		//System.out.println(e1);
		
		
		Employee e2=new Employee(201, "Ajay", 15000.0);
		System.out.println("Values of e2...");
		e2.display();
	}

}
