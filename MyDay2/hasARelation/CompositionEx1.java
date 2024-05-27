package hasARelation;

/*
 * Has-A relationship is when one class has an object of another class.
 * Example Car Has-A Engine in it.
 * 
 * It is of two types:-
 * Composition: Car class by default creates the object of the
 * engine class. We can see this happening in the empty constructor.
 * 
 * Aggregation: We are making the object of engine class and then
 * setting it into the car object. We are doing this by using
 * setter.
 */
class Engine{
	int engineId;
	
}
class Car{
	String model="SUV";
	Engine e;
	
	Car(){
		
		e=new Engine();
		e.engineId=101;
	}

	Car(String model){
		this.model=model;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}
	
	
}
public class CompositionEx1 {

	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println("Model: "+c.model);
		System.out.println("Engine Id: "+c.e.engineId);
		
		
		Engine e=new Engine();
		e.engineId=5000;
		c.setE(e);
		
	}

}
