package inheritanceEx;

class Honda{
	
		Number companyMoto() {
		System.out.println("Innovation is power...");
		
		return 100;
	}
		
		int display() {
			
			System.out.println("Parent display...");
			return 2;
		}
}
class Activa extends Honda{
	
	@Override
	public Double companyMoto() {
		
		System.out.println("The best two wheeler...");
		
		return 100.0;
		
		
	}
	
	@Override
	int display() {
		
		System.out.println("Parent display...");
		return 2;
	}
}

public class MethodOverridingEx2 {

	public static void main(String[] args) {
		

	}

}
