package basics;

public class IfElse1 {

	public static void main(String[] args) {
		int x=1;
		
		if(x>5) {
		System.out.println("Hello");
		
		if(x>100) {
			System.out.println("wow");
		}
		else {
			System.out.println("oh no");
		}
	}
		else if(x%2==0){
		System.out.println("How are you??");
		}
		else {
			System.out.println("Sorry");
		}
	}

}
