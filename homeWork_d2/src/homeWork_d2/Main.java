package homeWork_d2;

public class Main {

	public static void main(String[] args) {
		
		// Iki Adet OZellik Nesnesi :
		
		//1-Kategori
			//
		//2-Egitmen
			//
		//System.out.println("test!");
		
		
		Instructor instructor1 = new Instructor(
				1,
				"Engin_Demirog",
				"Uzman" 
				//args
				);
		
		System.out.println("test!");
		
		Instructor instructor2 = new Instructor();
			instructor2.id = 2;
			instructor2.name = "Tuncay Kozak";
			instructor2.detail = "Acemi";
		/*
		 * instructor2.courses[0] = "java"; instructor2.courses[1] = "c#";
		 */
		
		System.out.println("test!");
		
		
		Category category1 = new Category(1,"Yazilim","8 Hafta");
		
		System.out.println("test!");
		
		Category category2 = new Category();
			category2.id =2;
			category2.name = "Network";
			category2.detail = "10 Hafta";
			
			System.out.println("test!");
			
			
			
		InstructorManager instructorManager	= new InstructorManager();
		instructorManager.nameOfInstructor(instructor1);
		instructorManager.nameOfInstructor(instructor2);
		
		System.out.println("=========================================");
		
		instructorManager.levelOfInstructor(instructor1);
		instructorManager.levelOfInstructor(instructor2);
		
		
		
		
		
			
			
			
			
			
			
			
	}
}
