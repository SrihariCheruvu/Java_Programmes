package arraysDemo;
//alt+shift+s
//generate constructor from superclass
//generate constructor using fields
//generate getter setter--> select all--> generate

class Person{
	
	int personId;
	String personName;
	String occupation;
	
	public Person() {


	}
	public Person(int personId, String personName, String occupation) {
		
		this.personId = personId;
		this.personName = personName;
		this.occupation = occupation;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
}

public class Example3 {

	public static void main(String[] args) {
		
		Person [] plist=new Person[5];
		
		Person p1=new Person(101, "Priti", "Hockey player");
		plist[0]=p1;
		
		plist[1]=new Person(102, "Chandu", "Cricket player");
		plist[2]=new Person(103, "Meena", "Doctor");
		plist[3]=new Person(104, "Akash", "Lawyer");
		plist[4]=new Person(105, "Rohit", "Engineer");
		
		for(Person p:plist) {
			
			System.out.println("Id: "+p.personId);
			System.out.println("Name: "+p.personName);
			System.out.println("Occupation: "+p.occupation);
			System.out.println("________________________________\n");
		}
	}

}
