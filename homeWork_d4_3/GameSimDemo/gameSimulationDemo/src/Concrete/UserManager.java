package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	
	public UserManager() {
		
	}
	
	public UserManager(UserCheckService userCheckService) {		
		this();
		this.userCheckService = userCheckService;
	}

	

	@Override
	public void add(User user) {
		
		if(userCheckService.checkIfRealPerson(user)) {
			
			System.out.println("Kaydedildi : " + 
								user.getFirstName() + 
								" (Kimlik dogrulama basarili)");
		}
		else {
			System.out.println("Kayit islemi basarisiz.(Kimlik dogrulama basarisiz)");
		}
		
	}
	
	

	@Override
	public void delete(User user) {
		
		System.out.println("Kullanici silindi");
		
	}

	@Override
	public void update(User user) {


		if(userCheckService.checkIfRealPerson(user)) { //Wrong informations controlling
			
			System.out.println("Guncelleme basarili (Kimlik dogrulama basarili)");
		}
		else {
			System.out.println("Guncelleme basarisiz.(Kimlik dogrulama basarisiz)");
		}
		
	}

}
