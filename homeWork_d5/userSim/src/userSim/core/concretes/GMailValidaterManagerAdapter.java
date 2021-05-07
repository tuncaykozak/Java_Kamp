package userSim.core.concretes;

import userSim.core.abstracts.GMailValidateService;
import userSim.entities.concretes.User;
import userSim.gMailValidater.GMailValidateManager;

public class GMailValidaterManagerAdapter implements GMailValidateService {

	@Override
	public String isGmail(User user) {
		
		GMailValidateManager manager =new GMailValidateManager();
		if(manager.isGoogleMail(user.getEmail())) {
			return("Google hesabi ile giris yapilmistir : " + user.getEmail());
		}
		else {
			
		return "Boyle bir Google hesabi bulunmamaktadir : " + user.getEmail();
		}
	}

	


}
