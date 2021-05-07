package userSim.core.abstracts;

import userSim.entities.concretes.User;

public interface MailControllerService {
	
	boolean mailControl(User user);
	boolean mailControlIfTaken(User user);
	
	
		
	

}
