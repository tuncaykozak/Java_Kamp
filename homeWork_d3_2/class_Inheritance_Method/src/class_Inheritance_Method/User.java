package class_Inheritance_Method;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	private String link; // a web-link to access user's page

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLink() {
		return "www.kodlama.io/" + this.firstName.substring(0,3) + this.id;
	}
	
	
	
	
	
	

}
