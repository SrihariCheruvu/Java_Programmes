package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
/*
 * Comparable interface is used to compare objects.
 * Below we are using it to compare Employee object so that sort method can sort the
 * employees according to their names.
 */
class Employee implements Comparable<Employee>{
	
	Integer empId;
	String empName;
	Double salary;
	String designation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, Double salary, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}
	
	
}

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(new Employee(101, "Ajay", 19000.0, "Developer"));
		empList.add(new Employee(102, "Raju", 170000.0, "PMO"));
		empList.add(new Employee(103, "Rahul", 9000.0, "Cleaner"));
		empList.add(new Employee(104, "Amitabh", 25000.0, "Marketing exec"));
		empList.add(new Employee(105, "Surya", 190000.0, "XYZ"));
		/*
		 * below we are seeing forEach method
		 */
		System.out.println("Before.........");
		empList.forEach(e->System.out.println(e));
		
		Collections.sort(empList);
		
		System.out.println("\nAfter.........");
		empList.forEach(e->System.out.println(e));
		
		System.out.println("\nSorting according to the salary....");
		Collections.sort(empList, new CompareEmpSalary());
		empList.forEach(e->System.out.println(e));
		
	}

}
