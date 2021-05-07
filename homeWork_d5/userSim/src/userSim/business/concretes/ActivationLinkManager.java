package userSim.business.concretes;

import java.util.Random;

import userSim.business.abstracts.ActivationLinkService;
import userSim.entities.concretes.User;

public class ActivationLinkManager implements ActivationLinkService {

	@Override
	public String linkCreate(User user) {
		
		Random random = new Random();
		
		return ("www.buradanaktifol.com/" + random.nextInt(1000000) + user.getFirstName() + "??" + user.getId() );
	}
	
	

}
