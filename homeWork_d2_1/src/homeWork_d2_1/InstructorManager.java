package homeWork_d2_1;

public class InstructorManager {
	
	public void nameOfInstructor(Instructor instructor) { 
		System.out.println(instructor.id+". "+"Egitmen Adi :" + instructor.name);

	}
	public void levelOfInstructor(Instructor instructor) { 
		System.out.println("--------------------------------");
		nameOfInstructor(instructor); 
		System.out.println("	Seviyesi:"+instructor.detail);

	}
	
}
