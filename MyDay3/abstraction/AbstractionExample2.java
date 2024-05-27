package abstraction;

abstract class Car{
	
	int carNo;
	String brand;
	
	public Car(int carNo, String brand) {
		
		this.carNo = carNo;
		this.brand = brand;
	}
	
	public void display() {
		
		System.out.println("Car number: "+carNo);
		System.out.println("Brand: "+brand);
	}
	
}

class Innova extends Car{

	public Innova(int carNo, String brand) {
		
		super(carNo, brand);
		
	}
	
	
}
public class AbstractionExample2 {

	public static void main(String[] args) {
		
		
		Innova i=new Innova(400, "Toyota");
		i.display();
		
		
	}

}
