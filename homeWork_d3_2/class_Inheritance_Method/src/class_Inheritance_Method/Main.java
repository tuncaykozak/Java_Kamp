package class_Inheritance_Method;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		/*
		 * student.id = 1; student.firstName = "Tuncay"; student.lastName = "KOZAK";
		 * student.email = ""; student.link = ""; // after this, link will be only can
		 * getting
		 */	
		
		student.setId(1);
		student.setFirstName("Tuncay");
		student.setLastName("KOZAK");
		student.setEmail("");
		//student.link = ""; // after this, link will be only can getting
		
		
		Instructor instructor = new Instructor();
		
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("DEMÝROÐ");
		instructor.setEmail("");
		//instructor.setLink(""); // after this, link will be only can getting
		//instructor.accessToTheTutorPanel = true; // this feature will not get or set
		
		
		Student student2 = new Student(3,"Mahmud","AKSOY","email");
		
		Instructor instructor2 = new Instructor(4, "Ahmed", "Selman", "email"/* , true */);
		
		System.out.println(student.getId());
		/*
		 * System.out.println(student2.getId()); 
		 * System.out.println(instructor.getId());
		 * System.out.println(instructor2.getId());
		 */
		
		System.out.println(student.getLink());
		System.out.println(instructor.getLink());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();		
		studentManager.add(student);
		
		
		
		

	}

}
