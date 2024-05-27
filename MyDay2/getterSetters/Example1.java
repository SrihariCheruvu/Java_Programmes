package getterSetters;
/*
 * setters are public methods used to set values to instance variable
 * of a class.
 * syntax:-
 * public void setVariableName(datatype variableName){
 * this.variableName=variableName;
 * }
 * 
 * getters are public methods used to get the values of intance variable.
 * Syntax:-
 * public dataTypeOfVariable getVariableName(){
 * 	return variableName;
 * }
 * 
 * 
 */
class Student{
	
	private int roll;
	private String name;
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public int getRoll() {
		
		return roll;
	}
	
	public String getName() {
		return name;
	}
	public Student() {}
	
	public Student(int roll, String name) {
		this.roll=roll;
		this.name=name;
	}
	
	public void display() {
		
		System.out.println("roll: "+roll);
		System.out.println("name: "+name);
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setName("Manoj");
		
		System.out.println("Details of manoj...");
		s1.display();
		
		Student s2=new Student(201, "Suraj");
		System.out.println("\n\nDetails of Suraj");
		s2.display();
		
		
		System.out.println("\nGetting the name of s1 object..");
		String name=s1.getName();
		System.out.println(name);
		
		
	}

}
