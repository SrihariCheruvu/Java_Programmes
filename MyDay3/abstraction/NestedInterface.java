package abstraction;

interface Hotel{
	
	public void dining();
	
	interface Banquet{
		
		public void functions();
	}
}

class SunAndSand implements Hotel, Hotel.Banquet{

	@Override
	public void dining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void functions() {
		// TODO Auto-generated method stub
		
	}
	}

public class NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
