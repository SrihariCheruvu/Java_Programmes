package com.accenture.lkm.stringEx;
/*
 * 1) toString method is inherited from Object class.
 * 2) All classes have toString method.
 * 3) toString method returns the string representation of the object.
 * 4) Implicitly it will give the hashcode, but we can override the toString method
 * 		to return all the values of our instance methods.
 */
class Employee{
	
	int empId=101;
	String empName="Sujina";
	String designation="Trainer";
	
	@Override
	public String toString() {
		return "Id= "+empId+"\nName= "+empName+"\nDesignation= "+designation;
	}
	
	
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		System.out.println(e);
		
	}

}
