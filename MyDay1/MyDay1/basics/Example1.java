package basics;
/*
 * Class is a blueprint of an object.
 * Class is the template to write our code.
 * 
 * Variable:- A container to store data for a temporary purpose.
 * 
 * Datatypes: used to declare the type of data that we will store 
 * in the variable, and how much memory we need for it.
 * 
 * Numerical datatypes
 * byte:- 1 byte
 * short:- 2 byte
 * int:- 4 byt
 * long:- 8 byte
 * 
 * decimal points..
 * float: 4 bytes
 * double: 8 bytes
 * 
 * 
 * Non-numerical datatypes
 * char: 2 bytes
 * boolean: 1 bit
 * 
 * Non-Primitive datatype
 * String
 * Arrays
 * Class objects
 * 
 * Method:- is a block of code which will run only when it is called.
 * Syntax of method:- accessSpecifier returnType nameOfMethod(){}
 * 
 * AccessSpecier: defines the scope
 * public 		------------------------
 * protected	---------------------
 * default		--------------
 * private		-------
 * 
 * Return type:- type of the value that the method will return at the end.
 * void
 * primitive datatype
 * non-primitive datatye
 */
public class Example1 {
	
	short x=1098;
	float marks=99.78f;
	
	char grade='{';
	boolean fresher=true;
			
	String name="Accenture India. Vikhroli centre. Java session";		
	
	long mobile=9876543210l;
			
			
	public 	void display() {
		
		System.out.println("Hello everyone!!!");
		System.out.println("marks= "+marks);
	}
	
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.display();
		
		System.out.println(e1.mobile);
		
		AccessSpecifier1 as=new AccessSpecifier1();
		System.out.println(as.i);
		System.out.println("j= "+as.j);
		System.out.println("k= "+as.k);
		//System.out.println("m= "+as.m);
	}
	
}
