package userSim.core.concretes;

import userSim.core.abstracts.PasswordControllerService;
import userSim.entities.concretes.User;

public class PasswordControllerManager implements PasswordControllerService {

	@Override
	public boolean controlPassword(User user) {
		
		if(user.getPassword().length()<=6) {
			System.out.println("Sifre cok kisa");
			return false;
		}
		return true;
	}
	
}



