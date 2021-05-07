package userSim.core.abstracts;

import userSim.entities.concretes.User;

public interface LoginControlService {
	
	void log(User user, String mail, String password);

}
