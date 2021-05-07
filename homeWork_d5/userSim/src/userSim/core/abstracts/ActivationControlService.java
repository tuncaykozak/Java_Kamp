package userSim.core.abstracts;

import userSim.entities.concretes.User;

public interface ActivationControlService {
	
	boolean isActivated(User user);

}
