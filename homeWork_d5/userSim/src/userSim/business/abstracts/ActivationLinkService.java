package userSim.business.abstracts;

import userSim.entities.concretes.User;

public interface ActivationLinkService {
	
	String linkCreate(User user);

}
