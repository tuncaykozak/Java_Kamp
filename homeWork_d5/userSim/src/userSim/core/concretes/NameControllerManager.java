package userSim.core.concretes;

import userSim.core.abstracts.NameControllerService;
import userSim.entities.concretes.User;

public class NameControllerManager  implements NameControllerService{

	@Override
	public boolean nameControl(User user) {
		
		if(user.getFirstName().length() >=2 && user.getLastName().length() >= 2) {
			
			return true;
		}
		else {
			System.out.println("Adiniz veya Soyadiniz cok kisa : " + user.getFirstName() +" " + user.getLastName());
			return false;
		}
	}
	
	
}

