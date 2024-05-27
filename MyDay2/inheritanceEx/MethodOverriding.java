package inheritanceEx;
/*
 * method overriding is the process of changing the behavior of the
 * inherited method in child class.
 * 
 * Rules of method overriding:-
 * 1) name of method should be same.
 * 2) parameters should be same.
 * 3) access specifier can increase scope but it cannot decrease scope
 * 4) primitive or void return types should be kept same. Covariants of 
 * non primitive return types can be used.
 * 
 * public -----------------------
 * protected ----------------
 * default ---------
 * private---
 */
class Parent{
	
	 public void sendResume() {
		
		System.out.println("Sending resume thru post...");
	}
}

class Child extends Parent{
	@Override
	 public void sendResume() {
		
		System.out.println("Sending resume thru email...");
	}
	
	public void studying() {
		System.out.println("Child is studying...");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.sendResume();

	}

}
