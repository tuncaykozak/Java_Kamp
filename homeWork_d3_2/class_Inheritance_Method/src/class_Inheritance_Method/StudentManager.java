package class_Inheritance_Method;

public class StudentManager extends UserManager {
	
		public void add(User user) {	//overriding
		
			System.out.println(user.getFirstName() +" " +user.getLastName()+ " isimli ogrenci eklendi");
		
	}

}
