package class_Inheritance_Method;

public class Instructor extends User {
	
	final boolean accessToTheTutorPanel = true; // unchangeable
	
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email/*String link,*//*boolean access*/) {// link will only getting 
		
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		//this.link =link;
		
		//this.accessToTheTutorPanel = access;
		
		
	}

}
