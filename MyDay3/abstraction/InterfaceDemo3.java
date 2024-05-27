package abstraction;

interface EmployeeDao{
	
	public boolean addEmployee();
}

class Department{
	
	public void address() {
		System.out.println("Vikhroli");
	}
}

interface DeveloperDao extends EmployeeDao{
	
	public void coding();
}



public class InterfaceDemo3 implements EmployeeDao, DeveloperDao{

	public static void main(String[] args) {
		

	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

}
