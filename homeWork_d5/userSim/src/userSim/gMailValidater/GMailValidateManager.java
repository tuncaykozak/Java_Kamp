package userSim.gMailValidater;

public class GMailValidateManager {
	
	public boolean isGoogleMail(String mail) {
		
		if(mail.contains("gmail.com")) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
