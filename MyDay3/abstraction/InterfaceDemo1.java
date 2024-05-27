package abstraction;
/*
 * 1) Interface is the blue print of a class.
 * 2) It gives 100% abstraction.
 * 3) All variables in an interface are implicitly public final and static.
 * 4) Interfaces do not have constructors.
 * 5) We cannot create the object of an interface.
 * 6) We use implements keyword to inherit the variables and methods of an interface.
 * 7) We can implement more than one interface to a class.
 * 8) An interface cannot extend another class.
 * 9) An interface can extend another interface.
 * 10) Marker interfaces have no abstract methods.
 * 11) Functional interface has only one abstract method.
 */

interface ClothingTemplate{
		
	public void searchProduct();
	public void sortProduct();
	public void rateProduct();
	public void addToCart();
	public void placeOrder();
	
	
}

class Myntra implements ClothingTemplate{

	@Override
	public void searchProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class Ajio implements ClothingTemplate{

	@Override
	public void searchProduct() {
		
		
	}

	@Override
	public void sortProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		

	}

}
