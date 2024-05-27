package inheritanceEx;

class Animal{
	
	public void sound() {
		System.out.println("Animal is making sound....");
	}
}

class Bird extends Animal{
	@Override
	public void sound() {
		System.out.println("Bird is chirping....");
	}
}


public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		
		Bird b=new Bird();
		b.sound();
		
		Animal a=new Bird();//upcasting
		a.sound();
		
		Animal an=new Animal();
		an.sound();
	

		//Bird bi=new Animal();//downcasting
	}

}
