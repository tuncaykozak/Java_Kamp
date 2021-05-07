package userSim.business.abstracts;

import userSim.entities.concretes.User;

public interface ActivationControllerService {
	
	String isActive(User user); 

}
