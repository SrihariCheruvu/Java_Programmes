package basics;

public class Example2 {

	String batch="Batch27";//instance
	
	public void display() {
		
		String company="Accenture";//local
		
		System.out.println("company= "+company);
		System.out.println("Batch= "+batch);
	}
	
	public void show() {
		
		//System.out.println("company= "+company);
		System.out.println("Batch= "+batch);
	}
	public static void main(String[] args) {
		
		Example2 e=new Example2();
		System.out.println(e.batch);
		
		e.display();
		e.show();
		//System.out.println(e.company);
	}

}
