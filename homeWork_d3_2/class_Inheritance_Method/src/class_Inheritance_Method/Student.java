package class_Inheritance_Method;

public class Student extends User {
	
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email/*String link,*/) {
		
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		
	}

}
