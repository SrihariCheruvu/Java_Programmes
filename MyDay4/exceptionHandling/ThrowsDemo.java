package exceptionHandling;
/*
 * throws is a keyword to declare that the method has some code where exception may
 * occur and it has not been handled.
 * Any other method which calls the above method will now have to handle the exception.
 */
class Demo{
	
	public void display()  {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
public class ThrowsDemo {

	public static void main(String[] args) {
		
		
		
			new Demo().display();
			
		
	}

}
