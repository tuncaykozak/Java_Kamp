package userSim.business.concretes;

import userSim.business.abstracts.ActivationControllerService;
import userSim.entities.concretes.User;

public class ActivationControllerManager implements ActivationControllerService {

	@Override
	public String isActive(User user) {
		if(user.getActivated()) {
			return ("Kullanici aktivasyonu yapmistir: " + user.getFirstName());
			
			
		}
		else {
		return ("Kullanici aktif degildir: " + user.getFirstName());
		}
		
	}

}
